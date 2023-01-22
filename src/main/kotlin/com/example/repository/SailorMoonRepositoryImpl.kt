package com.example.repository

import com.example.models.ApiResponse
import com.example.models.SailorMoonModel

class SailorMoonRepositoryImpl(

) : SailorMoonRepository {

    override val chars: Map<Int, List<SailorMoonModel>> by lazy{
        mapOf(
            1 to page1,
            2 to page2,
            3 to page3,
            4 to page4,
            5 to page5
        )
    }
    override val page1 = listOf(
        SailorMoonModel(
            id = 1,
            name ="Sailor Moon" ,
            image = "/images/moon.jpg",
            realName = "",
            birthday = "",
            age = 1,
            species = ""
        ),
        SailorMoonModel(
            id = 2,
            name ="Sailor Mars" ,
            image = "/images/mars.jpg",
            realName = "",
            birthday = "",
            age = 1,
            species = ""

        ),
        SailorMoonModel(
            id = 3,
            name ="" ,
            image = "/images/mercury.jpg",
            realName = "",
            birthday = "",
            age = 1,
            species = ""

        )
    )
    override val page2 = listOf(
        SailorMoonModel(
            id = 4,
            name ="" ,
            image = "/images/jupiter.jpg",
            realName = "",
            birthday = "",
            age = 1,
            species = ""

        ),
        SailorMoonModel(
            id = 5,
            name ="" ,
            image = "/images/pluto.jpg",
            realName = "",
            birthday = "",
            age = 1,
            species = ""

        ),
        SailorMoonModel(
            id = 6,
            name ="" ,
            image = "/images/saturn.jpg",
            realName = "",
            birthday = "",
            age = 1,
            species = ""

        )
    )
    override val page3 = listOf(
        SailorMoonModel(
            id = 7,
            name ="" ,
            image = "/images/venus.jpg",
            realName = "",
            birthday = "",
            age = 1,
            species = ""

        ),
        SailorMoonModel(
            id = 8,
            name ="" ,
            image = "/images/neptun.jpg",
            realName = "",
            birthday = "",
            age = 1,
            species = ""

        ),
        SailorMoonModel(
            id = 9,
            name ="" ,
            image = "/images/uranus.jpg",
            realName = "",
            birthday = "",
            age = 1,
            species = ""

        )
    )
    override val page4 = listOf(
        SailorMoonModel(
            id = 10,
            name ="" ,
            image = "/images/sailorkakyuu.jpg",
            realName = "",
            birthday = "",
            age = 1,
            species = ""

        ),
        SailorMoonModel(
            id = 11,
            name ="" ,
            image = "/images/sailorcosmos.jpg",
            realName = "",
            birthday = "",
            age = 1,
            species = ""

        ),
        SailorMoonModel(
            id = 12,
            name ="" ,
            image = "/images/mamoruchiba.jpg",
            realName = "",
            birthday = "",
            age = 1,
            species = ""

        )
    )
    override val page5 = listOf(
        SailorMoonModel(
            id = 13,
            name ="" ,
            image = "/images/starFigher.jpg",
            realName = "",
            birthday = "",
            age = 1,
            species = ""

        ),
        SailorMoonModel(
            id = 14,
            name ="" ,
            image = "/images/starHealer.jpg",
            realName = "",
            birthday = "",
            age = 1,
            species = ""

        ),
        SailorMoonModel(
            id = 15,
            name ="" ,
            image = "/images/starMaker.jpg",
            realName = "",
            birthday = "",
            age = 1,
            species = ""

        )
    )

    override suspend fun gelAllCharacters(page: Int): ApiResponse {
        TODO("Not yet implemented")
    }

    override suspend fun searchCharacters(name: String): ApiResponse {
        TODO("Not yet implemented")
    }
}