package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class SailorMoonModel(
        val id : Int,
        val name : String,
        val image : String,
        val realName : String,
        val birthday : String,
        val age : Int,
        val species : String
)
