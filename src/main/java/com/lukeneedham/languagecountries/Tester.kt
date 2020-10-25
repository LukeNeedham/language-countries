package com.lukeneedham.languagecountries

internal fun main(args: Array<String>) {
    print(LanguageProvider.allLanguages?.languages?.map { it.code })
}