package com.lukeneedham.languagecountries

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

object LanguageProvider {

    private const val jsonFilePath = "/data.json"

    private val moshi = Moshi.Builder()
        .addLast(KotlinJsonAdapterFactory())
        .build()

    private val adapter = moshi.adapter(AllLanguages::class.java)

    val allLanguages: AllLanguages? by lazy {
        val stream = javaClass.getResourceAsStream(jsonFilePath) ?: return@lazy null
        val json = stream.bufferedReader().readText()
        adapter.fromJson(json)
    }
}