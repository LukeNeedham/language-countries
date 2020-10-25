package com.lukeneedham.languagecountries.parser

import java.io.File
import java.lang.StringBuilder

internal object Parser {

    internal fun parse(inputFolderPath: String, outputFolderPath: String) {
        val outputDir = File(outputFolderPath)
        val inputDir = File(inputFolderPath)
        val inputFile = File(inputDir, "language.csv")
        val otherNamesFile = File(inputDir, "other_names.tsv")
        val outputFile = File(outputDir, "LanguageCountries.java")

        val languages = readEntries(inputFile)
        val languagesWithOtherNames = addOtherNames(otherNamesFile, languages)
        val uniqueLanguages = mergeDuplicateCodes(languagesWithOtherNames)

        writeToEnum(outputFile, uniqueLanguages)
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

    private fun addOtherNames(otherNamesFile: File, languages: List<RawLanguage>): List<ResultLanguage> {
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
                ?: return@map ResultLanguage(rawCode, listOf(rawLanguage.name), rawLanguage.countryCodes)
            val names = listOf(rawLanguage.name, otherNamesData.name)
            val autonyms = otherNamesData.autonyms
            val allNames = (names + autonyms).distinct()
            ResultLanguage(rawCode, allNames, rawLanguage.countryCodes)
        }
    }

    private fun mergeDuplicateCodes(languages: List<ResultLanguage>): List<ResultLanguage> {
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

            val mergedLanguage = ResultLanguage(code, allNames.distinct(), allCountryCodes.distinct())
            resultLanguages.add(mergedLanguage)
        }

        println("Merged duplicate codes: $duplicateCodes")

        return resultLanguages
    }

    private fun writeToEnum(outputFile: File, uniqueLanguages: List<ResultLanguage>) {
        val outputText = StringBuilder()
        outputText.append(
            """package com.lukeneedham.languagecountries;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public enum LanguageCountries {"""
        )
        uniqueLanguages.forEachIndexed { index, resultLanguage ->
            val nameTextsToRemove = listOf("(", ")", "'", "/", "|", "=", "\"", "!", ":", ".")
            val nameTextsToConvert = listOf(" ", "-")
            var name = resultLanguage.names.first()
            nameTextsToRemove.forEach {
                name = name.replace(it, "")
            }
            nameTextsToConvert.forEach {
                name = name.replace(it, "_")
            }

            val code = resultLanguage.code
            val formattedCode = if (code == null) null else "\"${code}\""

            outputText.append("""
    $name(
        $formattedCode, 
        new String[] {${
                resultLanguage.names.joinToString(", ") {
                    val escaped = it.replace("\"", "\\\"")
                    "\"$escaped\""
                }
            }},
        new String[] {${resultLanguage.countryCodes.joinToString(", ") { "\"$it\"" }}}
    )"""
            )
            val separator = if (index != uniqueLanguages.lastIndex) "," else ";"
            outputText.append(separator)
        }

        outputText.append(
            """
                
    /** ISO-639-3 code of language */
    public @Nullable String code;
    
    /** All names of language */
    public @NotNull String[] names;
    
    /** List of ISO 3166-1 alpha-2 country codes */
    public @NotNull String[] countryCodes;
    
    private LanguageCountries(@Nullable String code, @NotNull String[] names, @NotNull String[] countryCodes) {
        this.code = code;
        this.names = names;
        this.countryCodes = countryCodes;
    }
}
"""
        )

        outputFile.writeText(outputText.toString())
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

    private data class ResultLanguage(
        /** ISO-639-3 code of language */
        val code: String?,
        /** All names of language */
        val names: List<String>,
        /** List of ISO 3166-1 alpha-2 country codes */
        val countryCodes: List<String>
    )
}