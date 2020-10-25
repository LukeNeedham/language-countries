package com.lukeneedham.languagecountries

data class Language internal constructor(
    /** ISO-639-3 code of language */
    val code: String?,
    /** All names of language */
    val names: List<String>,
    /** List of ISO 3166-1 alpha-2 country codes */
    val countryCodes: List<String>
)