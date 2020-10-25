This project provides a Kotlin enum (`LanguageCountries`) which provides a number of languages with:
- Their ISO-639-3 code
- A number of its names (both in English and autonyms)
- A list of ISO 3166-1 alpha-2 country codes, where the language is used

# Method

The parsing of data is done in the internal `Parser` object.

This does some processing, including:

- Merging languages with the same ISO code, so they are considered alternative names
- Adding alternative names for each language

# Usage

Use with Jitpack:

[![](https://jitpack.io/v/LukeNeedham/language-countries.svg)](https://jitpack.io/#LukeNeedham/language-countries)

And then simply use `LanguageProvider.allLanguages`.

# References

The bulk of the data comes directly from:

`Dryer, Matthew S. & Haspelmath, Martin (eds.) 2013. The World Atlas of Language Structures Online. Leipzig: Max Planck Institute for Evolutionary Anthropology. (Available online at http://wals.info, Accessed on September 7, 2017.)`

This is combined with autonym data from:

`https://github.com/bbqsrc/iso639-databases`
