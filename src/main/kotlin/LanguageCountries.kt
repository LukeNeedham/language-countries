package com.lukeneedham.languagedata

enum class LanguageCountries(
    /** ISO-639-3 code of language */
    val code: String?,
    /** All names of language */
    val names: List<String>,
    /** List of ISO 3166-1 alpha-2 country codes */
    val countryCodes: List<String>
) {
    Arapesh_Abu(
        null, 
        listOf("Arapesh (Abu)"),
        listOf("PG")
    ),
    Aari(
        "aiw", 
        listOf("Aari"),
        listOf("ET")
    ),
    Abau(
        "aau", 
        listOf("Abau"),
        listOf("PG")
    ),
    Abidji(
        "abi", 
        listOf("Abidji"),
        listOf("CI")
    ),
    Arabic_Bahrain(
        "abv", 
        listOf("Arabic (Bahrain)", "Baharna Arabic", "العربية البحرانية‎ (Arab Bahraini)"),
        listOf("BH")
    ),
    Abipón(
        "axb", 
        listOf("Abipón", "Abipon"),
        listOf("AR")
    ),
    Abkhaz(
        "abk", 
        listOf("Abkhaz", "Abkhazian", "аҧсуа бызшәа‎ (Aṗsua byzšwa)", "аҧсшәа‎ (Aṗsšwa)"),
        listOf("GE")
    ),
    Alabama(
        "akz", 
        listOf("Alabama"),
        listOf("US")
    ),
    Arabana(
        "ard", 
        listOf("Arabana"),
        listOf("AU")
    ),
    Arbore(
        "arv", 
        listOf("Arbore"),
        listOf("ET")
    ),
    Abun(
        "kgr", 
        listOf("Abun"),
        listOf("ID")
    ),
    Abui(
        "abz", 
        listOf("Abui"),
        listOf("ID")
    ),
    Abenaki_Western(
        "abe", 
        listOf("Abenaki (Western)", "Western Abnaki", "Alnôbak"),
        listOf("US", "CA")
    ),
    Abaza(
        "abq", 
        listOf("Abaza", "абаза‎ (Abaza)", "абаза бызшва‎ (Abaza byzšva)"),
        listOf("RU")
    ),
    Acehnese(
        "ace", 
        listOf("Acehnese", "Achinese", "Aceh", "Basa Acèh"),
        listOf("ID")
    ),
    Achagua(
        "aca", 
        listOf("Achagua"),
        listOf("CO")
    ),
    Aché(
        "guq", 
        listOf("Aché"),
        listOf("PY")
    ),
    Achí(
        "acr", 
        listOf("Achí", "Achi", "Qach’a’teem"),
        listOf("GT")
    ),
    Acholi(
        "ach", 
        listOf("Acholi", "Acoli"),
        listOf("UG", "SD")
    ),
    Achumawi(
        "acv", 
        listOf("Achumawi"),
        listOf("US")
    ),
    Achang(
        "acn", 
        listOf("Achang", "Ngochang"),
        listOf("MM", "CN")
    ),
    Acoma(
        "kjq", 
        listOf("Acoma", "Western Keres"),
        listOf("US")
    ),
    Achuar(
        "acu", 
        listOf("Achuar", "Achuar-Shiwiar", "Achuar Chicham", "Shiwiar Chicham"),
        listOf("PE")
    ),
    Adamorobe_Sign_Language(
        "ads", 
        listOf("Adamorobe Sign Language"),
        listOf("GH")
    ),
    Adang(
        "adn", 
        listOf("Adang"),
        listOf("ID")
    ),
    Adioukrou(
        "adj", 
        listOf("Adioukrou"),
        listOf("CI")
    ),
    Andoke(
        "ano", 
        listOf("Andoke", "Andoque"),
        listOf("CO")
    ),
    Adynyamathanha(
        "adt", 
        listOf("Adynyamathanha", "Adnyamathanha"),
        listOf("AU")
    ),
    Adzera(
        "adz", 
        listOf("Adzera"),
        listOf("PG")
    ),
    Arabic_Egyptian(
        "arz", 
        listOf("Arabic (Egyptian)", "Egyptian Arabic", "مصري‎ (Masri)"),
        listOf("EG")
    ),
    Arabic_Eastern_Libyan(
        "ayl", 
        listOf("Arabic (Eastern Libyan)", "Libyan Arabic", "ليبي‎ (Lībi)"),
        listOf("LY")
    ),
    Afrikaans(
        "afr", 
        listOf("Afrikaans"),
        listOf("ZA")
    ),
    Agarabi(
        "agd", 
        listOf("Agarabi"),
        listOf("PG")
    ),
    Leggbó(
        "agb", 
        listOf("Leggbó", "Legbo"),
        listOf("NG")
    ),
    Agta_Central(
        "agt", 
        listOf("Agta (Central)", "Central Cagayan Agta", "Agta"),
        listOf("PH")
    ),
    Agta_Dupaningan(
        "duo", 
        listOf("Agta (Dupaningan)", "Dupaninan Agta"),
        listOf("PH")
    ),
    Aghem(
        "agq", 
        listOf("Aghem"),
        listOf("CM")
    ),
    Aghul(
        "agx", 
        listOf("Aghul", "агъул‎ (Aġul)", "агъул чӀал‎ (Ağul ҫ̇al)"),
        listOf("RU")
    ),
    Angami(
        "nri", 
        listOf("Angami", "Chokri Naga"),
        listOf("IN")
    ),
    Angolar(
        "aoa", 
        listOf("Angolar"),
        listOf("ST")
    ),
    Aguaruna(
        "agr", 
        listOf("Aguaruna", "Awajún"),
        listOf("PE")
    ),
    Aguacatec(
        "agu", 
        listOf("Aguacatec", "Aguacateco", "Qa’yol"),
        listOf("GT")
    ),
    Alagwa(
        "wbj", 
        listOf("Alagwa", "Alagwaisa"),
        listOf("TZ")
    ),
    Arapaho(
        "arp", 
        listOf("Arapaho", "Hinónoʼeitíít"),
        listOf("US")
    ),
    Arabic_Bani_Hassan(
        "mey", 
        listOf("Arabic (Bani-Hassan)", "Hassaniyya", "حسانية‎‎‎ (Ḥassānīya)"),
        listOf("MR")
    ),
    Ahtna(
        "aht", 
        listOf("Ahtna", "Ahtena"),
        listOf("US")
    ),
    Aghu(
        "ahh", 
        listOf("Aghu"),
        listOf("ID")
    ),
    Aikaná(
        "tba", 
        listOf("Aikaná", "Aikanã"),
        listOf("BR")
    ),
    Ainu(
        "ain", 
        listOf("Ainu", "アイヌ‎ (Aynu)", "アイヌ イタㇰ‎ (Aynu itak)"),
        listOf("JP")
    ),
    Aizi(
        "ahp", 
        listOf("Aizi", "Aproumu Aizi"),
        listOf("CI")
    ),
    Aja(
        "aja", 
        listOf("Aja", "Aja (Sudan)"),
        listOf("SD", "CF")
    ),
    Ajagbe(
        "ajg", 
        listOf("Ajagbe", "Aja (Benin)"),
        listOf("TG", "BJ")
    ),
    Ajië(
        "aji", 
        listOf("Ajië"),
        listOf("NC")
    ),
    Aka(
        "axk", 
        listOf("Aka", "Yaka (Central African Republic)"),
        listOf("CF", "CG")
    ),
    Aka_Biada(
        "abj", 
        listOf("Aka-Biada", "Aka-Bea"),
        listOf("IN")
    ),
    Aka_Cari(
        "aci", 
        listOf("Aka-Cari"),
        listOf("IN")
    ),
    Akha(
        "ahk", 
        listOf("Akha", "A˯ka˯daw˯‎ (Avkavdawv)"),
        listOf("MM", "TH", "CN")
    ),
    Aka_Kede(
        "akx", 
        listOf("Aka-Kede"),
        listOf("IN")
    ),
    Aklanon(
        "akl", 
        listOf("Aklanon", "Inakeanon"),
        listOf("PH")
    ),
    Arakanese_Marma(
        "mhv", 
        listOf("Arakanese (Marma)"),
        listOf("MM", "BD")
    ),
    Akan(
        "aka", 
        listOf("Akan"),
        listOf("GH")
    ),
    Arabic_Kormakiti(
        "acy", 
        listOf("Arabic (Kormakiti)", "Cypriot Arabic", "Sanna"),
        listOf("CY")
    ),
    Arikara(
        "ari", 
        listOf("Arikara"),
        listOf("US")
    ),
    Akawaio(
        "ake", 
        listOf("Akawaio", "Kapon"),
        listOf("GY")
    ),
    Alamblak(
        "amp", 
        listOf("Alamblak"),
        listOf("PG")
    ),
    Albanian(
        "aln", 
        listOf("Albanian", "Gheg Albanian", "Gegnisht-Shqyp", "Shqyp"),
        listOf("AL", "RS")
    ),
    Allentiac(
        null, 
        listOf("Allentiac"),
        listOf("AR")
    ),
    Alladian(
        "ald", 
        listOf("Alladian"),
        listOf("CI")
    ),
    Algonquin(
        "alq", 
        listOf("Algonquin", "Anishinaabemowin"),
        listOf("CA")
    ),
    Arop_Lokep(
        "apr", 
        listOf("Arop-Lokep"),
        listOf("PG")
    ),
    Alaala(
        "nrz", 
        listOf("Ala'ala", "Lala"),
        listOf("PG")
    ),
    Alune(
        "alp", 
        listOf("Alune"),
        listOf("ID")
    ),
    Alsea(
        "aes", 
        listOf("Alsea"),
        listOf("US")
    ),
    Alutor(
        "alr", 
        listOf("Alutor"),
        listOf("RU")
    ),
    Alawa(
        "alh", 
        listOf("Alawa"),
        listOf("AU")
    ),
    Alas(
        "btz", 
        listOf("Alas", "Batak Alas-Kluet"),
        listOf("ID")
    ),
    Alyawarra(
        "aly", 
        listOf("Alyawarra", "Alyawarr"),
        listOf("AU")
    ),
    Amara(
        "aie", 
        listOf("Amara"),
        listOf("PG")
    ),
    Ambulas(
        "abt", 
        listOf("Ambulas"),
        listOf("PG")
    ),
    Amahuaca(
        "amc", 
        listOf("Amahuaca", "Yora"),
        listOf("PE", "BR")
    ),
    Amele(
        "aey", 
        listOf("Amele"),
        listOf("PG")
    ),
    Amharic(
        "amh", 
        listOf("Amharic", "አማርኛ"),
        listOf("ET")
    ),
    Amis(
        "ami", 
        listOf("Amis"),
        listOf("TW")
    ),
    Amarakaeri(
        "amr", 
        listOf("Amarakaeri", "Harakmbut"),
        listOf("PE")
    ),
    Ambae_Lolovoli_Northeast(
        "omb", 
        listOf("Ambae (Lolovoli Northeast)", "East Ambae"),
        listOf("VU")
    ),
    Ama(
        "amm", 
        listOf("Ama", "Ama (Papua New Guinea)"),
        listOf("PG")
    ),
    Amanab(
        "amn", 
        listOf("Amanab", "Awai"),
        listOf("PG")
    ),
    Amo(
        "amo", 
        listOf("Amo", "Timap"),
        listOf("NG")
    ),
    Arrernte_Mparntwe(
        "aer", 
        listOf("Arrernte (Mparntwe)", "Eastern Arrernte", "Arrernte"),
        listOf("AU")
    ),
    Ambai(
        "amk", 
        listOf("Ambai"),
        listOf("ID")
    ),
    Arabic_Moroccan(
        "ary", 
        listOf("Arabic (Moroccan)", "Moroccan Arabic", "الدارجة‎ (Darija)"),
        listOf("MA")
    ),
    Arabic_Modern_Standard(
        "arb", 
        listOf("Arabic (Modern Standard)", "Standard Arabic", "العربية‎ (al-ʻArabīyah)"),
        listOf("KM", "KW", "SO", "SY", "OM", "QA", "EG", "TN", "MA", "LY", "JO", "LB", "ER", "YE", "SA", "IQ", "PS", "DZ", "AE", "BH", "SD", "IL")
    ),
    Yanesha(
        "ame", 
        listOf("Yanesha'", "Yanesha’"),
        listOf("PE")
    ),
    Anamuxra(
        "imi", 
        listOf("Anamuxra", "Anamgura"),
        listOf("PG")
    ),
    Amuzgo(
        "amu", 
        listOf("Amuzgo", "Guerrero Amuzgo", "Ñomndaa"),
        listOf("MX")
    ),
    Araona(
        "aro", 
        listOf("Araona"),
        listOf("BO")
    ),
    Angas(
        "anc", 
        listOf("Angas", "Ngas"),
        listOf("NG")
    ),
    Anêm(
        "anz", 
        listOf("Anêm", "Anem"),
        listOf("PG")
    ),
    Anggor(
        "agg", 
        listOf("Anggor", "Angor"),
        listOf("PG")
    ),
    Ani(
        "hnh", 
        listOf("//Ani"),
        listOf("BW")
    ),
    Anejom(
        "aty", 
        listOf("Anejom", "Aneityum", "Intas Anejom"),
        listOf("VU")
    ),
    Anindilyakwa(
        "aoi", 
        listOf("Anindilyakwa"),
        listOf("AU")
    ),
    Anong(
        "nun", 
        listOf("Anong"),
        listOf("CN", "MM")
    ),
    Angaatiha(
        "agm", 
        listOf("Angaatiha", "Angaataha"),
        listOf("PG")
    ),
    Anufo(
        "cko", 
        listOf("Anufo"),
        listOf("GH", "TG", "BJ")
    ),
    Andi(
        "ani", 
        listOf("Andi", "къIaваннаб мицци‎ (Qwavannab Micci)", "мицци‎ (Micci)"),
        listOf("RU")
    ),
    Anywa(
        "anu", 
        listOf("Anywa", "Anuak"),
        listOf("ET")
    ),
    Ao(
        "njo", 
        listOf("Ao", "Ao Naga"),
        listOf("IN")
    ),
    Mufian(
        "aoj", 
        listOf("Mufian"),
        listOf("PG")
    ),
    Apache_Chiricahua(
        "apm", 
        listOf("Apache (Chiricahua)", "Mescalero-Chiricahua Apache", "Ndee bizaa"),
        listOf("US")
    ),
    Ampeeli(
        "apz", 
        listOf("Ampeeli", "Safeyoka"),
        listOf("PG")
    ),
    Apinayé(
        "apn", 
        listOf("Apinayé"),
        listOf("BR")
    ),
    Apache_Jicarilla(
        "apj", 
        listOf("Apache (Jicarilla)", "Jicarilla Apache", "Abáachi mizaa", "Jicarilla Abáachi"),
        listOf("US")
    ),
    Apalaí(
        "apy", 
        listOf("Apalaí"),
        listOf("BR")
    ),
    Apatani(
        "apt", 
        listOf("Apatani"),
        listOf("IN")
    ),
    Apurinã(
        "apu", 
        listOf("Apurinã"),
        listOf("BR")
    ),
    Apache_Western(
        "apw", 
        listOf("Apache (Western)", "Western Apache", "Ndee biyáti’"),
        listOf("US")
    ),
    Arawak(
        "arw", 
        listOf("Arawak", "Lokono"),
        listOf("SR")
    ),
    Arabela(
        "arl", 
        listOf("Arabela", "Tapueyocaca"),
        listOf("PE")
    ),
    Archi(
        "aqc", 
        listOf("Archi"),
        listOf("RU")
    ),
    Arandai(
        "jbj", 
        listOf("Arandai"),
        listOf("ID")
    ),
    Arabic_Hijazi(
        "acw", 
        listOf("Arabic (Hijazi)", "Hijazi Arabic"),
        listOf("SA")
    ),
    Aribwatsa(
        "laz", 
        listOf("Aribwatsa"),
        listOf("PG")
    ),
    Araki(
        "akr", 
        listOf("Araki"),
        listOf("VU")
    ),
    Arosi(
        "aia", 
        listOf("Arosi"),
        listOf("SB")
    ),
    Arapesh_Mountain(
        "ape", 
        listOf("Arapesh (Mountain)", "Bukiyip"),
        listOf("PG")
    ),
    Arabic_Iraqi(
        "acm", 
        listOf("Arabic (Iraqi)", "Mesopotamian Arabic", "عراقي‎ (ʕirāgi)"),
        listOf("IQ")
    ),
    Arabic_Sanani(
        "ayn", 
        listOf("Arabic (San'ani)", "Sanaani Arabic"),
        listOf("YE")
    ),
    Areare(
        "alu", 
        listOf("'Are'are", "’Are’are"),
        listOf("SB")
    ),
    American_Sign_Language(
        "ase", 
        listOf("American Sign Language"),
        listOf("CA", "US")
    ),
    Asmat(
        "tml", 
        listOf("Asmat", "Tamnim Citak"),
        listOf("ID")
    ),
    Altai_Southern(
        "alt", 
        listOf("Altai (Southern)", "Southern Altai", "алтай тили‎ (Altay tili)", "алтайча‎ (Altajča)"),
        listOf("RU")
    ),
    Assamese(
        "asm", 
        listOf("Assamese", "অসমীয়া"),
        listOf("IN")
    ),
    Asturian(
        "ast", 
        listOf("Asturian", "asturianu"),
        listOf("ES")
    ),
    Asuriní(
        "asu", 
        listOf("Asuriní", "Tocantins Asurini"),
        listOf("BR")
    ),
    Atayal(
        "tay", 
        listOf("Atayal"),
        listOf("TW")
    ),
    Aralle_Tabulahan(
        "atq", 
        listOf("Aralle-Tabulahan"),
        listOf("ID")
    ),
    Atchin(
        "upv", 
        listOf("Atchin", "Uripiv-Wala-Rano-Atchin", "Tirax"),
        listOf("VU")
    ),
    Athpare(
        "aph", 
        listOf("Athpare", "Athpariya", "आठपहरिया‎ (Āṭhapahariyā)"),
        listOf("NP")
    ),
    Atikamekw(
        "atj", 
        listOf("Atikamekw"),
        listOf("CA")
    ),
    Atakapa(
        "aqp", 
        listOf("Atakapa"),
        listOf("US")
    ),
    Atacameño(
        "kuz", 
        listOf("Atacameño", "Kunza"),
        listOf("BO", "CL", "AR")
    ),
    Alutiiq(
        "ems", 
        listOf("Alutiiq", "Pacific Gulf Yupik", "Aleut"),
        listOf("US")
    ),
    Atsugewi(
        "atw", 
        listOf("Atsugewi"),
        listOf("US")
    ),
    Arabic_Tunisian(
        "aeb", 
        listOf("Arabic (Tunisian)", "Tunisian Arabic", "Derja", "تونسي‎ (Tounsi)"),
        listOf("TN")
    ),
    Au(
        "avt", 
        listOf("Au"),
        listOf("PG")
    ),
    Aulua(
        "aul", 
        listOf("Aulua"),
        listOf("VU")
    ),
    Auslan(
        "asf", 
        listOf("Auslan", "Australian Sign Language"),
        listOf("AU")
    ),
    Auyana(
        "auy", 
        listOf("Auyana", "Awiyaana"),
        listOf("PG")
    ),
    Avar(
        "ava", 
        listOf("Avar", "Avaric", "авар мацӏ‎ (Awar mac̣)", "магӏарул мацӏ‎ (Maʿarul mac̣)"),
        listOf("RU", "AZ")
    ),
    Avikam(
        "avi", 
        listOf("Avikam"),
        listOf("CI")
    ),
    Avokaya(
        "avu", 
        listOf("Avokaya"),
        listOf("SD", "CD")
    ),
    Avatime(
        "avn", 
        listOf("Avatime", "Si-yà"),
        listOf("GH")
    ),
    Awa(
        "awb", 
        listOf("Awa", "Awa (Papua New Guinea)"),
        listOf("PG")
    ),
    Awadhi(
        "awa", 
        listOf("Awadhi", "अवधी‎ (Awadhi)"),
        listOf("NP", "IN")
    ),
    Aekyom(
        "awi", 
        listOf("Aekyom"),
        listOf("PG")
    ),
    Akwa(
        "png", 
        listOf("Akwa", "Pongu", "Tarin"),
        listOf("NG")
    ),
    Awngi(
        "awn", 
        listOf("Awngi"),
        listOf("ET")
    ),
    Awa_Pit(
        "kwi", 
        listOf("Awa Pit", "Awa-Cuaiquer", "Înkal Awa"),
        listOf("EC", "CO")
    ),
    Awtuw(
        "kmn", 
        listOf("Awtuw"),
        listOf("PG")
    ),
    Awyi(
        "auw", 
        listOf("Awyi"),
        listOf("ID")
    ),
    Akhvakh(
        "akv", 
        listOf("Akhvakh"),
        listOf("RU")
    ),
    Anyi(
        "any", 
        listOf("Anyi", "Anyin"),
        listOf("CI")
    ),
    Aymara_Central(
        "ayc", 
        listOf("Aymara (Central)", "Southern Aymara"),
        listOf("PE", "CL", "BO")
    ),
    Aynu(
        "aib", 
        listOf("Aynu", "Ainu (China)"),
        listOf("CN")
    ),
    Ayomán(
        null, 
        listOf("Ayomán"),
        listOf("VR")
    ),
    Ayoreo(
        "ayo", 
        listOf("Ayoreo", "Morotoco"),
        listOf("PY")
    ),
    Ayiwo(
        "nfl", 
        listOf("Ayiwo"),
        listOf("SB")
    ),
    Barai(
        "bbb", 
        listOf("Barai"),
        listOf("PG")
    ),
    Babungo(
        "bav", 
        listOf("Babungo", "Vengo"),
        listOf("CM")
    ),
    Bade(
        "bde", 
        listOf("Bade", "Gabaden"),
        listOf("NG")
    ),
    Baré(
        "bae", 
        listOf("Baré"),
        listOf("BR", "VR")
    ),
    Bafut(
        "bfd", 
        listOf("Bafut"),
        listOf("CM")
    ),
    Bagirmi(
        "bmi", 
        listOf("Bagirmi", "Barma"),
        listOf("TD")
    ),
    Xiriana(
        "xir", 
        listOf("Xiriana", "Xiriâna"),
        listOf("BR")
    ),
    Bai(
        "bca", 
        listOf("Bai", "Central Bai", "白语‎ (Baip‧ngvp‧zix)"),
        listOf("CN")
    ),
    Bajau_Sama(
        "bdl", 
        listOf("Bajau (Sama)", "Indonesian Bajau"),
        listOf("ID")
    ),
    Baka_in_Cameroon(
        "bkc", 
        listOf("Baka (in Cameroon)", "Baka (Cameroon)"),
        listOf("CM")
    ),
    Balinese(
        "ban", 
        listOf("Balinese", "Basa Bali"),
        listOf("ID")
    ),
    Bambara(
        "bam", 
        listOf("Bambara", "bamanakan"),
        listOf("ML")
    ),
    Bana(
        "bcw", 
        listOf("Bana"),
        listOf("CM")
    ),
    Baoan(
        "peh", 
        listOf("Bao'an", "Bonan"),
        listOf("CN")
    ),
    Baure(
        "brg", 
        listOf("Baure"),
        listOf("BO")
    ),
    Basaá(
        "bas", 
        listOf("Basaá", "Basaa", "Ɓàsàa"),
        listOf("CM")
    ),
    Batak(
        "bya", 
        listOf("Batak"),
        listOf("PH")
    ),
    Bau(
        "bbd", 
        listOf("Bau"),
        listOf("PG")
    ),
    Bawm(
        "bgr", 
        listOf("Bawm", "Bawm Chin"),
        listOf("BD", "IN", "MM")
    ),
    Bobo_Madaré_Northern(
        "bbo", 
        listOf("Bobo Madaré (Northern)", "Northern Bobo Madaré"),
        listOf("BF")
    ),
    Babole(
        "bvx", 
        listOf("Babole", "Dibole"),
        listOf("CG")
    ),
    Bambam(
        "ptu", 
        listOf("Bambam"),
        listOf("ID")
    ),
    Barambu(
        "brm", 
        listOf("Barambu"),
        listOf("CD")
    ),
    Bininj_Gun_Wok(
        "gup", 
        listOf("Bininj Gun-Wok", "Gunwinggu"),
        listOf("AU")
    ),
    Berber_Chaouia(
        "shy", 
        listOf("Berber (Chaouia)", "Tachawit"),
        listOf("DZ")
    ),
    Bella_Coola(
        "blc", 
        listOf("Bella Coola"),
        listOf("CA")
    ),
    Berbice_Dutch_Creole(
        "brc", 
        listOf("Berbice Dutch Creole", "Berbice Creole Dutch"),
        listOf("GY")
    ),
    Badaga(
        "bfq", 
        listOf("Badaga", "ಬಡಗ‎ (Badaga)"),
        listOf("IN")
    ),
    Budukh(
        "bdk", 
        listOf("Budukh"),
        listOf("AZ")
    ),
    Badimaya(
        "bia", 
        listOf("Badimaya"),
        listOf("AU")
    ),
    Budu(
        "buu", 
        listOf("Budu"),
        listOf("CD")
    ),
    Baham(
        "bdw", 
        listOf("Baham"),
        listOf("ID")
    ),
    Benabena(
        "bef", 
        listOf("Benabena"),
        listOf("PG")
    ),
    Bengali_Chittagong(
        "ctg", 
        listOf("Bengali (Chittagong)", "Chittagonian", "চাঁটগাঁইয়া বুলি‎ (Caṭgãia Buli)"),
        listOf("BD")
    ),
    Beembe(
        "beq", 
        listOf("Beembe"),
        listOf("CG")
    ),
    Begak_Idaan(
        "dbj", 
        listOf("Begak-Ida'an", "Ida'an"),
        listOf("MY")
    ),
    Beja(
        "bej", 
        listOf("Beja", "Bedàwie", "Tu Bdhaawi"),
        listOf("ER", "SD")
    ),
    Belhare(
        "byw", 
        listOf("Belhare", "Belhariya"),
        listOf("NP")
    ),
    Bemba(
        "bmy", 
        listOf("Bemba"),
        listOf("CD")
    ),
    Bengali(
        "ben", 
        listOf("Bengali", "Bangla", "বাংলা"),
        listOf("IN", "BD")
    ),
    Beothuk(
        "bue", 
        listOf("Beothuk"),
        listOf("CA")
    ),
    Berta(
        "wti", 
        listOf("Berta", "Rotana"),
        listOf("ET", "SD")
    ),
    Bété(
        "bev", 
        listOf("Bété", "Daloa Bété"),
        listOf("CI")
    ),
    Bezhta(
        "kap", 
        listOf("Bezhta"),
        listOf("RU")
    ),
    Biafada(
        "bif", 
        listOf("Biafada"),
        listOf("GW")
    ),
    Berber_Figuig(
        null, 
        listOf("Berber (Figuig)"),
        listOf("MA")
    ),
    Bafia(
        "ksf", 
        listOf("Bafia", "rikpa"),
        listOf("CM")
    ),
    Benga(
        "bng", 
        listOf("Benga"),
        listOf("GQ", "GA")
    ),
    Banggai(
        "bgz", 
        listOf("Banggai"),
        listOf("ID")
    ),
    Bagri(
        "bgq", 
        listOf("Bagri", "बागड़ी‎ (Bagri)"),
        listOf("IN")
    ),
    Buglere(
        "sab", 
        listOf("Buglere"),
        listOf("PA")
    ),
    Bangime(
        "dba", 
        listOf("Bangime"),
        listOf("ML")
    ),
    Bugun(
        "bgg", 
        listOf("Bugun"),
        listOf("IN")
    ),
    Bongo(
        "bot", 
        listOf("Bongo"),
        listOf("SD")
    ),
    Bagiro(
        "fuu", 
        listOf("Bagiro", "Furu"),
        listOf("CF", "CD")
    ),
    Baga_Sitemu(
        "bsp", 
        listOf("Baga Sitemu"),
        listOf("GN")
    ),
    Bagvalal(
        "kva", 
        listOf("Bagvalal"),
        listOf("RU")
    ),
    Banggi(
        "bdg", 
        listOf("Banggi", "Bonggi"),
        listOf("MY")
    ),
    Bhili(
        "bhb", 
        listOf("Bhili", "भीली‎ (Bhīlī)"),
        listOf("IN")
    ),
    Bahinemo(
        "bjh", 
        listOf("Bahinemo"),
        listOf("PG")
    ),
    Bhojpuri(
        "bho", 
        listOf("Bhojpuri", "भोजपुरी‎ (Bhōjpurī)"),
        listOf("IN")
    ),
    Bira(
        "bip", 
        listOf("Bira", "Bila"),
        listOf("CD")
    ),
    Bidiya(
        "bid", 
        listOf("Bidiya", "Bidiyo"),
        listOf("TD")
    ),
    Biri(
        "bzr", 
        listOf("Biri"),
        listOf("AU")
    ),
    Biak(
        "bhw", 
        listOf("Biak", "Wós Kovedi", "Wós Vyak"),
        listOf("ID")
    ),
    Bilua(
        "blb", 
        listOf("Bilua"),
        listOf("SB")
    ),
    Bima(
        "bhp", 
        listOf("Bima"),
        listOf("ID")
    ),
    Binandere(
        "bhg", 
        listOf("Binandere"),
        listOf("PG")
    ),
    Nai(
        "bio", 
        listOf("Nai"),
        listOf("PG")
    ),
    Bilaan(
        "bps", 
        listOf("Bilaan", "Sarangani Blaan"),
        listOf("PH")
    ),
    Birom(
        "bom", 
        listOf("Birom", "Berom"),
        listOf("NG")
    ),
    Bisa(
        "bib", 
        listOf("Bisa", "Bissa"),
        listOf("GH", "BF")
    ),
    Biatah(
        "bth", 
        listOf("Biatah", "Biatah Bidayuh"),
        listOf("ID", "MY")
    ),
    Bisu(
        "lwm", 
        listOf("Bisu", "Laomian"),
        listOf("TH")
    ),
    Sama_Southern(
        "ssb", 
        listOf("Sama (Southern)", "Southern Sama", "Sinama", "Tawi-Tawi Sinama"),
        listOf("MY", "PH")
    ),
    Baka_in_Sudan(
        "bdh", 
        listOf("Baka (in Sudan)", "Baka (Sudan)"),
        listOf("SD")
    ),
    Betta_Kurumba(
        "xub", 
        listOf("Betta Kurumba"),
        listOf("IN")
    ),
    Binukid(
        "bkd", 
        listOf("Binukid"),
        listOf("PH")
    ),
    Bakairí(
        "bkq", 
        listOf("Bakairí", "Kurâ"),
        listOf("BR")
    ),
    Bikol(
        "bcl", 
        listOf("Bikol", "Central Bikol"),
        listOf("PH")
    ),
    Batak_Karo(
        "btx", 
        listOf("Batak (Karo)", "Batak Karo"),
        listOf("ID")
    ),
    Brokskat(
        "bkk", 
        listOf("Brokskat"),
        listOf("PK", "IN")
    ),
    Bakueri(
        "bri", 
        listOf("Bakueri", "Mokpwe"),
        listOf("CM")
    ),
    Blackfoot(
        "bla", 
        listOf("Blackfoot", "Siksika", "ᓱᖽᐧᖿ‎ (Siksiká)"),
        listOf("CA", "US")
    ),
    Baluchi(
        "bgp", 
        listOf("Baluchi", "Eastern Balochi", "بلوچی‎ (Balōčī)", "بلوچی زبان‎ (Balōčī Zubān)"),
        listOf("PK", "IR", "AF")
    ),
    Baule(
        "bci", 
        listOf("Baule", "Baoulé"),
        listOf("CI")
    ),
    Balangao(
        "blw", 
        listOf("Balangao"),
        listOf("PH")
    ),
    Baale(
        "koe", 
        listOf("Baale", "Kacipo-Balesi", "Kacipo"),
        listOf("SD")
    ),
    Balantak(
        "blz", 
        listOf("Balantak"),
        listOf("ID")
    ),
    Bilin(
        "byn", 
        listOf("Bilin", "Blin", "ብሊን"),
        listOf("ER")
    ),
    Bole(
        "bol", 
        listOf("Bole"),
        listOf("NG")
    ),
    Belorussian(
        "bel", 
        listOf("Belorussian", "Belarusian", "беларуская"),
        listOf("BY")
    ),
    Balti(
        "bft", 
        listOf("Balti", "بلتی‎ (Baltī)", "སྦལ་འཐུས་‎ (Balti)"),
        listOf("IN", "PK")
    ),
    Biloxi(
        "bll", 
        listOf("Biloxi"),
        listOf("US")
    ),
    Balyku(
        "nad", 
        listOf("Balyku"),
        listOf("AU")
    ),
    Balanta(
        "bjt", 
        listOf("Balanta", "Balanta-Ganja"),
        listOf("SN", "GW")
    ),
    Bimoba(
        "bim", 
        listOf("Bimoba"),
        listOf("GH")
    ),
    Bamun(
        "bax", 
        listOf("Bamun", "Shüpamom"),
        listOf("CM")
    ),
    Burum(
        "bmu", 
        listOf("Burum", "Somba-Siawari", "Mindik"),
        listOf("PG")
    ),
    Berber_Mzab(
        "mzb", 
        listOf("Berber (Mzab)", "Tumzabt"),
        listOf("DZ")
    ),
    Bunuba(
        "bck", 
        listOf("Bunuba", "Bunaba"),
        listOf("AU")
    ),
    Bandi(
        "bza", 
        listOf("Bandi"),
        listOf("LR")
    ),
    Baining(
        "byx", 
        listOf("Baining", "Qaqet"),
        listOf("PG")
    ),
    Bini(
        "bin", 
        listOf("Bini", "Edo"),
        listOf("NG")
    ),
    Bankon(
        "abb", 
        listOf("Bankon"),
        listOf("CM")
    ),
    Banggarla(
        "bjb", 
        listOf("Banggarla"),
        listOf("AU")
    ),
    Binumarien(
        "bjr", 
        listOf("Binumarien"),
        listOf("PG")
    ),
    Banoni(
        "bcm", 
        listOf("Banoni", "Bannoni", "Tsunari"),
        listOf("PG")
    ),
    Waimaha(
        "bao", 
        listOf("Waimaha", "Waimaja"),
        listOf("CO")
    ),
    Beng(
        "nhb", 
        listOf("Beng"),
        listOf("CI")
    ),
    Bantik(
        "bnq", 
        listOf("Bantik"),
        listOf("ID")
    ),
    Bularnu(
        null, 
        listOf("Bularnu"),
        listOf("AU")
    ),
    Baniwa(
        "bwi", 
        listOf("Baniwa"),
        listOf("VR", "BR")
    ),
    Boazi(
        "kvg", 
        listOf("Boazi", "Kuni-Boazi"),
        listOf("PG")
    ),
    Bobangi(
        "bni", 
        listOf("Bobangi", "Bangi"),
        listOf("CD")
    ),
    Bodo(
        "brx", 
        listOf("Bodo", "बड़ो"),
        listOf("IN")
    ),
    Boiken(
        "bzf", 
        listOf("Boiken", "Boikin"),
        listOf("PG")
    ),
    Boko(
        "bqc", 
        listOf("Boko", "Boko (Benin)"),
        listOf("NG", "BJ")
    ),
    Bolia(
        "bli", 
        listOf("Bolia"),
        listOf("CD")
    ),
    Bongu(
        "bpu", 
        listOf("Bongu"),
        listOf("PG")
    ),
    Bora(
        "boa", 
        listOf("Bora", "Booraa", "Miamunaa"),
        listOf("CO", "PE")
    ),
    Bosnian(
        "bos", 
        listOf("Bosnian", "bosanski"),
        listOf("BA")
    ),
    Berber_Wargla(
        "oua", 
        listOf("Berber (Wargla)", "Tagargrent"),
        listOf("DZ")
    ),
    Bozo_Tigemaxo(
        "boz", 
        listOf("Bozo (Tigemaxo)", "Tiéyaxo Bozo", "Tieyaxo"),
        listOf("ML")
    ),
    Bura_Pabir(
        "bwr", 
        listOf("Bura-Pabir"),
        listOf("NG")
    ),
    Bahnar_Plei_Bong_Mang_Yang(
        "bdq", 
        listOf("Bahnar (Plei Bong-Mang Yang)", "Bahnar"),
        listOf("VN")
    ),
    Brao(
        "brb", 
        listOf("Brao", "Lave"),
        listOf("VN")
    ),
    Bariba(
        "bba", 
        listOf("Bariba", "Baatonum"),
        listOf("NG", "BJ")
    ),
    Boruca(
        "brn", 
        listOf("Boruca"),
        listOf("CR")
    ),
    Bardi(
        "bcj", 
        listOf("Bardi"),
        listOf("AU")
    ),
    Breton(
        "bre", 
        listOf("Breton", "brezhoneg"),
        listOf("FR")
    ),
    Berber_Rif(
        "rif", 
        listOf("Berber (Rif)", "Riffian"),
        listOf("DZ", "MA")
    ),
    Brahui(
        "brh", 
        listOf("Brahui", "براہوئی‎ (brāhūʾī)"),
        listOf("PK")
    ),
    Bribri(
        "bzd", 
        listOf("Bribri"),
        listOf("CR")
    ),
    Burji(
        "bji", 
        listOf("Burji"),
        listOf("ET")
    ),
    Berik(
        "bkl", 
        listOf("Berik"),
        listOf("ID")
    ),
    Baragaunle(
        "loy", 
        listOf("Baragaunle", "Loke", "ल्होवा‎ (Lhowa)"),
        listOf("NP")
    ),
    Burmese(
        "mya", 
        listOf("Burmese", "မြန်မာ"),
        listOf("MM")
    ),
    Burunge(
        "bds", 
        listOf("Burunge", "Burungaisoo"),
        listOf("TZ")
    ),
    Broken(
        "tcs", 
        listOf("Broken", "Torres Strait Creole"),
        listOf("AU")
    ),
    Barupu(
        "wra", 
        listOf("Barupu", "Warapu"),
        listOf("PG")
    ),
    Bororo(
        "bor", 
        listOf("Bororo", "Borôro", "Boe Wadáru"),
        listOf("BR")
    ),
    Barasano(
        "bsn", 
        listOf("Barasano", "Barasana-Eduria"),
        listOf("CO")
    ),
    Bru_Eastern(
        "bru", 
        listOf("Bru (Eastern)", "Eastern Bru"),
        listOf("LA")
    ),
    Bru_Western(
        "brv", 
        listOf("Bru (Western)", "Western Bru"),
        listOf("LA")
    ),
    Baruya(
        "byr", 
        listOf("Baruya"),
        listOf("PG")
    ),
    Birri(
        "bvq", 
        listOf("Birri"),
        listOf("CF")
    ),
    Bushoong(
        "buf", 
        listOf("Bushoong"),
        listOf("CD")
    ),
    Berber_Siwa(
        "siz", 
        listOf("Berber (Siwa)", "Siwi"),
        listOf("EG")
    ),
    Bashkir(
        "bak", 
        listOf("Bashkir", "башҡорт теле‎ (Başķort tele)", "башҡортса‎ (Başķortsa)"),
        listOf("RU")
    ),
    British_Sign_Language(
        "bfi", 
        listOf("British Sign Language"),
        listOf("GB")
    ),
    Bislama(
        "bis", 
        listOf("Bislama"),
        listOf("VU")
    ),
    Basari(
        "bsc", 
        listOf("Basari", "Bassari", "Oniyan"),
        listOf("GN", "SN")
    ),
    Bathari(
        "bhm", 
        listOf("Bathari"),
        listOf("OM")
    ),
    Betoi(
        null, 
        listOf("Betoi"),
        listOf("VR", "CO")
    ),
    Bontok(
        "bnc", 
        listOf("Bontok"),
        listOf("PH")
    ),
    Batak_Toba(
        "bbc", 
        listOf("Batak (Toba)", "Batak Toba", "Batta"),
        listOf("ID")
    ),
    Burarra(
        "bvr", 
        listOf("Burarra"),
        listOf("AU")
    ),
    Bubi(
        "bvb", 
        listOf("Bubi", "Bube"),
        listOf("GQ")
    ),
    Buduma(
        "bdm", 
        listOf("Buduma"),
        listOf("NG", "TD", "CM")
    ),
    Bugis(
        "bug", 
        listOf("Bugis", "Buginese", "Basa Ugi"),
        listOf("ID")
    ),
    Buli_in_Indonesia(
        "bzq", 
        listOf("Buli (in Indonesia)", "Buli (Indonesia)"),
        listOf("ID")
    ),
    Bujeba(
        "nmg", 
        listOf("Bujeba", "Kwasio"),
        listOf("GQ", "CM")
    ),
    Bukusu(
        "bxk", 
        listOf("Bukusu"),
        listOf("KE")
    ),
    Bulgarian(
        "bul", 
        listOf("Bulgarian", "български"),
        listOf("BG")
    ),
    Buma(
        "tkw", 
        listOf("Buma", "Teanu"),
        listOf("SB")
    ),
    Buin(
        "buo", 
        listOf("Buin", "Terei"),
        listOf("PG")
    ),
    Burushaski(
        "bsk", 
        listOf("Burushaski", "Mishaski", "بروشسکی‎ (burū́šaskī)"),
        listOf("PK")
    ),
    Busa(
        "bqp", 
        listOf("Busa", "Bisã"),
        listOf("NG")
    ),
    Buriat(
        "bxm", 
        listOf("Buriat", "Mongolia Buriat"),
        listOf("MN", "RU", "CN")
    ),
    Buru(
        "mhs", 
        listOf("Buru", "Buru (Indonesia)"),
        listOf("ID")
    ),
    Bulu(
        "bum", 
        listOf("Bulu"),
        listOf("CM")
    ),
    Buli_in_Ghana(
        "bwu", 
        listOf("Buli (in Ghana)", "Buli (Ghana)", "Builsa"),
        listOf("GH")
    ),
    Bali_Vitu(
        "wiv", 
        listOf("Bali-Vitu", "Vitu"),
        listOf("PG")
    ),
    Bajau_West_Coast(
        "bdr", 
        listOf("Bajau (West Coast)", "West Coast Bajau", "Sama"),
        listOf("MY")
    ),
    Bayungu(
        "bxj", 
        listOf("Bayungu"),
        listOf("AU")
    ),
    Byansi(
        "bee", 
        listOf("Byansi", "Byangsi"),
        listOf("IN")
    ),
    Bayso(
        "bsw", 
        listOf("Bayso", "Baiso"),
        listOf("ET")
    ),
    Bauzi(
        "bvz", 
        listOf("Bauzi"),
        listOf("ID")
    ),
    Cabécar(
        "cjp", 
        listOf("Cabécar"),
        listOf("CR")
    ),
    Cacua(
        "cbv", 
        listOf("Cacua"),
        listOf("CO")
    ),
    Caddo(
        "cad", 
        listOf("Caddo"),
        listOf("US")
    ),
    Cahuilla(
        "chl", 
        listOf("Cahuilla"),
        listOf("US")
    ),
    Cakchiquel(
        "ckf", 
        listOf("Cakchiquel"),
        listOf("GT")
    ),
    Camsá(
        "kbh", 
        listOf("Camsá"),
        listOf("CO")
    ),
    Candoshi(
        "cbu", 
        listOf("Candoshi", "Candoshi-Shapra"),
        listOf("PE")
    ),
    Capanahua(
        "kaq", 
        listOf("Capanahua", "Capa Baquebo"),
        listOf("PE")
    ),
    Carib(
        "car", 
        listOf("Carib", "Kari’na auran", "Kari’ña"),
        listOf("SR")
    ),
    Cashibo(
        "cbr", 
        listOf("Cashibo", "Cashibo-Cacataibo", "Kakataibo-Kashibo"),
        listOf("PE")
    ),
    Catio(
        "cto", 
        listOf("Catio", "Emberá-Catío"),
        listOf("CO")
    ),
    Cavineña(
        "cav", 
        listOf("Cavineña"),
        listOf("BO")
    ),
    Campa_Axininca(
        "cpc", 
        listOf("Campa (Axininca)", "Ajyíninka Apurucayali", "Ajyéninka"),
        listOf("PE")
    ),
    Cayapa(
        "cbi", 
        listOf("Cayapa", "Chachi", "Cha’Palaa"),
        listOf("EC")
    ),
    Chumash_Barbareño(
        "boi", 
        listOf("Chumash (Barbareño)", "Barbareño"),
        listOf("US")
    ),
    Chácobo(
        "cao", 
        listOf("Chácobo"),
        listOf("BO")
    ),
    Chocho(
        "coz", 
        listOf("Chocho", "Chochotec"),
        listOf("MX")
    ),
    Chickasaw(
        "cic", 
        listOf("Chickasaw"),
        listOf("US")
    ),
    Chinantec_Comaltepec(
        "cco", 
        listOf("Chinantec (Comaltepec)", "Comaltepec Chinantec", "Jmii’"),
        listOf("MX")
    ),
    Chasta_Costa(
        null, 
        listOf("Chasta Costa"),
        listOf("US")
    ),
    Cocopa(
        "coc", 
        listOf("Cocopa", "Kuapá"),
        listOf("MX", "US")
    ),
    Choctaw(
        "cho", 
        listOf("Choctaw"),
        listOf("US")
    ),
    Carib_Dekwana(
        "mch", 
        listOf("Carib (De'kwana)", "Maquiritari", "Ye’kuana"),
        listOf("VR")
    ),
    Cree_Swampy(
        "csw", 
        listOf("Cree (Swampy)", "Swampy Cree"),
        listOf("CA")
    ),
    Cebuano(
        "ceb", 
        listOf("Cebuano", "Binisaya"),
        listOf("PH")
    ),
    Chicomuceltec(
        "cob", 
        listOf("Chicomuceltec"),
        listOf("MX")
    ),
    Cèmuhî(
        "cam", 
        listOf("Cèmuhî", "Cemuhî"),
        listOf("NC")
    ),
    Chaga(
        "old", 
        listOf("Chaga", "Mochi"),
        listOf("TZ")
    ),
    Chamorro(
        "cha", 
        listOf("Chamorro", "Chamorru"),
        listOf("GU")
    ),
    Chambri(
        "can", 
        listOf("Chambri"),
        listOf("PG")
    ),
    Chechen(
        "che", 
        listOf("Chechen", "нохчийн"),
        listOf("RU")
    ),
    Chaudangsi(
        "cdn", 
        listOf("Chaudangsi"),
        listOf("IN")
    ),
    Cherokee(
        "chr", 
        listOf("Cherokee", "ᏣᎳᎩ"),
        listOf("US")
    ),
    Chang(
        "nbc", 
        listOf("Chang", "Chang Naga"),
        listOf("IN", "MM")
    ),
    Chimariko(
        "cid", 
        listOf("Chimariko"),
        listOf("US")
    ),
    Chuj(
        "cnm", 
        listOf("Chuj"),
        listOf("GT")
    ),
    Chukchi(
        "ckt", 
        listOf("Chukchi", "Chukot"),
        listOf("RU")
    ),
    Chehalis_Upper(
        "cjh", 
        listOf("Chehalis (Upper)", "Upper Chehalis"),
        listOf("US")
    ),
    Chamalal(
        "cji", 
        listOf("Chamalal"),
        listOf("RU")
    ),
    Chantyal(
        "chx", 
        listOf("Chantyal"),
        listOf("NP")
    ),
    Chontal_Highland(
        "chd", 
        listOf("Chontal (Highland)", "Highland Oaxaca Chontal", "Tsome"),
        listOf("MX")
    ),
    Chipewyan(
        "chp", 
        listOf("Chipewyan"),
        listOf("CA")
    ),
    Chinantec_Quiotepec(
        "chq", 
        listOf("Chinantec (Quiotepec)", "Quiotepec Chinantec", "juu jmiih"),
        listOf("MX")
    ),
    Chrau(
        "crw", 
        listOf("Chrau"),
        listOf("VN")
    ),
    Chin_Siyin(
        "csy", 
        listOf("Chin (Siyin)", "Siyin Chin"),
        listOf("MM")
    ),
    Chatino_Nopala(
        "cya", 
        listOf("Chatino (Nopala)", "Nopala Chatino", "Cha’ jna’a"),
        listOf("MX")
    ),
    Chulupí(
        "cag", 
        listOf("Chulupí", "Nivaclé", "Guisnai"),
        listOf("PY")
    ),
    Chuvash(
        "chv", 
        listOf("Chuvash", "Чӑвашла"),
        listOf("RU")
    ),
    Cham_Western(
        "cja", 
        listOf("Cham (Western)", "Western Cham", "Cham"),
        listOf("KH")
    ),
    Chontal_Huamelultec_Oaxaca(
        "clo", 
        listOf("Chontal (Huamelultec Oaxaca)", "Lowland Oaxaca Chontal", "Lajltyaygi"),
        listOf("MX")
    ),
    Chayahuita(
        "cbt", 
        listOf("Chayahuita"),
        listOf("PE")
    ),
    Chichewa(
        "nya", 
        listOf("Chichewa", "Nyanja", "chiCheŵa‎ (Chichewa)", "chiNyanja"),
        listOf("ZW", "MW", "ZM", "MZ")
    ),
    Chumash_Ineseño(
        "inz", 
        listOf("Chumash (Ineseño)", "Ineseño"),
        listOf("US")
    ),
    Chichimeca_Jonaz(
        "pei", 
        listOf("Chichimeca-Jonaz"),
        listOf("MX")
    ),
    Cheke_Holo(
        "mrn", 
        listOf("Cheke Holo"),
        listOf("SB")
    ),
    Chinook_Lower(
        "chh", 
        listOf("Chinook (Lower)", "Chinook"),
        listOf("US")
    ),
    Chinook_Upper(
        "wac", 
        listOf("Chinook (Upper)", "Wasco-Wishram"),
        listOf("US")
    ),
    Clallam(
        "clm", 
        listOf("Clallam"),
        listOf("US")
    ),
    Colac(
        null, 
        listOf("Colac"),
        listOf("AU")
    ),
    Chinantec_Lealao(
        "cle", 
        listOf("Chinantec (Lealao)", "Lealao Chinantec"),
        listOf("MX")
    ),
    Cholón(
        "clh", 
        listOf("Cholón", "Chilisso"),
        listOf("PE")
    ),
    Chulym(
        "clw", 
        listOf("Chulym"),
        listOf("RU")
    ),
    Chimila(
        "cbg", 
        listOf("Chimila"),
        listOf("CO")
    ),
    Comecrudo(
        "xcm", 
        listOf("Comecrudo"),
        listOf("MX")
    ),
    Cham_Eastern(
        "cjm", 
        listOf("Cham (Eastern)", "Eastern Cham"),
        listOf("VN")
    ),
    Chemakum(
        "xch", 
        listOf("Chemakum"),
        listOf("US")
    ),
    Camling(
        "rab", 
        listOf("Camling"),
        listOf("NP")
    ),
    Comanche(
        "com", 
        listOf("Comanche"),
        listOf("US")
    ),
    Chin_Mara(
        "mrh", 
        listOf("Chin (Mara)", "Mara Chin", "Mara"),
        listOf("IN", "MM")
    ),
    Comox(
        "coo", 
        listOf("Comox"),
        listOf("CA")
    ),
    Chontal_Maya(
        "chf", 
        listOf("Chontal Maya", "Tabasco Chontal", "Yocot’an"),
        listOf("MX")
    ),
    Canela(
        "ram", 
        listOf("Canela"),
        listOf("BR")
    ),
    Canamarí(
        "knm", 
        listOf("Canamarí", "Kanamarí"),
        listOf("BR")
    ),
    Cantonese(
        "yue", 
        listOf("Cantonese", "粵語"),
        listOf("CN")
    ),
    Coahuilteco(
        "xcw", 
        listOf("Coahuilteco"),
        listOf("MX")
    ),
    Cocama(
        "cod", 
        listOf("Cocama", "Cocama-Cocamilla"),
        listOf("PE")
    ),
    Coeur_dAlene(
        "crd", 
        listOf("Coeur d'Alene"),
        listOf("US")
    ),
    Cofán(
        "con", 
        listOf("Cofán", "A’ingae"),
        listOf("CO", "EC")
    ),
    Cogui(
        "kog", 
        listOf("Cogui"),
        listOf("CO")
    ),
    Chortí(
        "caa", 
        listOf("Chortí"),
        listOf("HN", "GT")
    ),
    Chol(
        "cti", 
        listOf("Chol"),
        listOf("MX")
    ),
    Comorian(
        "swb", 
        listOf("Comorian", "Maore Comorian", "Shimaore"),
        listOf("KM", "YT")
    ),
    Coos_Hanis(
        "csz", 
        listOf("Coos (Hanis)", "Coos"),
        listOf("US")
    ),
    Coptic(
        "cop", 
        listOf("Coptic"),
        listOf("EG")
    ),
    Cora(
        "crn", 
        listOf("Cora", "El Nayar Cora", "Naáyeri"),
        listOf("MX")
    ),
    Campa_Pajonal_Asheninca(
        "cjo", 
        listOf("Campa Pajonal Asheninca", "Ashéninka Pajonal"),
        listOf("PE")
    ),
    Chinantec_Palantla(
        "cpa", 
        listOf("Chinantec (Palantla)", "Palantla Chinantec", "Jajme dzä mii", "Jmiih kia’ dzä mii"),
        listOf("MX")
    ),
    Chepang(
        "cdm", 
        listOf("Chepang"),
        listOf("NP")
    ),
    Chipaya(
        "cap", 
        listOf("Chipaya"),
        listOf("BO")
    ),
    Chiquitano(
        "cax", 
        listOf("Chiquitano"),
        listOf("BO")
    ),
    Cree_Plains(
        "crk", 
        listOf("Cree (Plains)", "Plains Cree", "ᓀᐦᐃᔭᐍᐏᐣ", "Nēhiyawēwin"),
        listOf("CA")
    ),
    Chiriguano(
        "gui", 
        listOf("Chiriguano", "Eastern Bolivian Guaraní"),
        listOf("PY", "BO", "AR")
    ),
    Chru(
        "cje", 
        listOf("Chru"),
        listOf("VN")
    ),
    Crimean_Tatar(
        "crh", 
        listOf("Crimean Tatar", "Crimean Turkish", "Qirim", "Qirimtatar"),
        listOf("UZ")
    ),
    Carolinian(
        "cal", 
        listOf("Carolinian"),
        listOf("MP")
    ),
    Cornish(
        "cor", 
        listOf("Cornish", "kernewek"),
        listOf("GB")
    ),
    Crow(
        "cro", 
        listOf("Crow"),
        listOf("US")
    ),
    Carapana(
        "cbc", 
        listOf("Carapana"),
        listOf("CO", "BR")
    ),
    Carrier(
        "crx", 
        listOf("Carrier", "Dakelh"),
        listOf("CA")
    ),
    Chorote(
        "crt", 
        listOf("Chorote", "Iyojwa'ja Chorote"),
        listOf("PY", "AR", "BO")
    ),
    Chinantec_Sochiapan(
        "cso", 
        listOf("Chinantec (Sochiapan)", "Sochiapam Chinantec", "Jaú jm_", "Jmiih kia’ dzä jii’"),
        listOf("MX")
    ),
    Chinantec_San_Felipe_Usila(
        "cuc", 
        listOf("Chinantec (San Felipe Usila)", "Usila Chinantec", "Jaú jm_", "Jmiih kia’ dzä jii’"),
        listOf("MX")
    ),
    Cashinahua(
        "cbs", 
        listOf("Cashinahua"),
        listOf("PE", "BR")
    ),
    Diola_Kasa(
        "csk", 
        listOf("Diola-Kasa", "Jola-Kasa"),
        listOf("")
    ),
    Chinese_Sign_Language(
        "csl", 
        listOf("Chinese Sign Language"),
        listOf("CN")
    ),
    Cuicatec(
        "cux", 
        listOf("Cuicatec", "Tepeuxila Cuicatec", "Dibaku"),
        listOf("MX")
    ),
    Chinantec_Tepetotutla(
        "cnt", 
        listOf("Chinantec (Tepetotutla)", "Tepetotutla Chinantec", "Jajmi dzä kï ï’", "Jejmi"),
        listOf("MX")
    ),
    Chin_Tiddim(
        "ctd", 
        listOf("Chin (Tiddim)", "Tedim Chin", "Tidim"),
        listOf("MM")
    ),
    Catalan(
        "cat", 
        listOf("Catalan", "català"),
        listOf("ES")
    ),
    Chitimacha(
        "ctm", 
        listOf("Chitimacha"),
        listOf("US")
    ),
    Chatino_Tataltepec(
        "cta", 
        listOf("Chatino (Tataltepec)", "Tataltepec Chatino", "Cha’ jna’a"),
        listOf("MX")
    ),
    Catawba(
        "chc", 
        listOf("Catawba"),
        listOf("US")
    ),
    Cua(
        "cua", 
        listOf("Cua"),
        listOf("VN")
    ),
    Cubeo(
        "cub", 
        listOf("Cubeo", "Pamié"),
        listOf("CO")
    ),
    Cuica(
        null, 
        listOf("Cuica"),
        listOf("VR")
    ),
    Cuiba(
        "cui", 
        listOf("Cuiba"),
        listOf("CO")
    ),
    Culina(
        "cul", 
        listOf("Culina", "Madiha"),
        listOf("BR", "PE")
    ),
    Chumburung(
        "ncu", 
        listOf("Chumburung"),
        listOf("GH")
    ),
    Cupeño(
        "cup", 
        listOf("Cupeño"),
        listOf("US")
    ),
    Curripaco(
        "kpc", 
        listOf("Curripaco"),
        listOf("CO")
    ),
    Cuitlatec(
        null, 
        listOf("Cuitlatec"),
        listOf("MX")
    ),
    Chuukese(
        "chk", 
        listOf("Chuukese"),
        listOf("FM")
    ),
    Chavacano(
        "cbk", 
        listOf("Chavacano"),
        listOf("PH")
    ),
    Chuave(
        "cjv", 
        listOf("Chuave"),
        listOf("PG")
    ),
    Columbia_Wenatchi(
        "col", 
        listOf("Columbia-Wenatchi"),
        listOf("US")
    ),
    Cayuga(
        "cay", 
        listOf("Cayuga"),
        listOf("US")
    ),
    Cheyenne(
        "chy", 
        listOf("Cheyenne"),
        listOf("US")
    ),
    Cayuvava(
        "cyb", 
        listOf("Cayuvava", "Cayubaba"),
        listOf("BO")
    ),
    Czech(
        "ces", 
        listOf("Czech", "čeština"),
        listOf("CZ")
    ),
    Daa(
        "kzf", 
        listOf("Da'a", "Da'a Kaili"),
        listOf("ID")
    ),
    Daba(
        "dkx", 
        listOf("Daba", "Mazagway"),
        listOf("CM")
    ),
    Dadibi(
        "mps", 
        listOf("Dadibi"),
        listOf("PG")
    ),
    Daga(
        "dgz", 
        listOf("Daga"),
        listOf("PG")
    ),
    Dahalo(
        "dal", 
        listOf("Dahalo"),
        listOf("KE")
    ),
    Dakota(
        "dak", 
        listOf("Dakota"),
        listOf("US")
    ),
    Damana(
        "mbp", 
        listOf("Damana", "Malayo"),
        listOf("CO")
    ),
    Darai(
        "dry", 
        listOf("Darai"),
        listOf("NP")
    ),
    Datooga(
        "tcc", 
        listOf("Datooga"),
        listOf("TZ")
    ),
    Dâw(
        "kwa", 
        listOf("Dâw"),
        listOf("BR")
    ),
    Day(
        "dai", 
        listOf("Day"),
        listOf("TD")
    ),
    Dabida(
        "dav", 
        listOf("Dabida", "Taita", "Kitaita"),
        listOf("KE")
    ),
    Dumagat_Casiguran(
        "dgc", 
        listOf("Dumagat (Casiguran)", "Casiguran Dumagat Agta"),
        listOf("PH")
    ),
    Daju_Dar_Fur(
        "daj", 
        listOf("Daju (Dar Fur)", "Dar Fur Daju", "Bekke"),
        listOf("SD")
    ),
    Donno_So(
        "dds", 
        listOf("Donno So", "Donno So Dogon"),
        listOf("BF", "ML")
    ),
    Defaka(
        "afn", 
        listOf("Defaka"),
        listOf("NG")
    ),
    Degema(
        "deg", 
        listOf("Degema"),
        listOf("NG")
    ),
    Dení(
        "dny", 
        listOf("Dení", "Madiha"),
        listOf("BR")
    ),
    Desano(
        "des", 
        listOf("Desano"),
        listOf("CO", "BR")
    ),
    Deti(
        "shg", 
        listOf("Deti", "Shua"),
        listOf("BW")
    ),
    Deuri(
        "der", 
        listOf("Deuri", "Deori"),
        listOf("IN")
    ),
    Dagaare(
        "dga", 
        listOf("Dagaare", "Southern Dagaare"),
        listOf("GH", "BF")
    ),
    Dagbani(
        "dag", 
        listOf("Dagbani", "Dagbanli"),
        listOf("GH")
    ),
    Deutsche_Gebärdensprache(
        "gsg", 
        listOf("Deutsche Gebärdensprache", "German Sign Language"),
        listOf("DE")
    ),
    Dogri(
        "dgo", 
        listOf("Dogri", "Dogri (individual language)"),
        listOf("IN")
    ),
    Dongo(
        "doo", 
        listOf("Dongo"),
        listOf("CD")
    ),
    Dagur(
        "dta", 
        listOf("Dagur", "Daur"),
        listOf("CN")
    ),
    Degexitan(
        "ing", 
        listOf("Degexit'an"),
        listOf("US")
    ),
    Dhaasanac(
        "dsh", 
        listOf("Dhaasanac", "Daasanach"),
        listOf("ET")
    ),
    Dharumbal(
        "bjy", 
        listOf("Dharumbal", "Bayali"),
        listOf("AU")
    ),
    Dhivehi(
        "div", 
        listOf("Dhivehi", "Divehi", "ދިވެހިބަސް"),
        listOf("MV")
    ),
    Dhalandji(
        "dhl", 
        listOf("Dhalandji"),
        listOf("AU")
    ),
    Dhimal(
        "dhi", 
        listOf("Dhimal"),
        listOf("NP")
    ),
    Dhargari(
        "dhr", 
        listOf("Dhargari"),
        listOf("AU")
    ),
    Dhurga(
        "dhu", 
        listOf("Dhurga"),
        listOf("AU")
    ),
    Dharawal(
        "tbh", 
        listOf("Dharawal", "Thurawal"),
        listOf("AU")
    ),
    Didinga(
        "did", 
        listOf("Didinga"),
        listOf("SD")
    ),
    Digaro(
        "mhu", 
        listOf("Digaro", "Digaro-Mishmi"),
        listOf("IN")
    ),
    Dime(
        "dim", 
        listOf("Dime"),
        listOf("ET")
    ),
    Dinka(
        "dip", 
        listOf("Dinka", "Northeastern Dinka"),
        listOf("SD")
    ),
    Diola_Fogny(
        "dyo", 
        listOf("Diola-Fogny", "Jola-Fonyi", "joola"),
        listOf("GM", "SN")
    ),
    Diyari(
        "dif", 
        listOf("Diyari", "Dieri"),
        listOf("AU")
    ),
    Dizi(
        "mdx", 
        listOf("Dizi", "Dizin"),
        listOf("ET")
    ),
    Djabugay(
        "dyy", 
        listOf("Djabugay", "Dyaabugay"),
        listOf("AU")
    ),
    Djingili(
        "jig", 
        listOf("Djingili"),
        listOf("AU")
    ),
    Djambarrpuyngu(
        "djr", 
        listOf("Djambarrpuyngu"),
        listOf("AU")
    ),
    Djinang(
        "dji", 
        listOf("Djinang"),
        listOf("AU")
    ),
    Djaru(
        "ddj", 
        listOf("Djaru", "Jaru"),
        listOf("AU")
    ),
    Duma(
        "dma", 
        listOf("Duma"),
        listOf("GA")
    ),
    Dumi(
        "dus", 
        listOf("Dumi"),
        listOf("NP")
    ),
    Dumaki(
        "dmk", 
        listOf("Dumaki", "Domaaki"),
        listOf("PK")
    ),
    Dimasa(
        "dis", 
        listOf("Dimasa", "Grau Dima", "Magrau"),
        listOf("IN")
    ),
    Ding(
        "diz", 
        listOf("Ding"),
        listOf("CD")
    ),
    Dani_Lower_Grand_Valley(
        "dni", 
        listOf("Dani (Lower Grand Valley)", "Lower Grand Valley Dani"),
        listOf("ID")
    ),
    Dangaléat_Western(
        "daa", 
        listOf("Dangaléat (Western)", "Dangaléat"),
        listOf("TD")
    ),
    Dobel(
        "kvo", 
        listOf("Dobel"),
        listOf("ID")
    ),
    Dolgan(
        "dlg", 
        listOf("Dolgan"),
        listOf("RU")
    ),
    Domari(
        "rmt", 
        listOf("Domari"),
        listOf("IR", "JO", "IL")
    ),
    Dong(
        "kmc", 
        listOf("Dong", "Southern Dong"),
        listOf("CN")
    ),
    Doutai(
        "tds", 
        listOf("Doutai"),
        listOf("ID")
    ),
    Doyayo(
        "dow", 
        listOf("Doyayo"),
        listOf("CM")
    ),
    Drehu(
        "dhv", 
        listOf("Drehu", "Dehu"),
        listOf("NC")
    ),
    Dargwa(
        "dar", 
        listOf("Dargwa"),
        listOf("RU")
    ),
    Dari(
        "prs", 
        listOf("Dari", "فارسی‎ (Farsi)"),
        listOf("AF")
    ),
    Darma(
        "drd", 
        listOf("Darma", "Darmiya"),
        listOf("IN")
    ),
    Danish(
        "dan", 
        listOf("Danish", "dansk"),
        listOf("DK")
    ),
    Toro_So(
        "dts", 
        listOf("Toro So", "Toro So Dogon"),
        listOf("BF", "ML")
    ),
    Duala(
        "dua", 
        listOf("Duala", "duálá"),
        listOf("CM")
    ),
    Dullay_Gollango(
        "gwd", 
        listOf("Dullay (Gollango)", "Gawwada"),
        listOf("ET")
    ),
    Duka(
        "dud", 
        listOf("Duka", "Hun-Saare"),
        listOf("NG")
    ),
    Dulong(
        "duu", 
        listOf("Dulong", "Drung"),
        listOf("CN")
    ),
    Dumo(
        "vam", 
        listOf("Dumo", "Vanimo"),
        listOf("PG")
    ),
    Duna(
        "duc", 
        listOf("Duna"),
        listOf("PG")
    ),
    Dutch_Zeeuws(
        "zea", 
        listOf("Dutch (Zeeuws)", "Zeelandic"),
        listOf("NL", "BE")
    ),
    Dyirbal(
        "dbl", 
        listOf("Dyirbal"),
        listOf("AU")
    ),
    Dyimini(
        "dyi", 
        listOf("Dyimini", "Djimini Senoufo"),
        listOf("CI")
    ),
    Dyula(
        "dyu", 
        listOf("Dyula", "Julakan"),
        listOf("ML", "BF", "CI")
    ),
    Ebira(
        "igb", 
        listOf("Ebira"),
        listOf("NG")
    ),
    Edolo(
        "etr", 
        listOf("Edolo"),
        listOf("PG")
    ),
    Efik(
        "efi", 
        listOf("Efik"),
        listOf("NG")
    ),
    Ega(
        "ega", 
        listOf("Ega"),
        listOf("CI")
    ),
    Engenni(
        "enn", 
        listOf("Engenni"),
        listOf("NG")
    ),
    Eipo(
        "eip", 
        listOf("Eipo", "Eipomek", "Lik"),
        listOf("ID")
    ),
    Ejagham(
        "etu", 
        listOf("Ejagham"),
        listOf("NG", "CM")
    ),
    Ekari(
        "ekg", 
        listOf("Ekari", "Me"),
        listOf("ID")
    ),
    Ekoti(
        "eko", 
        listOf("Ekoti", "Koti"),
        listOf("MZ")
    ),
    Elseng(
        "mrf", 
        listOf("Elseng"),
        listOf("ID")
    ),
    Emberá_Northern(
        "emp", 
        listOf("Emberá (Northern)", "Northern Emberá", "Embera"),
        listOf("PA", "CO")
    ),
    Embera_Chami(
        "cmi", 
        listOf("Embera Chami", "Emberá-Chamí"),
        listOf("CO")
    ),
    Émérillon(
        "eme", 
        listOf("Émérillon", "Emerillon"),
        listOf("GF")
    ),
    Embaloh(
        "emb", 
        listOf("Embaloh"),
        listOf("ID")
    ),
    Emmi(
        "amy", 
        listOf("Emmi", "Ami"),
        listOf("AU")
    ),
    Enga(
        "enq", 
        listOf("Enga"),
        listOf("PG")
    ),
    Enets(
        "enh", 
        listOf("Enets", "Tundra Enets"),
        listOf("RU")
    ),
    English(
        "eng", 
        listOf("English"),
        listOf("GB", "IE")
    ),
    Enggano(
        "eno", 
        listOf("Enggano"),
        listOf("ID")
    ),
    Enya(
        "gey", 
        listOf("Enya"),
        listOf("CD")
    ),
    Epena_Pedee(
        "sja", 
        listOf("Epena Pedee", "Epena", "Epéna Pedée"),
        listOf("CO")
    ),
    Efate_South(
        "erk", 
        listOf("Efate (South)", "South Efate"),
        listOf("VU")
    ),
    Erromangan(
        "erg", 
        listOf("Erromangan", "Sie"),
        listOf("VU")
    ),
    Ese_Ejja(
        "ese", 
        listOf("Ese Ejja"),
        listOf("PE", "BO")
    ),
    Esmeraldeño(
        null, 
        listOf("Esmeraldeño"),
        listOf("EC")
    ),
    Esselen(
        "esq", 
        listOf("Esselen"),
        listOf("US")
    ),
    Estonian(
        "est", 
        listOf("Estonian", "eesti"),
        listOf("EE")
    ),
    Etsako(
        "ets", 
        listOf("Etsako", "Yekhee"),
        listOf("NG")
    ),
    Eudeve(
        "opt", 
        listOf("Eudeve", "Opata"),
        listOf("MX")
    ),
    Even(
        "eve", 
        listOf("Even"),
        listOf("RU")
    ),
    Ewondo(
        "ewo", 
        listOf("Ewondo", "ewondo"),
        listOf("CM")
    ),
    Eyak(
        "eya", 
        listOf("Eyak"),
        listOf("US")
    ),
    Faroese(
        "fao", 
        listOf("Faroese", "føroyskt"),
        listOf("DK")
    ),
    Fasu(
        "faa", 
        listOf("Fasu"),
        listOf("PG")
    ),
    Fefe(
        "fmp", 
        listOf("Fe'fe'"),
        listOf("CM")
    ),
    Fula_Guinean(
        "fuf", 
        listOf("Fula (Guinean)", "Pular"),
        listOf("GN")
    ),
    Finnish(
        "fin", 
        listOf("Finnish", "suomi"),
        listOf("FI")
    ),
    Fijian_Wayan(
        "wyy", 
        listOf("Fijian (Wayan)", "Western Fijian"),
        listOf("FJ")
    ),
    Fula_Nigerian(
        "fuv", 
        listOf("Fula (Nigerian)", "Nigerian Fulfulde", "Fulfulde"),
        listOf("NG")
    ),
    Frisian_North(
        "frr", 
        listOf("Frisian (North)", "Northern Frisian"),
        listOf("DE")
    ),
    Foe(
        "foi", 
        listOf("Foe", "Foi"),
        listOf("PG")
    ),
    Fongbe(
        "fon", 
        listOf("Fongbe", "Fon"),
        listOf("BJ")
    ),
    Fore(
        "for", 
        listOf("Fore"),
        listOf("PG")
    ),
    Fox(
        "sac", 
        listOf("Fox", "Meskwaki"),
        listOf("US")
    ),
    Momu(
        "fqs", 
        listOf("Momu", "Fas"),
        listOf("PG")
    ),
    Fordata(
        "frd", 
        listOf("Fordata"),
        listOf("ID")
    ),
    French(
        "fra", 
        listOf("French", "français"),
        listOf("CH", "FR")
    ),
    Frisian_Western(
        "fry", 
        listOf("Frisian (Western)", "Western Frisian", "Frysk"),
        listOf("NL")
    ),
    Finnish_Sign_Language(
        "fse", 
        listOf("Finnish Sign Language"),
        listOf("FI")
    ),
    Futuna_East(
        "fud", 
        listOf("Futuna (East)", "East Futuna"),
        listOf("WF")
    ),
    Fulniô(
        "fun", 
        listOf("Fulniô"),
        listOf("BR")
    ),
    Fulfulde_Maasina(
        "ffm", 
        listOf("Fulfulde (Maasina)", "Maasina Fulfulde"),
        listOf("ML")
    ),
    Fur(
        "fvr", 
        listOf("Fur"),
        listOf("SD")
    ),
    Futuna_Aniwa(
        "fut", 
        listOf("Futuna-Aniwa"),
        listOf("VU")
    ),
    Fuzhou(
        "cdo", 
        listOf("Fuzhou", "Min Dong Chinese", "平話‎ (Bangua)", "闽东话‎ (Mindongyu)"),
        listOf("MY", "TH", "CN")
    ),
    Fyem(
        "pym", 
        listOf("Fyem", "Fyam"),
        listOf("NG")
    ),
    Gã(
        "gaa", 
        listOf("Gã", "Ga"),
        listOf("GH")
    ),
    Gaagudju(
        "gbu", 
        listOf("Gaagudju", "Gagadu"),
        listOf("AU")
    ),
    Gade(
        "ged", 
        listOf("Gade"),
        listOf("NG")
    ),
    Gaelic_Scots(
        "gla", 
        listOf("Gaelic (Scots)", "Scottish Gaelic", "Gàidhlig"),
        listOf("GB")
    ),
    Gagauz(
        "gag", 
        listOf("Gagauz"),
        listOf("MD")
    ),
    Gahuku(
        "gah", 
        listOf("Gahuku", "Alekano"),
        listOf("PG")
    ),
    Gapapaiwa(
        "pwg", 
        listOf("Gapapaiwa"),
        listOf("PG")
    ),
    Garo(
        "grt", 
        listOf("Garo", "Mande"),
        listOf("IN")
    ),
    Gavião(
        "gvo", 
        listOf("Gavião", "Gavião Do Jiparaná"),
        listOf("BR")
    ),
    Gayo(
        "gay", 
        listOf("Gayo"),
        listOf("ID")
    ),
    Gbeya_Bossangoa(
        "gbp", 
        listOf("Gbeya Bossangoa", "Gbaya-Bossangoa"),
        listOf("CF")
    ),
    Guinea_Bissau_Crioulo(
        "pov", 
        listOf("Guinea Bissau Crioulo", "Upper Guinea Crioulo", "Kriyol"),
        listOf("GW")
    ),
    Gbaya_Kara(
        "gya", 
        listOf("Gbaya Kara", "Northwest Gbaya"),
        listOf("CM", "CF")
    ),
    Gutob(
        "gbj", 
        listOf("Gutob", "Bodo Gadaba"),
        listOf("IN")
    ),
    Guduf(
        "gdf", 
        listOf("Guduf", "Guduf-Gava"),
        listOf("CM", "NG")
    ),
    Gadaba_Kondekor(
        "gdb", 
        listOf("Gadaba (Kondekor)", "Pottangi Ollar Gadaba"),
        listOf("IN")
    ),
    Gidar(
        "gid", 
        listOf("Gidar"),
        listOf("CM")
    ),
    Gadsup(
        "gaj", 
        listOf("Gadsup"),
        listOf("PG")
    ),
    Gela(
        "nlg", 
        listOf("Gela"),
        listOf("SB")
    ),
    Georgian(
        "kat", 
        listOf("Georgian", "ქართული"),
        listOf("GE")
    ),
    Guianese_French_Creole(
        "gcr", 
        listOf("Guianese French Creole", "Guianese Creole French"),
        listOf("GF")
    ),
    Gugadj(
        "ggd", 
        listOf("Gugadj"),
        listOf("AU")
    ),
    Gureng_Gureng(
        "gnr", 
        listOf("Gureng Gureng"),
        listOf("AU")
    ),
    Ghotuo(
        "aaa", 
        listOf("Ghotuo"),
        listOf("NG")
    ),
    Bunan(
        "bfu", 
        listOf("Bunan", "Gahri"),
        listOf("IN")
    ),
    Gilaki(
        "glk", 
        listOf("Gilaki"),
        listOf("IR")
    ),
    Gimira(
        "bcq", 
        listOf("Gimira", "Bench"),
        listOf("ET")
    ),
    Gula_Iro(
        "glj", 
        listOf("Gula Iro"),
        listOf("TD")
    ),
    Gitksan(
        "git", 
        listOf("Gitksan", "Gitxsan", "Gitsenimx"),
        listOf("CA")
    ),
    Giziga(
        "giz", 
        listOf("Giziga", "South Giziga"),
        listOf("CM")
    ),
    Gurindji(
        "gue", 
        listOf("Gurindji", "Gurinji"),
        listOf("AU")
    ),
    Guajajara(
        "gub", 
        listOf("Guajajara", "Guajajára"),
        listOf("BR")
    ),
    Gününa_Küne(
        "pue", 
        listOf("Gününa Küne", "Puelche"),
        listOf("AR")
    ),
    Gelao(
        "gio", 
        listOf("Gelao"),
        listOf("VN")
    ),
    Galician(
        "glg", 
        listOf("Galician", "galego"),
        listOf("ES")
    ),
    Galela(
        "gbi", 
        listOf("Galela"),
        listOf("ID")
    ),
    Golin(
        "gvf", 
        listOf("Golin"),
        listOf("PG")
    ),
    Gaalpu(
        "dhg", 
        listOf("Gaalpu", "Dhangu-Djangu", "Yolngu-Matha"),
        listOf("AU")
    ),
    Guambiano(
        "gum", 
        listOf("Guambiano"),
        listOf("CO")
    ),
    Gumatj(
        "gnn", 
        listOf("Gumatj"),
        listOf("AU")
    ),
    Gumawana(
        "gvs", 
        listOf("Gumawana"),
        listOf("PG")
    ),
    Gumuz(
        "guk", 
        listOf("Gumuz", "Bega-Tse", "Sigumza"),
        listOf("ET", "SD")
    ),
    Guana(
        "gva", 
        listOf("Guana", "Guana (Paraguay)"),
        listOf("PY")
    ),
    Gunbalang(
        "wlg", 
        listOf("Gunbalang", "Kunbarlang"),
        listOf("AU")
    ),
    Gaanda(
        "gqa", 
        listOf("Ga'anda"),
        listOf("NG")
    ),
    Gunin(
        "gww", 
        listOf("Gunin", "Kwini"),
        listOf("AU")
    ),
    Guanano(
        "gvc", 
        listOf("Guanano"),
        listOf("BR", "CO")
    ),
    Gunya(
        "gyy", 
        listOf("Gunya"),
        listOf("AU")
    ),
    Goajiro(
        "guc", 
        listOf("Goajiro", "Wayuu"),
        listOf("VR", "CO")
    ),
    Godoberi(
        "gdo", 
        listOf("Godoberi", "Ghodoberi"),
        listOf("RU")
    ),
    Goemai(
        "ank", 
        listOf("Goemai"),
        listOf("NG")
    ),
    Gogodala(
        "ggw", 
        listOf("Gogodala"),
        listOf("PG")
    ),
    Gojri(
        "gju", 
        listOf("Gojri", "Gujari"),
        listOf("IN")
    ),
    Gokana(
        "gkn", 
        listOf("Gokana"),
        listOf("NG")
    ),
    Gola(
        "gol", 
        listOf("Gola"),
        listOf("SL", "LR")
    ),
    Gondi(
        "ggo", 
        listOf("Gondi"),
        listOf("IN")
    ),
    Gooniyandi(
        "gni", 
        listOf("Gooniyandi"),
        listOf("AU")
    ),
    Gorowa(
        "gow", 
        listOf("Gorowa"),
        listOf("TZ")
    ),
    Grebo(
        "grj", 
        listOf("Grebo", "Southern Grebo"),
        listOf("LR")
    ),
    Garífuna(
        "cab", 
        listOf("Garífuna", "Garifuna"),
        listOf("BZ", "GT", "HN")
    ),
    Gurr_goni(
        "gge", 
        listOf("Gurr-goni", "Guragone"),
        listOf("AU")
    ),
    Guarijío(
        "var", 
        listOf("Guarijío", "Huarijio"),
        listOf("MX")
    ),
    Gurenne(
        "gur", 
        listOf("Gurenne", "Frafra", "Farefare", "Ninkarsé"),
        listOf("GH")
    ),
    Guro(
        "goa", 
        listOf("Guro", "Golo"),
        listOf("CI")
    ),
    German_Ripuarian(
        "ksh", 
        listOf("German (Ripuarian)", "Colognian", "Kölsch"),
        listOf("BE")
    ),
    Garrwa(
        "gbc", 
        listOf("Garrwa"),
        listOf("AU")
    ),
    Garus(
        "gyb", 
        listOf("Garus"),
        listOf("PG")
    ),
    Gorontalo(
        "gor", 
        listOf("Gorontalo"),
        listOf("ID")
    ),
    Greek_Sign_Language(
        "gss", 
        listOf("Greek Sign Language"),
        listOf("GR")
    ),
    Guató(
        "gta", 
        listOf("Guató"),
        listOf("BR")
    ),
    Guaraní(
        "gug", 
        listOf("Guaraní", "Paraguayan Guaraní"),
        listOf("PY")
    ),
    Gude(
        "gde", 
        listOf("Gude"),
        listOf("CM", "NG")
    ),
    Guere(
        "gxx", 
        listOf("Guere", "Wè Southern", "Wèè"),
        listOf("CI")
    ),
    Gupapuyngu(
        "guf", 
        listOf("Gupapuyngu"),
        listOf("AU")
    ),
    Gugada(
        "ktd", 
        listOf("Gugada", "Kokata"),
        listOf("AU")
    ),
    Guhu_Samane(
        "ghs", 
        listOf("Guhu-Samane"),
        listOf("PG")
    ),
    Gujarati(
        "guj", 
        listOf("Gujarati", "ગુજરાતી"),
        listOf("IN")
    ),
    Gula_in_Central_African_Republic(
        "glu", 
        listOf("Gula (in Central African Republic)", "Gula (Chad)"),
        listOf("CF")
    ),
    Gumbaynggir(
        "kgs", 
        listOf("Gumbaynggir", "Kumbainggar"),
        listOf("AU")
    ),
    Gunu(
        "yas", 
        listOf("Gunu", "Nugunu (Cameroon)"),
        listOf("CM")
    ),
    Guaque(
        null, 
        listOf("Guaque"),
        listOf("CO")
    ),
    Gurung(
        "ggn", 
        listOf("Gurung"),
        listOf("NP")
    ),
    Gusii(
        "guz", 
        listOf("Gusii", "Ekegusii"),
        listOf("KE")
    ),
    Guugu_Yimidhirr(
        "kky", 
        listOf("Guugu Yimidhirr", "Guguyimidjir"),
        listOf("AU")
    ),
    Gungbe(
        "guw", 
        listOf("Gungbe", "Gun"),
        listOf("BJ")
    ),
    Gwari(
        "gbr", 
        listOf("Gwari", "Gbagyi"),
        listOf("NG")
    ),
    German_Westphalian(
        "wep", 
        listOf("German (Westphalian)", "Westphalien"),
        listOf("DE")
    ),
    Gworok(
        "kcg", 
        listOf("Gworok", "Tyap"),
        listOf("NG")
    ),
    Guayabero(
        "guo", 
        listOf("Guayabero"),
        listOf("CO")
    ),
    Hadza(
        "hts", 
        listOf("Hadza"),
        listOf("TZ")
    ),
    Haida(
        "hax", 
        listOf("Haida", "Southern Haida"),
        listOf("CA", "US")
    ),
    Hakka(
        "hak", 
        listOf("Hakka", "Hakka Chinese", "客家話‎ (Hakkafa)"),
        listOf("CN")
    ),
    Halia(
        "hla", 
        listOf("Halia"),
        listOf("PG")
    ),
    Hamtai(
        "hmt", 
        listOf("Hamtai"),
        listOf("PG")
    ),
    Hani(
        "hni", 
        listOf("Hani", "Ha Nhi"),
        listOf("CN")
    ),
    Haruai(
        "tmd", 
        listOf("Haruai"),
        listOf("PG")
    ),
    Hatam(
        "had", 
        listOf("Hatam"),
        listOf("ID")
    ),
    Hausa(
        "hau", 
        listOf("Hausa"),
        listOf("NG", "NE")
    ),
    Hawaiian(
        "haw", 
        listOf("Hawaiian", "ʻŌlelo Hawaiʻi"),
        listOf("US")
    ),
    Hayu(
        "vay", 
        listOf("Hayu", "Wayu"),
        listOf("NP")
    ),
    Haitian_Creole(
        "hat", 
        listOf("Haitian Creole", "Ayisyen", "Kreyòl"),
        listOf("HT")
    ),
    Hdi(
        "xed", 
        listOf("Hdi"),
        listOf("CM", "NG")
    ),
    Hehe(
        "heh", 
        listOf("Hehe"),
        listOf("TZ")
    ),
    Heiltsuk(
        "hei", 
        listOf("Heiltsuk"),
        listOf("CA")
    ),
    Hemba(
        "hem", 
        listOf("Hemba"),
        listOf("CD")
    ),
    Herero(
        "her", 
        listOf("Herero"),
        listOf("BW", "NA")
    ),
    Hanga_Hundi(
        "wos", 
        listOf("Hanga Hundi"),
        listOf("PG")
    ),
    Hidatsa(
        "hid", 
        listOf("Hidatsa"),
        listOf("US")
    ),
    Hiligaynon(
        "hil", 
        listOf("Hiligaynon"),
        listOf("PH")
    ),
    Hindi(
        "hin", 
        listOf("Hindi", "हिन्दी"),
        listOf("IN")
    ),
    Hixkaryana(
        "hix", 
        listOf("Hixkaryana", "Hixkaryána"),
        listOf("BR")
    ),
    Hong_Kong_Sign_Language(
        "hks", 
        listOf("Hong Kong Sign Language"),
        listOf("CN")
    ),
    Halbi(
        "hlb", 
        listOf("Halbi"),
        listOf("IN")
    ),
    Halang(
        "hal", 
        listOf("Halang"),
        listOf("VN")
    ),
    Hmar(
        "hmr", 
        listOf("Hmar"),
        listOf("IN")
    ),
    Huambisa(
        "hub", 
        listOf("Huambisa"),
        listOf("PE")
    ),
    Hmong_Daw(
        "mww", 
        listOf("Hmong Daw"),
        listOf("VN", "CN")
    ),
    Hmong_Njua(
        "hnj", 
        listOf("Hmong Njua"),
        listOf("CN")
    ),
    Hamer(
        "amf", 
        listOf("Hamer", "Hamer-Banna"),
        listOf("ET")
    ),
    Huitoto_Muinane(
        "hux", 
        listOf("Huitoto (Muinane)", "Nüpode Huitoto"),
        listOf("PE")
    ),
    Mina(
        "hna", 
        listOf("Mina", "Mina (Cameroon)"),
        listOf("CM")
    ),
    Hunde(
        "hke", 
        listOf("Hunde"),
        listOf("CD")
    ),
    Hinuq(
        "gin", 
        listOf("Hinuq", "Hinukh"),
        listOf("RU")
    ),
    Hanunóo(
        "hnn", 
        listOf("Hanunóo", "Hanunoo"),
        listOf("PH")
    ),
    Haida_Northern(
        "hdn", 
        listOf("Haida (Northern)", "Northern Haida", "Xaad Kil"),
        listOf("CA")
    ),
    Ho(
        "hoc", 
        listOf("Ho"),
        listOf("IN")
    ),
    Hoava(
        "hoa", 
        listOf("Hoava"),
        listOf("SB")
    ),
    Holoholo(
        "hoo", 
        listOf("Holoholo"),
        listOf("TZ")
    ),
    Hopi(
        "hop", 
        listOf("Hopi"),
        listOf("US")
    ),
    Hup(
        "jup", 
        listOf("Hup", "Hupdë"),
        listOf("CO", "BR")
    ),
    Hre(
        "hre", 
        listOf("Hre"),
        listOf("VN")
    ),
    Harari(
        "har", 
        listOf("Harari"),
        listOf("ET")
    ),
    Harsusi(
        "hss", 
        listOf("Harsusi"),
        listOf("OM")
    ),
    Haisla(
        "has", 
        listOf("Haisla"),
        listOf("CA")
    ),
    Huastec(
        "hsf", 
        listOf("Huastec"),
        listOf("MX")
    ),
    Hoan(
        "huc", 
        listOf("=|Hoan", "=/Hua"),
        listOf("BW")
    ),
    Huichol(
        "hch", 
        listOf("Huichol", "Wixárika"),
        listOf("MX")
    ),
    Huitoto_Murui(
        "huu", 
        listOf("Huitoto (Murui)", "Murui Huitoto", "Murui"),
        listOf("PE", "CO", "BR")
    ),
    Hungarian(
        "hun", 
        listOf("Hungarian", "magyar"),
        listOf("HU")
    ),
    Hupa(
        "hup", 
        listOf("Hupa"),
        listOf("US")
    ),
    Huave_San_Mateo_del_Mar(
        "huv", 
        listOf("Huave (San Mateo del Mar)", "San Mateo Del Mar Huave", "Ombeayiüts"),
        listOf("MX")
    ),
    Hawaiian_Creole(
        "hwc", 
        listOf("Hawaiian Creole", "Hawai'i Creole English"),
        listOf("US")
    ),
    Hawrami(
        "hac", 
        listOf("Hawrami", "Gurani"),
        listOf("IQ")
    ),
    Haya(
        "hay", 
        listOf("Haya"),
        listOf("TZ")
    ),
    Hyow(
        "csh", 
        listOf("Hyow", "Asho Chin", "Asho"),
        listOf("BD")
    ),
    Hunzib(
        "huz", 
        listOf("Hunzib"),
        listOf("RU")
    ),
    Iaai(
        "iai", 
        listOf("Iaai"),
        listOf("NC")
    ),
    Iatmul(
        "ian", 
        listOf("Iatmul"),
        listOf("PG")
    ),
    Iau(
        "tmu", 
        listOf("Iau"),
        listOf("ID")
    ),
    Iban(
        "iba", 
        listOf("Iban"),
        listOf("MY")
    ),
    Ibibio(
        "ibb", 
        listOf("Ibibio"),
        listOf("NG")
    ),
    Ibanag(
        "ibg", 
        listOf("Ibanag"),
        listOf("PH")
    ),
    Icelandic(
        "isl", 
        listOf("Icelandic", "íslenska"),
        listOf("IS")
    ),
    Icelandic_Sign_Language(
        "icl", 
        listOf("Icelandic Sign Language"),
        listOf("IS")
    ),
    Iduna(
        "viv", 
        listOf("Iduna"),
        listOf("PG")
    ),
    Idoma(
        "idu", 
        listOf("Idoma"),
        listOf("NG")
    ),
    Idu(
        "clk", 
        listOf("Idu", "Idu-Mishmi"),
        listOf("IN")
    ),
    Ifumu(
        "ifm", 
        listOf("Ifumu", "Teke-Fuumu"),
        listOf("CG")
    ),
    Ifugao_Batad(
        "ifb", 
        listOf("Ifugao (Batad)", "Batad Ifugao"),
        listOf("PH")
    ),
    Inga(
        "inb", 
        listOf("Inga"),
        listOf("CO")
    ),
    Igbo(
        "ibo", 
        listOf("Igbo"),
        listOf("NG")
    ),
    Igede(
        "ige", 
        listOf("Igede"),
        listOf("NG")
    ),
    Ignaciano(
        "ign", 
        listOf("Ignaciano"),
        listOf("BO")
    ),
    Ingessana(
        "tbi", 
        listOf("Ingessana", "Gaam", "Gaahmg"),
        listOf("SD")
    ),
    Iha(
        "ihp", 
        listOf("Iha"),
        listOf("ID")
    ),
    Indonesian_Papuan(
        "pmy", 
        listOf("Indonesian (Papuan)", "Papuan Malay", "Melayu Papua"),
        listOf("ID")
    ),
    Ijo_Kolokuma(
        "ijc", 
        listOf("Ijo (Kolokuma)", "Izon"),
        listOf("NG")
    ),
    Ik(
        "ikx", 
        listOf("Ik", "Icetod"),
        listOf("UG")
    ),
    Ika(
        "arh", 
        listOf("Ika", "Arhuaco", "Iku"),
        listOf("CO")
    ),
    Ila(
        "ilb", 
        listOf("Ila"),
        listOf("ZW", "ZM")
    ),
    Illinois(
        "mia", 
        listOf("Illinois", "Miami"),
        listOf("US")
    ),
    Ilocano(
        "ilo", 
        listOf("Ilocano", "Iloko"),
        listOf("PH")
    ),
    Imonda(
        "imn", 
        listOf("Imonda"),
        listOf("PG")
    ),
    Inanwatan(
        "szp", 
        listOf("Inanwatan", "Suabo"),
        listOf("ID")
    ),
    Ingush(
        "inh", 
        listOf("Ingush"),
        listOf("RU")
    ),
    Innamincka(
        "ynd", 
        listOf("Innamincka", "Yandruwandha"),
        listOf("AU")
    ),
    Iñupiaq(
        "esi", 
        listOf("Iñupiaq", "North Alaskan Inupiatun"),
        listOf("US")
    ),
    Indo_Pakistani_Sign_Language_Indian_dialects(
        "ins", 
        listOf("Indo-Pakistani Sign Language (Indian dialects)", "Indian Sign Language"),
        listOf("IN")
    ),
    Indo_Pakistani_Sign_Language_Karachi_dialect(
        "pks", 
        listOf("Indo-Pakistani Sign Language (Karachi dialect)", "Pakistan Sign Language"),
        listOf("PK")
    ),
    Iquito(
        "iqu", 
        listOf("Iquito", "Akenóiri"),
        listOf("PE")
    ),
    Iraqw(
        "irk", 
        listOf("Iraqw"),
        listOf("TZ")
    ),
    Irarutu(
        "irh", 
        listOf("Irarutu"),
        listOf("ID")
    ),
    Irish_Sign_Language(
        "isg", 
        listOf("Irish Sign Language"),
        listOf("IE")
    ),
    Iranxe(
        "irn", 
        listOf("Iranxe", "Irántxe"),
        listOf("BR")
    ),
    Isaka(
        "ksi", 
        listOf("I'saka", "Krisa"),
        listOf("PG")
    ),
    Isekiri(
        "its", 
        listOf("Isekiri"),
        listOf("NG")
    ),
    Ishkashmi(
        "sgl", 
        listOf("Ishkashmi"),
        listOf("AF", "TJ")
    ),
    Isirawa(
        "srl", 
        listOf("Isirawa"),
        listOf("ID")
    ),
    International_Sign(
        "ils", 
        listOf("International Sign"),
        listOf("")
    ),
    Isnag(
        "isd", 
        listOf("Isnag"),
        listOf("PH")
    ),
    Isoko(
        "iso", 
        listOf("Isoko"),
        listOf("NG")
    ),
    Israeli_Sign_Language(
        "isr", 
        listOf("Israeli Sign Language"),
        listOf("IL")
    ),
    Italian_Bologna(
        "eml", 
        listOf("Italian (Bologna)"),
        listOf("IT")
    ),
    Itelmen(
        "itl", 
        listOf("Itelmen"),
        listOf("RU")
    ),
    Italian_Genoa(
        "lij", 
        listOf("Italian (Genoa)", "Ligurian"),
        listOf("IT")
    ),
    Italian_Napolitanian(
        "nap", 
        listOf("Italian (Napolitanian)", "Neapolitan"),
        listOf("IT")
    ),
    Itonama(
        "ito", 
        listOf("Itonama"),
        listOf("BO")
    ),
    Italian_Turinese(
        "pms", 
        listOf("Italian (Turinese)", "Piedmontese", "Piemontèis"),
        listOf("IT")
    ),
    Itawis(
        "itv", 
        listOf("Itawis", "Itawit"),
        listOf("PH")
    ),
    Itzaj(
        "itz", 
        listOf("Itzaj", "Itzá"),
        listOf("GT")
    ),
    Iwaidja(
        "ibd", 
        listOf("Iwaidja"),
        listOf("AU")
    ),
    Iwam(
        "iwm", 
        listOf("Iwam"),
        listOf("PG")
    ),
    Ixcatec(
        "ixc", 
        listOf("Ixcatec", "Xwja"),
        listOf("MX")
    ),
    Ixil(
        "ixi", 
        listOf("Ixil"),
        listOf("GT")
    ),
    Izhor(
        "izh", 
        listOf("Izhor", "Ingrian"),
        listOf("RU")
    ),
    Izi(
        "izi", 
        listOf("Izi"),
        listOf("NG")
    ),
    Jabêm(
        "jae", 
        listOf("Jabêm", "Yabem"),
        listOf("PG")
    ),
    Jahai(
        "jhi", 
        listOf("Jahai", "Jehai"),
        listOf("MY")
    ),
    Jakaltek(
        "jac", 
        listOf("Jakaltek", "Popti'", "Jakalteko-Popti’"),
        listOf("GT")
    ),
    Jaminjung(
        "djd", 
        listOf("Jaminjung", "Djamindjung"),
        listOf("AU")
    ),
    Jaqaru(
        "jqr", 
        listOf("Jaqaru"),
        listOf("PE")
    ),
    Jarawa_in_Nigeria(
        "jar", 
        listOf("Jarawa (in Nigeria)"),
        listOf("NG")
    ),
    Javanese(
        "jav", 
        listOf("Javanese", "Basa Jawa"),
        listOf("ID")
    ),
    Jabutí(
        "jbt", 
        listOf("Jabutí"),
        listOf("BR")
    ),
    Jamaican_Creole(
        "jam", 
        listOf("Jamaican Creole", "Jamaican Creole English"),
        listOf("JM")
    ),
    Jebero(
        "jeb", 
        listOf("Jebero"),
        listOf("PE")
    ),
    Jeh(
        "jeh", 
        listOf("Jeh"),
        listOf("LA", "VN")
    ),
    Jeli(
        null, 
        listOf("Jeli"),
        listOf("CI")
    ),
    Jemez(
        "tow", 
        listOf("Jemez"),
        listOf("US")
    ),
    Jibbali(
        "shv", 
        listOf("Jibbali", "Shehri"),
        listOf("OM")
    ),
    Jino(
        "jiy", 
        listOf("Jino", "Buyuan Jinuo"),
        listOf("CN")
    ),
    Jivaro(
        "jiv", 
        listOf("Jivaro", "Shuar", "Shuar Chicham"),
        listOf("EC")
    ),
    Luwo(
        "lwo", 
        listOf("Luwo"),
        listOf("SD")
    ),
    Jur_Mödö(
        "bex", 
        listOf("Jur Mödö", "Jur Modo"),
        listOf("SD")
    ),
    Jamsay(
        "djm", 
        listOf("Jamsay", "Jamsay Dogon"),
        listOf("ML")
    ),
    Jingpho(
        "kac", 
        listOf("Jingpho", "Kachin"),
        listOf("MM")
    ),
    Johari(
        null, 
        listOf("Johari"),
        listOf("IN")
    ),
    Jomang(
        "tlo", 
        listOf("Jomang", "Talodi"),
        listOf("SD")
    ),
    Japanese(
        "jpn", 
        listOf("Japanese", "日本語"),
        listOf("JP")
    ),
    Japreria(
        "jru", 
        listOf("Japreria", "Japrería"),
        listOf("VR")
    ),
    Juruna(
        "jur", 
        listOf("Juruna", "Jurúna"),
        listOf("BR")
    ),
    Jarawa_in_Andamans(
        "anq", 
        listOf("Jarawa (in Andamans)", "Jarawa (India)"),
        listOf("IN")
    ),
    Juat(
        null, 
        listOf("Juat"),
        listOf("AU")
    ),
    Juhoan(
        "ktz", 
        listOf("Ju|'hoan", "Ju/'hoan", "Ju|’hoansi"),
        listOf("BW", "AO", "NA")
    ),
    Jukun(
        "jbu", 
        listOf("Jukun", "Jukun Takum", "Njikum"),
        listOf("NG")
    ),
    Júma(
        "jua", 
        listOf("Júma", "Kagwahiva"),
        listOf("BR")
    ),
    Juang(
        "jun", 
        listOf("Juang"),
        listOf("IN")
    ),
    Jurchen(
        "juc", 
        listOf("Jurchen"),
        listOf("CN")
    ),
    Karajá(
        "kpj", 
        listOf("Karajá"),
        listOf("BR")
    ),
    Karó_Arára(
        "arr", 
        listOf("Karó (Arára)", "Karo (Brazil)"),
        listOf("BR")
    ),
    Kabardian(
        "kbd", 
        listOf("Kabardian"),
        listOf("RU")
    ),
    Kachari(
        "xac", 
        listOf("Kachari"),
        listOf("IN")
    ),
    Kaki_Ae(
        "tbd", 
        listOf("Kaki Ae"),
        listOf("PG")
    ),
    Kayu_Agung(
        "kge", 
        listOf("Kayu Agung", "Komering"),
        listOf("ID")
    ),
    Kaian(
        "kct", 
        listOf("Kaian"),
        listOf("PG")
    ),
    Kaure(
        "bpp", 
        listOf("Kaure"),
        listOf("ID")
    ),
    Kamano_Kafe(
        "kbq", 
        listOf("Kamano-Kafe", "Kamano"),
        listOf("PG")
    ),
    Kalami(
        "gwc", 
        listOf("Kalami"),
        listOf("PK")
    ),
    Kambera(
        "xbr", 
        listOf("Kambera"),
        listOf("ID")
    ),
    Kana(
        "ogo", 
        listOf("Kana", "Khana"),
        listOf("NG")
    ),
    Karao(
        "kyj", 
        listOf("Karao"),
        listOf("PH")
    ),
    Kela_Apoze(
        "kcl", 
        listOf("Kela (Apoze)", "Kela (Papua New Guinea)"),
        listOf("PG")
    ),
    Kaurna(
        "zku", 
        listOf("Kaurna"),
        listOf("AU")
    ),
    Kara_in_Central_African_Republic(
        "kah", 
        listOf("Kara (in Central African Republic)", "Kara (Central African Republic)"),
        listOf("CF")
    ),
    Kashmiri(
        "kas", 
        listOf("Kashmiri", "کٲشُر"),
        listOf("PK", "IN")
    ),
    Kâte(
        "kmg", 
        listOf("Kâte"),
        listOf("PG")
    ),
    Kaulong(
        "pss", 
        listOf("Kaulong"),
        listOf("PG")
    ),
    Kaiwá(
        "kgk", 
        listOf("Kaiwá"),
        listOf("PY", "BR")
    ),
    Kayardild(
        "gyd", 
        listOf("Kayardild"),
        listOf("AU")
    ),
    Kazakh(
        "kaz", 
        listOf("Kazakh", "қазақ тілі"),
        listOf("KZ")
    ),
    Kamba(
        "kam", 
        listOf("Kamba", "Kikamba"),
        listOf("KE")
    ),
    Kabui(
        "nkf", 
        listOf("Kabui", "Inpui Naga", "Inpui"),
        listOf("IN")
    ),
    Kabyle(
        "kab", 
        listOf("Kabyle", "Taqbaylit"),
        listOf("DZ")
    ),
    Kambot(
        "kbx", 
        listOf("Kambot", "Ap Ma"),
        listOf("PG")
    ),
    Kayan_Baram(
        "kys", 
        listOf("Kayan (Baram)", "Baram Kayan"),
        listOf("MY")
    ),
    Kabatei(
        "xkp", 
        listOf("Kabatei"),
        listOf("IR")
    ),
    Kanembu(
        "kbl", 
        listOf("Kanembu"),
        listOf("NG", "NE", "TD")
    ),
    Karen_Bwe(
        "bwe", 
        listOf("Karen (Bwe)", "Bwe Karen"),
        listOf("MM")
    ),
    Kabiyé(
        "kbp", 
        listOf("Kabiyé", "Kabiyè"),
        listOf("TG")
    ),
    Koyra_Chiini(
        "khq", 
        listOf("Koyra Chiini", "Koyra ciini"),
        listOf("ML")
    ),
    Konda(
        "kfc", 
        listOf("Konda", "Konda-Dora"),
        listOf("IN")
    ),
    Karipuna_do_Guapore(
        "kuq", 
        listOf("Karipuna do Guapore", "Karipuna"),
        listOf("BR")
    ),
    Kadiwéu(
        "kbc", 
        listOf("Kadiwéu"),
        listOf("BR")
    ),
    Kadazan(
        "kzj", 
        listOf("Kadazan"),
        listOf("MY")
    ),
    Kanjobal_Eastern(
        "kjb", 
        listOf("Kanjobal (Eastern)", "Q'anjob'al"),
        listOf("GT")
    ),
    Kedang(
        "ksx", 
        listOf("Kedang"),
        listOf("ID")
    ),
    Kefa(
        "kbr", 
        listOf("Kefa", "Kafa"),
        listOf("ET")
    ),
    Kei(
        "kei", 
        listOf("Kei"),
        listOf("ID")
    ),
    Kekchí(
        "kek", 
        listOf("K'ekchí", "Kekchí"),
        listOf("GT")
    ),
    Kele(
        "sbc", 
        listOf("Kele", "Kele (Papua New Guinea)"),
        listOf("PG")
    ),
    Kemant(
        "ahg", 
        listOf("Kemant", "Qimant"),
        listOf("ET")
    ),
    Kenga(
        "kyq", 
        listOf("Kenga"),
        listOf("TD")
    ),
    Keo(
        "xxk", 
        listOf("Ke'o"),
        listOf("ID")
    ),
    Kera(
        "ker", 
        listOf("Kera"),
        listOf("TD")
    ),
    Ket(
        "ket", 
        listOf("Ket"),
        listOf("RU")
    ),
    Kenyah_Uma_Lung(
        null, 
        listOf("Kenyah (Uma' Lung)"),
        listOf("ID")
    ),
    Kewa(
        "kjs", 
        listOf("Kewa", "East Kewa"),
        listOf("PG")
    ),
    Kriol_Fitzroy_Crossing(
        null, 
        listOf("Kriol (Fitzroy Crossing)"),
        listOf("AU")
    ),
    Koromfe(
        "kfz", 
        listOf("Koromfe", "Koromfé", "Koromba"),
        listOf("BF", "ML")
    ),
    Kinga(
        "zga", 
        listOf("Kinga", "Bakinga"),
        listOf("TZ")
    ),
    Konyagi(
        "cou", 
        listOf("Konyagi", "Wamey", "Wamay"),
        listOf("ML", "GN")
    ),
    Umbu_Ungu(
        "ubu", 
        listOf("Umbu Ungu", "Umbu-Ungu"),
        listOf("PG")
    ),
    Kagoma(
        "kdm", 
        listOf("Kagoma"),
        listOf("NG")
    ),
    Kagulu(
        "kki", 
        listOf("Kagulu"),
        listOf("TZ")
    ),
    Kalkatungu(
        "ktg", 
        listOf("Kalkatungu", "Kalkutung"),
        listOf("AU")
    ),
    Kyirong(
        "kgy", 
        listOf("Kyirong", "Kyerung"),
        listOf("CN")
    ),
    Khalkha(
        "khk", 
        listOf("Khalkha", "Halh Mongolian", "Монгол хэл‎ (Mongol khel)"),
        listOf("MN")
    ),
    Khaling(
        "klr", 
        listOf("Khaling"),
        listOf("IN", "CN", "NP")
    ),
    Khinalug(
        "kjj", 
        listOf("Khinalug", "Khinalugh"),
        listOf("AZ")
    ),
    Khakas(
        "kjh", 
        listOf("Khakas"),
        listOf("RU")
    ),
    Khalaj(
        "klj", 
        listOf("Khalaj", "Turkic Khalaj"),
        listOf("IR")
    ),
    Khmer(
        "khm", 
        listOf("Khmer", "ខ្មែរ"),
        listOf("KH")
    ),
    Khün(
        "kkh", 
        listOf("Khün"),
        listOf("MM")
    ),
    Khoekhoe(
        "naq", 
        listOf("Khoekhoe", "Nama", "Khoekhoegowab"),
        listOf("NA")
    ),
    Kharia(
        "khr", 
        listOf("Kharia"),
        listOf("IN")
    ),
    Khasi(
        "kha", 
        listOf("Khasi"),
        listOf("IN")
    ),
    Khumi(
        "cnk", 
        listOf("Khumi", "Khumi Chin"),
        listOf("MM")
    ),
    Khvarshi(
        "khv", 
        listOf("Khvarshi"),
        listOf("RU")
    ),
    Khowar(
        "khw", 
        listOf("Khowar"),
        listOf("PK")
    ),
    Kickapoo(
        "kic", 
        listOf("Kickapoo"),
        listOf("US")
    ),
    Kire(
        "geb", 
        listOf("Kire"),
        listOf("PG")
    ),
    Kitja(
        "gia", 
        listOf("Kitja"),
        listOf("AU")
    ),
    Kikuyu(
        "kik", 
        listOf("Kikuyu", "Gikuyu"),
        listOf("KE")
    ),
    Kiluba(
        "lub", 
        listOf("Kiluba", "Luba-Katanga", "Tshiluba"),
        listOf("CD")
    ),
    Kimaghama(
        "kig", 
        listOf("Kimaghama", "Kimaama"),
        listOf("ID")
    ),
    Kinyarwanda(
        "kin", 
        listOf("Kinyarwanda"),
        listOf("RW")
    ),
    Kiowa(
        "kio", 
        listOf("Kiowa", "Cáuijògà"),
        listOf("US")
    ),
    Kirma(
        "cme", 
        listOf("Kirma", "Cerma"),
        listOf("BF")
    ),
    Kitsai(
        "kii", 
        listOf("Kitsai"),
        listOf("US")
    ),
    Kui_in_Indonesia(
        "kvd", 
        listOf("Kui (in Indonesia)", "Kui (Indonesia)"),
        listOf("ID")
    ),
    Kiwai(
        "kjd", 
        listOf("Kiwai", "Southern Kiwai"),
        listOf("PG")
    ),
    Koreguaje(
        "coe", 
        listOf("Koreguaje"),
        listOf("CO")
    ),
    Kunjen(
        "kjn", 
        listOf("Kunjen"),
        listOf("AU")
    ),
    Konjo(
        "kjc", 
        listOf("Konjo", "Coastal Konjo"),
        listOf("ID")
    ),
    Koorete(
        "kqy", 
        listOf("Koorete"),
        listOf("ET")
    ),
    Konkomba(
        "xon", 
        listOf("Konkomba", "Likpakpaanl"),
        listOf("TG", "GH")
    ),
    Kata_Kolok(
        "bqy", 
        listOf("Kata Kolok", "Bengkala Sign Language"),
        listOf("ID")
    ),
    Konkani(
        "knn", 
        listOf("Konkani", "Konkani (individual language)", "कोंकणी‎ (Konknni)"),
        listOf("IN")
    ),
    Koranko(
        "knk", 
        listOf("Koranko", "Kuranko"),
        listOf("SL", "GN")
    ),
    Karakalpak(
        "kaa", 
        listOf("Karakalpak", "Kara-Kalpak"),
        listOf("UZ")
    ),
    Kuikúro(
        "kui", 
        listOf("Kuikúro", "Kuikúro-Kalapálo"),
        listOf("BR")
    ),
    Kirikiri(
        "kiy", 
        listOf("Kirikiri"),
        listOf("ID")
    ),
    Kokota(
        "kkk", 
        listOf("Kokota"),
        listOf("SB")
    ),
    Korku(
        "kfq", 
        listOf("Korku"),
        listOf("IN")
    ),
    Lusi(
        "khl", 
        listOf("Lusi"),
        listOf("PG")
    ),
    Karankawa(
        "zkk", 
        listOf("Karankawa"),
        listOf("US")
    ),
    Kankanay(
        "kne", 
        listOf("Kankanay", "Kankanaey"),
        listOf("PH")
    ),
    Kokni(
        "kex", 
        listOf("Kokni", "Kukna"),
        listOf("IN")
    ),
    Klao(
        "klu", 
        listOf("Klao"),
        listOf("LR")
    ),
    Kilba(
        "hbb", 
        listOf("Kilba", "Huba"),
        listOf("NG")
    ),
    Kulung(
        "kle", 
        listOf("Kulung", "Kulung (Nepal)"),
        listOf("NP")
    ),
    Kalasha(
        "kls", 
        listOf("Kalasha"),
        listOf("PK")
    ),
    Kaili(
        "lew", 
        listOf("Kaili", "Ledo Kaili", "Kaili-Ledo"),
        listOf("ID")
    ),
    Koh_Lakka(
        "xuo", 
        listOf("Koh (Lakka)", "Kuo"),
        listOf("TD", "CM")
    ),
    Kaluli(
        "bco", 
        listOf("Kaluli"),
        listOf("PG")
    ),
    Klamath(
        "kla", 
        listOf("Klamath", "Klamath-Modoc"),
        listOf("US")
    ),
    Kolana(
        "kvw", 
        listOf("Kolana", "Wersing"),
        listOf("ID")
    ),
    Kalapuya(
        "kyl", 
        listOf("Kalapuya"),
        listOf("US")
    ),
    Kalam(
        "kmh", 
        listOf("Kalam"),
        listOf("PG")
    ),
    Koluri(
        "shm", 
        listOf("Koluri", "Shahrudi"),
        listOf("IR")
    ),
    Kalispel(
        "fla", 
        listOf("Kalispel", "Kalispel-Pend d'Oreille"),
        listOf("US")
    ),
    Kelabit(
        "kzi", 
        listOf("Kelabit"),
        listOf("MY")
    ),
    Kilivila(
        "kij", 
        listOf("Kilivila"),
        listOf("PG")
    ),
    Kiliwa(
        "klb", 
        listOf("Kiliwa"),
        listOf("MX")
    ),
    Kala_Lagaw_Ya(
        "mwp", 
        listOf("Kala Lagaw Ya"),
        listOf("AU")
    ),
    Kalanga(
        "kck", 
        listOf("Kalanga"),
        listOf("ZW", "BW")
    ),
    Kamaiurá(
        "kay", 
        listOf("Kamaiurá", "Kamayurá"),
        listOf("BR")
    ),
    Kombai(
        "tyn", 
        listOf("Kombai"),
        listOf("ID")
    ),
    Kham(
        "kgj", 
        listOf("Kham", "Gamale Kham"),
        listOf("NP")
    ),
    Kami(
        "kcu", 
        listOf("Kami", "Kami (Tanzania)"),
        listOf("TZ")
    ),
    Karimojong(
        "kdj", 
        listOf("Karimojong", "Karamojong"),
        listOf("UG")
    ),
    Kuman(
        "kue", 
        listOf("Kuman", "Kuman (Papua New Guinea)"),
        listOf("PG")
    ),
    Koiali_Mountain(
        "kpx", 
        listOf("Koiali (Mountain)", "Mountain Koiali"),
        listOf("PG")
    ),
    Kunimaipa(
        "kup", 
        listOf("Kunimaipa"),
        listOf("PG")
    ),
    Kamoro(
        "kgq", 
        listOf("Kamoro"),
        listOf("ID")
    ),
    Kamass(
        "xas", 
        listOf("Kamass", "Kamas"),
        listOf("RU")
    ),
    Kemtuik(
        "kmt", 
        listOf("Kemtuik"),
        listOf("ID")
    ),
    Khmu(
        "kjg", 
        listOf("Khmu'", "Khmu", "ກຶມຫມຸ‎ (Kmhmu’)"),
        listOf("LA")
    ),
    Kamu(
        "xmu", 
        listOf("Kamu"),
        listOf("AU")
    ),
    Kamasau(
        "kms", 
        listOf("Kamasau"),
        listOf("PG")
    ),
    Karitiâna(
        "ktn", 
        listOf("Karitiâna"),
        listOf("BR")
    ),
    Kanum_Bädi(
        "khd", 
        listOf("Kanum (Bädi)", "Bädi Kanum"),
        listOf("ID")
    ),
    Kugu_Nganhcara(
        "uwa", 
        listOf("Kugu Nganhcara", "Kuku-Uwanh"),
        listOf("AU")
    ),
    Kannada(
        "kan", 
        listOf("Kannada", "ಕನ್ನಡ"),
        listOf("IN")
    ),
    Kaingang(
        "kgp", 
        listOf("Kaingang"),
        listOf("BR")
    ),
    Konni(
        "kma", 
        listOf("Konni"),
        listOf("GH")
    ),
    Kanakuru(
        "kna", 
        listOf("Kanakuru", "Dera (Nigeria)"),
        listOf("NG")
    ),
    Kunama(
        "kun", 
        listOf("Kunama"),
        listOf("ER", "ET")
    ),
    Kinnauri(
        "kfk", 
        listOf("Kinnauri"),
        listOf("IN")
    ),
    Kanoê(
        null, 
        listOf("Kanoê"),
        listOf("BR")
    ),
    Kanum_Ngkâlmpw(
        "kcd", 
        listOf("Kanum (Ngkâlmpw)", "Ngkâlmpw Kanum"),
        listOf("ID")
    ),
    Kriol_Ngukurr(
        "rop", 
        listOf("Kriol (Ngukurr)", "Kriol"),
        listOf("AU")
    ),
    Kanuri(
        "knc", 
        listOf("Kanuri", "Central Kanuri"),
        listOf("NE", "TD", "NG", "SD")
    ),
    Konua(
        "kyx", 
        listOf("Konua", "Rapoisi"),
        listOf("PG")
    ),
    Konkow(
        "mjd", 
        listOf("Konkow", "Northwest Maidu"),
        listOf("US")
    ),
    Koasati(
        "cku", 
        listOf("Koasati"),
        listOf("US")
    ),
    Kobon(
        "kpw", 
        listOf("Kobon"),
        listOf("PG")
    ),
    Kodava(
        "kfa", 
        listOf("Kodava"),
        listOf("IN")
    ),
    Koegu(
        "xwg", 
        listOf("Koegu", "Kwegu"),
        listOf("ET")
    ),
    Kohumono(
        "bcs", 
        listOf("Kohumono"),
        listOf("NG")
    ),
    Koiari(
        "kbk", 
        listOf("Koiari", "Grass Koiari"),
        listOf("PG")
    ),
    Kokborok(
        "trp", 
        listOf("Kokborok", "Kok Borok"),
        listOf("IN")
    ),
    Kolami(
        "nit", 
        listOf("Kolami", "Southeastern Kolami"),
        listOf("IN")
    ),
    Komo(
        "xom", 
        listOf("Komo", "Komo (Sudan)", "Tta Komo"),
        listOf("SD", "ET")
    ),
    Kola(
        "kvv", 
        listOf("Kola"),
        listOf("ID")
    ),
    Komi_Permyak(
        "koi", 
        listOf("Komi-Permyak"),
        listOf("RU")
    ),
    Korean(
        "kor", 
        listOf("Korean", "한국어"),
        listOf("KP", "KR")
    ),
    Kosraean(
        "kos", 
        listOf("Kosraean", "Kosrae"),
        listOf("FM")
    ),
    Kota(
        "kfe", 
        listOf("Kota", "Kota (India)"),
        listOf("IN")
    ),
    Kom(
        "bkm", 
        listOf("Kom", "Itangikom"),
        listOf("CM")
    ),
    Ko_Winye(
        "kst", 
        listOf("Ko (Winye)", "Winyé"),
        listOf("BF")
    ),
    Koya(
        "kff", 
        listOf("Koya"),
        listOf("IN")
    ),
    Kpan(
        "kpk", 
        listOf("Kpan"),
        listOf("NG")
    ),
    Kpelle(
        "xpe", 
        listOf("Kpelle", "Liberia Kpelle"),
        listOf("LR")
    ),
    Kapampangan(
        "pam", 
        listOf("Kapampangan", "Pampanga"),
        listOf("PH")
    ),
    Kapingamarangi(
        "kpg", 
        listOf("Kapingamarangi"),
        listOf("FM")
    ),
    Kposo(
        "kpo", 
        listOf("Kposo", "Ikposo"),
        listOf("TG")
    ),
    Karen_Pwo(
        "kjp", 
        listOf("Karen (Pwo)", "Pwo Eastern Karen"),
        listOf("MM", "CN")
    ),
    Krenak(
        "kqq", 
        listOf("Krenak"),
        listOf("BR")
    ),
    Kara_in_Papua_New_Guinea(
        "leu", 
        listOf("Kara (in Papua New Guinea)", "Kara (Papua New Guinea)"),
        listOf("PG")
    ),
    Kiribati(
        "gil", 
        listOf("Kiribati", "Gilbertese", "I-Kiribati"),
        listOf("KI")
    ),
    Karachay_Balkar(
        "krc", 
        listOf("Karachay-Balkar"),
        listOf("RU")
    ),
    Kresh(
        "krs", 
        listOf("Kresh", "Gbaya (Sudan)"),
        listOf("SD")
    ),
    Korafe(
        "kpr", 
        listOf("Korafe", "Korafe-Yegha"),
        listOf("PG")
    ),
    Kipea(
        "kzw", 
        listOf("Kipea", "Karirí-Xocó"),
        listOf("BR")
    ),
    Karadjeri(
        "gbd", 
        listOf("Karadjeri"),
        listOf("AU")
    ),
    Karok(
        "kyh", 
        listOf("Karok"),
        listOf("US")
    ),
    Karelian(
        "krl", 
        listOf("Karelian"),
        listOf("RU")
    ),
    Karaim(
        "kdr", 
        listOf("Karaim"),
        listOf("LT", "UA")
    ),
    Korana(
        "kqz", 
        listOf("Korana"),
        listOf("ZA")
    ),
    Krongo(
        "kgo", 
        listOf("Krongo", "Niino mo-di"),
        listOf("SD")
    ),
    Kerek(
        "krk", 
        listOf("Kerek"),
        listOf("RU")
    ),
    Kairiru(
        "kxa", 
        listOf("Kairiru"),
        listOf("PG")
    ),
    Karata(
        "kpt", 
        listOf("Karata"),
        listOf("RU")
    ),
    Korowai(
        "khe", 
        listOf("Korowai"),
        listOf("ID")
    ),
    Koryak(
        "kpy", 
        listOf("Koryak"),
        listOf("RU")
    ),
    Kryz(
        "kry", 
        listOf("Kryz", "Kryts"),
        listOf("AZ")
    ),
    Keresan_Santa_Ana(
        "kee", 
        listOf("Keresan (Santa Ana)", "Eastern Keres"),
        listOf("US")
    ),
    Koyraboro_Senni(
        "ses", 
        listOf("Koyraboro Senni", "Koyraboro senni"),
        listOf("ML", "NE")
    ),
    Karen_Sgaw(
        "ksw", 
        listOf("Karen (Sgaw)", "S'gaw Karen"),
        listOf("MM")
    ),
    Kashaya(
        "kju", 
        listOf("Kashaya"),
        listOf("US")
    ),
    Ksingmul(
        "puo", 
        listOf("Ksingmul", "Puoc"),
        listOf("VN", "LA")
    ),
    Kenyan_Sign_Language(
        "xki", 
        listOf("Kenyan Sign Language"),
        listOf("KE")
    ),
    Kasong(
        null, 
        listOf("Kasong"),
        listOf("TH")
    ),
    Kosop(
        "kia", 
        listOf("Kosop", "Kim"),
        listOf("TD")
    ),
    Kisar(
        "kje", 
        listOf("Kisar"),
        listOf("ID")
    ),
    Koita(
        "kqi", 
        listOf("Koita", "Koitabu"),
        listOf("PG")
    ),
    Kituba(
        "ktu", 
        listOf("Kituba", "Kituba (Democratic Republic of Congo)"),
        listOf("CD")
    ),
    Kete(
        "kcv", 
        listOf("Kete"),
        listOf("CD")
    ),
    Kutchin(
        "gwi", 
        listOf("Kutchin", "Gwichʼin", "Dinju Zhuh K’yuu"),
        listOf("US", "CA")
    ),
    Kati_in_West_Papua(
        "yon", 
        listOf("\"Kati (in West Papua", "Yongkom"),
        listOf("Papunesia")
    ),
    Kotoko(
        "aal", 
        listOf("Kotoko", "Afade"),
        listOf("CF")
    ),
    Katla(
        "kcr", 
        listOf("Katla"),
        listOf("SD")
    ),
    Ketengban(
        "xte", 
        listOf("Ketengban"),
        listOf("ID")
    ),
    Kato(
        "ktw", 
        listOf("Kato"),
        listOf("US")
    ),
    Kott(
        "zko", 
        listOf("Kott"),
        listOf("RU")
    ),
    Katu(
        "ktv", 
        listOf("Katu", "Eastern Katu"),
        listOf("VN", "LA")
    ),
    Khanty(
        "kca", 
        listOf("Khanty"),
        listOf("RU")
    ),
    Kati_in_Afghanistan(
        "bsh", 
        listOf("Kati (in Afghanistan)", "Kati"),
        listOf("AF", "PK")
    ),
    Kualan(
        null, 
        listOf("Kualan"),
        listOf("ID")
    ),
    Kui_in_India(
        "kxu", 
        listOf("Kui (in India)", "Kui (India)"),
        listOf("IN")
    ),
    Kumauni(
        "kfy", 
        listOf("Kumauni", "Kumaoni"),
        listOf("IN")
    ),
    Kuna(
        "kvn", 
        listOf("Kuna", "Border Kuna"),
        listOf("CO", "PA")
    ),
    Kuot(
        "kto", 
        listOf("Kuot"),
        listOf("PG")
    ),
    Kumyk(
        "kum", 
        listOf("Kumyk"),
        listOf("RU")
    ),
    Kurukh(
        "kru", 
        listOf("Kurukh"),
        listOf("IN")
    ),
    Kusunda(
        "kgg", 
        listOf("Kusunda"),
        listOf("NP")
    ),
    Kutenai(
        "kut", 
        listOf("Kutenai", "Ktunaxa"),
        listOf("CA", "US")
    ),
    Kuuku_Yau(
        "kuy", 
        listOf("Kuuku Ya'u", "Kuuku-Ya'u"),
        listOf("AU")
    ),
    Kuvi(
        "kxv", 
        listOf("Kuvi"),
        listOf("IN")
    ),
    Kutai(
        "vkt", 
        listOf("Kutai", "Tenggarong Kutai Malay"),
        listOf("ID")
    ),
    Kulamanen(
        "mbt", 
        listOf("Kulamanen", "Matigsalug Manobo"),
        listOf("PH")
    ),
    Kwaio(
        "kwd", 
        listOf("Kwaio"),
        listOf("SB")
    ),
    Kwerba(
        "kwe", 
        listOf("Kwerba"),
        listOf("ID")
    ),
    Kanjobal_Western(
        "knj", 
        listOf("Kanjobal (Western)", "Western Kanjobal", "K’anjob’al"),
        listOf("GT")
    ),
    Kwakwala(
        "kwk", 
        listOf("Kwakw'ala", "Kwakiutl", "Kwak’wala"),
        listOf("CA")
    ),
    Kwami(
        "ksq", 
        listOf("Kwami", "Kwaami"),
        listOf("NG")
    ),
    Kwangali(
        "kwn", 
        listOf("Kwangali"),
        listOf("NA", "AO")
    ),
    Kwoma(
        "kmo", 
        listOf("Kwoma"),
        listOf("PG")
    ),
    Kwamera(
        "tnk", 
        listOf("Kwamera"),
        listOf("VU")
    ),
    Kawaiisu(
        "xaw", 
        listOf("Kawaiisu"),
        listOf("US")
    ),
    Kwomtari(
        "kwo", 
        listOf("Kwomtari"),
        listOf("PG")
    ),
    Iwoyo(
        "kwy", 
        listOf("Iwoyo", "San Salvador Kongo"),
        listOf("AO")
    ),
    Kwaza(
        "xwa", 
        listOf("Kwaza"),
        listOf("BR")
    ),
    Kxoe(
        "xuu", 
        listOf("Kxoe", "Khwe", "Khwedam"),
        listOf("NA", "AO")
    ),
    Kuku_Yalanji(
        "gvn", 
        listOf("Kuku-Yalanji"),
        listOf("AU")
    ),
    Kenyang(
        "ken", 
        listOf("Kenyang"),
        listOf("CM")
    ),
    Kyaka(
        "kyc", 
        listOf("Kyaka"),
        listOf("PG")
    ),
    Kayah_Li_Eastern(
        "eky", 
        listOf("Kayah Li (Eastern)", "Eastern Kayah"),
        listOf("MM", "TH")
    ),
    Koyukon(
        "koy", 
        listOf("Koyukon"),
        listOf("US")
    ),
    Kanyok(
        "kny", 
        listOf("Kanyok"),
        listOf("CD")
    ),
    Kayapó(
        "txu", 
        listOf("Kayapó"),
        listOf("BR")
    ),
    Karkar_Yuri(
        "yuj", 
        listOf("Karkar-Yuri"),
        listOf("PG")
    ),
    Kaytej(
        "gbb", 
        listOf("Kaytej", "Kaytetye"),
        listOf("AU")
    ),
    Kayabí(
        "kyz", 
        listOf("Kayabí"),
        listOf("BR")
    ),
    Kam_Zhanglu(
        "doc", 
        listOf("Kam (Zhanglu)", "Northern Dong"),
        listOf("CN")
    ),
    Laal(
        "gdm", 
        listOf("Laal"),
        listOf("TD")
    ),
    Labu(
        "lbu", 
        listOf("Labu"),
        listOf("PG")
    ),
    Lacandón(
        "lac", 
        listOf("Lacandón", "Lacandon", "Jach-t’aan"),
        listOf("MX")
    ),
    Ladakhi(
        "lbj", 
        listOf("Ladakhi"),
        listOf("IN")
    ),
    Lafofa(
        "laf", 
        listOf("Lafofa"),
        listOf("SD")
    ),
    Lagwan(
        "kot", 
        listOf("Lagwan"),
        listOf("CM")
    ),
    Lahu(
        "lhu", 
        listOf("Lahu"),
        listOf("CN", "TH", "MM")
    ),
    Lai(
        "cnh", 
        listOf("Lai", "Hakha Chin", "Lai Chin"),
        listOf("MM")
    ),
    Lak(
        "lbe", 
        listOf("Lak"),
        listOf("RU")
    ),
    Lalo(
        "ywt", 
        listOf("Lalo", "Xishanba Lalo"),
        listOf("CN")
    ),
    Lamé(
        "lme", 
        listOf("Lamé", "Pévé"),
        listOf("CM", "TD")
    ),
    Lango(
        "laj", 
        listOf("Lango", "Lango (Uganda)"),
        listOf("UG")
    ),
    Lao(
        "lao", 
        listOf("Lao", "ລາວ"),
        listOf("LA", "TH")
    ),
    Laragia(
        "lrg", 
        listOf("Laragia"),
        listOf("AU")
    ),
    Latvian(
        "lav", 
        listOf("Latvian", "latviešu"),
        listOf("LV")
    ),
    Lau(
        "llu", 
        listOf("Lau"),
        listOf("SB")
    ),
    Lavukaleve(
        "lvk", 
        listOf("Lavukaleve"),
        listOf("SB")
    ),
    Laz(
        "lzz", 
        listOf("Laz", "Lazuri"),
        listOf("GE", "TR")
    ),
    Lunda(
        "lun", 
        listOf("Lunda"),
        listOf("CD")
    ),
    Lachi(
        "lbt", 
        listOf("Lachi"),
        listOf("VN")
    ),
    Lesser_Antillean_French_Creole(
        "acf", 
        listOf("Lesser Antillean French Creole", "Saint Lucian Creole French", "Kwéyòl", "Patwa"),
        listOf("GP", "TT", "GY", "LC", "DM", "GD", "MQ")
    ),
    Luganda(
        "lug", 
        listOf("Luganda", "Ganda"),
        listOf("UG")
    ),
    Ladin(
        "lld", 
        listOf("Ladin"),
        listOf("IT")
    ),
    Lendu(
        "led", 
        listOf("Lendu", "Ndrulo"),
        listOf("CD")
    ),
    Lebeo(
        "agh", 
        listOf("Lebeo", "Ngelima"),
        listOf("CD")
    ),
    Leko(
        "lec", 
        listOf("Leko", "Leco"),
        listOf("BO")
    ),
    Lega(
        "lea", 
        listOf("Lega", "Lega-Shabunda"),
        listOf("CD")
    ),
    Lele(
        "lln", 
        listOf("Lele", "Lele (Chad)"),
        listOf("TD")
    ),
    Lenakel(
        "tnl", 
        listOf("Lenakel"),
        listOf("VU")
    ),
    Lepcha(
        "lep", 
        listOf("Lepcha"),
        listOf("IN", "NP", "BT")
    ),
    Lese(
        "les", 
        listOf("Lese"),
        listOf("CD")
    ),
    Leti(
        "lti", 
        listOf("Leti", "Leti (Indonesia)"),
        listOf("ID")
    ),
    Lewo(
        "lww", 
        listOf("Lewo"),
        listOf("VU")
    ),
    Lezgian(
        "lez", 
        listOf("Lezgian", "Lezghian"),
        listOf("RU", "AZ")
    ),
    Luangiua(
        "ojv", 
        listOf("Luangiua", "Ontong Java"),
        listOf("SB")
    ),
    Low_German(
        "nds", 
        listOf("Low German", "Neddersass’sch"),
        listOf("DE")
    ),
    Lughat_al_Isharat_al_Lubnaniya(
        null, 
        listOf("Lughat al-Isharat al-Lubnaniya"),
        listOf("LB")
    ),
    Langi(
        "lag", 
        listOf("Langi", "Kɨlaangi"),
        listOf("TZ")
    ),
    Língua_Gestual_Portuguesa(
        "psr", 
        listOf("Língua Gestual Portuguesa", "Portuguese Sign Language"),
        listOf("PT")
    ),
    Logoti(
        "log", 
        listOf("Logoti", "Logo"),
        listOf("CD")
    ),
    Longgu(
        "lgu", 
        listOf("Longgu"),
        listOf("SB")
    ),
    Laha(
        "lha", 
        listOf("Laha", "Laha (Viet Nam)"),
        listOf("VN")
    ),
    Lhomi(
        "lhm", 
        listOf("Lhomi", "ल्होमी‎ (Lhomi)"),
        listOf("NP")
    ),
    Hlai_Baoding(
        "lic", 
        listOf("Hlai (Baoding)", "Hlai"),
        listOf("CN")
    ),
    Lingua_Italiana_dei_Segni(
        "ise", 
        listOf("Lingua Italiana dei Segni", "Italian Sign Language"),
        listOf("IT")
    ),
    Lillooet(
        "lil", 
        listOf("Lillooet"),
        listOf("CA")
    ),
    Limbu(
        "lif", 
        listOf("Limbu"),
        listOf("BT", "NP", "IN")
    ),
    Lingala(
        "lin", 
        listOf("Lingala", "lingála"),
        listOf("CD")
    ),
    Lisu(
        "lis", 
        listOf("Lisu", "LI-SU‎ (Li-su)"),
        listOf("CN", "MM")
    ),
    Lithuanian(
        "lit", 
        listOf("Lithuanian", "lietuvių"),
        listOf("LT")
    ),
    Liv(
        "liv", 
        listOf("Liv", "Livonian", "Livõ kel"),
        listOf("LV")
    ),
    Lauje(
        "law", 
        listOf("Lauje"),
        listOf("ID")
    ),
    Lakkia(
        "lbc", 
        listOf("Lakkia"),
        listOf("CN")
    ),
    Lakhota(
        "lkt", 
        listOf("Lakhota", "Lakota", "Lakȟólʼiyapi"),
        listOf("US")
    ),
    Lamu_Lamu(
        "lby", 
        listOf("Lamu-Lamu"),
        listOf("AU")
    ),
    Lelemi(
        "lef", 
        listOf("Lelemi"),
        listOf("GH")
    ),
    Loma(
        "lom", 
        listOf("Loma", "Loma (Liberia)"),
        listOf("LR", "GN")
    ),
    Lamba(
        "lam", 
        listOf("Lamba"),
        listOf("CD", "ZM")
    ),
    Lamang(
        "hia", 
        listOf("Lamang"),
        listOf("NG")
    ),
    Lamaholot(
        "slp", 
        listOf("Lamaholot"),
        listOf("ID")
    ),
    Limilngan(
        "lmc", 
        listOf("Limilngan"),
        listOf("AU")
    ),
    Lamani(
        "lmn", 
        listOf("Lamani", "Lambadi"),
        listOf("IN")
    ),
    Lampung(
        "ljp", 
        listOf("Lampung", "Lampung Api"),
        listOf("ID")
    ),
    Lamen(
        "lmu", 
        listOf("Lamen", "Lamenu"),
        listOf("VU")
    ),
    Linda(
        "liy", 
        listOf("Linda", "Banda-Bambari"),
        listOf("CF")
    ),
    Lengua(
        "leg", 
        listOf("Lengua"),
        listOf("PY")
    ),
    Ladino(
        "lad", 
        listOf("Ladino"),
        listOf("IL", "TR")
    ),
    Lamnso(
        "lns", 
        listOf("Lamnso'", "Lamnso’"),
        listOf("CM")
    ),
    Lonwolwol(
        "crc", 
        listOf("Lonwolwol"),
        listOf("VU")
    ),
    Lobi(
        "lob", 
        listOf("Lobi"),
        listOf("BF", "CI")
    ),
    Loko(
        "lok", 
        listOf("Loko"),
        listOf("SL")
    ),
    Loniu(
        "los", 
        listOf("Loniu"),
        listOf("PG")
    ),
    Lotha(
        "njh", 
        listOf("Lotha", "Lotha Naga"),
        listOf("IN")
    ),
    Lou(
        "loj", 
        listOf("Lou"),
        listOf("PG")
    ),
    Loven(
        "lbo", 
        listOf("Loven", "Laven"),
        listOf("LA")
    ),
    Lozi(
        "loz", 
        listOf("Lozi"),
        listOf("ZM")
    ),
    Lardil(
        "lbz", 
        listOf("Lardil"),
        listOf("AU")
    ),
    Larike(
        "alo", 
        listOf("Larike", "Larike-Wakasihu"),
        listOf("ID")
    ),
    Lengua_de_Señas_Argentina(
        "aed", 
        listOf("Lengua de Señas Argentina", "Argentine Sign Language"),
        listOf("AR")
    ),
    Língua_de_Sinais_Brasileira(
        "bzs", 
        listOf("Língua de Sinais Brasileira", "Brazilian Sign Language"),
        listOf("BR")
    ),
    Lengua_de_Señas_Española(
        "ssp", 
        listOf("Lengua de Señas Española", "Spanish Sign Language"),
        listOf("ES")
    ),
    Langue_des_Signes_Française(
        "fsl", 
        listOf("Langue des Signes Française", "French Sign Language"),
        listOf("FR")
    ),
    Langue_des_Signes_Québecoise(
        "fcs", 
        listOf("Langue des Signes Québecoise", "Quebec Sign Language"),
        listOf("CA")
    ),
    Lü(
        "khb", 
        listOf("Lü", "ᦅᧄᦺᦑᦟᦹᧉ‎ (Kam Tai Lue)"),
        listOf("LA", "MM", "CN")
    ),
    Lua(
        "nie", 
        listOf("Lua", "Niellim"),
        listOf("TD")
    ),
    Lucazi(
        "lch", 
        listOf("Lucazi", "Luchazi"),
        listOf("AO")
    ),
    Lun_Dayeh(
        "lnd", 
        listOf("Lun Dayeh", "Lundayeh"),
        listOf("ID")
    ),
    Lugbara(
        "lgg", 
        listOf("Lugbara", "Lugbarati"),
        listOf("CD", "UG")
    ),
    Luiseño(
        "lui", 
        listOf("Luiseño", "Luiseno"),
        listOf("US")
    ),
    Lule(
        "ule", 
        listOf("Lule"),
        listOf("AR")
    ),
    Luo(
        "luo", 
        listOf("Luo", "Dholuo"),
        listOf("TZ", "KE")
    ),
    Luri(
        "lrc", 
        listOf("Luri", "Northern Luri", "لۊری شومالی"),
        listOf("IR")
    ),
    Lushootseed(
        "lut", 
        listOf("Lushootseed"),
        listOf("US")
    ),
    Luvale(
        "lue", 
        listOf("Luvale"),
        listOf("AO")
    ),
    Luxemburgeois(
        "ltz", 
        listOf("Luxemburgeois", "Luxembourgish", "Lëtzebuergesch"),
        listOf("LU")
    ),
    Luyia(
        "luy", 
        listOf("Luyia", "Luluhia"),
        listOf("KE")
    ),
    Lyele(
        "lee", 
        listOf("Lyele", "Lyélé"),
        listOf("BF")
    ),
    Ma(
        "msj", 
        listOf("Ma", "Ma (Democratic Republic of Congo)"),
        listOf("CD")
    ),
    Maasai(
        "mas", 
        listOf("Maasai", "Masai", "Maa"),
        listOf("KE", "TZ")
    ),
    Maba(
        "mde", 
        listOf("Maba", "Bura Mabang"),
        listOf("TD")
    ),
    Macushi(
        "mbc", 
        listOf("Macushi"),
        listOf("GY", "BR", "VR")
    ),
    Madi(
        "mhi", 
        listOf("Ma'di"),
        listOf("SD", "UG")
    ),
    Mae(
        "mme", 
        listOf("Mae"),
        listOf("VU")
    ),
    Magar(
        "mgp", 
        listOf("Magar", "Eastern Magar"),
        listOf("NP")
    ),
    Mari_Hill(
        "mrj", 
        listOf("Mari (Hill)", "Western Mari"),
        listOf("RU")
    ),
    Maithili(
        "mai", 
        listOf("Maithili", "मैथिली‎ (Maithilī)"),
        listOf("NP", "IN")
    ),
    Majang(
        "mpe", 
        listOf("Majang"),
        listOf("ET")
    ),
    Makah(
        "myh", 
        listOf("Makah"),
        listOf("US")
    ),
    Malagasy(
        "plt", 
        listOf("Malagasy", "Plateau Malagasy", "Malagasy fiteny"),
        listOf("MG")
    ),
    Mam(
        "mvc", 
        listOf("Mam"),
        listOf("GT")
    ),
    Mano(
        "mev", 
        listOf("Mano", "Maa"),
        listOf("LR", "GN")
    ),
    Maori(
        "mri", 
        listOf("Maori", "te reo Maori"),
        listOf("NZ")
    ),
    Mapudungun(
        "arn", 
        listOf("Mapudungun", "Mapuche"),
        listOf("CL")
    ),
    Maricopa(
        "mrc", 
        listOf("Maricopa"),
        listOf("US")
    ),
    Masa(
        "mcn", 
        listOf("Masa", "Masana"),
        listOf("TD", "CM")
    ),
    Maung(
        "mph", 
        listOf("Maung"),
        listOf("AU")
    ),
    Maring(
        "mbw", 
        listOf("Maring"),
        listOf("PG")
    ),
    Maninka_Western(
        "mlq", 
        listOf("Maninka (Western)", "Western Maninkakan"),
        listOf("ML")
    ),
    Maxakalí(
        "mbl", 
        listOf("Maxakalí"),
        listOf("BR")
    ),
    Maybrat(
        "ayz", 
        listOf("Maybrat", "Mai Brat"),
        listOf("ID")
    ),
    Mazahua(
        "maz", 
        listOf("Mazahua", "Central Mazahua", "Jnatrjo"),
        listOf("MX")
    ),
    Mba(
        "mfc", 
        listOf("Mba"),
        listOf("CD")
    ),
    Mbabaram(
        null, 
        listOf("Mbabaram"),
        listOf("AU")
    ),
    Mbere(
        "mdt", 
        listOf("Mbere"),
        listOf("GA", "CG")
    ),
    Mbugu(
        "mhd", 
        listOf("Mbugu"),
        listOf("TZ")
    ),
    Mbili(
        "baw", 
        listOf("Mbili", "Bambili-Bambui"),
        listOf("CM")
    ),
    Mbole(
        "mdq", 
        listOf("Mbole"),
        listOf("CD")
    ),
    Mbum(
        "mdd", 
        listOf("Mbum"),
        listOf("TD", "CF", "CM")
    ),
    Monumbo(
        "mxk", 
        listOf("Monumbo"),
        listOf("PG")
    ),
    Mbara(
        "mpk", 
        listOf("Mbara", "Mbara (Chad)"),
        listOf("TD")
    ),
    Mangbetu(
        "mdj", 
        listOf("Mangbetu"),
        listOf("CD")
    ),
    Manambu(
        "mle", 
        listOf("Manambu"),
        listOf("PG")
    ),
    Mbay(
        "myb", 
        listOf("Mbay"),
        listOf("TD")
    ),
    Mbe(
        "mtk", 
        listOf("Mbe'"),
        listOf("CM")
    ),
    Maca(
        "mca", 
        listOf("Maca", "Mak’á"),
        listOf("PY")
    ),
    Mochica(
        "omc", 
        listOf("Mochica"),
        listOf("PE")
    ),
    Macedonian(
        "mkd", 
        listOf("Macedonian", "македонски"),
        listOf("MK")
    ),
    Mískito_Coast_English_Creole(
        "bzj", 
        listOf("Mískito Coast English Creole", "Belize Kriol English", "Kriol"),
        listOf("BZ")
    ),
    Michif(
        "crg", 
        listOf("Michif"),
        listOf("CA")
    ),
    Macaguán(
        "mbn", 
        listOf("Macaguán"),
        listOf("CO")
    ),
    Machiguenga(
        "mcb", 
        listOf("Machiguenga", "Matsigenka"),
        listOf("PE")
    ),
    Macuna(
        "myy", 
        listOf("Macuna"),
        listOf("CO", "BR")
    ),
    Mixe_Coatlán(
        "mco", 
        listOf("Mixe (Coatlán)", "Coatlán Mixe", "Ayuk"),
        listOf("MX")
    ),
    Mauritian_Creole(
        "mfe", 
        listOf("Mauritian Creole", "Morisyen", "kreol morisien"),
        listOf("MU")
    ),
    Miwok_Central_Sierra(
        "csm", 
        listOf("Miwok (Central Sierra)", "Central Sierra Miwok"),
        listOf("US")
    ),
    Mocoví(
        "moc", 
        listOf("Mocoví"),
        listOf("AR")
    ),
    Mada_in_Cameroon(
        "mxu", 
        listOf("Mada (in Cameroon)", "Mada (Cameroon)"),
        listOf("CM")
    ),
    Mudburra(
        "mwd", 
        listOf("Mudburra"),
        listOf("AU")
    ),
    Mende(
        "men", 
        listOf("Mende", "Mɛnde‎ (Mende)", "Mɛnde yia‎ (Mende yia)"),
        listOf("SL")
    ),
    Mundang(
        "mua", 
        listOf("Mundang", "MUNDAŊ"),
        listOf("TD")
    ),
    Matngele(
        "zml", 
        listOf("Matngele", "Madngele"),
        listOf("AU")
    ),
    Madimadi(
        null, 
        listOf("Madimadi"),
        listOf("AU")
    ),
    Mandan(
        "mhq", 
        listOf("Mandan"),
        listOf("US")
    ),
    Mbodomo(
        "gmm", 
        listOf("Mbodomo", "Gbaya-Mbodomo"),
        listOf("CF")
    ),
    Madurese(
        "mad", 
        listOf("Madurese"),
        listOf("ID")
    ),
    Manadonese(
        "xmm", 
        listOf("Manadonese", "Manado Malay", "Bahasa Manado"),
        listOf("ID")
    ),
    Mündü(
        "muh", 
        listOf("Mündü"),
        listOf("SD", "CD")
    ),
    Mbosi(
        "mdw", 
        listOf("Mbosi"),
        listOf("CG")
    ),
    Mada_in_Nigeria(
        "mda", 
        listOf("Mada (in Nigeria)", "Mada (Nigeria)"),
        listOf("NG")
    ),
    Meyah(
        "mej", 
        listOf("Meyah"),
        listOf("ID")
    ),
    Melayu_Betawi(
        "bew", 
        listOf("Melayu Betawi", "Betawi"),
        listOf("ID")
    ),
    Meen(
        "mym", 
        listOf("Me'en"),
        listOf("ET")
    ),
    Mehri(
        "gdq", 
        listOf("Mehri"),
        listOf("YE", "OM")
    ),
    Meithei(
        "mni", 
        listOf("Meithei", "Manipuri", "মৈতৈলোন্"),
        listOf("IN")
    ),
    Mekens(
        "skf", 
        listOf("Mekens", "Sakirabiá"),
        listOf("BR")
    ),
    Melanau(
        "mel", 
        listOf("Melanau", "Central Melanau"),
        listOf("MY")
    ),
    Manem(
        "jet", 
        listOf("Manem"),
        listOf("ID", "PG")
    ),
    Menomini(
        "mez", 
        listOf("Menomini", "Menominee"),
        listOf("US")
    ),
    Meryam_Mir(
        "ulk", 
        listOf("Meryam Mir", "Meriam"),
        listOf("AU")
    ),
    Menya(
        "mcr", 
        listOf("Menya"),
        listOf("PG")
    ),
    Mondunga(
        "ndt", 
        listOf("Mondunga", "Ndunga"),
        listOf("CD")
    ),
    Mongondow(
        "mog", 
        listOf("Mongondow"),
        listOf("ID")
    ),
    Mnong_Eastern(
        "mng", 
        listOf("Mnong (Eastern)", "Eastern Mnong"),
        listOf("VN")
    ),
    Mangghuer(
        "mjg", 
        listOf("Mangghuer", "Tu"),
        listOf("CN")
    ),
    Magahi(
        "mag", 
        listOf("Magahi"),
        listOf("IN")
    ),
    Magi(
        "mgu", 
        listOf("Magi", "Mailu"),
        listOf("PG")
    ),
    Mungaka(
        "mhk", 
        listOf("Mungaka"),
        listOf("CM")
    ),
    Mingrelian(
        "xmf", 
        listOf("Mingrelian"),
        listOf("GE")
    ),
    Magindanao(
        "mdh", 
        listOf("Magindanao", "Maguindanaon"),
        listOf("PH")
    ),
    Mongo(
        "lol", 
        listOf("Mongo"),
        listOf("CD")
    ),
    Mango(
        "mge", 
        listOf("Mango"),
        listOf("TD")
    ),
    Musgu(
        "mug", 
        listOf("Musgu", "Mulwi"),
        listOf("TD", "CM")
    ),
    Mahican(
        "mof", 
        listOf("Mahican"),
        listOf("US")
    ),
    Marathi(
        "mar", 
        listOf("Marathi", "मराठी"),
        listOf("IN")
    ),
    Mehek(
        "nux", 
        listOf("Mehek"),
        listOf("PG")
    ),
    Mah_Meri(
        "mhe", 
        listOf("Mah Meri", "Besisi"),
        listOf("MY")
    ),
    Mbalanhu(
        "lnb", 
        listOf("Mbalanhu"),
        listOf("NA")
    ),
    Micmac(
        "mic", 
        listOf("Micmac", "Mi'kmaq", "Míkmawísimk"),
        listOf("CA")
    ),
    Midob(
        "mei", 
        listOf("Midob"),
        listOf("SD")
    ),
    Mien(
        "ium", 
        listOf("Mien", "Iu Mien"),
        listOf("CN")
    ),
    Migama(
        "mmy", 
        listOf("Migama", "Migaama"),
        listOf("TD")
    ),
    Miju(
        "mxj", 
        listOf("Miju", "Miju-Mishmi", "Kman"),
        listOf("IN")
    ),
    Mikir(
        "mjw", 
        listOf("Mikir", "Karbi"),
        listOf("IN")
    ),
    Minangkabau(
        "min", 
        listOf("Minangkabau"),
        listOf("ID")
    ),
    Miriwung(
        "mep", 
        listOf("Miriwung"),
        listOf("AU")
    ),
    Miskito(
        "miq", 
        listOf("Miskito", "Mískito", "Mískitu"),
        listOf("NI")
    ),
    Mituku(
        "zmq", 
        listOf("Mituku"),
        listOf("CD")
    ),
    Miya(
        "mkf", 
        listOf("Miya"),
        listOf("NG")
    ),
    Mizo(
        "lus", 
        listOf("Mizo"),
        listOf("IN", "BD")
    ),
    Mixtec_Jamiltepec(
        "mxt", 
        listOf("Mixtec (Jamiltepec)", "Jamiltepec Mixtec"),
        listOf("MX")
    ),
    Mixtec_San_Juan_Colorado(
        "mjc", 
        listOf("Mixtec (San Juan Colorado)", "San Juan Colorado Mixtec", "Tu’un sav"),
        listOf("MX")
    ),
    Manjaku(
        "mfv", 
        listOf("Manjaku", "Mandjak"),
        listOf("GW")
    ),
    Mauka(
        "mxx", 
        listOf("Mauka", "Mahou"),
        listOf("CI")
    ),
    Miwok_Bodega(
        "csi", 
        listOf("Miwok (Bodega)", "Coast Miwok"),
        listOf("US")
    ),
    Makonde(
        "kde", 
        listOf("Makonde", "Chimakonde"),
        listOf("MZ", "TZ")
    ),
    Mekeo(
        "mek", 
        listOf("Mekeo"),
        listOf("PG")
    ),
    Mongol_Khamnigan(
        null, 
        listOf("Mongol (Khamnigan)"),
        listOf("CN", "MN")
    ),
    Mikasuki(
        "mik", 
        listOf("Mikasuki"),
        listOf("US")
    ),
    Makasae(
        "mkz", 
        listOf("Makasae"),
        listOf("TL")
    ),
    Maklew(
        "mgf", 
        listOf("Maklew"),
        listOf("ID")
    ),
    Mankanya(
        "knf", 
        listOf("Mankanya"),
        listOf("GW")
    ),
    Mokilko(
        "moz", 
        listOf("Mokilko", "Mukulu"),
        listOf("TD")
    ),
    Mikarew(
        "msy", 
        listOf("Mikarew", "Aruamu"),
        listOf("PG")
    ),
    Makassar(
        "mak", 
        listOf("Makassar", "Makasar"),
        listOf("ID")
    ),
    Maranungku(
        "zmr", 
        listOf("Maranungku", "Maranunggu"),
        listOf("AU")
    ),
    Máku(
        "xak", 
        listOf("Máku"),
        listOf("BR")
    ),
    Makaa(
        "mcp", 
        listOf("Makaa"),
        listOf("CM")
    ),
    Mambila(
        "mcu", 
        listOf("Mambila", "Cameroon Mambila"),
        listOf("CM", "NG")
    ),
    Malacca_Creole(
        "mcm", 
        listOf("Malacca Creole", "Malaccan Creole Portuguese", "Kristang"),
        listOf("MY")
    ),
    Maale(
        "mdy", 
        listOf("Maale", "Male (Ethiopia)"),
        listOf("ET")
    ),
    Malgwa(
        "mfi", 
        listOf("Malgwa", "Wandala"),
        listOf("NG")
    ),
    Mali(
        "gcc", 
        listOf("Mali"),
        listOf("PG")
    ),
    Malakmalak(
        "mpb", 
        listOf("Malakmalak", "Mullukmulluk"),
        listOf("AU")
    ),
    Molala(
        "mbe", 
        listOf("Molala", "Molale"),
        listOf("US")
    ),
    Mlabri_Minor(
        "mra", 
        listOf("Mlabri (Minor)", "Mlabri", "มละบริ‎ (Mlabri)", "มาลาบรี‎ (Malabri)"),
        listOf("TH")
    ),
    Maltese(
        "mlt", 
        listOf("Maltese", "Malti"),
        listOf("MT")
    ),
    Maleu(
        "mgl", 
        listOf("Maleu", "Maleu-Kilenge"),
        listOf("PG")
    ),
    Malay(
        "zsm", 
        listOf("Malay", "Standard Malay", "Bahasa Malaysia"),
        listOf("MY")
    ),
    Mandaic_Modern(
        "mid", 
        listOf("Mandaic (Modern)", "Mandaic"),
        listOf("IR", "IQ")
    ),
    Mangap_Mbula(
        "mna", 
        listOf("Mangap-Mbula", "Mbula"),
        listOf("PG")
    ),
    Mari_Meadow(
        "mhr", 
        listOf("Mari (Meadow)", "Eastern Mari"),
        listOf("RU")
    ),
    Mambai(
        "mcs", 
        listOf("Mambai", "dâg tì mà̧mbày"),
        listOf("TD")
    ),
    Mamanwa(
        "mmn", 
        listOf("Mamanwa"),
        listOf("PH")
    ),
    Mordvin_Moksha(
        "mdf", 
        listOf("Mordvin (Moksha)", "Moksha"),
        listOf("RU")
    ),
    Mampruli(
        "maw", 
        listOf("Mampruli", "Nmampurli"),
        listOf("GH", "TG")
    ),
    Mamasa(
        "mqj", 
        listOf("Mamasa"),
        listOf("ID")
    ),
    Malay_Ulu_Muar(
        "zmi", 
        listOf("Malay (Ulu Muar)", "Negeri Sembilan Malay"),
        listOf("MY")
    ),
    Mamvu(
        "mdi", 
        listOf("Mamvu", "Tengo"),
        listOf("CD")
    ),
    Mambwe(
        "mgr", 
        listOf("Mambwe", "Mambwe-Lungu"),
        listOf("TZ", "ZM")
    ),
    Mam_Southern(
        "mms", 
        listOf("Mam (Southern)"),
        listOf("GT")
    ),
    Muna(
        "mnb", 
        listOf("Muna", "Wuna"),
        listOf("ID")
    ),
    Manchu(
        "mnc", 
        listOf("Manchu"),
        listOf("CN")
    ),
    Maidu_Northeast(
        "nmu", 
        listOf("Maidu (Northeast)", "Northeast Maidu"),
        listOf("US")
    ),
    Manggarai(
        "mqy", 
        listOf("Manggarai"),
        listOf("ID")
    ),
    Moni(
        "mnz", 
        listOf("Moni"),
        listOf("ID")
    ),
    Maninka(
        "emk", 
        listOf("Maninka", "Eastern Maninkakan"),
        listOf("GN", "SL")
    ),
    Manam(
        "mva", 
        listOf("Manam"),
        listOf("PG")
    ),
    Mono_in_United_States(
        "mnr", 
        listOf("Mono (in United States)", "Mono (USA)"),
        listOf("US")
    ),
    Mandar(
        "mdr", 
        listOf("Mandar"),
        listOf("ID")
    ),
    Mansi(
        "mns", 
        listOf("Mansi", "Ма̄ньщи"),
        listOf("RU")
    ),
    Mentawai(
        "mwv", 
        listOf("Mentawai"),
        listOf("ID")
    ),
    Mun(
        "mji", 
        listOf("Mun", "Kim Mun", "Kem di mun"),
        listOf("CN")
    ),
    Minaveha(
        "mvn", 
        listOf("Minaveha"),
        listOf("PG")
    ),
    Manx(
        "glv", 
        listOf("Manx", "Gaelg"),
        listOf("GB")
    ),
    Margany(
        "zmc", 
        listOf("Margany"),
        listOf("AU")
    ),
    Munzombo(
        "moj", 
        listOf("Munzombo", "Monzombo"),
        listOf("CG")
    ),
    Mono_Alu(
        "mte", 
        listOf("Mono-Alu", "Mono (Solomon Islands)"),
        listOf("SB")
    ),
    Moca(
        "moy", 
        listOf("Moca", "Shekkacho"),
        listOf("ET")
    ),
    Mordvin_Erzya(
        "myv", 
        listOf("Mordvin (Erzya)", "Erzya"),
        listOf("KZ", "RU")
    ),
    Mofu_Gudur(
        "mif", 
        listOf("Mofu-Gudur"),
        listOf("CM")
    ),
    Moghol(
        "mhj", 
        listOf("Moghol", "Mogholi"),
        listOf("AF")
    ),
    Mohawk(
        "moh", 
        listOf("Mohawk", "Kanienʼkéha"),
        listOf("CA", "US")
    ),
    Mojave(
        "mov", 
        listOf("Mojave", "Mohave"),
        listOf("US")
    ),
    Mokilese(
        "mkj", 
        listOf("Mokilese", "Mokil", "Mwoakilloa"),
        listOf("FM")
    ),
    Mombum(
        "mso", 
        listOf("Mombum"),
        listOf("ID")
    ),
    Mon(
        "mnw", 
        listOf("Mon"),
        listOf("TH", "MM")
    ),
    Mooré(
        "mos", 
        listOf("Mooré", "Mossi", "Mòoré"),
        listOf("BF")
    ),
    Mopan(
        "mop", 
        listOf("Mopan", "Mopán Maya"),
        listOf("BZ")
    ),
    Mor(
        "mhz", 
        listOf("Mor", "Mor (Mor Islands)"),
        listOf("ID")
    ),
    Mosetén(
        "cas", 
        listOf("Mosetén", "Tsimané"),
        listOf("BO")
    ),
    Motuna(
        "siw", 
        listOf("Motuna", "Siwai"),
        listOf("PG")
    ),
    Moru(
        "mgd", 
        listOf("Moru"),
        listOf("SD")
    ),
    Movima(
        "mzp", 
        listOf("Movima"),
        listOf("BO")
    ),
    Murrinh_Patha(
        "mwf", 
        listOf("Murrinh-Patha"),
        listOf("AU")
    ),
    Mpongwe(
        "mye", 
        listOf("Mpongwe", "Myene"),
        listOf("GA")
    ),
    Maipure(
        null, 
        listOf("Maipure"),
        listOf("VR")
    ),
    Mian(
        "mpt", 
        listOf("Mian"),
        listOf("PG")
    ),
    Mpur(
        "akc", 
        listOf("Mpur"),
        listOf("ID")
    ),
    Mapoyo(
        "mcg", 
        listOf("Mapoyo"),
        listOf("VR")
    ),
    Momuna(
        "mqf", 
        listOf("Momuna"),
        listOf("ID")
    ),
    Mara(
        "mec", 
        listOf("Mara"),
        listOf("AU")
    ),
    Marchha(
        "rnp", 
        listOf("Marchha", "Rongpo"),
        listOf("IN")
    ),
    Marind(
        "mrz", 
        listOf("Marind"),
        listOf("ID")
    ),
    Margi(
        "mrt", 
        listOf("Margi", "Marghi Central"),
        listOf("NG")
    ),
    Marrithiyel(
        "mfr", 
        listOf("Marrithiyel", "Marithiel"),
        listOf("AU")
    ),
    Moraori(
        "mok", 
        listOf("Moraori", "Morori"),
        listOf("ID")
    ),
    Murik(
        "mtf", 
        listOf("Murik", "Murik (Papua New Guinea)"),
        listOf("PG")
    ),
    Murle(
        "mur", 
        listOf("Murle"),
        listOf("SD")
    ),
    Maranao(
        "mrw", 
        listOf("Maranao"),
        listOf("PH")
    ),
    Moro(
        "mor", 
        listOf("Moro", "Dhimorong"),
        listOf("SD")
    ),
    Marquesan(
        "mrq", 
        listOf("Marquesan", "North Marquesan"),
        listOf("PF")
    ),
    Maringarr(
        "zmt", 
        listOf("Maringarr"),
        listOf("AU")
    ),
    Mairasi(
        "zrs", 
        listOf("Mairasi"),
        listOf("ID")
    ),
    Martuthunira(
        "vma", 
        listOf("Martuthunira", "Martuyhunira"),
        listOf("AU")
    ),
    Maru(
        "mhx", 
        listOf("Maru", "Lhao Vo"),
        listOf("MM")
    ),
    Muruwari(
        "zmu", 
        listOf("Muruwari"),
        listOf("AU")
    ),
    Muisca(
        "chb", 
        listOf("Muisca", "Chibcha"),
        listOf("CO")
    ),
    Munsee(
        "umu", 
        listOf("Munsee"),
        listOf("US")
    ),
    Marshallese(
        "mah", 
        listOf("Marshallese"),
        listOf("MH")
    ),
    Masakin(
        "jle", 
        listOf("Masakin", "Ngile"),
        listOf("SD")
    ),
    Masalit(
        "mls", 
        listOf("Masalit", "Kana Masaraka"),
        listOf("SD", "TD")
    ),
    Musom(
        "msu", 
        listOf("Musom"),
        listOf("PG")
    ),
    Maisin(
        "mbq", 
        listOf("Maisin"),
        listOf("PG")
    ),
    Miwok_Southern_Sierra(
        "skd", 
        listOf("Miwok (Southern Sierra)", "Southern Sierra Miwok"),
        listOf("US")
    ),
    Magar_Syangja(
        "mrd", 
        listOf("Magar (Syangja)", "Western Magar"),
        listOf("NP")
    ),
    Mentuh_Tapuh(
        "sdo", 
        listOf("Mentuh Tapuh", "Bukar-Sadung Bidayuh"),
        listOf("MY")
    ),
    Matuumbi(
        "mgw", 
        listOf("Matuumbi", "Matumbi"),
        listOf("TZ")
    ),
    Montagnais(
        "moe", 
        listOf("Montagnais"),
        listOf("CA")
    ),
    Mixe_Tlahuitoltepec(
        "mxp", 
        listOf("Mixe (Tlahuitoltepec)", "Tlahuitoltepec Mixe"),
        listOf("MX")
    ),
    Barí(
        "mot", 
        listOf("Barí"),
        listOf("VR", "CO")
    ),
    Matukar(
        "mjk", 
        listOf("Matukar"),
        listOf("PG")
    ),
    Mattole(
        "mvb", 
        listOf("Mattole"),
        listOf("US")
    ),
    Malto(
        "kmj", 
        listOf("Malto", "Kumarbhag Paharia"),
        listOf("IN")
    ),
    Mixe_Totontepec(
        "mto", 
        listOf("Mixe (Totontepec)", "Totontepec Mixe", "Ayuk"),
        listOf("MX")
    ),
    Matis(
        "mpq", 
        listOf("Matis", "Matís"),
        listOf("BR")
    ),
    Massachusett(
        "wam", 
        listOf("Massachusett", "Wampanoag", "Wôpanâak"),
        listOf("US")
    ),
    Motu(
        "meu", 
        listOf("Motu"),
        listOf("PG")
    ),
    Makua(
        "xsq", 
        listOf("Makua", "Makhuwa-Saka"),
        listOf("MZ")
    ),
    Mundani(
        "mnf", 
        listOf("Mundani"),
        listOf("CM")
    ),
    Mugil(
        "mlp", 
        listOf("Mugil", "Bargam"),
        listOf("PG")
    ),
    Muinane(
        "bmr", 
        listOf("Muinane"),
        listOf("CO")
    ),
    Mulao(
        "mlm", 
        listOf("Mulao", "Mulam"),
        listOf("CN")
    ),
    Mumuye(
        "mzm", 
        listOf("Mumuye"),
        listOf("NG")
    ),
    Muong(
        "mtq", 
        listOf("Muong"),
        listOf("VN")
    ),
    Mupun(
        "sur", 
        listOf("Mupun", "Mwaghavul"),
        listOf("NG")
    ),
    Mursi(
        "muz", 
        listOf("Mursi"),
        listOf("ET")
    ),
    Mussau(
        "emi", 
        listOf("Mussau", "Mussau-Emira"),
        listOf("PG")
    ),
    Mundurukú(
        "myu", 
        listOf("Mundurukú"),
        listOf("BR")
    ),
    Muyuw(
        "myw", 
        listOf("Muyuw"),
        listOf("PG")
    ),
    Manobo_Western_Bukidnon(
        "mbb", 
        listOf("Manobo (Western Bukidnon)", "Western Bukidnon Manobo"),
        listOf("PH")
    ),
    Mawchi(
        "mke", 
        listOf("Mawchi"),
        listOf("IN")
    ),
    Mwera(
        "mwe", 
        listOf("Mwera", "Mwera (Chimwera)"),
        listOf("TZ")
    ),
    Miwok_Lake(
        "lmw", 
        listOf("Miwok (Lake)", "Lake Miwok"),
        listOf("US")
    ),
    Miwok_Northern_Sierra(
        "nsq", 
        listOf("Miwok (Northern Sierra)", "Northern Sierra Miwok"),
        listOf("US")
    ),
    Mwotlap(
        "mlv", 
        listOf("Mwotlap", "Motlav"),
        listOf("VU")
    ),
    Miwok_Plains(
        "pmw", 
        listOf("Miwok (Plains)", "Plains Miwok"),
        listOf("US")
    ),
    Mixtec_Atatlahuca(
        "mib", 
        listOf("Mixtec (Atatlahuca)", "Atatláhuca Mixtec"),
        listOf("MX")
    ),
    Ifira_Mele(
        "mxe", 
        listOf("Ifira-Mele", "Mele-Fila"),
        listOf("VU")
    ),
    Mixtec_Jicaltepec(
        "mio", 
        listOf("Mixtec (Jicaltepec)", "Pinotepa Nacional Mixtec"),
        listOf("MX")
    ),
    Mixtec_Alacatlatzala(
        "mim", 
        listOf("Mixtec (Alacatlatzala)", "Alacatlatzala Mixtec", "To’on Savi"),
        listOf("MX")
    ),
    Mixtec_Ocotepec(
        "mie", 
        listOf("Mixtec (Ocotepec)", "Ocotepec Mixtec", "Tu’un savi"),
        listOf("MX")
    ),
    Mixtec_Peñoles(
        "mil", 
        listOf("Mixtec (Peñoles)", "Peñoles Mixtec", "Tu’un savi"),
        listOf("MX")
    ),
    Mixtec_Silacayoapan(
        "mks", 
        listOf("Mixtec (Silacayoapan)", "Silacayoapan Mixtec"),
        listOf("MX")
    ),
    Mixtec_Ayutla(
        "miy", 
        listOf("Mixtec (Ayutla)", "Ayutla Mixtec"),
        listOf("MX")
    ),
    Mixtec_Chayuco(
        "mih", 
        listOf("Mixtec (Chayuco)", "Chayuco Mixtec", "Tu’un savi"),
        listOf("MX")
    ),
    Mixe_Ayutla(
        null, 
        listOf("Mixe (Ayutla)"),
        listOf("MX")
    ),
    Mixtec_Yosondúa(
        "mpm", 
        listOf("Mixtec (Yosondúa)", "Yosondúa Mixtec"),
        listOf("MX")
    ),
    Mixtec_Coatzospan(
        "miz", 
        listOf("Mixtec (Coatzospan)", "Coatzospan Mixtec", "Tu’un davi"),
        listOf("MX")
    ),
    Maya(
        "slz", 
        listOf("Ma'ya"),
        listOf("ID")
    ),
    Mayogo(
        "mdm", 
        listOf("Mayogo"),
        listOf("CD")
    ),
    Mangarrayi(
        "mpc", 
        listOf("Mangarrayi", "Mangarayi"),
        listOf("AU")
    ),
    Malayalam(
        "mal", 
        listOf("Malayalam", "മലയാളം"),
        listOf("IN")
    ),
    Maanyan(
        "mhy", 
        listOf("Ma'anyan"),
        listOf("ID")
    ),
    Mayo(
        "mfy", 
        listOf("Mayo", "Yoreme Nokki"),
        listOf("MX")
    ),
    Matsés(
        "mcf", 
        listOf("Matsés"),
        listOf("PE", "BR")
    ),
    Mayi_Yapi(
        "xyj", 
        listOf("Mayi-Yapi"),
        listOf("AU")
    ),
    Mazatec_Chiquihuitlán(
        "maq", 
        listOf("Mazatec (Chiquihuitlán)", "Chiquihuitlán Mazatec", "Nne nangui ngaxni"),
        listOf("MX")
    ),
    Mazatec_Huautla(
        "mau", 
        listOf("Mazatec (Huautla)", "Huautla Mazatec", "Enna"),
        listOf("MX")
    ),
    Mazanderani(
        "mzn", 
        listOf("Mazanderani", "مازرونی"),
        listOf("IR")
    ),
    Nabak(
        "naf", 
        listOf("Nabak"),
        listOf("PG")
    ),
    Nadëb(
        "mbj", 
        listOf("Nadëb"),
        listOf("BR")
    ),
    Nafaanra(
        "nfr", 
        listOf("Nafaanra"),
        listOf("GH", "CI")
    ),
    Nagatman(
        "nce", 
        listOf("Nagatman", "Yale"),
        listOf("PG")
    ),
    Nahali(
        "nll", 
        listOf("Nahali", "Nihali"),
        listOf("IN")
    ),
    Nanai(
        "gld", 
        listOf("Nanai"),
        listOf("RU")
    ),
    Neo_Aramaic_Arbel_Jewish(
        "aij", 
        listOf("Neo-Aramaic (Arbel Jewish)", "Lishanid Noshan"),
        listOf("IL")
    ),
    Nakanai(
        "nak", 
        listOf("Nakanai"),
        listOf("PG")
    ),
    Nalik(
        "nal", 
        listOf("Nalik"),
        listOf("PG")
    ),
    Namia(
        "nnm", 
        listOf("Namia"),
        listOf("PG")
    ),
    Nandi(
        "kln", 
        listOf("Nandi", "Kalenjin"),
        listOf("KE")
    ),
    Neo_Aramaic_Persian_Azerbaijan(
        "trg", 
        listOf("Neo-Aramaic (Persian Azerbaijan)", "Lishán Didán"),
        listOf("IR", "IL")
    ),
    Nara_in_Ethiopia(
        "nrb", 
        listOf("Nara (in Ethiopia)", "Nara"),
        listOf("ER")
    ),
    Nasioi(
        "nas", 
        listOf("Nasioi", "Naasioi"),
        listOf("PG")
    ),
    Natchez(
        "ncz", 
        listOf("Natchez"),
        listOf("US")
    ),
    Nauruan(
        "nau", 
        listOf("Nauruan", "Nauru"),
        listOf("NR")
    ),
    Navajo(
        "nav", 
        listOf("Navajo", "Diné"),
        listOf("US")
    ),
    Naxi(
        "nbf", 
        listOf("Naxi"),
        listOf("CN")
    ),
    Nambas_Big(
        "nmb", 
        listOf("Nambas (Big)", "Big Nambas"),
        listOf("VU")
    ),
    Ghulfan(
        "ghl", 
        listOf("Ghulfan"),
        listOf("SD")
    ),
    Natügu(
        "stc", 
        listOf("Natügu"),
        listOf("SB")
    ),
    Ngbaka_Mabo(
        "nbm", 
        listOf("Ngbaka (Ma'bo)", "Ngbaka Ma'bo"),
        listOf("CD")
    ),
    Nyambo(
        "now", 
        listOf("Nyambo"),
        listOf("TZ")
    ),
    Ngäbere(
        "gym", 
        listOf("Ngäbere"),
        listOf("PA")
    ),
    Nicobarese_Car(
        "caq", 
        listOf("Nicobarese (Car)", "Car Nicobarese"),
        listOf("IN")
    ),
    Ncàm(
        "bud", 
        listOf("Ncàm", "Ntcham", "Ncham"),
        listOf("GH", "TG")
    ),
    Ndebele_in_South_Africa(
        "nbl", 
        listOf("Ndebele (in South Africa)", "South Ndebele", "isiNdebele"),
        listOf("ZA")
    ),
    Nande(
        "nnb", 
        listOf("Nande"),
        listOf("CD")
    ),
    Ndogo(
        "ndz", 
        listOf("Ndogo", "Co Ndogo"),
        listOf("SD")
    ),
    Ngbandi(
        "ngb", 
        listOf("Ngbandi", "Northern Ngbandi"),
        listOf("CD")
    ),
    Ndjébbana(
        "djj", 
        listOf("Ndjébbana", "Djeebbana"),
        listOf("AU")
    ),
    Ndonga(
        "ndo", 
        listOf("Ndonga"),
        listOf("AO", "NA")
    ),
    Ndut(
        "ndv", 
        listOf("Ndut"),
        listOf("SN")
    ),
    Ndumu(
        "nmd", 
        listOf("Ndumu"),
        listOf("GA")
    ),
    Ndyuka(
        "djk", 
        listOf("Ndyuka", "Eastern Maroon Creole"),
        listOf("GF", "SR")
    ),
    Nederlandse_Gebarentaal(
        "dse", 
        listOf("Nederlandse Gebarentaal", "Dutch Sign Language"),
        listOf("NL")
    ),
    Negidal(
        "neg", 
        listOf("Negidal"),
        listOf("RU")
    ),
    Nehan(
        "nsn", 
        listOf("Nehan"),
        listOf("PG")
    ),
    Nelemwa(
        "nee", 
        listOf("Nelemwa", "Nêlêmwa-Nixumwak"),
        listOf("NC")
    ),
    Nepali(
        "nep", 
        listOf("Nepali", "नेपाली"),
        listOf("NP")
    ),
    Neyo(
        "ney", 
        listOf("Neyo"),
        listOf("CI")
    ),
    Nez_Perce(
        "nez", 
        listOf("Nez Perce"),
        listOf("US")
    ),
    Nganasan(
        "nio", 
        listOf("Nganasan"),
        listOf("RU")
    ),
    Ngbaka_Minagende(
        "nga", 
        listOf("Ngbaka (Minagende)", "Ngbaka"),
        listOf("CD")
    ),
    Ngada(
        "nxg", 
        listOf("Ngad'a"),
        listOf("ID")
    ),
    Ngiyambaa(
        "wyb", 
        listOf("Ngiyambaa", "Wangaaybuwan-Ngiyambaa"),
        listOf("AU")
    ),
    Ngalakan(
        "nig", 
        listOf("Ngalakan"),
        listOf("AU")
    ),
    Ngambay(
        "sba", 
        listOf("Ngambay"),
        listOf("TD", "CM")
    ),
    Ngandi(
        "nid", 
        listOf("Ngandi"),
        listOf("AU")
    ),
    Ngoni(
        "ngo", 
        listOf("Ngoni"),
        listOf("MZ", "TZ")
    ),
    Ngarinyeri(
        "nay", 
        listOf("Ngarinyeri", "Narrinyeri"),
        listOf("AU")
    ),
    Naga_Tangkhul(
        "nmf", 
        listOf("Naga (Tangkhul)", "Tangkhul Naga (India)"),
        listOf("IN")
    ),
    Nguna(
        "llp", 
        listOf("Nguna", "North Efate"),
        listOf("VU")
    ),
    Ngawun(
        "nxn", 
        listOf("Ngawun"),
        listOf("AU")
    ),
    Ngizim(
        "ngi", 
        listOf("Ngizim"),
        listOf("NG")
    ),
    Nhanda(
        "nha", 
        listOf("Nhanda"),
        listOf("AU")
    ),
    Nahuatl_Central(
        "nhn", 
        listOf("Nahuatl (Central)", "Central Nahuatl"),
        listOf("MX")
    ),
    Nahuatl_Huasteca(
        "nhe", 
        listOf("Nahuatl (Huasteca)", "Eastern Huasteca Nahuatl"),
        listOf("MX")
    ),
    Nahuatl_Michoacán(
        "ncl", 
        listOf("Nahuatl (Michoacán)", "Michoacán Nahuatl"),
        listOf("MX")
    ),
    Nahuatl_North_Puebla(
        "ncj", 
        listOf("Nahuatl (North Puebla)", "Northern Puebla Nahuatl"),
        listOf("MX")
    ),
    Nahuatl_Pochutla(
        null, 
        listOf("Nahuatl (Pochutla)"),
        listOf("MX")
    ),
    Nahuatl_Tetelcingo(
        "nhg", 
        listOf("Nahuatl (Tetelcingo)", "Tetelcingo Nahuatl"),
        listOf("MX")
    ),
    Nahuatl_Huauchinango(
        null, 
        listOf("Nahuatl (Huauchinango)"),
        listOf("MX")
    ),
    Nahuatl_Xalitla(
        "ngu", 
        listOf("Nahuatl (Xalitla)", "Guerrero Nahuatl"),
        listOf("MX")
    ),
    Nias(
        "nia", 
        listOf("Nias"),
        listOf("ID")
    ),
    Niuafoou(
        "num", 
        listOf("Niuafo'ou"),
        listOf("TO")
    ),
    Nihon_Shuwa_Japanese_Sign_Language(
        "jsl", 
        listOf("Nihon Shuwa (Japanese Sign Language)", "Japanese Sign Language"),
        listOf("JP")
    ),
    Nimboran(
        "nir", 
        listOf("Nimboran"),
        listOf("ID")
    ),
    Ningil(
        "niz", 
        listOf("Ningil"),
        listOf("PG")
    ),
    Nyishi(
        "dap", 
        listOf("Nyishi"),
        listOf("IN")
    ),
    Niuean(
        "niu", 
        listOf("Niuean", "Vagahau Niuē"),
        listOf("NZ")
    ),
    Nyungar(
        "nys", 
        listOf("Nyungar", "Nyunga"),
        listOf("AU")
    ),
    Ngalkbun(
        "ngk", 
        listOf("Ngalkbun", "Dalabon"),
        listOf("AU")
    ),
    Nkem(
        "isi", 
        listOf("Nkem", "Nkem-Nkum"),
        listOf("NG")
    ),
    Nakkara(
        "nck", 
        listOf("Nakkara", "Nakara"),
        listOf("AU")
    ),
    Nkonya(
        "nko", 
        listOf("Nkonya", "Nkunya"),
        listOf("GH")
    ),
    Nkore_Kiga(
        "cgg", 
        listOf("Nkore-Kiga", "Chiga", "Rukiga"),
        listOf("UG")
    ),
    Nukuoro(
        "nkr", 
        listOf("Nukuoro"),
        listOf("FM")
    ),
    Nyah_Kur_Tha_Pong(
        "cbn", 
        listOf("Nyah Kur (Tha Pong)", "Nyahkur"),
        listOf("TH")
    ),
    Ngarla(
        "nlr", 
        listOf("Ngarla"),
        listOf("AU")
    ),
    Ngarluma(
        "nrl", 
        listOf("Ngarluma"),
        listOf("AU")
    ),
    Nyamal(
        "nly", 
        listOf("Nyamal"),
        listOf("AU")
    ),
    Naga_Mao(
        "nbi", 
        listOf("Naga (Mao)", "Mao Naga"),
        listOf("IN")
    ),
    Nambikuára_Southern(
        "nab", 
        listOf("Nambikuára (Southern)", "Southern Nambikuára"),
        listOf("BR")
    ),
    Nomad(
        "smq", 
        listOf("Nomad", "Samo"),
        listOf("PG")
    ),
    Nahuatl_Mecayapan_Isthmus(
        "nhx", 
        listOf("Nahuatl (Mecayapan Isthmus)", "Isthmus-Mecayapan Nahuatl"),
        listOf("MX")
    ),
    Manange(
        "nmm", 
        listOf("Manange", "Manangba"),
        listOf("NP")
    ),
    Nahuatl_Milpa_Alta(
        null, 
        listOf("Nahuatl (Milpa Alta)"),
        listOf("MX")
    ),
    Nend(
        "anh", 
        listOf("Nend"),
        listOf("PG")
    ),
    Nengone(
        "nen", 
        listOf("Nengone"),
        listOf("NC")
    ),
    Nyanga(
        "nyj", 
        listOf("Nyanga"),
        listOf("CD")
    ),
    Nankina(
        "nnk", 
        listOf("Nankina"),
        listOf("PG")
    ),
    Nuni_Northern(
        "nuv", 
        listOf("Nuni (Northern)", "Northern Nuni"),
        listOf("BF")
    ),
    Nanticoke(
        "nnt", 
        listOf("Nanticoke"),
        listOf("US")
    ),
    Nobiin(
        "fia", 
        listOf("Nobiin"),
        listOf("EG", "SD")
    ),
    Nocte(
        "njb", 
        listOf("Nocte", "Nocte Naga"),
        listOf("IN")
    ),
    Nomatsiguenga(
        "not", 
        listOf("Nomatsiguenga", "Nomatsigenga"),
        listOf("PE")
    ),
    Noni(
        "nhu", 
        listOf("Noni", "Noone"),
        listOf("CM")
    ),
    Noon(
        "snf", 
        listOf("Noon"),
        listOf("SN")
    ),
    Norwegian(
        "nob", 
        listOf("Norwegian", "Norwegian Bokmål", "norsk bokmål"),
        listOf("NO")
    ),
    Nahuatl_Pajapan(
        "nhp", 
        listOf("Nahuatl (Pajapan)", "Isthmus-Pajapan Nahuatl"),
        listOf("MX")
    ),
    Nar_Phu(
        "npa", 
        listOf("Nar-Phu", "Nar Phu"),
        listOf("NP")
    ),
    Nigerian_Pidgin(
        "pcm", 
        listOf("Nigerian Pidgin", "Naijá", "Pidgin"),
        listOf("NG")
    ),
    Naga_Pidgin(
        "nag", 
        listOf("Naga Pidgin"),
        listOf("IN")
    ),
    Napu(
        "npy", 
        listOf("Napu"),
        listOf("ID")
    ),
    Nanerge(
        "sen", 
        listOf("Nanerge", "Nanerigé Sénoufo"),
        listOf("BF")
    ),
    Narom(
        "nrm", 
        listOf("Narom"),
        listOf("MY")
    ),
    Nharo(
        "nhr", 
        listOf("Nharo", "Naro"),
        listOf("NA", "BW")
    ),
    Nsenga(
        "nse", 
        listOf("Nsenga"),
        listOf("ZM")
    ),
    Nisgha(
        "ncg", 
        listOf("Nisgha", "Nisga'a"),
        listOf("CA")
    ),
    Naskapi(
        "nsk", 
        listOf("Naskapi"),
        listOf("CA")
    ),
    Nisenan(
        "nsz", 
        listOf("Nisenan"),
        listOf("US")
    ),
    Neo_Aramaic_Assyrian(
        "aii", 
        listOf("Neo-Aramaic (Assyrian)", "Assyrian Neo-Aramaic", "ܐܬܘܪܝܐ‎ (Ātūrāyā)", "ܣܘܪܬ‎ (Sūrët)"),
        listOf("SY")
    ),
    Nahuatl_Sierra_de_Zacapoaxtla(
        "azz", 
        listOf("Nahuatl (Sierra de Zacapoaxtla)", "Highland Puebla Nahuatl", "Mexicano", "Nahuatlahtolli"),
        listOf("MX")
    ),
    Norsk_Tegnspråk(
        "nsl", 
        listOf("Norsk Tegnspråk", "Norwegian Sign Language"),
        listOf("NO")
    ),
    Ngiti(
        "niy", 
        listOf("Ngiti", "Ndruna"),
        listOf("CD")
    ),
    Ngaanyatjarra(
        "ntj", 
        listOf("Ngaanyatjarra"),
        listOf("AU")
    ),
    Nateni(
        "ntm", 
        listOf("Nateni"),
        listOf("BJ")
    ),
    Ntomba(
        "nto", 
        listOf("Ntomba"),
        listOf("CD")
    ),
    Nuaulu(
        "nni", 
        listOf("Nuaulu", "North Nuaulu"),
        listOf("ID")
    ),
    Nubi(
        "kcn", 
        listOf("Nubi"),
        listOf("UG")
    ),
    Nuer(
        "nus", 
        listOf("Nuer", "Thok Nath"),
        listOf("SD", "ET")
    ),
    Nunggubuyu(
        "nuy", 
        listOf("Nunggubuyu"),
        listOf("AU")
    ),
    Nukak(
        "mbr", 
        listOf("Nukak", "Nukak Makú"),
        listOf("CO")
    ),
    Nung_in_Vietnam(
        "nut", 
        listOf("Nung (in Vietnam)", "Nung (Viet Nam)"),
        listOf("VN")
    ),
    Nupe(
        "nup", 
        listOf("Nupe", "Nupe-Nupe-Tako"),
        listOf("NG")
    ),
    Nusu(
        "nuf", 
        listOf("Nusu"),
        listOf("CN")
    ),
    Nyawaygi(
        "nyt", 
        listOf("Nyawaygi"),
        listOf("AU")
    ),
    Nyangi(
        "nyp", 
        listOf("Nyangi", "Nyang'i"),
        listOf("UG")
    ),
    Nyiha(
        "nih", 
        listOf("Nyiha", "Nyiha (Tanzania)"),
        listOf("ZM", "TZ")
    ),
    Nyimang(
        "nyi", 
        listOf("Nyimang", "Ama (Sudan)"),
        listOf("SD")
    ),
    Nyamkad(
        "tpq", 
        listOf("Nyamkad", "Tukpa"),
        listOf("IN")
    ),
    Nyelâyu(
        "yly", 
        listOf("Nyelâyu", "Nyâlayu"),
        listOf("NC")
    ),
    Nyamwezi(
        "nym", 
        listOf("Nyamwezi"),
        listOf("TZ")
    ),
    Nyigina(
        "nyh", 
        listOf("Nyigina"),
        listOf("AU")
    ),
    Nyangumarda(
        "nna", 
        listOf("Nyangumarda", "Nyangumarta"),
        listOf("AU")
    ),
    Nyulnyul(
        "nyv", 
        listOf("Nyulnyul"),
        listOf("AU")
    ),
    Nzakara(
        "nzk", 
        listOf("Nzakara"),
        listOf("CD", "CF")
    ),
    Naga_Zeme(
        "nzm", 
        listOf("Naga (Zeme)", "Zeme Naga"),
        listOf("IN")
    ),
    New_Zealand_Sign_Language(
        "nzs", 
        listOf("New Zealand Sign Language"),
        listOf("NZ")
    ),
    Ogbronuagum(
        "ogu", 
        listOf("Ogbronuagum"),
        listOf("NG")
    ),
    Obokuitai(
        "afz", 
        listOf("Obokuitai"),
        listOf("ID")
    ),
    Obolo(
        "ann", 
        listOf("Obolo"),
        listOf("NG")
    ),
    Ocaina(
        "oca", 
        listOf("Ocaina"),
        listOf("PE")
    ),
    Ocuilteco(
        "ocu", 
        listOf("Ocuilteco", "Atzingo Matlatzinca"),
        listOf("MX")
    ),
    Ogbia(
        "ogb", 
        listOf("Ogbia"),
        listOf("NG")
    ),
    Oi(
        "oyb", 
        listOf("Oi", "Oy"),
        listOf("LA")
    ),
    Otomí_Ixtenco(
        "otz", 
        listOf("Otomí (Ixtenco)", "Ixtenco Otomi"),
        listOf("MX")
    ),
    Ojibwa_Eastern(
        "otw", 
        listOf("Ojibwa (Eastern)", "Ottawa"),
        listOf("CA")
    ),
    Ojibwa_Severn(
        "ojs", 
        listOf("Ojibwa (Severn)", "Severn Ojibwa"),
        listOf("CA")
    ),
    Okanagan(
        "oka", 
        listOf("Okanagan", "Nsyilxcen"),
        listOf("CA", "US")
    ),
    Oriya_Kotia(
        "ort", 
        listOf("Oriya (Kotia)", "Adivasi Oriya"),
        listOf("IN")
    ),
    Oksapmin(
        "opm", 
        listOf("Oksapmin"),
        listOf("PG")
    ),
    Oku(
        "oku", 
        listOf("Oku"),
        listOf("CM")
    ),
    Olo(
        "ong", 
        listOf("Olo"),
        listOf("PG")
    ),
    Olutec(
        "plo", 
        listOf("Olutec", "Oluta Popoluca"),
        listOf("MX")
    ),
    Omagua(
        "omg", 
        listOf("Omagua"),
        listOf("PE")
    ),
    Omaha(
        "oma", 
        listOf("Omaha", "Omaha-Ponca"),
        listOf("US")
    ),
    Ömie(
        "aom", 
        listOf("Ömie"),
        listOf("PG")
    ),
    Oneida(
        "one", 
        listOf("Oneida"),
        listOf("US")
    ),
    One(
        "aun", 
        listOf("One", "Molmo One"),
        listOf("PG")
    ),
    Onge(
        "oon", 
        listOf("Onge", "Önge"),
        listOf("IN")
    ),
    Onondaga(
        "ono", 
        listOf("Onondaga"),
        listOf("US")
    ),
    Ono(
        "ons", 
        listOf("Ono"),
        listOf("PG")
    ),
    Emai(
        "ema", 
        listOf("Emai", "Emai-Iuleha-Ora"),
        listOf("NG")
    ),
    Oromo_Boraana(
        "gax", 
        listOf("Oromo (Boraana)", "Borana-Arsi-Guji Oromo"),
        listOf("ET", "KE")
    ),
    Oroch(
        "oac", 
        listOf("Oroch"),
        listOf("RU")
    ),
    Ordos(
        "mvf", 
        listOf("Ordos", "Peripheral Mongolian"),
        listOf("CN")
    ),
    Orejón(
        "ore", 
        listOf("Orejón", "Maijuna"),
        listOf("PE")
    ),
    Oromo_Harar(
        "hae", 
        listOf("Oromo (Harar)", "Eastern Oromo"),
        listOf("ET")
    ),
    Orok(
        "oaa", 
        listOf("Orok"),
        listOf("RU")
    ),
    Orokolo(
        "oro", 
        listOf("Orokolo"),
        listOf("PG")
    ),
    Ormuri(
        "oru", 
        listOf("Ormuri"),
        listOf("PK")
    ),
    Orokaiva(
        "okv", 
        listOf("Orokaiva"),
        listOf("PG")
    ),
    Oromo_Waata(
        "ssn", 
        listOf("Oromo (Waata)", "Waata"),
        listOf("KE")
    ),
    Orya(
        "ury", 
        listOf("Orya"),
        listOf("ID")
    ),
    Osage(
        "osa", 
        listOf("Osage"),
        listOf("US")
    ),
    Otomí_Santiago_Mexquititlan(
        "otq", 
        listOf("Otomí (Santiago Mexquititlan)", "Querétaro Otomi", "Hñohño"),
        listOf("MX")
    ),
    Ossetic(
        "oss", 
        listOf("Ossetic", "ирон"),
        listOf("GE", "RU")
    ),
    Otomí_Mezquital(
        "ote", 
        listOf("Otomí (Mezquital)", "Mezquital Otomi", "Hñahñu"),
        listOf("MX")
    ),
    Oto(
        "iow", 
        listOf("Oto", "Iowa-Oto"),
        listOf("US")
    ),
    Otoro(
        "otr", 
        listOf("Otoro"),
        listOf("SD")
    ),
    Otomí_Sierra(
        "otm", 
        listOf("Otomí (Sierra)", "Eastern Highland Otomi", "Yuhu"),
        listOf("MX")
    ),
    Oromo_West_Central(
        "gaz", 
        listOf("Oromo (West-Central)", "West Central Oromo", "Afaan Oromoo", "Oromiffa"),
        listOf("ET")
    ),
    Owininga(
        "owi", 
        listOf("Owininga", "Owiniga"),
        listOf("PG")
    ),
    Oriya(
        "ori", 
        listOf("Oriya", "Odia", "ଓଡ଼ିଆ"),
        listOf("IN")
    ),
    Paa(
        "pqa", 
        listOf("Pa'a"),
        listOf("NG")
    ),
    Pacoh(
        "pac", 
        listOf("Pacoh"),
        listOf("VN")
    ),
    Padoe(
        "pdo", 
        listOf("Padoe"),
        listOf("ID")
    ),
    Páez(
        "pbb", 
        listOf("Páez", "Nasa Yuwe"),
        listOf("CO")
    ),
    Pagu(
        "pgu", 
        listOf("Pagu"),
        listOf("ID")
    ),
    Paiwan(
        "pwn", 
        listOf("Paiwan"),
        listOf("TW")
    ),
    Pakanha(
        "pkn", 
        listOf("Pakanha"),
        listOf("AU")
    ),
    Palauan(
        "pau", 
        listOf("Palauan", "Tekoi ra Belau"),
        listOf("PW")
    ),
    Pame(
        "pbs", 
        listOf("Pame", "Central Pame", "Xi’oi"),
        listOf("MX")
    ),
    Panjabi(
        "pan", 
        listOf("Panjabi", "Punjabi", "ਪੰਜਾਬੀ"),
        listOf("IN", "PK")
    ),
    Papiamentu(
        "pap", 
        listOf("Papiamentu", "Papiamento"),
        listOf("AN")
    ),
    Päri(
        "lkr", 
        listOf("Päri"),
        listOf("SD")
    ),
    Patep(
        "ptp", 
        listOf("Patep"),
        listOf("PG")
    ),
    Paumarí(
        "pad", 
        listOf("Paumarí"),
        listOf("BR")
    ),
    Pawaian(
        "pwa", 
        listOf("Pawaian", "Pawaia"),
        listOf("PG")
    ),
    Pima_Bajo(
        "pia", 
        listOf("Pima Bajo", "Oob No’ok"),
        listOf("MX")
    ),
    Pocomam(
        "poc", 
        listOf("Pocomam", "Poqomam", "Qaq’oral"),
        listOf("GT")
    ),
    Folopa(
        "ppo", 
        listOf("Folopa"),
        listOf("PG")
    ),
    Pech(
        "pay", 
        listOf("Pech"),
        listOf("HN")
    ),
    Pemon(
        "aoc", 
        listOf("Pemon", "Kamarakotos"),
        listOf("GY", "VR")
    ),
    Pengo(
        "peg", 
        listOf("Pengo"),
        listOf("IN")
    ),
    Pero(
        "pip", 
        listOf("Pero"),
        listOf("NG")
    ),
    Pilagá(
        "plg", 
        listOf("Pilagá"),
        listOf("AR")
    ),
    Pingilapese(
        "pif", 
        listOf("Pingilapese", "Pingelapese"),
        listOf("FM")
    ),
    Phlong(
        "pww", 
        listOf("Phlong", "Pwo Northern Karen"),
        listOf("TH")
    ),
    Piaroa(
        "pid", 
        listOf("Piaroa", "De’aruwã thiwene"),
        listOf("VR")
    ),
    Pileni(
        "piv", 
        listOf("Pileni"),
        listOf("SB")
    ),
    Pintupi(
        "piu", 
        listOf("Pintupi", "Pintupi-Luritja"),
        listOf("AU")
    ),
    Pipil(
        "ppl", 
        listOf("Pipil", "Nahuat"),
        listOf("SV")
    ),
    Piro(
        "pib", 
        listOf("Piro", "Yine"),
        listOf("PE")
    ),
    Pisa(
        "psa", 
        listOf("Pisa", "Asue Awyu"),
        listOf("ID")
    ),
    Pitjantjatjara(
        "pjt", 
        listOf("Pitjantjatjara"),
        listOf("AU")
    ),
    Pokomchí(
        "poh", 
        listOf("Pokomchí", "Poqomchi'"),
        listOf("GT")
    ),
    Paakantyi(
        "drl", 
        listOf("Paakantyi"),
        listOf("AU")
    ),
    Pokot(
        "pko", 
        listOf("Pokot", "Pökoot"),
        listOf("UG", "KE")
    ),
    Playero(
        "gob", 
        listOf("Playero"),
        listOf("CO")
    ),
    Polabian(
        "pox", 
        listOf("Polabian"),
        listOf("DE")
    ),
    Palaung(
        "rbb", 
        listOf("Palaung", "Rumai Palaung"),
        listOf("MM")
    ),
    Paulohi(
        "plh", 
        listOf("Paulohi"),
        listOf("ID")
    ),
    Palikur(
        "plu", 
        listOf("Palikur", "Palikúr", "Pa’ikwaki"),
        listOf("BR")
    ),
    Palor(
        "fap", 
        listOf("Palor", "Paloor"),
        listOf("SN")
    ),
    Pomo_Central(
        "poo", 
        listOf("Pomo (Central)", "Central Pomo"),
        listOf("US")
    ),
    Pomo_Eastern(
        "peb", 
        listOf("Pomo (Eastern)", "Eastern Pomo"),
        listOf("US")
    ),
    Pomo_Northern(
        "pej", 
        listOf("Pomo (Northern)", "Northern Pomo"),
        listOf("US")
    ),
    Paamese(
        "pma", 
        listOf("Paamese", "Paama"),
        listOf("VU")
    ),
    Pamona(
        "pmf", 
        listOf("Pamona"),
        listOf("ID")
    ),
    Pangwa(
        "pbr", 
        listOf("Pangwa"),
        listOf("TZ")
    ),
    Pangasinan(
        "pag", 
        listOf("Pangasinan"),
        listOf("PH")
    ),
    Paiute_Northern(
        "pao", 
        listOf("Paiute (Northern)", "Northern Paiute"),
        listOf("US")
    ),
    Panare(
        "pbh", 
        listOf("Panare", "E'ñapa Woromaipu", "E’ñepa"),
        listOf("VR")
    ),
    Bunu_Younuo(
        "buh", 
        listOf("Bunu (Younuo)", "Younuo Bunu"),
        listOf("CN")
    ),
    Panará(
        "kre", 
        listOf("Panará"),
        listOf("BR")
    ),
    Panyjima(
        "pnw", 
        listOf("Panyjima", "Panytyima"),
        listOf("AU")
    ),
    Po_Ai(
        "fwa", 
        listOf("Po-Ai", "Fwâi"),
        listOf("NC")
    ),
    Pocomam_Oriental(
        "poa", 
        listOf("Pocomam Oriental"),
        listOf("GT")
    ),
    Podoko(
        "pbi", 
        listOf("Podoko", "Parkwa"),
        listOf("CM")
    ),
    Pogoro(
        "poy", 
        listOf("Pogoro", "Pogolo"),
        listOf("TZ")
    ),
    Pohnpeian(
        "pon", 
        listOf("Pohnpeian", "Pohnpei"),
        listOf("FM")
    ),
    Poko_Rawo(
        "rwa", 
        listOf("Poko-Rawo", "Rawo"),
        listOf("PG")
    ),
    Polish(
        "pol", 
        listOf("Polish", "polski"),
        listOf("PL")
    ),
    Popoloca_Metzontla(
        "pbe", 
        listOf("Popoloca (Metzontla)", "Mezontla Popoloca"),
        listOf("MX")
    ),
    Portuguese(
        "por", 
        listOf("Portuguese", "português"),
        listOf("PT")
    ),
    Potawatomi(
        "pot", 
        listOf("Potawatomi"),
        listOf("US")
    ),
    Powhatan(
        "pim", 
        listOf("Powhatan"),
        listOf("US")
    ),
    Piapoco(
        "pio", 
        listOf("Piapoco", "Wenewika"),
        listOf("CO")
    ),
    Pitta_Pitta(
        "pit", 
        listOf("Pitta Pitta"),
        listOf("AU")
    ),
    Prasuni(
        "prn", 
        listOf("Prasuni"),
        listOf("AF")
    ),
    Parecis(
        "pab", 
        listOf("Parecis", "Parecís"),
        listOf("BR")
    ),
    Parji_Dravidian(
        "pci", 
        listOf("Parji (Dravidian)", "Duruwa"),
        listOf("IN")
    ),
    Pare(
        "asa", 
        listOf("Pare", "Asu", "Kipare"),
        listOf("TZ")
    ),
    Pirahã(
        "myp", 
        listOf("Pirahã"),
        listOf("BR")
    ),
    Príncipense(
        "pre", 
        listOf("Príncipense", "Principense"),
        listOf("ST")
    ),
    Purki(
        "prx", 
        listOf("Purki", "Purik"),
        listOf("IN")
    ),
    Persian(
        "pes", 
        listOf("Persian", "Iranian Persian", "فارسی‎ (Fārsi)"),
        listOf("IR")
    ),
    Piratapuyo(
        "pir", 
        listOf("Piratapuyo"),
        listOf("CO", "BR")
    ),
    Pashto(
        "pst", 
        listOf("Pashto", "Central Pashto"),
        listOf("AF", "PK")
    ),
    Popoloca_San_Juan_Atzingo(
        "poe", 
        listOf("Popoloca (San Juan Atzingo)", "San Juan Atzingo Popoloca", "Ngigua"),
        listOf("MX")
    ),
    Plains_Indians_Sign_Language(
        "psd", 
        listOf("Plains-Indians Sign Language", "Plains Indian Sign Language"),
        listOf("US")
    ),
    Passamaquoddy_Maliseet(
        "pqm", 
        listOf("Passamaquoddy-Maliseet", "Malecite-Passamaquoddy"),
        listOf("US", "CA")
    ),
    Pomo_Southeastern(
        "pom", 
        listOf("Pomo (Southeastern)", "Southeastern Pomo"),
        listOf("US")
    ),
    Popoloca_San_Vicente_Coyotepec(
        "pbf", 
        listOf("Popoloca (San Vicente Coyotepec)", "Coyotepec Popoloca"),
        listOf("MX")
    ),
    Port_Sandwich(
        "psw", 
        listOf("Port Sandwich"),
        listOf("VU")
    ),
    Paita(
        "duf", 
        listOf("Paita", "Dumbea"),
        listOf("NC")
    ),
    Paite(
        "pck", 
        listOf("Paite", "Paite Chin"),
        listOf("IN")
    ),
    Patpatar(
        "gfk", 
        listOf("Patpatar"),
        listOf("PG")
    ),
    Pattani(
        "lae", 
        listOf("Pattani"),
        listOf("IN")
    ),
    Puinave(
        "pui", 
        listOf("Puinave"),
        listOf("VR", "CO")
    ),
    Parauk(
        "prk", 
        listOf("Parauk"),
        listOf("CN", "MM")
    ),
    Puluwat(
        "puw", 
        listOf("Puluwat", "Puluwatese"),
        listOf("FM")
    ),
    Pumi(
        "pmj", 
        listOf("Pumi", "Southern Pumi"),
        listOf("CN")
    ),
    Puquina(
        "puq", 
        listOf("Puquina"),
        listOf("PE", "BO")
    ),
    Purépecha(
        "tsz", 
        listOf("Purépecha", "Purepecha", "P’urhepecha"),
        listOf("MX")
    ),
    Pawnee(
        "paw", 
        listOf("Pawnee"),
        listOf("US")
    ),
    Qafar(
        "aar", 
        listOf("Qafar", "Afar"),
        listOf("ER", "ET", "DJ")
    ),
    Quechua_Ancash(
        "qxa", 
        listOf("Quechua (Ancash)", "Chiquián Ancash Quechua"),
        listOf("PE")
    ),
    Qawasqar(
        "alc", 
        listOf("Qawasqar"),
        listOf("CL")
    ),
    Quechua_Ayacucho(
        "quy", 
        listOf("Quechua (Ayacucho)", "Ayacucho Quechua", "Runasimi"),
        listOf("PE")
    ),
    Quechua_Cajamarca(
        "qvc", 
        listOf("Quechua (Cajamarca)", "Cajamarca Quechua", "Kichwa"),
        listOf("PE")
    ),
    Quiché(
        "quc", 
        listOf("Quiché", "Kʼicheʼ"),
        listOf("GT")
    ),
    Quechua_Cuzco(
        "quz", 
        listOf("Quechua (Cuzco)", "Cusco Quechua", "Qheswasimi", "Runasimi"),
        listOf("PE")
    ),
    Quechua_Ecuadorean(
        "qug", 
        listOf("Quechua (Ecuadorean)", "Chimborazo Highland Quichua"),
        listOf("EC")
    ),
    Quechua_Huallaga(
        "qvh", 
        listOf("Quechua (Huallaga)", "Huamalíes-Dos de Mayo Huánuco Quechua"),
        listOf("PE")
    ),
    Qiang(
        "cng", 
        listOf("Qiang", "Northern Qiang"),
        listOf("CN")
    ),
    Quechua_Imbabura(
        "qvi", 
        listOf("Quechua (Imbabura)", "Imbabura Highland Quichua"),
        listOf("EC")
    ),
    Quechua_Tarma(
        "qvn", 
        listOf("Quechua (Tarma)", "North Junín Quechua"),
        listOf("PE")
    ),
    Quechan(
        "yum", 
        listOf("Quechan"),
        listOf("US")
    ),
    Quileute(
        "qui", 
        listOf("Quileute"),
        listOf("US")
    ),
    Sipakapense(
        "qum", 
        listOf("Sipakapense", "Sipacapense"),
        listOf("GT")
    ),
    Rade(
        "rad", 
        listOf("Rade"),
        listOf("VN")
    ),
    Raga(
        "lml", 
        listOf("Raga", "Hano"),
        listOf("VU")
    ),
    Ralte(
        "ral", 
        listOf("Ralte"),
        listOf("IN", "MM")
    ),
    Rama(
        "rma", 
        listOf("Rama"),
        listOf("NI")
    ),
    Rao(
        "rao", 
        listOf("Rao"),
        listOf("PG")
    ),
    Rapanui(
        "rap", 
        listOf("Rapanui"),
        listOf("CL")
    ),
    Rawang(
        "raw", 
        listOf("Rawang", "Nung"),
        listOf("MM")
    ),
    Romani_Burgenland(
        "rmo", 
        listOf("Romani (Burgenland)", "Sinte Romani", "Romanes"),
        listOf("AT")
    ),
    Russian_Chinese_Pidgin_Birobidjan(
        null, 
        listOf("Russian-Chinese Pidgin (Birobidjan)"),
        listOf("RU")
    ),
    Rejang(
        "rej", 
        listOf("Rejang"),
        listOf("ID")
    ),
    Remo(
        "bfw", 
        listOf("Remo", "Bondo"),
        listOf("IN")
    ),
    Rendille(
        "rel", 
        listOf("Rendille"),
        listOf("KE")
    ),
    Resígaro(
        "rgr", 
        listOf("Resígaro"),
        listOf("CO", "PE")
    ),
    Retuarã(
        "tnc", 
        listOf("Retuarã", "Tanimuca-Retuarã"),
        listOf("CO")
    ),
    Ronga(
        "rng", 
        listOf("Ronga"),
        listOf("MZ")
    ),
    Roglai_Northern(
        "rog", 
        listOf("Roglai (Northern)", "Northern Roglai"),
        listOf("VN")
    ),
    Riantana(
        "ran", 
        listOf("Riantana"),
        listOf("ID")
    ),
    Rikbaktsa(
        "rkb", 
        listOf("Rikbaktsa"),
        listOf("BR")
    ),
    Rimi(
        "rim", 
        listOf("Rimi", "Nyaturu"),
        listOf("TZ")
    ),
    Ritharngu(
        "rit", 
        listOf("Ritharngu", "Ritarungo"),
        listOf("AU")
    ),
    Raji(
        "rji", 
        listOf("Raji"),
        listOf("NP", "IN")
    ),
    Rembarnga(
        "rmb", 
        listOf("Rembarnga", "Rembarunga"),
        listOf("AU")
    ),
    Rundi(
        "run", 
        listOf("Rundi", "Ikirundi"),
        listOf("BI")
    ),
    Rengao(
        "ren", 
        listOf("Rengao"),
        listOf("VN")
    ),
    Rennellese(
        "mnv", 
        listOf("Rennellese", "Rennell-Bellona"),
        listOf("SB")
    ),
    Romani_North_Russian(
        "rml", 
        listOf("Romani (North Russian)", "Baltic Romani", "Romani"),
        listOf("RU")
    ),
    Runyankore(
        "nyn", 
        listOf("Runyankore", "Nyankole"),
        listOf("UG")
    ),
    Ron(
        "cla", 
        listOf("Ron"),
        listOf("NG")
    ),
    Roro(
        "rro", 
        listOf("Roro", "Waima"),
        listOf("PG")
    ),
    Rotuman(
        "rtm", 
        listOf("Rotuman"),
        listOf("FJ")
    ),
    Roviana(
        "rug", 
        listOf("Roviana"),
        listOf("SB")
    ),
    Runyoro_Rutooro(
        "nyo", 
        listOf("Runyoro-Rutooro", "Nyoro"),
        listOf("UG")
    ),
    Romani_Sepecides(
        null, 
        listOf("Romani (Sepecides)"),
        listOf("TR")
    ),
    Rushan(
        "sgh", 
        listOf("Rushan", "Shughni", "Khugnone"),
        listOf("TJ", "AF")
    ),
    Russian_Sign_Language(
        "rsl", 
        listOf("Russian Sign Language"),
        listOf("RU")
    ),
    Roti(
        "twu", 
        listOf("Roti", "Termanu"),
        listOf("ID")
    ),
    Rotokas(
        "roo", 
        listOf("Rotokas"),
        listOf("PG")
    ),
    Rukai_Tanan(
        "dru", 
        listOf("Rukai (Tanan)", "Rukai"),
        listOf("TW")
    ),
    Rumu(
        "klq", 
        listOf("Rumu"),
        listOf("PG")
    ),
    Runga(
        "rou", 
        listOf("Runga"),
        listOf("TD", "CF")
    ),
    Russian(
        "rus", 
        listOf("Russian", "русский"),
        listOf("RU")
    ),
    Rutul(
        "rut", 
        listOf("Rutul"),
        listOf("RU", "AZ")
    ),
    Rawa(
        "rwo", 
        listOf("Rawa"),
        listOf("PG")
    ),
    Romani_Welsh(
        "rmw", 
        listOf("Romani (Welsh)", "Welsh Romani"),
        listOf("GB")
    ),
    Shuri(
        "ryu", 
        listOf("Shuri", "Central Okinawan"),
        listOf("JP")
    ),
    Saa(
        "apb", 
        listOf("Sa'a"),
        listOf("SB")
    ),
    Saban(
        "snv", 
        listOf("Sa'ban"),
        listOf("ID")
    ),
    Saek(
        "skb", 
        listOf("Saek"),
        listOf("LA", "TH")
    ),
    Sahu(
        "saj", 
        listOf("Sahu"),
        listOf("ID")
    ),
    Sakao(
        "sku", 
        listOf("Sakao"),
        listOf("VU")
    ),
    Salinan(
        "sln", 
        listOf("Salinan"),
        listOf("US")
    ),
    Samoan(
        "smo", 
        listOf("Samoan", "Gagana Samoa"),
        listOf("AS", "WS")
    ),
    Sango(
        "sag", 
        listOf("Sango", "Sängö"),
        listOf("CF")
    ),
    Saho(
        "ssy", 
        listOf("Saho"),
        listOf("ER", "ET")
    ),
    Sapuan(
        "spu", 
        listOf("Sapuan"),
        listOf("LA")
    ),
    Sare(
        "dju", 
        listOf("Sare", "Kapriman"),
        listOf("PG")
    ),
    Savi(
        "sdg", 
        listOf("Savi"),
        listOf("AF")
    ),
    Sawu(
        "hvn", 
        listOf("Sawu", "Sabu"),
        listOf("ID")
    ),
    Sayultec(
        "pos", 
        listOf("Sayultec", "Sayula Popoluca"),
        listOf("MX")
    ),
    Sáliba_in_Colombia(
        "slc", 
        listOf("Sáliba (in Colombia)", "Sáliba"),
        listOf("VR", "CO")
    ),
    Sama_Balangingi(
        "sse", 
        listOf("Sama (Balangingi)", "Balangingi", "Bangingih"),
        listOf("PH")
    ),
    Serbian_Croatian(
        "hrv", 
        listOf("Serbian-Croatian", "Croatian", "hrvatski"),
        listOf("RS", "BA", "HR")
    ),
    Saami_Central_South(
        "sma", 
        listOf("Saami (Central-South)", "Southern Sami", "åarjelsaemien gïele"),
        listOf("SE")
    ),
    Sindhi(
        "snd", 
        listOf("Sindhi", "سنڌي"),
        listOf("PK", "IN")
    ),
    Sandawe(
        "sad", 
        listOf("Sandawe", "Sandawso"),
        listOf("TZ")
    ),
    Southeast_Ambrym(
        "tvk", 
        listOf("Southeast Ambrym"),
        listOf("VU")
    ),
    Sebei(
        "kpz", 
        listOf("Sebei", "Kupsabiny"),
        listOf("UG")
    ),
    Secoya(
        "sey", 
        listOf("Secoya"),
        listOf("EC", "PE")
    ),
    Sedang(
        "sed", 
        listOf("Sedang"),
        listOf("VN")
    ),
    Seediq(
        "trv", 
        listOf("Seediq", "Taroko", "Sediq Taroko"),
        listOf("TW")
    ),
    Selknam(
        "ona", 
        listOf("Selknam", "Ona"),
        listOf("AR")
    ),
    Sema(
        "nsm", 
        listOf("Sema", "Sumi Naga"),
        listOf("IN")
    ),
    Sena(
        "seh", 
        listOf("Sena", "sena"),
        listOf("MZ")
    ),
    Seri(
        "sei", 
        listOf("Seri", "Cmiique Iitom"),
        listOf("MX")
    ),
    Sesotho(
        "sot", 
        listOf("Sesotho", "Southern Sotho"),
        listOf("ZA", "LS")
    ),
    Seychelles_Creole(
        "crs", 
        listOf("Seychelles Creole", "Seselwa Creole French", "Seselwa"),
        listOf("SC")
    ),
    Sougb(
        "mnx", 
        listOf("Sougb", "Manikion"),
        listOf("ID")
    ),
    Songe(
        "sop", 
        listOf("Songe"),
        listOf("CD")
    ),
    Sengele(
        "szg", 
        listOf("Sengele"),
        listOf("CD")
    ),
    Sangir(
        "sxn", 
        listOf("Sangir"),
        listOf("ID")
    ),
    Sangu(
        "snq", 
        listOf("Sangu", "Sangu (Gabon)"),
        listOf("GA")
    ),
    Shan(
        "shn", 
        listOf("Shan"),
        listOf("MM")
    ),
    Shabo(
        "sbf", 
        listOf("Shabo", "Chabu"),
        listOf("ET")
    ),
    Sherdukpen(
        "sdp", 
        listOf("Sherdukpen"),
        listOf("IN")
    ),
    Sherpa(
        "xsr", 
        listOf("Sherpa"),
        listOf("NP")
    ),
    Sharanahua(
        "mcd", 
        listOf("Sharanahua"),
        listOf("PE", "BR")
    ),
    Shiriana(
        "shb", 
        listOf("Shiriana", "Ninam"),
        listOf("VR", "BR")
    ),
    Shipibo_Konibo(
        "shp", 
        listOf("Shipibo-Konibo", "Shipibo-Conibo"),
        listOf("PE")
    ),
    Shilluk(
        "shk", 
        listOf("Shilluk"),
        listOf("SD")
    ),
    Shambala(
        "ksb", 
        listOf("Shambala", "Kishambaa"),
        listOf("TZ")
    ),
    Sahaptin_Northern(
        "waa", 
        listOf("Sahaptin (Northern)", "Walla Walla"),
        listOf("US")
    ),
    Shor(
        "cjs", 
        listOf("Shor"),
        listOf("RU")
    ),
    Shasta(
        "sht", 
        listOf("Shasta"),
        listOf("US")
    ),
    Shatt(
        "shj", 
        listOf("Shatt", "Caning"),
        listOf("SD")
    ),
    Shuswap(
        "shs", 
        listOf("Shuswap"),
        listOf("CA")
    ),
    Shawnee(
        "sjw", 
        listOf("Shawnee"),
        listOf("US")
    ),
    Shira_Yughur(
        "yuy", 
        listOf("Shira Yughur", "East Yugur"),
        listOf("CN")
    ),
    Siane(
        "snp", 
        listOf("Siane"),
        listOf("PG")
    ),
    Sidaama(
        "sid", 
        listOf("Sidaama", "Sidamo", "Sidaamu Afo"),
        listOf("ET")
    ),
    Sika(
        "ski", 
        listOf("Sika"),
        listOf("ID")
    ),
    Sila(
        "dau", 
        listOf("Sila", "Dar Sila Daju"),
        listOf("TD")
    ),
    Simeulue(
        "smr", 
        listOf("Simeulue"),
        listOf("ID")
    ),
    Siona(
        "snn", 
        listOf("Siona"),
        listOf("CO", "EC")
    ),
    Sio(
        "xsi", 
        listOf("Sio"),
        listOf("PG")
    ),
    Siar(
        "sjr", 
        listOf("Siar", "Siar-Lak"),
        listOf("PG")
    ),
    Sisiqa(
        "baa", 
        listOf("Sisiqa", "Babatana"),
        listOf("SB")
    ),
    Siuslaw(
        "sis", 
        listOf("Siuslaw"),
        listOf("US")
    ),
    Saami_Kildin(
        "sjd", 
        listOf("Saami (Kildin)", "Kildin Sami", "Кӣллт са̄мь кӣлл"),
        listOf("RU")
    ),
    Sikkimese(
        "sip", 
        listOf("Sikkimese"),
        listOf("IN")
    ),
    Sikule(
        "skh", 
        listOf("Sikule"),
        listOf("ID")
    ),
    Sukuma(
        "suk", 
        listOf("Sukuma"),
        listOf("TZ")
    ),
    Skou(
        "skv", 
        listOf("Skou"),
        listOf("ID")
    ),
    Selkup(
        "sel", 
        listOf("Selkup"),
        listOf("RU")
    ),
    Sikaritai(
        "tty", 
        listOf("Sikaritai"),
        listOf("ID")
    ),
    Suku(
        "sub", 
        listOf("Suku"),
        listOf("AO", "CD")
    ),
    Shekhawati(
        "swv", 
        listOf("Shekhawati"),
        listOf("IN")
    ),
    Saliba_in_Papua_New_Guinea(
        "sbe", 
        listOf("Saliba (in Papua New Guinea)", "Saliba"),
        listOf("PG")
    ),
    Samba_Leko(
        "ndi", 
        listOf("Samba Leko"),
        listOf("CM", "NG")
    ),
    Sulung(
        "suv", 
        listOf("Sulung", "Puroik"),
        listOf("IN")
    ),
    Slovene(
        "slv", 
        listOf("Slovene", "Slovenian", "slovenščina"),
        listOf("SI")
    ),
    Selepet(
        "spl", 
        listOf("Selepet"),
        listOf("PG")
    ),
    Salar(
        "slr", 
        listOf("Salar"),
        listOf("CN")
    ),
    Selayar(
        "sly", 
        listOf("Selayar"),
        listOf("ID")
    ),
    Semandang(
        "sdm", 
        listOf("Semandang"),
        listOf("ID")
    ),
    Seme(
        "sif", 
        listOf("Seme", "Siamou"),
        listOf("BF")
    ),
    Semai(
        "sea", 
        listOf("Semai"),
        listOf("MY")
    ),
    Semelai(
        "sza", 
        listOf("Semelai"),
        listOf("MY")
    ),
    Shompen(
        null, 
        listOf("Shompen"),
        listOf("IN")
    ),
    Sahaptin_Umatilla(
        "uma", 
        listOf("Sahaptin (Umatilla)", "Umatilla"),
        listOf("US")
    ),
    Shina(
        "scl", 
        listOf("Shina", "شینا‎ (Šīnā)"),
        listOf("PK")
    ),
    Seneca(
        "see", 
        listOf("Seneca"),
        listOf("US")
    ),
    Senadi(
        "sef", 
        listOf("Senadi", "Cebaara Senoufo"),
        listOf("CI")
    ),
    Sinaugoro(
        "snc", 
        listOf("Sinaugoro"),
        listOf("PG")
    ),
    Sinhala(
        "sin", 
        listOf("Sinhala", "සිංහල"),
        listOf("LK")
    ),
    Sanuma(
        "xsu", 
        listOf("Sanuma", "Sanumá"),
        listOf("BR", "VR")
    ),
    Soninke(
        "snk", 
        listOf("Soninke", "Sooninkanxanne"),
        listOf("CI", "SN", "BF", "ML")
    ),
    Saami_Northern(
        "sme", 
        listOf("Saami (Northern)", "Northern Sami", "davvisámegiella"),
        listOf("NO", "FI", "SE")
    ),
    Sentani(
        "set", 
        listOf("Sentani"),
        listOf("ID")
    ),
    So(
        "teu", 
        listOf("So", "Soo"),
        listOf("UG")
    ),
    Sobei(
        "sob", 
        listOf("Sobei"),
        listOf("ID")
    ),
    Soddo(
        "gru", 
        listOf("Soddo", "Kistane"),
        listOf("ET")
    ),
    Somali(
        "som", 
        listOf("Somali", "Soomaali"),
        listOf("SO")
    ),
    Sonsorol_Tobi(
        "sov", 
        listOf("Sonsorol-Tobi", "Sonsorol"),
        listOf("PW")
    ),
    Soqotri(
        "sqt", 
        listOf("Soqotri"),
        listOf("YE")
    ),
    Sora(
        "srb", 
        listOf("Sora"),
        listOf("IN")
    ),
    Spokane(
        "spo", 
        listOf("Spokane"),
        listOf("US")
    ),
    Salish_Southern_Puget_Sound(
        "slh", 
        listOf("Salish (Southern Puget Sound)", "Southern Puget Sound Salish"),
        listOf("US")
    ),
    Squamish(
        "squ", 
        listOf("Squamish"),
        listOf("CA")
    ),
    Sranan(
        "srn", 
        listOf("Sranan", "Sranan Tongo"),
        listOf("SR")
    ),
    Sarcee(
        "srs", 
        listOf("Sarcee", "Tsúūt’ínà"),
        listOf("CA")
    ),
    Sardinian(
        "sro", 
        listOf("Sardinian", "Campidanese Sardinian"),
        listOf("IT")
    ),
    Sre(
        "kpm", 
        listOf("Sre", "Koho"),
        listOf("VN")
    ),
    Siriano(
        "sri", 
        listOf("Siriano"),
        listOf("BR", "CO")
    ),
    Sorbian_Lower(
        "dsb", 
        listOf("Sorbian (Lower)", "Lower Sorbian", "dolnoserbšćina"),
        listOf("DE")
    ),
    Saramaccan(
        "srm", 
        listOf("Saramaccan"),
        listOf("SR", "GF")
    ),
    Sirionó(
        "srq", 
        listOf("Sirionó"),
        listOf("BO")
    ),
    Siroi(
        "ssd", 
        listOf("Siroi"),
        listOf("PG")
    ),
    Serrano(
        "ser", 
        listOf("Serrano"),
        listOf("US")
    ),
    Selaru(
        "slu", 
        listOf("Selaru"),
        listOf("ID")
    ),
    Siraya(
        "fos", 
        listOf("Siraya"),
        listOf("TW")
    ),
    Sisaala(
        "sld", 
        listOf("Sisaala", "Sissala"),
        listOf("GH")
    ),
    Shinassha(
        "bwo", 
        listOf("Shinassha", "Boro (Ethiopia)", "Borna"),
        listOf("ET")
    ),
    South_Korean_Sign_Language(
        "kvk", 
        listOf("South Korean Sign Language", "Korean Sign Language"),
        listOf("KR")
    ),
    Santa(
        "sce", 
        listOf("Santa", "Dongxiang"),
        listOf("CN")
    ),
    Stieng(
        "stt", 
        listOf("Stieng", "Budeh Stieng"),
        listOf("VN", "KH")
    ),
    Santali(
        "sat", 
        listOf("Santali", "Har Rar"),
        listOf("IN")
    ),
    Sotho_Northern(
        "nso", 
        listOf("Sotho (Northern)", "Northern Sotho", "Sesotho sa Leboa"),
        listOf("ZA")
    ),
    Stoney(
        "sto", 
        listOf("Stoney"),
        listOf("CA")
    ),
    Subiya(
        "sbs", 
        listOf("Subiya"),
        listOf("NA")
    ),
    Sudest(
        "tgo", 
        listOf("Sudest"),
        listOf("PG")
    ),
    Suena(
        "sue", 
        listOf("Suena"),
        listOf("PG")
    ),
    Sungor(
        "sjg", 
        listOf("Sungor", "Assangori"),
        listOf("TD")
    ),
    Sui(
        "swi", 
        listOf("Sui"),
        listOf("CN")
    ),
    Suki(
        "sui", 
        listOf("Suki"),
        listOf("PG")
    ),
    Sulka(
        "sua", 
        listOf("Sulka"),
        listOf("PG")
    ),
    Sumu(
        "sum", 
        listOf("Sumu"),
        listOf("NI")
    ),
    Sundanese(
        "sun", 
        listOf("Sundanese", "Sunda"),
        listOf("ID")
    ),
    Supyire(
        "spp", 
        listOf("Supyire", "Supyire Senoufo"),
        listOf("ML")
    ),
    Sursurunga(
        "sgz", 
        listOf("Sursurunga"),
        listOf("PG")
    ),
    Susu(
        "sus", 
        listOf("Susu"),
        listOf("GN")
    ),
    Svan(
        "sva", 
        listOf("Svan", "Lushnu"),
        listOf("GE")
    ),
    Slovak(
        "slk", 
        listOf("Slovak", "slovenčina"),
        listOf("SK")
    ),
    Savosavo(
        "svs", 
        listOf("Savosavo"),
        listOf("SB")
    ),
    Svenska_Teckenspråket(
        "swl", 
        listOf("Svenska Teckenspråket", "Swedish Sign Language"),
        listOf("SE")
    ),
    Swahili(
        "swh", 
        listOf("Swahili", "Swahili (individual language)", "Kiswahili"),
        listOf("TZ")
    ),
    Sawai(
        "szw", 
        listOf("Sawai"),
        listOf("ID")
    ),
    Swati(
        "ssw", 
        listOf("Swati", "siSwati"),
        listOf("ZA", "SZ")
    ),
    Saryg_Yughur(
        "ybe", 
        listOf("Saryg Yughur", "West Yugur"),
        listOf("CN")
    ),
    Salt_Yui(
        "sll", 
        listOf("Salt-Yui"),
        listOf("PG")
    ),
    Taba(
        "mky", 
        listOf("Taba", "East Makian"),
        listOf("ID")
    ),
    Tacana(
        "tna", 
        listOf("Tacana"),
        listOf("BO")
    ),
    Taiof(
        "sps", 
        listOf("Taiof", "Saposa"),
        listOf("PG")
    ),
    Tagalog(
        "tgl", 
        listOf("Tagalog"),
        listOf("PH")
    ),
    Tahitian(
        "tah", 
        listOf("Tahitian", "Reo Tahiti"),
        listOf("PF")
    ),
    Tajik(
        "tgk", 
        listOf("Tajik", "тоҷикӣ"),
        listOf("TJ")
    ),
    Takia(
        "tbc", 
        listOf("Takia"),
        listOf("PG")
    ),
    Talinga(
        "tlj", 
        listOf("Talinga", "Talinga-Bwisi", "Bwisi"),
        listOf("UG", "CD")
    ),
    Tamang_Eastern(
        "taj", 
        listOf("Tamang (Eastern)", "Eastern Tamang"),
        listOf("NP")
    ),
    Tangale(
        "tan", 
        listOf("Tangale"),
        listOf("NG")
    ),
    Tarao(
        "tro", 
        listOf("Tarao", "Tarao Naga"),
        listOf("IN")
    ),
    Taiap(
        "gpn", 
        listOf("Taiap"),
        listOf("PG")
    ),
    Tariana(
        "tae", 
        listOf("Tariana"),
        listOf("BR")
    ),
    Tashlhiyt(
        "shi", 
        listOf("Tashlhiyt", "Tachelhit", "ⵜⴰⵛⵍⵃⵉⵜ"),
        listOf("MA")
    ),
    Tatana(
        "txx", 
        listOf("Tatana'", "Tatana"),
        listOf("MY")
    ),
    Tauya(
        "tya", 
        listOf("Tauya"),
        listOf("PG")
    ),
    Tawala(
        "tbo", 
        listOf("Tawala"),
        listOf("PG")
    ),
    Tayo(
        "cks", 
        listOf("Tayo"),
        listOf("NC")
    ),
    Tabare(
        "sst", 
        listOf("Tabare", "Sinasina"),
        listOf("PG")
    ),
    Tübatulabal(
        "tub", 
        listOf("Tübatulabal"),
        listOf("US")
    ),
    Tabla(
        "tnm", 
        listOf("Tabla"),
        listOf("ID")
    ),
    Tboli(
        "tbl", 
        listOf("Tboli"),
        listOf("PH")
    ),
    Tabaru(
        "tby", 
        listOf("Tabaru"),
        listOf("ID")
    ),
    Tabassaran(
        "tab", 
        listOf("Tabassaran"),
        listOf("RU")
    ),
    Tobati(
        "tti", 
        listOf("Tobati"),
        listOf("ID")
    ),
    Tubu(
        "dzg", 
        listOf("Tubu", "Dazaga"),
        listOf("TD", "NE")
    ),
    Tabwa(
        "tap", 
        listOf("Tabwa", "Taabwa"),
        listOf("ZM", "CD")
    ),
    Tangbe(
        "skj", 
        listOf("Tangbe", "Seke (Nepal)"),
        listOf("NP")
    ),
    Tarahumara_Central(
        "tar", 
        listOf("Tarahumara (Central)", "Central Tarahumara", "Ralámuli raicha"),
        listOf("MX")
    ),
    Toda(
        "tcx", 
        listOf("Toda"),
        listOf("IN")
    ),
    Teco(
        "ttc", 
        listOf("Teco", "Tektiteko", "B’a’aj"),
        listOf("GT", "MX")
    ),
    Tepehua_Huehuetla(
        "tee", 
        listOf("Tepehua (Huehuetla)", "Huehuetla Tepehua"),
        listOf("MX")
    ),
    Tehuelche(
        "teh", 
        listOf("Tehuelche"),
        listOf("AR")
    ),
    Telugu(
        "tel", 
        listOf("Telugu", "తెలుగు"),
        listOf("IN")
    ),
    Tem(
        "kdh", 
        listOf("Tem"),
        listOf("BJ", "GH", "TG")
    ),
    Tennet(
        "tex", 
        listOf("Tennet"),
        listOf("SD")
    ),
    Teop(
        "tio", 
        listOf("Teop"),
        listOf("PG")
    ),
    Tepehua_Tlachichilco(
        "tpt", 
        listOf("Tepehua (Tlachichilco)", "Tlachichilco Tepehua"),
        listOf("MX")
    ),
    Tera(
        "ttr", 
        listOf("Tera"),
        listOf("NG")
    ),
    Teso(
        "teo", 
        listOf("Teso", "Kiteso"),
        listOf("UG")
    ),
    Tetela(
        "tll", 
        listOf("Tetela"),
        listOf("CD")
    ),
    Tangga(
        "tgg", 
        listOf("Tangga"),
        listOf("PG")
    ),
    Tagbanwa_Aborlan(
        "tbw", 
        listOf("Tagbanwa (Aborlan)", "Tagbanwa"),
        listOf("PH")
    ),
    Tigak(
        "tgc", 
        listOf("Tigak"),
        listOf("PG")
    ),
    Tshangla(
        "tsj", 
        listOf("Tshangla"),
        listOf("BT", "IN")
    ),
    Tugun(
        "tzn", 
        listOf("Tugun"),
        listOf("ID")
    ),
    Tsogo(
        "tsv", 
        listOf("Tsogo"),
        listOf("GA")
    ),
    Tanglapui(
        "swt", 
        listOf("Tanglapui", "Sawila"),
        listOf("ID")
    ),
    Tarangan_West(
        "txn", 
        listOf("Tarangan (West)", "West Tarangan"),
        listOf("ID")
    ),
    Thai(
        "tha", 
        listOf("Thai", "ไทย"),
        listOf("TH")
    ),
    Thadou(
        "tcz", 
        listOf("Thadou", "Thado Chin"),
        listOf("IN", "MM")
    ),
    Thakali(
        "ths", 
        listOf("Thakali"),
        listOf("NP")
    ),
    Thangmi(
        "thf", 
        listOf("Thangmi"),
        listOf("NP")
    ),
    Thompson(
        "thp", 
        listOf("Thompson"),
        listOf("CA")
    ),
    Thaypan(
        "typ", 
        listOf("Thaypan"),
        listOf("AU")
    ),
    Thai_Sign_Language(
        "tsq", 
        listOf("Thai Sign Language"),
        listOf("TH")
    ),
    Tehit(
        "kps", 
        listOf("Tehit"),
        listOf("ID")
    ),
    Thulung(
        "tdh", 
        listOf("Thulung"),
        listOf("NP")
    ),
    Thao(
        "ssf", 
        listOf("Thao"),
        listOf("TW")
    ),
    Kuuk_Thaayorre(
        "thd", 
        listOf("Kuuk Thaayorre", "Thayore"),
        listOf("AU")
    ),
    Tima(
        "tms", 
        listOf("Tima"),
        listOf("SD")
    ),
    Ticuna(
        "tca", 
        listOf("Ticuna"),
        listOf("BR", "PE")
    ),
    Tidore(
        "tvo", 
        listOf("Tidore"),
        listOf("ID")
    ),
    Tifal(
        "tif", 
        listOf("Tifal"),
        listOf("PG")
    ),
    Tigrinya(
        "tir", 
        listOf("Tigrinya", "ትግርኛ"),
        listOf("ER", "ET")
    ),
    Tikar(
        "tik", 
        listOf("Tikar"),
        listOf("CM")
    ),
    Tillamook(
        "til", 
        listOf("Tillamook"),
        listOf("US")
    ),
    Timugon(
        "tih", 
        listOf("Timugon", "Timugon Murut"),
        listOf("MY")
    ),
    Tinrin(
        "cir", 
        listOf("Tinrin", "Tiri"),
        listOf("NC")
    ),
    Tiriyo(
        "tri", 
        listOf("Tiriyo", "Trió"),
        listOf("BR", "SR")
    ),
    Tiv(
        "tiv", 
        listOf("Tiv"),
        listOf("NG")
    ),
    Tiwi(
        "tiw", 
        listOf("Tiwi"),
        listOf("AU")
    ),
    Tokelauan(
        "tkl", 
        listOf("Tokelauan", "Tokelau"),
        listOf("TK")
    ),
    Tuki(
        "bag", 
        listOf("Tuki"),
        listOf("CM")
    ),
    Takelma(
        "tkm", 
        listOf("Takelma"),
        listOf("US")
    ),
    Turkmen(
        "tuk", 
        listOf("Turkmen", "Türkmen dili"),
        listOf("TM")
    ),
    Teke_Southern(
        "kkw", 
        listOf("Teke (Southern)", "Teke-Kukuya"),
        listOf("CG")
    ),
    Tolai(
        "ksd", 
        listOf("Tolai", "Kuanua"),
        listOf("PG")
    ),
    Talaud(
        "tld", 
        listOf("Talaud"),
        listOf("ID")
    ),
    Telefol(
        "tlf", 
        listOf("Telefol"),
        listOf("PG")
    ),
    Tlingit(
        "tli", 
        listOf("Tlingit", "Łingít"),
        listOf("US")
    ),
    Taulil(
        "tuh", 
        listOf("Taulil"),
        listOf("PG")
    ),
    Tobelo(
        "tlb", 
        listOf("Tobelo"),
        listOf("ID")
    ),
    Tlapanec(
        "tcf", 
        listOf("Tlapanec", "Malinaltepec Me'phaa", "Mè’phàà Mañuwìín"),
        listOf("MX")
    ),
    Timucua(
        "tjm", 
        listOf("Timucua"),
        listOf("US")
    ),
    Tamagario(
        "tcg", 
        listOf("Tamagario"),
        listOf("ID")
    ),
    Tumak(
        "tmc", 
        listOf("Tumak"),
        listOf("TD")
    ),
    Tamabo(
        "mla", 
        listOf("Tamabo", "Malo"),
        listOf("VU")
    ),
    Temein(
        "teq", 
        listOf("Temein"),
        listOf("SD")
    ),
    Tampulma(
        "tpm", 
        listOf("Tampulma"),
        listOf("GH")
    ),
    Temiar(
        "tea", 
        listOf("Temiar"),
        listOf("MY")
    ),
    Tommo_So(
        null, 
        listOf("Tommo So"),
        listOf("ML")
    ),
    Tat_Muslim(
        "ttt", 
        listOf("Tat (Muslim)", "Muslim Tat"),
        listOf("AZ")
    ),
    Turkana(
        "tuv", 
        listOf("Turkana"),
        listOf("KE", "UG")
    ),
    Tunebo(
        "tnd", 
        listOf("Tunebo", "Angosturas Tunebo"),
        listOf("CO")
    ),
    Tanacross(
        "tcb", 
        listOf("Tanacross"),
        listOf("US")
    ),
    Tindi(
        "tin", 
        listOf("Tindi"),
        listOf("RU")
    ),
    Temne(
        "tem", 
        listOf("Temne", "Timne", "Themne"),
        listOf("SL")
    ),
    Tongan(
        "ton", 
        listOf("Tongan", "lea fakatonga"),
        listOf("TO")
    ),
    Tinani(
        "lbf", 
        listOf("Tinani"),
        listOf("IN")
    ),
    Tanaina(
        "tfn", 
        listOf("Tanaina"),
        listOf("US")
    ),
    Tungak(
        "lcm", 
        listOf("Tungak", "Tungag"),
        listOf("PG")
    ),
    Tanana_Lower(
        "taa", 
        listOf("Tanana (Lower)", "Lower Tanana"),
        listOf("US")
    ),
    Tunen(
        "baz", 
        listOf("Tunen"),
        listOf("CM")
    ),
    Tondano(
        "tdn", 
        listOf("Tondano"),
        listOf("ID")
    ),
    Tanna_Southwest(
        "nwi", 
        listOf("Tanna (Southwest)", "Southwest Tanna"),
        listOf("VU")
    ),
    Tontemboan(
        "tnt", 
        listOf("Tontemboan"),
        listOf("ID")
    ),
    Tenyer(
        "kza", 
        listOf("Tenyer", "Western Karaboro"),
        listOf("BF")
    ),
    Toaripi(
        "tqo", 
        listOf("Toaripi"),
        listOf("PG")
    ),
    Toba(
        "tob", 
        listOf("Toba", "Qom"),
        listOf("AR")
    ),
    Tod(
        "sbu", 
        listOf("Tod", "Stod Bhoti"),
        listOf("IN")
    ),
    Tofa(
        "kim", 
        listOf("Tofa", "Karagas", "тоъфа дыл‎ (tofa dyl)"),
        listOf("RU")
    ),
    Tojolabal(
        "toj", 
        listOf("Tojolabal"),
        listOf("MX")
    ),
    Tarok(
        "yer", 
        listOf("Tarok"),
        listOf("NG")
    ),
    Tol(
        "jic", 
        listOf("Tol"),
        listOf("HN")
    ),
    Tonkawa(
        "tqw", 
        listOf("Tonkawa"),
        listOf("US")
    ),
    Toqabaqita(
        "mlu", 
        listOf("Toqabaqita", "To'abaita"),
        listOf("SB")
    ),
    Toratán(
        "rth", 
        listOf("Toratán", "Ratahan"),
        listOf("ID")
    ),
    Totonac_Sierra(
        "tos", 
        listOf("Totonac (Sierra)", "Highland Totonac"),
        listOf("MX")
    ),
    Totonac_Misantla(
        "tlc", 
        listOf("Totonac (Misantla)", "Yecuatla Totonac"),
        listOf("MX")
    ),
    Tasmanian_Oyster_Bay_to_Pitwater(
        null, 
        listOf("Tasmanian (Oyster Bay to Pitwater)"),
        listOf("AU")
    ),
    Tonga_in_Zambia(
        "toi", 
        listOf("Tonga (in Zambia)", "Tonga (Zambia)", "Chitonga", "Tonga"),
        listOf("ZM")
    ),
    Totonac_Papantla(
        "top", 
        listOf("Totonac (Papantla)", "Papantla Totonac"),
        listOf("MX")
    ),
    Tepecano(
        "tep", 
        listOf("Tepecano"),
        listOf("MX")
    ),
    Tok_Pisin(
        "tpi", 
        listOf("Tok Pisin"),
        listOf("PG")
    ),
    Tepehuan_Northern(
        "ntp", 
        listOf("Tepehuan (Northern)", "Northern Tepehuan", "O’otham"),
        listOf("MX")
    ),
    Tupuri(
        "tui", 
        listOf("Tupuri"),
        listOf("CM", "TD")
    ),
    Tepehuan_Southeastern(
        "stp", 
        listOf("Tepehuan (Southeastern)", "Southeastern Tepehuan", "O’dam"),
        listOf("MX")
    ),
    Tapieté(
        "tpj", 
        listOf("Tapieté"),
        listOf("PY")
    ),
    Teribe(
        "tfr", 
        listOf("Teribe", "Naso"),
        listOf("PA", "CR")
    ),
    Trique_Chicahuaxtla(
        "trs", 
        listOf("Trique (Chicahuaxtla)", "Chicahuaxtla Triqui"),
        listOf("MX")
    ),
    Toraja(
        "sda", 
        listOf("Toraja", "Toraja-Sa'dan"),
        listOf("ID")
    ),
    Trique_Copala(
        "trc", 
        listOf("Trique (Copala)", "Copala Triqui"),
        listOf("MX")
    ),
    Terêna(
        "ter", 
        listOf("Terêna", "Tereno"),
        listOf("BR")
    ),
    Tairora(
        "tbg", 
        listOf("Tairora", "North Tairora"),
        listOf("PG")
    ),
    Ternate(
        "tft", 
        listOf("Ternate"),
        listOf("ID")
    ),
    Trumai(
        "tpy", 
        listOf("Trumai"),
        listOf("BR")
    ),
    Torwali(
        "trw", 
        listOf("Torwali"),
        listOf("PK")
    ),
    Tiruray(
        "tiy", 
        listOf("Tiruray"),
        listOf("PH")
    ),
    Tsakhur(
        "tkr", 
        listOf("Tsakhur", "Cʼäxna miz"),
        listOf("RU", "AZ")
    ),
    Timorese(
        "aoz", 
        listOf("Timorese", "Uab Meto"),
        listOf("ID")
    ),
    Tsafiki(
        "cof", 
        listOf("Tsafiki", "Colorado"),
        listOf("EC")
    ),
    Tausug(
        "tsg", 
        listOf("Tausug"),
        listOf("PH", "MY", "ID")
    ),
    Tümpisa_Shoshone(
        "par", 
        listOf("Tümpisa Shoshone", "Panamint"),
        listOf("US")
    ),
    Tsimshian_Coast(
        "tsi", 
        listOf("Tsimshian (Coast)", "Tsimshian", "Sm’algyax"),
        listOf("US", "CA")
    ),
    Tamashek(
        "taq", 
        listOf("Tamashek", "Tamasheq"),
        listOf("ML")
    ),
    Tanzania_Sign_Language(
        "tza", 
        listOf("Tanzania Sign Language", "Tanzanian Sign Language"),
        listOf("TZ")
    ),
    Tasmanian(
        "xtz", 
        listOf("Tasmanian"),
        listOf("AU")
    ),
    Tsonga(
        "tso", 
        listOf("Tsonga", "Xitsonga"),
        listOf("MZ", "ZA")
    ),
    Tsou(
        "tsu", 
        listOf("Tsou"),
        listOf("TW")
    ),
    Taushiro(
        "trr", 
        listOf("Taushiro"),
        listOf("PE")
    ),
    Tsat(
        "huq", 
        listOf("Tsat"),
        listOf("CN")
    ),
    Tswana(
        "tsn", 
        listOf("Tswana", "Setswana"),
        listOf("BW", "ZA")
    ),
    Tsez(
        "ddo", 
        listOf("Tsez", "Dido"),
        listOf("RU")
    ),
    Tutelo(
        "tta", 
        listOf("Tutelo"),
        listOf("US")
    ),
    Tati_Southern(
        "tks", 
        listOf("Tati (Southern)", "Takestani"),
        listOf("IR")
    ),
    Tsova_Tush(
        "bbl", 
        listOf("Tsova-Tush", "Bats"),
        listOf("GE")
    ),
    Tatuyo(
        "tav", 
        listOf("Tatuyo"),
        listOf("CO")
    ),
    Tuamotuan(
        "pmt", 
        listOf("Tuamotuan", "Pa’umotu"),
        listOf("PF")
    ),
    Tubar(
        "tbu", 
        listOf("Tubar"),
        listOf("MX")
    ),
    Tucano(
        "tuo", 
        listOf("Tucano"),
        listOf("BR", "CO")
    ),
    Türk_Isaret_Dili(
        "tsm", 
        listOf("Türk Isaret Dili", "Turkish Sign Language"),
        listOf("TR")
    ),
    Tukang_Besi(
        "bhq", 
        listOf("Tukang Besi", "Tukang Besi South"),
        listOf("ID")
    ),
    Tulu(
        "tcy", 
        listOf("Tulu"),
        listOf("IN")
    ),
    Tumleo(
        "tmq", 
        listOf("Tumleo"),
        listOf("PG")
    ),
    Tunica(
        "tun", 
        listOf("Tunica"),
        listOf("US")
    ),
    Tupi(
        null, 
        listOf("Tupi"),
        listOf("BR")
    ),
    Turkish(
        "tur", 
        listOf("Turkish", "Türkçe"),
        listOf("TR")
    ),
    Tuscarora(
        "tus", 
        listOf("Tuscarora"),
        listOf("US")
    ),
    Tutchone_Northern(
        "ttm", 
        listOf("Tutchone (Northern)", "Northern Tutchone"),
        listOf("CA")
    ),
    Tuvan(
        "tyv", 
        listOf("Tuvan", "Tuvinian", "тыва‎ (tyva)", "тыва дыл‎ (tyva dyl)"),
        listOf("RU", "MN")
    ),
    Tuyuca(
        "tue", 
        listOf("Tuyuca"),
        listOf("CO", "BR")
    ),
    Tutsa(
        "tvt", 
        listOf("Tutsa", "Tutsa Naga"),
        listOf("IN")
    ),
    Twana(
        "twa", 
        listOf("Twana"),
        listOf("US")
    ),
    Tarahumara_Western(
        "tac", 
        listOf("Tarahumara (Western)", "Lowland Tarahumara", "Rarómari raicha"),
        listOf("MX")
    ),
    Tiwa_Northern(
        "twf", 
        listOf("Tiwa (Northern)", "Northern Tiwa"),
        listOf("US")
    ),
    Tiwa_Southern(
        "tix", 
        listOf("Tiwa (Southern)", "Southern Tiwa"),
        listOf("US")
    ),
    Totonac_Xicotepec_de_Juárez(
        "too", 
        listOf("Totonac (Xicotepec de Juárez)", "Xicotepec De Juárez Totonac"),
        listOf("MX")
    ),
    Tyeraity(
        "woa", 
        listOf("Tyeraity", "Tyaraity"),
        listOf("AU")
    ),
    Taiwanese_Sign_Language_Ziran_Shouyu(
        "tss", 
        listOf("Taiwanese Sign Language (Ziran Shouyu)", "Taiwan Sign Language"),
        listOf("TW")
    ),
    Tzotzil(
        "tzc", 
        listOf("Tzotzil"),
        listOf("MX")
    ),
    Tzotzil_San_Andrés(
        "tzs", 
        listOf("Tzotzil (San Andrés)"),
        listOf("MX")
    ),
    Tzutujil(
        "tzt", 
        listOf("Tzutujil"),
        listOf("GT")
    ),
    Tzotzil_Zinacantán(
        "tzz", 
        listOf("Tzotzil (Zinacantán)"),
        listOf("MX")
    ),
    Ubykh(
        "uby", 
        listOf("Ubykh"),
        listOf("RU", "TR")
    ),
    Udihe(
        "ude", 
        listOf("Udihe"),
        listOf("RU")
    ),
    Udi(
        "udi", 
        listOf("Udi"),
        listOf("AZ")
    ),
    Udmurt(
        "udm", 
        listOf("Udmurt"),
        listOf("RU")
    ),
    Ugandan_Sign_Language(
        "ugn", 
        listOf("Ugandan Sign Language"),
        listOf("UG")
    ),
    Uradhi(
        "urf", 
        listOf("Uradhi"),
        listOf("AU")
    ),
    Ukrainian(
        "ukr", 
        listOf("Ukrainian", "українська"),
        listOf("UA")
    ),
    Upper_Kuskokwim(
        "kuu", 
        listOf("Upper Kuskokwim"),
        listOf("US")
    ),
    Ulcha(
        "ulc", 
        listOf("Ulcha", "Ulch"),
        listOf("RU")
    ),
    Uldeme(
        "udl", 
        listOf("Uldeme", "Wuzlam"),
        listOf("CM")
    ),
    Ulithian(
        "uli", 
        listOf("Ulithian"),
        listOf("FM")
    ),
    Uma(
        "ppk", 
        listOf("Uma"),
        listOf("ID")
    ),
    UMbundu(
        "umb", 
        listOf("UMbundu", "Umbundu"),
        listOf("AO")
    ),
    Umpila(
        "ump", 
        listOf("Umpila"),
        listOf("AU")
    ),
    Una(
        "mtg", 
        listOf("Una"),
        listOf("ID")
    ),
    Ungarinjin(
        "ung", 
        listOf("Ungarinjin", "Ngarinyin"),
        listOf("AU")
    ),
    Unami(
        "unm", 
        listOf("Unami"),
        listOf("US")
    ),
    Ura(
        "uur", 
        listOf("Ura", "Ura (Vanuatu)"),
        listOf("VU")
    ),
    Urdu(
        "urd", 
        listOf("Urdu", "اردو"),
        listOf("PK")
    ),
    Urhobo(
        "urh", 
        listOf("Urhobo"),
        listOf("NG")
    ),
    Urim(
        "uri", 
        listOf("Urim"),
        listOf("PG")
    ),
    Urubú_Kaapor(
        "urb", 
        listOf("Urubú-Kaapor"),
        listOf("BR")
    ),
    Urak_Lawoi(
        "urk", 
        listOf("Urak Lawoi'"),
        listOf("TH")
    ),
    Urum(
        "uum", 
        listOf("Urum"),
        listOf("GE", "UA")
    ),
    Urarina(
        "ura", 
        listOf("Urarina"),
        listOf("PE")
    ),
    Urat(
        "urt", 
        listOf("Urat"),
        listOf("PG")
    ),
    Uru(
        "ure", 
        listOf("Uru"),
        listOf("BO")
    ),
    Usan(
        "wnu", 
        listOf("Usan"),
        listOf("PG")
    ),
    Urubú_Sign_Language(
        "uks", 
        listOf("Urubú Sign Language", "Urubú-Kaapor Sign Language"),
        listOf("BR")
    ),
    Usarufa(
        "usa", 
        listOf("Usarufa"),
        listOf("PG")
    ),
    Uyghur(
        "uig", 
        listOf("Uyghur", "ئۇيغۇرچە"),
        listOf("CN")
    ),
    Uzbek(
        "uzs", 
        listOf("Uzbek", "Southern Uzbek"),
        listOf("AF", "UZ")
    ),
    Vafsi(
        "vaf", 
        listOf("Vafsi"),
        listOf("IR")
    ),
    Vagla(
        "vag", 
        listOf("Vagla"),
        listOf("GH")
    ),
    Vai(
        "vai", 
        listOf("Vai", "ꕙꔤ"),
        listOf("SL", "LR")
    ),
    Vasavi(
        "vas", 
        listOf("Vasavi"),
        listOf("IN")
    ),
    Vata(
        "dic", 
        listOf("Vata", "Lakota Dida"),
        listOf("CI")
    ),
    Vedda(
        "ved", 
        listOf("Vedda", "Veddah"),
        listOf("LK")
    ),
    Venda(
        "ven", 
        listOf("Venda", "Tshivenḓa"),
        listOf("ZW", "ZA")
    ),
    Veps(
        "vep", 
        listOf("Veps"),
        listOf("RU")
    ),
    Vietnamese(
        "vie", 
        listOf("Vietnamese", "Tiếng Việt"),
        listOf("VN")
    ),
    Vili(
        "vif", 
        listOf("Vili"),
        listOf("GA", "CG")
    ),
    Kariera(
        "vka", 
        listOf("Kariera", "Kariyarra"),
        listOf("AU")
    ),
    Vlaamse_Gebarentaal(
        "bvs", 
        listOf("Vlaamse Gebarentaal"),
        listOf("BE")
    ),
    Vinmavis(
        "vnm", 
        listOf("Vinmavis"),
        listOf("VU")
    ),
    Votic(
        "vot", 
        listOf("Votic"),
        listOf("RU")
    ),
    Wagiman(
        "waq", 
        listOf("Wagiman", "Wageman"),
        listOf("AU")
    ),
    Wahgi(
        "whg", 
        listOf("Wahgi", "North Wahgi"),
        listOf("PG")
    ),
    Wai_Wai(
        "waw", 
        listOf("Wai Wai", "Waiwai"),
        listOf("BR", "GY")
    ),
    Wakhi(
        "wbl", 
        listOf("Wakhi", "Khik", "Khikwar"),
        listOf("AF", "PK", "TJ")
    ),
    Walman(
        "van", 
        listOf("Walman", "Valman"),
        listOf("PG")
    ),
    Wambaya(
        "wmb", 
        listOf("Wambaya"),
        listOf("AU")
    ),
    Wangkumara(
        "nbx", 
        listOf("Wangkumara"),
        listOf("AU")
    ),
    Waorani(
        "auc", 
        listOf("Waorani", "Wao Tededö"),
        listOf("EC")
    ),
    Wappo(
        "wao", 
        listOf("Wappo"),
        listOf("US")
    ),
    Wari(
        "pav", 
        listOf("Wari'", "Pakaásnovos"),
        listOf("BR")
    ),
    Washo(
        "was", 
        listOf("Washo"),
        listOf("US")
    ),
    Watjarri(
        "wbv", 
        listOf("Watjarri", "Wajarri"),
        listOf("AU")
    ),
    Waunana(
        "noa", 
        listOf("Waunana", "Woun Meu"),
        listOf("CO", "PA")
    ),
    Wayampi(
        "oym", 
        listOf("Wayampi"),
        listOf("BR")
    ),
    Wambon(
        "wms", 
        listOf("Wambon"),
        listOf("ID")
    ),
    Wanman(
        "wbt", 
        listOf("Wanman"),
        listOf("AU")
    ),
    Wichí(
        "mzh", 
        listOf("Wichí", "Wichí Lhamtés Güisnay", "Wichí Lhamtés"),
        listOf("BO", "AR")
    ),
    Western_Desert_Ooldea(
        null, 
        listOf("Western Desert (Ooldea)"),
        listOf("AU")
    ),
    Wedau(
        "wed", 
        listOf("Wedau"),
        listOf("PG")
    ),
    Wembawemba(
        null, 
        listOf("Wembawemba"),
        listOf("AU")
    ),
    Weri(
        "wer", 
        listOf("Weri"),
        listOf("PG")
    ),
    Wetan(
        "lex", 
        listOf("Wetan", "Luang"),
        listOf("ID")
    ),
    Wangkangurru(
        "wgg", 
        listOf("Wangkangurru", "Wangganguru"),
        listOf("AU")
    ),
    Waigali(
        "wbk", 
        listOf("Waigali"),
        listOf("AF")
    ),
    Warrongo(
        "wrg", 
        listOf("Warrongo", "Warungu"),
        listOf("AU")
    ),
    Wichita(
        "wic", 
        listOf("Wichita"),
        listOf("US")
    ),
    Wirangu(
        "wiw", 
        listOf("Wirangu"),
        listOf("AU")
    ),
    Wiyot(
        "wiy", 
        listOf("Wiyot"),
        listOf("US")
    ),
    Wagawaga(
        "wkw", 
        listOf("Wagawaga", "Wakawaka"),
        listOf("AU")
    ),
    Wolof(
        "wol", 
        listOf("Wolof"),
        listOf("SN", "GM")
    ),
    Wallisian(
        "wls", 
        listOf("Wallisian"),
        listOf("WF")
    ),
    Walmatjari(
        "wmt", 
        listOf("Walmatjari", "Walmajarri"),
        listOf("AU")
    ),
    Wolio(
        "wlo", 
        listOf("Wolio"),
        listOf("ID")
    ),
    Warluwara(
        "wrb", 
        listOf("Warluwara"),
        listOf("AU")
    ),
    Wolaytta(
        "wal", 
        listOf("Wolaytta", "ወላይታቱ"),
        listOf("ET")
    ),
    West_Makian(
        "mqs", 
        listOf("West Makian"),
        listOf("ID")
    ),
    Wambule(
        "wme", 
        listOf("Wambule"),
        listOf("NP")
    ),
    Wéménugbé(
        "wem", 
        listOf("Wéménugbé", "Weme Gbe"),
        listOf("BJ")
    ),
    Wik_Munkan(
        "wim", 
        listOf("Wik Munkan", "Wik-Mungkan"),
        listOf("AU")
    ),
    Wik_Ngathana(
        "wig", 
        listOf("Wik Ngathana", "Wik-Ngathana"),
        listOf("AU")
    ),
    Wan(
        "wan", 
        listOf("Wan"),
        listOf("CI")
    ),
    Winnebago(
        "win", 
        listOf("Winnebago", "Ho-Chunk"),
        listOf("US")
    ),
    Wantoat(
        "wnc", 
        listOf("Wantoat"),
        listOf("PG")
    ),
    Wobe(
        "wob", 
        listOf("Wobe", "Wè Northern"),
        listOf("CI")
    ),
    Wogamusin(
        "wog", 
        listOf("Wogamusin"),
        listOf("PG")
    ),
    Woisika(
        "woi", 
        listOf("Woisika", "Kamang"),
        listOf("ID")
    ),
    Woleaian(
        "woe", 
        listOf("Woleaian"),
        listOf("FM")
    ),
    Womo(
        "wmx", 
        listOf("Womo"),
        listOf("PG")
    ),
    Worora(
        "unp", 
        listOf("Worora"),
        listOf("AU")
    ),
    Wapishana(
        "wap", 
        listOf("Wapishana"),
        listOf("BR", "GY")
    ),
    Warao(
        "wba", 
        listOf("Warao"),
        listOf("VR")
    ),
    Warrnambool(
        null, 
        listOf("Warrnambool"),
        listOf("AU")
    ),
    Wardaman(
        "wrr", 
        listOf("Wardaman"),
        listOf("AU")
    ),
    Warrgamay(
        "wgy", 
        listOf("Warrgamay"),
        listOf("AU")
    ),
    Warekena(
        "gae", 
        listOf("Warekena", "Guarequena"),
        listOf("VR", "CO", "BR")
    ),
    Warlpiri(
        "wbp", 
        listOf("Warlpiri"),
        listOf("AU")
    ),
    Warembori(
        "wsa", 
        listOf("Warembori"),
        listOf("ID")
    ),
    Warndarang(
        "wnd", 
        listOf("Warndarang", "Wandarang"),
        listOf("AU")
    ),
    Waropen(
        "wrp", 
        listOf("Waropen"),
        listOf("ID")
    ),
    Waris(
        "wrs", 
        listOf("Waris"),
        listOf("PG", "ID")
    ),
    Warumungu(
        "wrm", 
        listOf("Warumungu"),
        listOf("AU")
    ),
    Warrwa(
        "wwr", 
        listOf("Warrwa"),
        listOf("AU")
    ),
    Waray_in_Australia(
        "wrz", 
        listOf("Waray (in Australia)", "Waray (Australia)"),
        listOf("AU")
    ),
    Waskia(
        "wsk", 
        listOf("Waskia"),
        listOf("PG")
    ),
    Wathawurrung(
        "wth", 
        listOf("Wathawurrung"),
        listOf("AU")
    ),
    Watam(
        "wax", 
        listOf("Watam"),
        listOf("PG")
    ),
    Wu_Changzhou(
        "wuu", 
        listOf("Wu (Changzhou)", "Wu Chinese"),
        listOf("CN")
    ),
    Waurá(
        "wau", 
        listOf("Waurá"),
        listOf("BR")
    ),
    Waama(
        "wwa", 
        listOf("Waama"),
        listOf("BJ")
    ),
    Woiwurrung(
        "wyi", 
        listOf("Woiwurrung"),
        listOf("AU")
    ),
    Waray_Waray(
        "war", 
        listOf("Waray-Waray", "Waray"),
        listOf("PH")
    ),
    Wyandot(
        "wya", 
        listOf("Wyandot"),
        listOf("CA")
    ),
    Wayana(
        "way", 
        listOf("Wayana"),
        listOf("SR", "BR", "GF")
    ),
    Xam(
        "xam", 
        listOf("/Xam"),
        listOf("ZA")
    ),
    Xârâcùù(
        "ane", 
        listOf("Xârâcùù"),
        listOf("NC")
    ),
    Xasonga(
        "kao", 
        listOf("Xasonga", "Xaasongaxango", "Xasongo"),
        listOf("ML", "SN")
    ),
    Xavánte(
        "xav", 
        listOf("Xavánte"),
        listOf("BR")
    ),
    Kombio(
        "xbi", 
        listOf("Kombio", "Akwun"),
        listOf("PG")
    ),
    Xerénte(
        "xer", 
        listOf("Xerénte"),
        listOf("BR")
    ),
    Xhosa(
        "xho", 
        listOf("Xhosa", "isiXhosa"),
        listOf("ZA")
    ),
    Kanashi(
        "xns", 
        listOf("Kanashi"),
        listOf("IN")
    ),
    Xokleng(
        "xok", 
        listOf("Xokleng"),
        listOf("BR")
    ),
    Xóõ(
        "nmn", 
        listOf("!Xóõ"),
        listOf("BW")
    ),
    Xun_Ekoka(
        "knw", 
        listOf("!Xun (Ekoka)", "Kung-Ekoka"),
        listOf("NA", "AO")
    ),
    Yagua(
        "yad", 
        listOf("Yagua", "Nijyamii", "Nijyamïï Nikyejaada"),
        listOf("PE")
    ),
    Yahgan(
        "yag", 
        listOf("Yahgan", "Yámana", "Háusi Kúta"),
        listOf("CL")
    ),
    Yaka(
        "yaf", 
        listOf("Yaka", "Yaka (Democratic Republic of Congo)"),
        listOf("AO", "CD")
    ),
    Yale_Kosarek(
        "kkl", 
        listOf("Yale (Kosarek)", "Kosarek Yale"),
        listOf("ID")
    ),
    Yaminahua(
        "yaa", 
        listOf("Yaminahua"),
        listOf("BR", "PE")
    ),
    Yana(
        "ynn", 
        listOf("Yana"),
        listOf("US")
    ),
    Yao_in_Malawi(
        "yao", 
        listOf("Yao (in Malawi)", "Yao"),
        listOf("MW", "MZ")
    ),
    Yapese(
        "yap", 
        listOf("Yapese"),
        listOf("FM")
    ),
    Yaqui(
        "yaq", 
        listOf("Yaqui", "Hiak-nooki", "Yoeme"),
        listOf("MX")
    ),
    Yareba(
        "yrb", 
        listOf("Yareba"),
        listOf("PG")
    ),
    Yawa(
        "yva", 
        listOf("Yawa", "Yawa Unat"),
        listOf("ID")
    ),
    Yay(
        "pcc", 
        listOf("Yay", "Bouyei"),
        listOf("VN")
    ),
    Yazgulyam(
        "yah", 
        listOf("Yazgulyam", "Yuzdomi zavég"),
        listOf("TJ")
    ),
    Yamba(
        "yam", 
        listOf("Yamba"),
        listOf("CM")
    ),
    Yamphu(
        "ybi", 
        listOf("Yamphu"),
        listOf("NP")
    ),
    Yucuna(
        "ycn", 
        listOf("Yucuna"),
        listOf("CO")
    ),
    Yucatec(
        "yua", 
        listOf("Yucatec", "Yucateco", "Maaya t’aan"),
        listOf("MX")
    ),
    Yei(
        "jei", 
        listOf("Yei"),
        listOf("ID", "PG")
    ),
    Yelî_Dnye(
        "yle", 
        listOf("Yelî Dnye", "Yele"),
        listOf("PG")
    ),
    Yemba(
        "ybb", 
        listOf("Yemba"),
        listOf("CM")
    ),
    Yessan_Mayo(
        "yss", 
        listOf("Yessan-Mayo"),
        listOf("PG")
    ),
    Yeyi(
        "yey", 
        listOf("Yeyi"),
        listOf("BW", "NA")
    ),
    Yag_Dii(
        "dur", 
        listOf("Yag Dii", "Dii"),
        listOf("CM")
    ),
    Yaghnobi(
        "yai", 
        listOf("Yaghnobi", "Yagnobi"),
        listOf("TJ")
    ),
    Yi(
        "iii", 
        listOf("Yi", "Sichuan Yi", "ꆈꌠꉙ"),
        listOf("CN")
    ),
    Yidiny(
        "yii", 
        listOf("Yidiny"),
        listOf("AU")
    ),
    Yil(
        "yll", 
        listOf("Yil"),
        listOf("PG")
    ),
    Yimas(
        "yee", 
        listOf("Yimas"),
        listOf("PG")
    ),
    Yindjibarndi(
        "yij", 
        listOf("Yindjibarndi"),
        listOf("AU")
    ),
    Yir_Yiront(
        "yiy", 
        listOf("Yir Yiront"),
        listOf("AU")
    ),
    Yuki(
        "yuk", 
        listOf("Yuki"),
        listOf("US")
    ),
    Yakoma(
        "yky", 
        listOf("Yakoma"),
        listOf("CF")
    ),
    Yakan(
        "yka", 
        listOf("Yakan"),
        listOf("PH")
    ),
    Yukaghir_Kolyma(
        "yux", 
        listOf("Yukaghir (Kolyma)", "Southern Yukaghir"),
        listOf("RU")
    ),
    Yukpa(
        "yup", 
        listOf("Yukpa"),
        listOf("VR", "CO")
    ),
    Yakut(
        "sah", 
        listOf("Yakut", "Sakha", "саха тыла"),
        listOf("RU")
    ),
    Yali(
        "yli", 
        listOf("Yali", "Angguruk Yali"),
        listOf("ID")
    ),
    Yelmek(
        "jel", 
        listOf("Yelmek"),
        listOf("ID")
    ),
    Yalarnnga(
        "ylr", 
        listOf("Yalarnnga"),
        listOf("AU")
    ),
    Yamdena(
        "jmd", 
        listOf("Yamdena"),
        listOf("ID")
    ),
    Yami(
        "tao", 
        listOf("Yami", "Pongso no Tao"),
        listOf("TW")
    ),
    Yemsa(
        "jnj", 
        listOf("Yemsa"),
        listOf("ET")
    ),
    Yupik_Naukan(
        "ynk", 
        listOf("Yupik (Naukan)", "Naukan Yupik"),
        listOf("RU")
    ),
    Yingkarta(
        "yia", 
        listOf("Yingkarta", "Yinggarda"),
        listOf("AU")
    ),
    Yankuntjatjara(
        "kdd", 
        listOf("Yankuntjatjara", "Yankunytjatjara"),
        listOf("AU")
    ),
    Yanomámi(
        "wca", 
        listOf("Yanomámi"),
        listOf("BR")
    ),
    Yansi(
        "yns", 
        listOf("Yansi"),
        listOf("CD")
    ),
    Yanyuwa(
        "jao", 
        listOf("Yanyuwa"),
        listOf("AU")
    ),
    Yoruba(
        "yor", 
        listOf("Yoruba", "Èdè Yorùbá"),
        listOf("NG", "BJ")
    ),
    Yaqay(
        "jaq", 
        listOf("Yaqay"),
        listOf("ID")
    ),
    Yuracare(
        "yuz", 
        listOf("Yuracare"),
        listOf("BO")
    ),
    Yurimangí(
        null, 
        listOf("Yurimangí"),
        listOf("CO")
    ),
    Yaruro(
        "yae", 
        listOf("Yaruro", "Pumé"),
        listOf("VR")
    ),
    Yuruti(
        "yui", 
        listOf("Yuruti", "Yurutí", "Wajiaraye"),
        listOf("CO")
    ),
    Yupik_Sirenik(
        "ysr", 
        listOf("Yupik (Sirenik)", "Sirenik Yupik"),
        listOf("RU")
    ),
    Yukaghir_Tundra(
        "ykg", 
        listOf("Yukaghir (Tundra)", "Northern Yukaghir"),
        listOf("RU")
    ),
    Yuchi(
        "yuc", 
        listOf("Yuchi"),
        listOf("US")
    ),
    Yugh(
        "yuu", 
        listOf("Yugh"),
        listOf("RU")
    ),
    Yukulta(
        "gcd", 
        listOf("Yukulta", "Ganggalida"),
        listOf("AU")
    ),
    Yurok(
        "yur", 
        listOf("Yurok"),
        listOf("US")
    ),
    Yawuru(
        "ywr", 
        listOf("Yawuru"),
        listOf("AU")
    ),
    Yaygir(
        "xya", 
        listOf("Yaygir"),
        listOf("AU")
    ),
    Yorta_Yorta(
        "xyy", 
        listOf("Yorta Yorta"),
        listOf("AU")
    ),
    Beria(
        "zag", 
        listOf("Beria", "Zaghawa"),
        listOf("SD", "TD")
    ),
    Zapotec_Isthmus(
        "zai", 
        listOf("Zapotec (Isthmus)", "Isthmus Zapotec", "diidxazá"),
        listOf("MX")
    ),
    Zapotec_Juárez(
        "zaa", 
        listOf("Zapotec (Juárez)", "Sierra de Juárez Zapotec"),
        listOf("MX")
    ),
    Zapotec_Mixtepec(
        "zpm", 
        listOf("Zapotec (Mixtepec)", "Mixtepec Zapotec"),
        listOf("MX")
    ),
    Zande(
        "zne", 
        listOf("Zande", "Zande (individual language)"),
        listOf("SD", "CF", "CD")
    ),
    Zapotec_Mitla(
        "zaw", 
        listOf("Zapotec (Mitla)", "Mitla Zapotec", "Didxsaj"),
        listOf("MX")
    ),
    Zapotec_Quiegolani(
        "zpi", 
        listOf("Zapotec (Quiegolani)", "Santa María Quiegolani Zapotec"),
        listOf("MX")
    ),
    Zarma(
        "dje", 
        listOf("Zarma", "Zarmaciine"),
        listOf("NE")
    ),
    Zayse(
        "zay", 
        listOf("Zayse", "Zayse-Zergulla"),
        listOf("ET")
    ),
    Zazaki(
        "diq", 
        listOf("Zazaki", "Dimli (individual language)"),
        listOf("TR")
    ),
    Zoque_Chimalapa(
        "zoh", 
        listOf("Zoque (Chimalapa)", "Chimalapa Zoque"),
        listOf("MX")
    ),
    Zenaga(
        "zen", 
        listOf("Zenaga"),
        listOf("MR")
    ),
    Zoque_Francisco_León(
        "zos", 
        listOf("Zoque (Francisco León)", "Francisco León Zoque"),
        listOf("MX")
    ),
    Zhang_Zhung(
        "jna", 
        listOf("Zhang-Zhung", "Jangshung"),
        listOf("IN")
    ),
    Zhuang_Northern(
        "zgb", 
        listOf("Zhuang (Northern)", "Guibei Zhuang"),
        listOf("CN")
    ),
    Zimakani(
        "zik", 
        listOf("Zimakani"),
        listOf("PG")
    ),
    Zapotec_Ixtlan(
        "zpd", 
        listOf("Zapotec (Ixtlan)", "Southeastern Ixtlán Zapotec"),
        listOf("MX")
    ),
    Zaparo(
        "zro", 
        listOf("Zaparo", "Záparo"),
        listOf("PE", "EC")
    ),
    Zoque_Rayon(
        "zor", 
        listOf("Zoque (Rayon)", "Rayón Zoque"),
        listOf("MX")
    ),
    Zoque_Soteapan(
        "poi", 
        listOf("Zoque (Soteapan)", "Highland Popoluca"),
        listOf("MX")
    ),
    Zapotec_San_Lucas_Quiaviní(
        "zab", 
        listOf("Zapotec (San Lucas Quiaviní)", "Western Tlacolula Valley Zapotec"),
        listOf("MX")
    ),
    Zapotec_Texmelucan(
        "zpz", 
        listOf("Zapotec (Texmelucan)", "Texmelucan Zapotec"),
        listOf("MX")
    ),
    Zuni(
        "zun", 
        listOf("Zuni", "Shiwi’ma"),
        listOf("US")
    ),
    Zapotec_Yatzachi(
        "zav", 
        listOf("Zapotec (Yatzachi)", "Yatzachi Zapotec"),
        listOf("MX")
    ),
    Zapotec_Zoogocho(
        "zpq", 
        listOf("Zapotec (Zoogocho)", "Zoogocho Zapotec"),
        listOf("MX")
    ),
    Arabic_Abbéché_Chad(
        "shu", 
        listOf("Arabic (Abbéché Chad)", "Chadian Arabic", "العربية‎ (Alearabia)", "Arabic (Borno Nigerian)"),
        listOf("TD", "NG")
    ),
    Arabic_Beirut(
        "apc", 
        listOf("Arabic (Beirut)", "North Levantine Arabic", "اللهجة العربيّة السورىّة‎ (El-lahjeẗ el-‛arabīyeẗ es-sūrīyé)", "Arabic (North Levantine Spoken)", "Arabic (Lebanese)", "Arabic (Syrian)"),
        listOf("LB", "SY")
    ),
    Adyghe_Temirgoy(
        "ady", 
        listOf("Adyghe (Temirgoy)", "Adyghe", "Адыгабзэ‎ (Adəgăbză)", "Adyghe (Abzakh)", "Adyghe (Shapsugh)"),
        listOf("RU")
    ),
    Aleut_Eastern(
        "ale", 
        listOf("Aleut (Eastern)", "Aleut", "Unangam tunnu"),
        listOf("US")
    ),
    Anguthimri(
        "lnj", 
        listOf("Anguthimri", "Leningitij", "Linngithig"),
        listOf("AU")
    ),
    Alsatian(
        "gsw", 
        listOf("Alsatian", "Swiss German", "Schwiizertüütsch", "German (Bern)", "German (Ostschweiz)", "German (Appenzell)", "German (Thurgau)", "German (Zurich)"),
        listOf("FR", "CH")
    ),
    Amdo(
        "adx", 
        listOf("Amdo", "Amdo Tibetan", "Amdo (Themchen)"),
        listOf("CN", "NP")
    ),
    Arabic_Palestinian(
        "ajp", 
        listOf("Arabic (Palestinian)", "South Levantine Arabic", "Arabic (Negev)"),
        listOf("PS", "IL")
    ),
    A_Pucikwar(
        "apq", 
        listOf("A-Pucikwar", "Great Andamanese"),
        listOf("IN")
    ),
    Arabic_Gulf(
        "afb", 
        listOf("Arabic (Gulf)", "Gulf Arabic", "خليجي‎ (Khaliji)", "Arabic (Kuwaiti)"),
        listOf("IQ", "SA", "OM", "QA", "KW", "IR", "BH")
    ),
    Armenian_Eastern(
        "hye", 
        listOf("Armenian (Eastern)", "Armenian", "հայերեն", "Armenian (Western)", "Armenian (Iranian)"),
        listOf("AM", "TR", "IR")
    ),
    Arrernte(
        "are", 
        listOf("Arrernte", "Western Arrarnta", "Arrente", "Arrernte (Western)"),
        listOf("AU")
    ),
    Azerbaijani(
        "azb", 
        listOf("Azerbaijani", "South Azerbaijani", "آذربایجان دیلی‎ (Azərbaycan dili)", "آذربایجانجا‎ (Azərbaycanca)", "Azari (Iranian)"),
        listOf("AZ", "IR", "IQ")
    ),
    Bachamal(
        "wdj", 
        listOf("Bachamal", "Wadjiginy", "Pungupungu"),
        listOf("AU")
    ),
    Bari(
        "bfa", 
        listOf("Bari", "Kuku", "Kukú"),
        listOf("SD")
    ),
    Bandjalang_Casino(
        "bdy", 
        listOf("Bandjalang (Casino)", "Bandjalang", "Bandjalang (Waalubal)", "Bandjalang (Yugumbir)", "Gidabal"),
        listOf("AU")
    ),
    Bhumij(
        "unr", 
        listOf("Bhumij", "Mundari"),
        listOf("IN")
    ),
    Binga(
        "yul", 
        listOf("Binga", "Yulu"),
        listOf("SD", "CF")
    ),
    Bakundu(
        "bdu", 
        listOf("Bakundu", "Oroko", "Londo"),
        listOf("CM")
    ),
    Bena_Lulua(
        "lua", 
        listOf("Bena-Lulua", "Luba-Lulua", "Tshiluba", "CiLuba"),
        listOf("CD")
    ),
    Berber_Middle_Atlas(
        "tzm", 
        listOf("Berber (Middle Atlas)", "Central Atlas Tamazight", "Tamaziɣt n laṭlaṣ", "Berber (Ayt Seghrouchen Middle Atlas)"),
        listOf("MA")
    ),
    Banawá(
        "jaa", 
        listOf("Banawá", "Jamamadí", "Jamamadi", "Jarawara"),
        listOf("BR")
    ),
    Bilinarra(
        "nbj", 
        listOf("Bilinarra", "Ngarinman", "Ngarinyman"),
        listOf("AU")
    ),
    Bori(
        "adi", 
        listOf("Bori", "Adi", "Bokar", "Galo", "Milang"),
        listOf("IN")
    ),
    Basque_Bidasoa_Valley(
        "eus", 
        listOf("Basque (Bidasoa Valley)", "Basque", "euskara", "Basque (Gernica)", "Basque (Hondarribia)", "Basque (Basaburua and Imoz)", "Basque (Lekeitio)", "Basque (Northern High Navarrese)", "Basque (Oñati)", "Basque (Roncalese)", "Basque (Sakana)", "Basque (Zeberio)", "Basque (Souletin)"),
        listOf("ES", "FR")
    ),
    Chai(
        "suq", 
        listOf("Chai", "Suri", "Tirmaga"),
        listOf("ET")
    ),
    Chaha(
        "sgw", 
        listOf("Chaha", "Sebat Bet Gurage", "Muher"),
        listOf("ET")
    ),
    Chaozhou(
        "nan", 
        listOf("Chaozhou", "Min Nan Chinese", "闽南语‎ (Minnanyu)", "Hokkien", "Taiwanese", "Xiamen"),
        listOf("CN", "TW")
    ),
    Canela_Krahô(
        "xra", 
        listOf("Canela-Krahô", "Krahô"),
        listOf("BR")
    ),
    Chaldean_Modern(
        "cld", 
        listOf("Chaldean (Modern)", "Chaldean Neo-Aramaic", "Neo-Aramaic (Amadiya)"),
        listOf("IQ")
    ),
    Chemehuevi(
        "ute", 
        listOf("Chemehuevi", "Ute-Southern Paiute", "Paiute (Southern)", "Ute"),
        listOf("US")
    ),
    Rumsien(
        "css", 
        listOf("Rumsien", "Southern Ohlone", "Mutsun"),
        listOf("US")
    ),
    Chippewa_Red_Lake_and_Pillager(
        "ciw", 
        listOf("Chippewa (Red Lake and Pillager)", "Chippewa", "Ojibwe (Minnesota)"),
        listOf("US")
    ),
    Carijona(
        "cbd", 
        listOf("Carijona", "Hianacoto", "Umaua"),
        listOf("CO")
    ),
    Creek(
        "mus", 
        listOf("Creek", "Seminole"),
        listOf("US")
    ),
    Chatino_Sierra_Occidental(
        "ctp", 
        listOf("Chatino (Sierra Occidental)", "Western Highland Chatino", "Cha’ jna’a", "Chatino (Yaitepec)"),
        listOf("MX")
    ),
    Dan(
        "daf", 
        listOf("Dan", "Dan (Blowo)"),
        listOf("LR", "GN", "CI")
    ),
    Dutch_Brabantic(
        "nld", 
        listOf("Dutch (Brabantic)", "Dutch", "Nederlands", "Dutch (Limburg)"),
        listOf("BE", "NL")
    ),
    Dhuwal_Dätiwuy(
        "duj", 
        listOf("Dhuwal (Dätiwuy)", "Djapu"),
        listOf("AU")
    ),
    Dadjriwalé(
        "god", 
        listOf("Dadjriwalé", "Godié"),
        listOf("CI")
    ),
    Dla_Proper(
        "kbv", 
        listOf("Dla (Proper)", "Dera (Indonesia)", "Dla (Menggwa)"),
        listOf("PG", "ID")
    ),
    Diegueño_Mesa_Grande(
        "dih", 
        listOf("Diegueño (Mesa Grande)", "Kumiai", "Tiipay (Jamul)"),
        listOf("MX", "US")
    ),
    Doko(
        "ngc", 
        listOf("Doko", "Ngombe (Democratic Republic of Congo)", "Ngombe"),
        listOf("CD")
    ),
    Evenki(
        "evn", 
        listOf("Evenki", "Solon"),
        listOf("RU", "CN")
    ),
    Ewe_Anglo(
        "ewe", 
        listOf("Ewe (Anglo)", "Ewe", "Eʋegbe"),
        listOf("GH", "TG")
    ),
    Fula_Burkina_Faso(
        "fuh", 
        listOf("Fula (Burkina Faso)", "Western Niger Fulfulde", "Fulfulde", "Ful (Liptako)"),
        listOf("BF")
    ),
    Frisian_Eastern(
        "frs", 
        listOf("Frisian (Eastern)", "Eastern Frisian", "Frisian"),
        listOf("DE", "NL")
    ),
    Fulani_Gombe(
        "fub", 
        listOf("Fulani (Gombe)", "Adamawa Fulfulde", "Fulfulde", "Fula (Cameroonian)"),
        listOf("NG", "CM")
    ),
    Fijian(
        "fij", 
        listOf("Fijian", "Nadroga"),
        listOf("FJ")
    ),
    Fiote(
        "kng", 
        listOf("Fiote", "Koongo", "Kikoongo", "Kongo"),
        listOf("CD")
    ),
    Fula_Mauritanian(
        "fuc", 
        listOf("Fula (Mauritanian)", "Pulaar", "Fula (Senegal)"),
        listOf("MR", "SN")
    ),
    Gamo(
        "gmo", 
        listOf("Gamo", "Kullo"),
        listOf("ET")
    ),
    German_Upper_Austrian(
        "bar", 
        listOf("German (Upper Austrian)", "Bavarian", "Boarisch", "German (Bavarian)", "German (Viennese)"),
        listOf("AT", "DE")
    ),
    German_Berlin(
        "deu", 
        listOf("German (Berlin)", "German", "Deutsch", "German (Hannover)", "German (Mansfeldisch)", "German (Thuringian)", "German (Timisoara)"),
        listOf("DE", "AT", "CH", "RO")
    ),
    Greek_Cypriot(
        "ell", 
        listOf("Greek (Cypriot)", "Greek", "Ελληνικά", "Greek (Modern)"),
        listOf("CY", "GR")
    ),
    Guadeloupe_Creole(
        "gcf", 
        listOf("Guadeloupe Creole", "Guadeloupean Creole French", "Martinique Creole"),
        listOf("GP", "MQ")
    ),
    Guahibo(
        "guh", 
        listOf("Guahibo", "Hivi", "Sikuani"),
        listOf("CO")
    ),
    Gamilaraay(
        "kld", 
        listOf("Gamilaraay", "Yuwaalaraay"),
        listOf("AU")
    ),
    Greenlandic_East(
        "kal", 
        listOf("Greenlandic (East)", "Kalaallisut", "kalaallisut", "Greenlandic (West)", "Greenlandic (South)"),
        listOf("GL")
    ),
    Gurma(
        "gux", 
        listOf("Gurma", "Gourmanchéma", "Gourma", "Gurma (Togo)"),
        listOf("BF")
    ),
    Gyarong_Cogtse(
        "jya", 
        listOf("Gyarong (Cogtse)", "Jiarong", "rGyalrong (Caodeng)"),
        listOf("CN")
    ),
    Havasupai(
        "yuf", 
        listOf("Havasupai", "Havasupai-Walapai-Yavapai", "Hualapai", "Yavapai"),
        listOf("US")
    ),
    Hebrew_Modern_Ashkenazic(
        "heb", 
        listOf("Hebrew (Modern Ashkenazic)", "Hebrew", "עברית", "Hebrew (Modern)"),
        listOf("IL")
    ),
    Halkomelem_Island(
        "hur", 
        listOf("Halkomelem (Island)", "Halkomelem", "Halkomelem (Upriver)", "Musqueam"),
        listOf("CA")
    ),
    Huitoto_Minica(
        "hto", 
        listOf("Huitoto (Minica)", "Minica Huitoto", "Huitoto"),
        listOf("CO", "PE")
    ),
    Hua(
        "ygr", 
        listOf("Hua", "Yagaria"),
        listOf("PG")
    ),
    Italian_Fiorentino(
        "ita", 
        listOf("Italian (Fiorentino)", "Italian", "italiano"),
        listOf("IT", "CH")
    ),
    Indonesian(
        "ind", 
        listOf("Indonesian", "Indonesia", "Indonesian (Jakarta)"),
        listOf("ID")
    ),
    Inuktitut_Rankin_Inlet(
        "ikt", 
        listOf("Inuktitut (Rankin Inlet)", "Inuinnaqtun", "ᐃᓄᐃᓐᓇᖅᑐᓐ‎ (Inuvialuktun)", "Kangiryuarmiut"),
        listOf("CA")
    ),
    Inuktitut_Salluit(
        "ike", 
        listOf("Inuktitut (Salluit)", "Eastern Canadian Inuktitut", "ᐃᓄᒃᑎᑐᑦ‎ (Inuktitut)", "Inuktitut (Quebec-Labrador)"),
        listOf("CA")
    ),
    Irish_Donegal(
        "gle", 
        listOf("Irish (Donegal)", "Irish", "Gaeilge", "Irish (Munster)"),
        listOf("IE")
    ),
    Ivatan(
        "ivv", 
        listOf("Ivatan", "Ivatan (Southern)"),
        listOf("PH")
    ),
    Jad(
        "bod", 
        listOf("Jad", "Tibetan", "བོད་སྐད་", "Rang Pas", "Shigatse", "Spitian", "Tibetan (Dingri)", "Tibetan (Drokpa)", "Tibetan (Standard Spoken)", "Tibetan (Shigatse)", "Tibetan (Modern Literary)"),
        listOf("IN", "NP", "CN")
    ),
    Jugli(
        "nst", 
        listOf("Jugli", "Tase Naga", "Tangshang Naga", "Lungchang"),
        listOf("IN")
    ),
    Kadugli(
        "xtc", 
        listOf("Kadugli", "Katcha-Kadugli-Miri", "Katcha"),
        listOf("SD")
    ),
    Kirghiz_Fu_Yu(
        "kir", 
        listOf("Kirghiz (Fu-Yu)", "Kyrgyz", "кыргызча", "Kirghiz"),
        listOf("CN", "KG")
    ),
    Kham_Dege(
        "khg", 
        listOf("Kham (Dege)", "Khams Tibetan", "Kham (Tibetan) (Nangchen)"),
        listOf("CN")
    ),
    Kalmyk_Issyk_Kul(
        "xal", 
        listOf("Kalmyk (Issyk-Kul)", "Kalmyk", "хальмг‎ (Xaľmg)", "хальмг келн‎ (Xaľmg keln)", "Oirat"),
        listOf("KG", "RU", "CN", "MN")
    ),
    Kisi(
        "kss", 
        listOf("Kisi", "Southern Kisi", "Kisi (Southern)"),
        listOf("SL", "GN", "LR")
    ),
    Kurmanji(
        "kmr", 
        listOf("Kurmanji", "Northern Kurdish", "Kurdish (Central)"),
        listOf("TR", "IQ", "IR")
    ),
    Karanga(
        "sna", 
        listOf("Karanga", "Shona", "chiShona"),
        listOf("ZW")
    ),
    Kasem(
        "xsm", 
        listOf("Kasem", "Kàsim"),
        listOf("BF", "GH")
    ),
    Kashubian(
        "csb", 
        listOf("Kashubian", "Slovincian"),
        listOf("PL")
    ),
    Ketapang(
        "zlm", 
        listOf("Ketapang", "Malay (individual language)", "Bahasa Melayu", "ملايو‎ (Melayu)", "Malay (Kuala Lumpur)"),
        listOf("ID", "MY")
    ),
    Kunming(
        "cmn", 
        listOf("Kunming", "Mandarin Chinese", "普通话‎ (Putonghua)", "Mandarin"),
        listOf("CN")
    ),
    Krymchak(
        "uzn", 
        listOf("Krymchak", "Northern Uzbek", "O’zbek", "Uzbek (Northern)"),
        listOf("UA", "UZ")
    ),
    Kyuquot(
        "noo", 
        listOf("Kyuquot", "Nitinaht", "Nuuchahnulth"),
        listOf("CA")
    ),
    Komi_Zyrian(
        "kpv", 
        listOf("Komi-Zyrian", "Yazva"),
        listOf("RU")
    ),
    Lummi(
        "str", 
        listOf("Lummi", "Straits Salish", "Saanich", "Songish", "Sooke", "Salish (Samish Straits)", "Salish (Straits)"),
        listOf("US", "CA")
    ),
    Mandinka(
        "mnk", 
        listOf("Mandinka", "Mandinka (Gambian)"),
        listOf("ML", "SN", "GN", "GM")
    ),
    Miri_Hill(
        "mrg", 
        listOf("Miri (Hill):", "Mising"),
        listOf("IN")
    ),
    Miisiirii(
        "tma", 
        listOf("Miisiirii", "Tama (Chad)", "Tama"),
        listOf("TD", "SD")
    ),
    Mankon(
        "nge", 
        listOf("Mankon", "Ngemba"),
        listOf("CM")
    ),
    Mantjiltjara(
        "mpj", 
        listOf("Mantjiltjara", "Martu Wangka", "Yulparija"),
        listOf("AU")
    ),
    Moldavian(
        "ron", 
        listOf("Moldavian", "Romanian", "română"),
        listOf("MD", "RO")
    ),
    Mirniny(
        "nju", 
        listOf("Mirniny", "Ngadjunmaya", "Ngadjumaja"),
        listOf("AU")
    ),
    Mixtec_Chalcatongo(
        "mig", 
        listOf("Mixtec (Chalcatongo)", "San Miguel El Grande Mixtec", "Mixtec (San Miguel el Grande)", "Mixtec (Molinos)"),
        listOf("MX")
    ),
    Nubian_Dongolese(
        "kzh", 
        listOf("Nubian (Dongolese)", "Nubian (Kunuz)"),
        listOf("SD", "EG")
    ),
    Nenets(
        "yrk", 
        listOf("Nenets", "Nenets (Tundra)"),
        listOf("RU")
    ),
    Nevome(
        "ood", 
        listOf("Nevome", "Tohono O'odham", "Tohono O’otham", "O'odham"),
        listOf("MX", "US")
    ),
    Newari_Kathmandu(
        "new", 
        listOf("Newari (Kathmandu)", "Newari", "नेवाः भाय्‎ (Newah Bhaaye)", "Newar (Dolakha)"),
        listOf("NP")
    ),
    Ngangityemerri(
        "nam", 
        listOf("Ngan'gityemerri", "Ngankikurungkurr"),
        listOf("AU")
    ),
    Nicobarese(
        "ncb", 
        listOf("Nicobarese", "Central Nicobarese", "Nancowry"),
        listOf("IN")
    ),
    Nivkh(
        "niv", 
        listOf("Nivkh", "Gilyak", "Nivkh (South Sakhalin)"),
        listOf("RU")
    ),
    Nanumea(
        "tvl", 
        listOf("Nanumea", "Tuvalu", "Tuvaluan"),
        listOf("TV")
    ),
    Noghay(
        "nog", 
        listOf("Noghay", "Nogai", "Noghay (Karagash)", "Tatar-Noghay (Alabugat)", "Yurt Tatar"),
        listOf("RU")
    ),
    Occitan(
        "oci", 
        listOf("Occitan", "occitan", "Provençal"),
        listOf("FR")
    ),
    Oloh_Mangtangai(
        "nij", 
        listOf("Oloh Mangtangai", "Ngaju", "Pulopetak"),
        listOf("ID")
    ),
    Orig(
        "ras", 
        listOf("Orig", "Tegali", "Rashad"),
        listOf("SD")
    ),
    Patwin(
        "wit", 
        listOf("Patwin", "Wintu"),
        listOf("US")
    ),
    Quechua_Bolivian(
        "quh", 
        listOf("Quechua (Bolivian)", "South Bolivian Quechua", "Quechua (Cochabamba)"),
        listOf("BO")
    ),
    Romani_Ajia_Varvara(
        "rmn", 
        listOf("Romani (Ajia Varvara)", "Balkan Romani", "Romani (Bugurdzi)"),
        listOf("GR", "RS")
    ),
    Romani_Kalderash(
        "rmy", 
        listOf("Romani (Kalderash)", "Vlax Romani", "Romani", "Romani (Lovari)"),
        listOf("RS", "RO", "HU")
    ),
    Romansch(
        "roh", 
        listOf("Romansch", "Romansh", "rumantsch", "Romansch (Scharans)", "Romansch (Surmeiran)", "Romansch (Sursilvan)"),
        listOf("CH")
    ),
    Shoshone(
        "shh", 
        listOf("Shoshone", "Shoshoni", "Shoshone (Wind River)"),
        listOf("US")
    ),
    Slave(
        "xsl", 
        listOf("Slave", "South Slavey", "Deh Gáh Ghotie Zhatie", "Slavey"),
        listOf("CA")
    ),
    Sorbian_Upper(
        "hsb", 
        listOf("Sorbian (Upper)", "Upper Sorbian", "hornjoserbšćina", "Sorbian"),
        listOf("DE")
    ),
    Spanish(
        "spa", 
        listOf("Spanish", "español", "Spanish (Canary Islands)"),
        listOf("ES")
    ),
    Swedish(
        "swe", 
        listOf("Swedish", "svenska", "Swedish (Västerbotten)"),
        listOf("FI", "SE")
    ),
    Tuareg_Air(
        "thv", 
        listOf("Tuareg (Air)", "Tahaggart Tamahaq", "Tuareg (Ghat)", "Tuareg (Ahaggar)"),
        listOf("NE", "LY", "DZ")
    ),
    Talysh_Azerbaijan(
        "tly", 
        listOf("Talysh (Azerbaijan)", "Talysh", "Talysh (Southern)"),
        listOf("AZ", "IR")
    ),
    Tigré_Beni_Amer(
        "tig", 
        listOf("Tigré (Beni Amer)", "Tigre", "ትግረ", "Tigré"),
        listOf("ER")
    ),
    Tewa_Arizona(
        "tew", 
        listOf("Tewa (Arizona)", "Tewa (USA)", "Tewa (Rio Grande)", "Tewa (San Juan Pueblo)"),
        listOf("US")
    ),
    Turkic_East_Central_Xorasan(
        "kmz", 
        listOf("Turkic (East-Central Xorasan)", "Khorasani Turkish", "Turkic (West Xorasan)"),
        listOf("IR")
    ),
    Tatar_Mishar(
        "tat", 
        listOf("Tatar (Mishar)", "Tatar", "татар", "Tatar (Baraba)"),
        listOf("RU")
    ),
    Tamil(
        "tam", 
        listOf("Tamil", "தமிழ்", "Tamil (Spoken)"),
        listOf("LK", "IN")
    ),
    Toussian(
        "wib", 
        listOf("Toussian", "Southern Toussian", "Toussian (Win)"),
        listOf("BF")
    ),
    Tetun_Dili(
        "tet", 
        listOf("Tetun Dili", "Tetum", "Tetun"),
        listOf("TL")
    ),
    Tzeltal_Aguacatenango(
        "tzh", 
        listOf("Tzeltal (Aguacatenango)", "Tzeltal", "Bats’il k’op", "Tzeltal (Tenejapa)"),
        listOf("MX")
    ),
    Tzeltal_Bachajón(
        "tzb", 
        listOf("Tzeltal (Bachajón)", "Tzeltal"),
        listOf("MX")
    ),
    Welsh_Colloquial(
        "cym", 
        listOf("Welsh (Colloquial)", "Welsh", "Cymraeg"),
        listOf("GB")
    ),
    Wikchamni(
        "yok", 
        listOf("Wikchamni", "Yokuts", "Yokuts (Yaudanchi)", "Yawelmani"),
        listOf("US")
    ),
    Yupik_Chevak(
        "esu", 
        listOf("Yup'ik (Chevak)", "Central Alaskan Yupik", "Yup'ik (Central)", "Yup'ik (Norton Sound)"),
        listOf("US")
    ),
    Yiddish_Bessarabian(
        "ydd", 
        listOf("Yiddish (Bessarabian)", "Eastern Yiddish", "יידיש‎ (Yiddish)", "Yiddish", "Yiddish (Lodz)", "Yiddish (Lithuanian)"),
        listOf("MD", "LT", "PL", "DE", "BY", "UA")
    ),
    Yupik_St_Lawrence_Island(
        "ess", 
        listOf("Yupik (St. Lawrence Island)", "Central Siberian Yupik", "Yupik (Siberian)"),
        listOf("US", "RU")
    ),
    Zulu_Northern(
        "zul", 
        listOf("Zulu (Northern)", "Zulu", "isiZulu", "Zulu (Southern)"),
        listOf("ZA")
    ),
    Zoque_Copainalá(
        "zoc", 
        listOf("Zoque (Copainalá)", "Copainalá Zoque", "Zoque (Ostuacan)"),
        listOf("MX")
    )
}