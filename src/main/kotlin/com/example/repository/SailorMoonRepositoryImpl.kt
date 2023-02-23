package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Characters

const val NEXT_PAGE_KEY = "nextPage"
const val PREV_PAGE_KEY = "prevPage"
class SailorMoonRepositoryImpl(

) : SailorMoonRepository {

    override val chars: Map<Int, List<Characters>> by lazy{
        mapOf(
            1 to page1,
            2 to page2,
            3 to page3,
            4 to page4,
            5 to page5
        )
    }
    override val page1 = listOf(
        Characters(
            id = 1,
            name ="Sailor Moon" ,
            image = "/images/moon.jpg",
            realName = "Usagi Tsukino",
            birthday = "June 30th",
            age = 16,
            species = "Human",
            heartRate = 5.0,
            about = "Usagi Tsukino (月野 うさぎ, Tsukino Usagi) is the Sailor Guardian of love and justice: " +
                    "Sailor Moon (セーラームーン, Seeraa Muun). She is the reincarnation of Princess Serenity " +
                    "(プリンセス・セレニティ;Purinsesu Sereniti) and the titular character of the Pretty Guardian " +
                    "Sailor Moon manga."
        ),
        Characters(
            id = 2,
            name ="Sailor Mars" ,
            image = "/images/mars.jpg",
            realName = "Rei Hino",
            birthday = "April 17",
            age = 16,
            species = "Human",
            heartRate = 5.0,
            about = "Rei Hino (火野 レイ, Hino Rei) is the civilian identity and present-day incarnation of " +
                    "Sailor Mars (セーラーマーズ, Seera Maazu). She is a shrine priestess who lives at Hikawa Shrine" +
                    "with her Grandfather and the crows Phobos and Deimos in the manga."

        ),
        Characters(
            id = 3,
            name ="Sailor Mercury" ,
            image = "/images/mercury.jpg",
            realName = "Ami Mizuno",
            birthday = "September 10",
            age = 16,
            species = "Human",
            heartRate = 4.8,
            about = "Ami Mizuno (水野 亜美, Mizuno Ami) is the civilian identity and present-day incarnation of Sailor" +
                    " Mercury (セーラーマーキュリー, Seeraa Maakyurii)." +
                    " She is one of the four Inner Sailor Guardians and the second Senshi recruited " +
                    "by Luna in the manga."

        )
    )
    override val page2 = listOf(
        Characters(
            id = 4,
            name ="Sailor Jupiter" ,
            image = "/images/jupiter.jpg",
            realName = "Makoto Kino",
            birthday = "December 5",
            age = 15,
            species = "Human",
            heartRate = 4.5,
            about = "Makoto “Mako” Kino (木野 まこと, Kino Makoto) is the civilian identity and " +
                    "present-day incarnation of Sailor Jupiter (セーラージュピター, Seeraa Jupitaa) in the manga."

        ),
        Characters(
            id = 5,
            name ="Sailor Pluto" ,
            image = "/images/pluto.jpg",
            realName = "Setsuna Meiou",
            birthday = "October 29",
            age = 19,
            species = "Human",
            heartRate = 4.2,
            about = "Setsuna Meiou (冥王 せつな, Meiou Setsuna) is the civilian identity " +
                    "and present-day incarnation of Sailor Pluto (セーラープルート, Seera Puruuto)." +
                    " She is one of the Outer Senshi and the guardian of the Door of Space and Time."

        ),
        Characters(
            id = 6,
            name ="Sailor Saturn" ,
            image = "/images/saturn.jpg",
            realName = "Hotaru Tomoe",
            birthday = "January 6th",
            age = 14,
            species = "Human",
            heartRate = 4.1,
            about = "Hotaru Tomoe (土萠 ほたる, Tomoe Hotaru) is the daughter of Souichi Tomoe and Keiko Tomoe," +
                    " and the civilian identity and present-day incarnation of Sailor Saturn (セーラーサターン, " +
                    "Seeraa Sataan). She is a close friend of Chibiusa and the last of the Outer Sailor Guardians" +
                    " to awaken in the manga."

        )
    )
    override val page3 = listOf(
        Characters(
            id = 7,
            name ="Sailor Venus" ,
            image = "/images/venus.jpg",
            realName = "Minako Aino",
            birthday = "October 22",
            age = 16,
            species = "Human",
            heartRate = 4.7,
            about = "Minako Aino (愛野 美奈子, Aino Minako) is the present-day incarnation of Sailor Venus" +
                    " (セーラーヴィーナス, Sērā Vīnasu) and the civilian identity of Sailor V " +
                    "(セーラーV, Sērā Bui). Minako is the original Sailor Guardian, protagonist of Codename:" +
                    " Sailor V, and leader of the Inner Sailor Guardians in the Sailor Moon manga."

        ),
        Characters(
            id = 8,
            name ="Sailor Neptun" ,
            image = "/images/neptun.jpg",
            realName = "Michiru Kaiou",
            birthday = "March 6",
            age = 16,
            species = "Human",
            heartRate = 4.3,
            about = "Michiru Kaiou (海王 みちる, Kaiou Michiru) is the civilian identity " +
                    "and present-day incarnation of Sailor Neptune (セーラーネプチューン, Seeraa Nepuchuun)."

        ),
        Characters(
            id = 9,
            name ="Sailor Uranus" ,
            image = "/images/uranus.jpg",
            realName = "Haruka Tenou",
            birthday = "January 27th",
            age = 16,
            species = "Human",
            heartRate = 4.2,
            about = "Haruka Tenou (天王 はるか, Tenou Haruka) is the civilian identity and present-day " +
                    "incarnation of Sailor Uranus (セーラーウラヌス, Seeraa Uranusu)."

        )
    )
    override val page4 = listOf(
        Characters(
            id = 10,
            name ="Sailor Kakyuu" ,
            image = "/images/sailorkakyuu.jpg",
            realName = "Princess Kakyuu",
            birthday = "Unknown",
            age = null,
            species = "Kinmoku Humanoid",
            heartRate = 2.9,
            about = "Princess Kakyuu (火球皇女, Kakyuu Koujo) is the princess of the planet Kinmoku" +
                    " who fled to Earth after her planet was destroyed by the Shadow Galactica empire. " +
                    "She is also the civilian identity of Sailor Kakyuu (セーラー火球, Seeraa Kakyuu)."

        ),
        Characters(
            id = 11,
            name ="Sailor Cosmos" ,
            image = "/images/sailorcosmos.jpg",
            realName = "Sailor Cosmos",
            birthday = "June 30th",
            age = null,
            species = "Human",
            heartRate = 2.4,
            about = "Sailor Cosmos is a central figure in the final arc of Sailor Moon. " +
                    "She is a Sailor Guardian from the distant future who initially disguises herself" +
                    " as a small girl: Chibi Chibi. " +
                    "She reveals her true form in the last two acts of the manga."

        ),
        Characters(
            id = 12,
            name ="Tuxedo Mask" ,
            image = "/images/mamoruchiba.jpg",
            realName = "Mamoru Chiba",
            birthday = "August 3rd",
            age = 18,
            species = "Human",
            heartRate = 5.0,
            about = "Mamoru Chiba (地場 衛, Chiba Mamoru) is the reincarnation of Prince Endymion " +
                    "and Sailor Moon's love interest. He is the civilian identity of Tuxedo Mask " +
                    "(タキシード仮面, Takishīdo Kamen)."

        )
    )
    override val page5 = listOf(
        Characters(
            id = 13,
            name ="Sailor Star Healer" ,
            image = "/images/starHealer.jpg",
            realName = "Kou Yaten",
            birthday = "February 8th",
            age = 16,
            species = "Kinmoku Humanoid",
            heartRate = 2.9,
            about = "Kou Yaten (夜天光, Yaten Kou) is one of the members " +
                    "of the Three Lights and is the civilian identity of Sailor Star Healer " +
                    "(セーラースターヒーラー, Seeraa Sutaa Hiiraa) of the Sailor Starlights in the manga."

        ),
        Characters(
            id = 14,
            name ="Sailor Star Fighter" ,
            image = "/images/starFighter.jpg",
            realName = "Kou Seiya",
            birthday = "July 30",
            age = 16,
            species = "Kinmoku humanoid",
            heartRate = 2.8,
            about = "Kou Seiya (星野光) is one of the members of the Three Lights idol group " +
                    "and is the civilian identity of Sailor Star Fighter of the Sailor Starlights."

        ),
        Characters(
            id = 15,
            name ="Sailor Star Maker" ,
            image = "/images/starMaker.jpg",
            realName = "Kou Taiki",
            birthday = "May 30",
            age = 16,
            species = "Kinmoku Humanoid",
            heartRate = 2.7,
            about = "Kou Taiki (大気光, Taiki Kou) is one of the members of " +
                    "the Three Lights idol group and is the civilian identity of Sailor Star Maker " +
                    "(セーラースターメーカー, Seeraa Sutaa Meekaa) and part of the Sailor Starlights."

        )
    )

    override suspend fun gelAllCharacters(page: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "OK",
            prevPage = calculatePage(page)[PREV_PAGE_KEY],
            nextPage = calculatePage(page)[NEXT_PAGE_KEY],
            sailorMoon = chars[page]!!,
            lastUpdated = System.currentTimeMillis()
        )
    }

    private fun calculatePage(page : Int): Map<String, Int?> {
        var prevPage: Int? = page
        var nextPage: Int? = page
        if(page in 1..4){
            nextPage = nextPage?.plus(1)
        }
        if(page in 2..5){
            prevPage = prevPage?.minus(1)
        }
        if(page == 1){
            prevPage = null
        }
        if (page == 5){
            nextPage = null
        }
        return mapOf(PREV_PAGE_KEY to prevPage, NEXT_PAGE_KEY to nextPage)
    }

    override suspend fun searchCharacters(name: String?): ApiResponse {
        return ApiResponse(
            success = true,
            message = "OK",
            sailorMoon = findCharacters(name)
        )
    }

    private fun findCharacters(query : String?) : List<Characters>{
        val founded = mutableListOf<Characters>()
        return if(!query.isNullOrEmpty()){
            chars.forEach{(_, chars) ->
                chars.forEach{ char ->
                    if(char.name.lowercase().contains(query.lowercase())){
                        founded.add(char)
                    }
                }
            }
            founded
        }
        else{
            emptyList()
        }
    }
}