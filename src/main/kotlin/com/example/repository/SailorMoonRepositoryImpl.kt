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
            name ="" ,
            image = "/images/moon.jpg",
            about = "",
            family = listOf()
        ),
        SailorMoonModel(
            id = 2,
            name ="" ,
            image = "/images/mars.jpg",
            about = "",
            family = listOf()
        ),
        SailorMoonModel(
            id = 3,
            name ="" ,
            image = "/images/mercury.jpg",
            about = "",
            family = listOf()
        )
    )
    override val page2 = listOf(
        SailorMoonModel(
            id = 4,
            name ="" ,
            image = "/images/jupiter.jpg",
            about = "",
            family = listOf()
        ),
        SailorMoonModel(
            id = 5,
            name ="" ,
            image = "/images/pluto.jpg",
            about = "",
            family = listOf()
        ),
        SailorMoonModel(
            id = 6,
            name ="" ,
            image = "/images/saturn.jpg",
            about = "",
            family = listOf()
        )
    )
    override val page3 = listOf(
        SailorMoonModel(
            id = 7,
            name ="" ,
            image = "/images/venus.jpg",
            about = "",
            family = listOf()
        ),
        SailorMoonModel(
            id = 8,
            name ="" ,
            image = "/images/neptun.jpg",
            about = "",
            family = listOf()
        ),
        SailorMoonModel(
            id = 9,
            name ="" ,
            image = "/images/uranus.jpg",
            about = "",
            family = listOf()
        )
    )
    override val page4 = listOf(
        SailorMoonModel(
            id = 10,
            name ="" ,
            image = "/images/sailorkakyuu.jpg",
            about = "",
            family = listOf()
        ),
        SailorMoonModel(
            id = 11,
            name ="" ,
            image = "/images/sailorcosmos.jpg",
            about = "",
            family = listOf()
        ),
        SailorMoonModel(
            id = 12,
            name ="" ,
            image = "/images/mamoruchiba.jpg",
            about = "",
            family = listOf()
        )
    )
    override val page5 = listOf(
        SailorMoonModel(
            id = 13,
            name ="" ,
            image = "/images/starFigher.jpg",
            about = "",
            family = listOf()
        ),
        SailorMoonModel(
            id = 14,
            name ="" ,
            image = "/images/starHealer.jpg",
            about = "",
            family = listOf()
        ),
        SailorMoonModel(
            id = 15,
            name ="" ,
            image = "/images/starMaker.jpg",
            about = "",
            family = listOf()
        )
    )

    override suspend fun gelAllCharacters(page: Int): ApiResponse {
        TODO("Not yet implemented")
    }

    override suspend fun searchCharacters(name: String): ApiResponse {
        TODO("Not yet implemented")
    }
}