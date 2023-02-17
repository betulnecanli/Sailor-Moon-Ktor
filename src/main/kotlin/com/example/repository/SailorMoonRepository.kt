package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Characters

interface SailorMoonRepository {

    val chars : Map<Int, List<Characters>>

    val page1 : List<Characters>
    val page2 : List<Characters>
    val page3 : List<Characters>
    val page4 : List<Characters>
    val page5 : List<Characters>
    suspend fun gelAllCharacters(page : Int = 1 ) : ApiResponse
    suspend fun searchCharacters(name : String?) : ApiResponse
}