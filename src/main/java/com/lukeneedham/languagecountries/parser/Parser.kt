package com.lukeneedham.languagecountries.parser

import com.lukeneedham.languagecountries.Language
import com.lukeneedham.languagecountries.AllLanguages
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import java.io.File

internal object Parser {

    internal fun parse(inputFolderPath: String, outputFolderPath: String) {
        val outputDir = File(outputFolderPath)
        val inputDir = File(inputFolderPath)
        val inputFile = File(inputDir, "language.csv")
        val otherNamesFile = File(inputDir, "other_names.tsv")
        val outputFile = File(outputDir, "data.json")

        val languages = readEntries(inputFile)
        val languagesWithOtherNames = addOtherNames(otherNamesFile, languages)
        val uniqueLanguages = mergeDuplicateCodes(languagesWithOtherNames)

        writeToFile(outputFile, uniqueLanguages)
    }

    private fun readEntries(inputFile: File): List<RawLanguage> {
        val countryEntries = inputFile.readLines().toMutableList()
        countryEntries.removeAt(0)

        return countryEntries.map {
            val columns = it.split(',')
            val code = columns[1]
            val codeOrNull = if (code.isBlank()) null else code
            val countryCodes = columns[9].split(' ').map { it.trim() }
            RawLanguage(
                codeOrNull,
                columns[3].trim(),
                countryCodes
            )
        }
    }

    private fun addOtherNames(otherNamesFile: File, languages: List<RawLanguage>): List<Language> {
        val otherNamesEntries = otherNamesFile.readLines().toMutableList()
        otherNamesEntries.removeAt(0)

        val otherNames = otherNamesEntries.map {
            val columns = it.split("\t")
            OtherNamesData(
                columns[0],
                columns[2].trim(),
                columns[3].split(",").filter { it.isNotBlank() }.map { it.trim() }
            )
        }

        /** Lookup map of code to item */
        val otherNamesMap = otherNames.map { it.code to it }.toMap()

        return languages.map { rawLanguage ->
            var updatedRawLanguage = rawLanguage
            if (rawLanguage.code == null) {
                val nameMatch = otherNames.firstOrNull { it.name == rawLanguage.name }
                if (nameMatch != null) {
                    val newCode = nameMatch.code
                    updatedRawLanguage = rawLanguage.copy(code = newCode)
                }
            }
            val rawCode = updatedRawLanguage.code

            val otherNamesData = otherNamesMap[rawCode]
                ?: return@map Language(rawCode, listOf(rawLanguage.name), rawLanguage.countryCodes)
            val names = listOf(rawLanguage.name, otherNamesData.name)
            val autonyms = otherNamesData.autonyms
            val allNames = (names + autonyms).distinct()
            Language(rawCode, allNames, rawLanguage.countryCodes)
        }
    }

    private fun mergeDuplicateCodes(languages: List<Language>): List<Language> {
        val duplicateCodes = languages.groupingBy { it.code }
            .eachCount()
            .filter { it.value > 1 }
            .map { it.key }
            .filterNotNull()

        val resultLanguages = languages.toMutableList()

        duplicateCodes.forEach { code ->
            val duplicates = languages.filter { it.code == code }
            resultLanguages.removeAll(duplicates)

            val allNames = mutableListOf<String>()
            duplicates.forEach {
                allNames.addAll(it.names)
            }

            val allCountryCodes = mutableListOf<String>()
            duplicates.forEach {
                allCountryCodes.addAll(it.countryCodes)
            }

            val mergedLanguage = Language(code, allNames.distinct(), allCountryCodes.distinct())
            resultLanguages.add(mergedLanguage)
        }

        println("Merged duplicate codes: $duplicateCodes")

        return resultLanguages
    }

    private fun writeToFile(outputFile: File, uniqueLanguages: List<Language>) {
        val languageGroup = AllLanguages(uniqueLanguages)
        val moshi = Moshi.Builder()
            .addLast(KotlinJsonAdapterFactory())
            .build()
        val adapter = moshi.adapter(AllLanguages::class.java)
        val json = adapter.toJson(languageGroup)
        outputFile.writeText(json)
    }

    private data class RawLanguage(
        /** ISO-639-3 code of language */
        val code: String?,
        /** Name of language in English */
        val name: String,
        /** List of ISO 3166-1 alpha-2 country codes */
        val countryCodes: List<String>
    )

    private data class OtherNamesData(
        /** ISO-639-3 code of language */
        val code: String,
        val name: String,
        val autonyms: List<String>
    )
}