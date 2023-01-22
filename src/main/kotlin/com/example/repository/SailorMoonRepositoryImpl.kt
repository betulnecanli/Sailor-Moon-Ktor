package com.example.repository

import com.example.models.ApiResponse
import com.example.models.SailorMoonModel

class SailorMoonRepositoryImpl(

) : SailorMoonRepository {

    override val chars: Map<Int, SailorMoonModel>
        get() {
            TODO()
        }
    override val page1: List<SailorMoonModel>
        get() {
            TODO()
        }
    override val page2: List<SailorMoonModel>
        get() {
            TODO()
        }
    override val page3: List<SailorMoonModel>
        get() {
            TODO()
        }
    override val page4: List<SailorMoonModel>
        get() {
            TODO()
        }
    override val page5: List<SailorMoonModel>
        get() {
            TODO()
        }

    override suspend fun gelAllCharacters(page: Int): ApiResponse {
        TODO("Not yet implemented")
    }

    override suspend fun searchCharacters(name: String): ApiResponse {
        TODO("Not yet implemented")
    }
}