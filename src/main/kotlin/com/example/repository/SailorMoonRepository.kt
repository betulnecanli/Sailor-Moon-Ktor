package com.example.repository

import com.example.models.ApiResponse
import com.example.models.SailorMoonModel

interface SailorMoonRepository {

    val chars : Map<Int, List<SailorMoonModel>>

    val page1 : List<SailorMoonModel>
    val page2 : List<SailorMoonModel>
    val page3 : List<SailorMoonModel>
    val page4 : List<SailorMoonModel>
    val page5 : List<SailorMoonModel>
    suspend fun gelAllCharacters(page : Int = 1 ) : ApiResponse
    suspend fun searchCharacters(name : String?) : ApiResponse
}