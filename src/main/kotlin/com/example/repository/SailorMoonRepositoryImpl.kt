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
            heartRate = 5.0
        ),
        Characters(
            id = 2,
            name ="Sailor Mars" ,
            image = "/images/mars.jpg",
            realName = "Rei Hino",
            birthday = "April 17",
            age = 16,
            species = "Human",
              heartRate = 5.0

        ),
        Characters(
            id = 3,
            name ="Sailor Mercury" ,
            image = "/images/mercury.jpg",
            realName = "Ami Mizuno",
            birthday = "September 10",
            age = 16,
            species = "Human",
            heartRate = 4.8

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
            heartRate = 4.5

        ),
        Characters(
            id = 5,
            name ="Sailor Pluto" ,
            image = "/images/pluto.jpg",
            realName = "Setsuna Meiou",
            birthday = "October 29",
            age = 19,
            species = "Human",
            heartRate = 4.2

        ),
        Characters(
            id = 6,
            name ="Sailor Saturn" ,
            image = "/images/saturn.jpg",
            realName = "Hotaru Tomoe",
            birthday = "January 6th",
            age = 14,
            species = "Human",
              heartRate = 4.1

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
              heartRate = 4.7

        ),
        Characters(
            id = 8,
            name ="Sailor Neptun" ,
            image = "/images/neptun.jpg",
            realName = "Michiru Kaiou",
            birthday = "March 6",
            age = 16,
            species = "Human",
            heartRate = 4.3

        ),
        Characters(
            id = 9,
            name ="Sailor Uranus" ,
            image = "/images/uranus.jpg",
            realName = "Haruka Tenou",
            birthday = "January 27th",
            age = 16,
            species = "Human",
            heartRate = 4.2

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
            heartRate = 2.9

        ),
        Characters(
            id = 11,
            name ="Sailor Cosmos" ,
            image = "/images/sailorcosmos.jpg",
            realName = "Sailor Cosmos",
            birthday = "June 30th",
            age = null,
            species = "Human",
            heartRate = 2.4

        ),
        Characters(
            id = 12,
            name ="Tuxedo Mask" ,
            image = "/images/mamoruchiba.jpg",
            realName = "Mamoru Chiba",
            birthday = "August 3rd",
            age = 18,
            species = "Human",
            heartRate = 5.0

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
            heartRate = 2.9

        ),
        Characters(
            id = 14,
            name ="Sailor Star Fighter" ,
            image = "/images/starFighter.jpg",
            realName = "Kou Seiya",
            birthday = "July 30",
            age = 16,
            species = "Kinmoku humanoid",
            heartRate = 2.8

        ),
        Characters(
            id = 15,
            name ="Sailor Star Maker" ,
            image = "/images/starMaker.jpg",
            realName = "Kou Taiki",
            birthday = "May 30",
            age = 16,
            species = "Kinmoku Humanoid",
            heartRate = 2.7

        )
    )

    override suspend fun gelAllCharacters(page: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "OK",
            prevPage = calculatePage(page)[PREV_PAGE_KEY],
            nextPage = calculatePage(page)[NEXT_PAGE_KEY],
            sailorMoon = chars[page]!!
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