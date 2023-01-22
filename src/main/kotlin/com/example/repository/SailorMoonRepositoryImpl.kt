package com.example.repository

import com.example.models.ApiResponse
import com.example.models.SailorMoonModel

class SailorMoonRepositoryImpl(
    override val chars: Map<Int, SailorMoonModel>,
    override val page1: List<SailorMoonModel>,
    override val page2: List<SailorMoonModel>,
    override val page3: List<SailorMoonModel>,
    override val page4: List<SailorMoonModel>,
    override val page5: List<SailorMoonModel>
) : SailorMoonRepository {
    override suspend fun gelAllCharacters(page: Int): ApiResponse {
        TODO("Not yet implemented")
    }

    override suspend fun searchCharacters(name: String): ApiResponse {
        TODO("Not yet implemented")
    }
}