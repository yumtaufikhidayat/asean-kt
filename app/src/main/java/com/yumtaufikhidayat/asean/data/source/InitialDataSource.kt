package com.yumtaufikhidayat.asean.data.source

import com.yumtaufikhidayat.asean.model.Country
import com.yumtaufikhidayat.asean.model.Profile

object InitialDataSource {
    fun listOfCountries(): ArrayList<Country> {
        val list = ArrayList<Country>()
        list.add(
            Country(
                countryId = 1,
                countryName = "Indonesia",
                countryInternationalName = "Republik Indonesia",
                countryFlag = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9f/Flag_of_Indonesia.svg/125px-Flag_of_Indonesia.svg.png",
                countryDescription = "Negara kepulauan dengan total penduduk sekitar 272.229.372 jiwa (per Juni 2021) ini memiliki wilayah yang ada di antara benua Asia dan Australia. Posisi geografis yang berada sebagai titik silang perekonomian dunia ini pun sangat berpengaruh terhadap aktivitas perdagangan Indonesia. Menelisik sejarahnya, Indonesia sempat mengalami pahitnya kolonialisme Belanda dan juga Jepang selama lebih dari 300 tahun. Setelah Jepang kalah di Perang Dunia II, Republik Indonesia akhirnya berdiri menjadi negara yang merdeka sejak 17 Agustus 1945. Setelah 76 tahun Indonesia merdeka, negara dengan ibu kota Jakarta ini dipimpin oleh Presiden Joko Widodo. Ini bukanlah kali pertama Presiden Joko Widodo menjabat sebagai kepala negara. Setelah masa jabatannya habis di tahun 2019, Joko widodo kembali memenangkan pemilihan umum di tahun yang sama. Republik dengan bentuk negara kesatuan ini memiliki ideologi Pancasila yang sekaligus menjadi pedoman bagi seluruh warganya. Berasas demokrasi, Indonesia memiliki sistem pemerintahan presidensial.",
                countryHeadGovernment = "Joko Widodo (Presiden)",
                countryCapital = "Jakarta",
                countryIndependenceDay = "17 Agustus",
                countryLanguage = "Bahasa Indonesia",
                countryCurrency = "Rupiah (IDR)",
                countryLandArea = "1.904.569 km²"
            )
        )
        list.add(
            Country(
                countryId = 2,
                countryName = "Thailand",
                countryInternationalName = "Kingdom of Thailand",
                countryFlag = "https://asset.kompas.com/crops/Wd4Blwo5HQZ9941XQ3qz9xEwjlk=/0x0:250x167/750x500/data/photo/2020/02/19/5e4d1bd77a5a9.jpg",
                countryDescription = "Negara yang dijuluki sebagai Negeri Gajah ini adalah negara ASEAN yang tidak pernah merasakan kolonialisme bangsa Eropa. Berbatasan dengan Laos dan Kamboja, Thailand memiliki sistem pemerintahan berbentuk monarki konstitusional. Hal ini menjadikan kepala negara Thailand adalah seorang raja. Perihal urusan kenegaraan dan pemerintahan, Thailand menyerahkan pekerjaan kepada seorang Perdana Menteri. Saat ini (2021), Prayut Chan-o-cha menduduki posisi sebagai perdana menteri Thailand sejak tahun 2014 silam. Sebelum tahun 1980, para elite militer mendominasi politik di Thailand. Namun setelah dekade 1980-an, parlemen yang terpilih mulai memiliki pengaruh dalam politik di sana. Majelis Nasional yang terpilih juga mulai mengambil alih kekuasaan pemerintahan Thailand di tahun 1992. Meskipun kekuasaan militer sudah tidak lagi berpengaruh di pemerintahan, Thailand sempat dilanda kisruh akibat dua kali kudeta pada tahun 2006-2007 dan 2014.",
                countryHeadGovernment = "Prayut Chan-o-cha (Perdana Menteri)",
                countryCapital = "Bangkok",
                countryIndependenceDay = "5 Desember",
                countryLanguage = "Thai",
                countryCurrency = "Baht (THB)",
                countryLandArea = "513.120 km²"
            )
        )
        list.add(
            Country(
                countryId = 3,
                countryName = "Brunei Darussalam",
                countryInternationalName = "Brunei Darussalam",
                countryFlag = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/Flag_of_Brunei.svg/2560px-Flag_of_Brunei.svg.png",
                countryDescription = "Negara mungil yang memiliki luas wilayah sekitar 5.765 km² ini memiliki standar hidup yang cukup tinggi, dan termasuk negara kaya di Asia. Sejak lama, Brunei mengandalkan minyak dan gas sebagai tulang punggung ekonomi. Terletak di bagian barat laut pulau Borneo (Kalimantan), Brunei adalah negara kesultanan Islam. Negara dengan ibu kota di Bandar Seri Begawan ini merdeka tahun 1984 setelah lama menjadi protektorat Inggris sejak 1888. Sistem pemerintahan Brunei berbentuk monarki absolut. Sultan sekaligus Perdana Menteri Brunei Darussalam saat ini adalah Hassanal Bolkiah. Budaya negara Brunei berakar kuat pada asal-usul melayunya yang juga tercermin dari gaya arsitektur, bahasa, dan adat. Maka itu, bahasa nasional Brunei adalah bahasa melayu, diikuti dengan bahasa Inggris sebagai bahasa kedua paling populer di negara tersebut. Brunei mulai resmi menjadi anggota ASEAN pada tahun 1984. Brunei bergabung menjadi anggota ASEAN setelah mendapatkan kemerdekaannya.",
                countryHeadGovernment = "Sultan Hassanal Bolkiah (Raja/Sultan/Perdana Menteri)",
                countryCapital = "Bandar Sri Begawan",
                countryIndependenceDay = "23 Februari",
                countryLanguage = "Melayu, Inggris, Mandarin",
                countryCurrency = "Dolar Brunei (BND)",
                countryLandArea = "5.765 km²"
            )
        )
        list.add(
            Country(
                countryId = 4,
                countryName = "Vietnam",
                countryInternationalName = "Socialist Republic Of Vietnam",
                countryFlag = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Flag_of_Vietnam.svg/250px-Flag_of_Vietnam.svg.png",
                countryDescription = "Negara Vietnam merupakan salah satu dari tiga negara terakhir yang resmi menjadi bagian dari ASEAN. Vietnam sebenarnya sudah menyatakan ketertarikannya untuk gabung dengan ASEAN sejak tahun 1992. Pada akhirnya, di tahun 1995, negara dengan ibu kota Hanoi itu mengikuti jejak kawan-kawannya di Asia Tenggara untuk bergabung dengan ASEAN. Bentuk negara Vietnam adalah sistem republik komunis, dengan Partai Komunis Vietnam tetap menjadi institusi politik yang dominan. Kepala negara Vietnam dijabat presiden, sementara urusan pemerintahan dipegang perdana menteri. Pham Minh Chinh baru saja terpilih jadi perdana menteri Vietnam pada April 2021, menggantikan Nguyễn Xuân Phúc. Perekonomian Vietnam yang berkembang pesat didukung oleh industri yang bergerak di bidang ritel, manufaktur, makanan, pertanian dan infrastruktur. Selain itu, sektor pariwisata juga menjadi salah satu kontributor terbesar bagi perekonomian Vietnam. Pada 2019, Vietnam dinobatkan sebagai Asia’s Leading Destination oleh WTA (World Travel Awards).",
                countryHeadGovernment = "Nguyễn Xuân Phúc (Perdana Menteri)",
                countryCapital = "Hanoi",
                countryIndependenceDay = "2 September",
                countryLanguage = "Vietnam",
                countryCurrency = "Dong (VND)",
                countryLandArea = "331.231 km²"
            )
        )
        list.add(
            Country(
                countryId = 5,
                countryName = "Malaysia",
                countryInternationalName = "Malaysia",
                countryFlag = "https://asset.kompas.com/crops/txVUgwjRJBYGDz5JUrwZs-Ep_8g=/0x0:250x125/780x390/data/photo/2020/02/19/5e4d1c91e29ec.jpg",
                countryDescription = "Sebagai salah satu dari lima negara pelopor ASEAN, negara tetangga Indonesia ini memiliki 13 negara bagian dan 3 wilayah federal. Setelah lepas dari jajahan Inggris, Malaysia sekarang menjadi bagian dari Commonwealth. Negara dengan ibu kota di Kuala Lumpur ini memiliki bahasa nasional yaitu Bahasa Malaysia, dengan mata uang Malaysian Ringgit. Saat ini, pemerintahan Malaysia menganut demokrasi parlementer dengan sistem monarki konstitusional. Oleh karena itu, raja berperan sebagai Kepala Negara sementara perdana menteri menduduki posisi sebagai kepala pemerintahan. Di akhir tahun 2020, populasi negara Malaysia mencapai 32,6 juta penduduk. Penduduk Malaysia datang dari berbagai kelompok etnis. Lebih dari 69% didominasi oleh bumiputera meliputi Orang Asli, Sarawak, Sabah dan penduduk asli Melayu.",
                countryHeadGovernment = "Ismail Sabri Yakob (Perdana Menteri)",
                countryCapital = "Kuala Lumpur",
                countryIndependenceDay = "31 Agustus",
                countryLanguage = "Melayu, Cina, Inggris, Tamil",
                countryCurrency = "Ringgit (MYR)",
                countryLandArea = "329.847 km²"
            )
        )
        list.add(
            Country(
                countryId = 6,
                countryName = "Laos",
                countryInternationalName = "Lao People's Democratic Republic",
                countryFlag = "https://asset.kompas.com/crops/1vwByzVDAIDujFeQ8VH38-nMKRM=/0x0:250x166/375x240/data/photo/2020/02/19/5e4d1d104c870.jpg",
                countryDescription = "Pada ulang tahun ASEAN yang ke-30, Laos memutuskan untuk bergabung dengan negara-negara Asia Tenggara lainnya di tahun 1997. Memiliki wilayah di jantung daratan Asia Tenggara, Laos adalah negara dengan populasi sekitar 7,169 juta penduduk. Menggantikan kerajaan Laos, Republik Demokratik Rakyat Laos didirikan pada Desember 1975. Dilansir dari laman UNDP, perkembangan Laos dalam pengentasan kemiskinan dapat dilihat secara signifikan selama dua dekade. Hal ini dibuktikan dengan data UNDP, bahwa tingkat kemiskinan turun 23% dari tahun 1992 hingga 2015. Laos memiliki sumber daya alam yang cukup melimpah. Sejumlah peninggalan bersejarah dan keindahan alam di Laos menjadikan negara ini populer bagi turis internasional.",
                countryHeadGovernment = "Thongloun Sisoulith (Perdana Menteri)",
                countryCapital = "Vientiane",
                countryIndependenceDay = "2 Desember",
                countryLanguage = "Lao, Prancis, Inggris",
                countryCurrency = "Kip (LAK)",
                countryLandArea = "237.955 km²"
            )
        )
        list.add(
            Country(
                countryId = 7,
                countryName = "Singapura",
                countryInternationalName = "Republic of Singapore",
                countryFlag = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Flag_of_Singapore.svg/1200px-Flag_of_Singapore.svg.png",
                countryDescription = "Selain Malaysia, Singapura juga menjadi salah satu negara ASEAN yang bergabung pada Commonwealth selepas merdeka dari Inggris. Singapura juga menjadi salah satu pelopor terbentuknya ASEAN. Negara pulau dengan populasi sekitar 5,7 juta penduduk ini memiliki ibu kota yang juga bernama Singapura. Ada empat bahasa resmi di Singapura, yakni Inggris, Mandarin, Melayu dan Tamil. Republik Parlementer merupakan bentuk pemerintahan Singapura, yang mana kepala negara dijabat oleh seorang presiden. Sementara itu, perdana menteri mempunyai peran sebagai kepala pemerintahan di Singapura. Lee Hsien Loong, anak tertua dari PM pertama Singapura yaitu Lee Kuan Yew, saat ini sedang menjabat sebagai perdana menteri. Loong sejak tahun 2014 hingga kini menyandang posisinya tersebut.",
                countryHeadGovernment = "Lee Hsien Loong (Perdana Menteri)",
                countryCapital = "Singapura",
                countryIndependenceDay = "9 Agustus",
                countryLanguage = "Inggris, Cina, Mandarin, Melayu, Tamil",
                countryCurrency = "Dolar Singapura (SGD)",
                countryLandArea = "721,5 km²"
            )
        )
        list.add(
            Country(
                countryId = 8,
                countryName = "Myanmar",
                countryInternationalName = "Republic of the Union of Myanmar",
                countryFlag = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8c/Flag_of_Myanmar.svg/2000px-Flag_of_Myanmar.svg.png",
                countryDescription = "Myanmar adalah negara terbesar di daratan Asia Tenggara. Myanmar memutuskan bergabung menjadi anggota resmi ASEAN pada Juli 1997. Sama dengan Laos, negara ini bergabung tepat pada ulang-tahun ASEAN ke-30. Wilayah Myanmar terletak di bagian barat daratan Asia Tenggara. Saat ini, populasi Myanmar mencapai 54,2 juta penduduk dengan ibu kota di Naypyitaw. Sebenarnya, bentuk pemerintahan Myanmar menganut sistem republik, dengan kepala negara seorang Presiden. Namun, Myanmar kini berada di bawah junta militer dan sampai pertengahan 2021 masih dilanda kemelut politik.",
                countryHeadGovernment = "Win Myint (Perdana Menteri)",
                countryCapital = "Nay Pyi Taw (Naypyidaw)",
                countryIndependenceDay = "4 Januari",
                countryLanguage = "Burma",
                countryCurrency = "Kyat (MMK)",
                countryLandArea = "676.578 km²"
            )
        )
        list.add(
            Country(
                countryId = 9,
                countryName = "Filipina",
                countryInternationalName = "Republic of the Philippines",
                countryFlag = "https://cdn.pixabay.com/photo/2012/04/10/22/58/philippines-26794_960_720.png",
                countryDescription = "Negara kepulauan yang terbentuk dari kurang lebih 7,000 pulau ini juga menjadi salah satu pelopor terbentuknya ASEAN. Terletak di sebelah barat lautan Pasifik, Filipina merupakan negara yang memiliki populasi mencapai lebih dari 109 juta penduduk pada tahun 2019. Selama kurang lebih 300 tahun, Filipina berada di bawah kolonialisme Spanyol. Pada tahun 1898, Filipina berhasil merdeka dari penjajahan Spanyol. Namun, AS merebut kekuasaan Spanyol di Filipina di perang Spanish-American War. Hal itu membuat Filipina dikuasai AS yang diikuti pecahnya perang Philippine-American War pada tahun 1899 hingga 1902. Invasi Spanyol dan Amerika memberikan banyak pengaruh terutama pada bahasa, agama dan gaya pemerintahan negara Filipina. Saat ini, Filipina menganut sistem demokrasi dan memiliki bentuk pemerintahan republik. Negara dengan ibu kota Manila itu menunjuk kepala negara yaitu Presiden melalui pemilu langsung.",
                countryHeadGovernment = "Rodrigo Duterte (Presiden)",
                countryCapital = "Manila",
                countryIndependenceDay = "12 Juni",
                countryLanguage = "Tagalog/Filipino, Inggris",
                countryCurrency = "Peso (PHP)",
                countryLandArea = "343.448 km²"
            )
        )
        list.add(
            Country(
                countryId = 10,
                countryName = "Kamboja",
                countryInternationalName = "Kingdom of Cambodia",
                countryFlag = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Flag_of_Cambodia.svg/2560px-Flag_of_Cambodia.svg.png",
                countryDescription = "Kamboja merupakan salah satu negara terakhir yang diterima menjadi bagian dari ASEAN di tahun 1999. Negara Kamboja terkenal sebagai pengekspor garmen. Sektor pariwisata Kamboja pun cukup kuat. Hal ini menjadikan Kamboja salah satu negara dengan pertumbuhan ekonomi pesat di Asia Tenggara. Ibu kota Kamboja yang terletak di Phnom Penh dulu dijuluki sebagai mutiara Asia. Julukan tersebut diberikan karena kota Phnom Penh menjadi pusat ekonomi, komersial, budaya dan wisata negara Kamboja. Kamboja menganut sistem monarki konstitusional dengan bentuk pemerintahan kerajaan. Sistem ini menjadikan raja sebagai kepala negara, sementara pemerintahan dipimpin oleh perdana menteri. Kini, Norodom Sihamoni adalah raja Kamboja sejak meneruskan tahta sang ayah pada 2004.",
                countryHeadGovernment = "Hun Sen (Perdana Menteri)",
                countryCapital = "Phnom Penh",
                countryIndependenceDay = "9 November",
                countryLanguage = "Khmer, Prancis, Inggris",
                countryCurrency = "Riel (KHR)",
                countryLandArea = "181.035 km²"
            )
        )
        return list
    }

    fun getProfile(): Profile {
        return Profile(
            profileName = "Taufik Hidayat",
            profileJob = "Android Developer",
            profileDesc = "Taufik merupakan lulusan Teknik Informatika dari Institut Teknologi Telkom Purwokerto. Sejak kuliah, ia mendirikan Belajar LibreOffice Indonesia (BLOI), komunitas online/virtual di Telegram dan memiliki 1000+ anggota yang berfokus untuk membantu sesama dalam mempelajari software LibreOffice dan penyelesaian isu terkait LibreOffice.\n\n" +
                    "Di waktu luang, ia belajar dan berlatih dengan mengambil kursus pengembangan Android dari Dicoding Indonesia untuk belajar teknologi terkini seputar Android serta meningkatkan dan mempertajam keahlian Android-nya sesuai dengan kebutuhan industri. Ia juga suka dan belajar terkait UI/UX design untuk membangun UI/UX aplikasi Android yang lebih baik serta meningkatkan kemampuan UI/UX-nya.\n\n" +
                    "Saat ini, ia bekerja sebagai External Code Reviewer pada learning path Android di Dicoding Indonesia.",
            profileEmail = "yumtaufikhidayat@gmail.com",
            profileOffice = "Dicoding Indonesia"
        )
    }
}