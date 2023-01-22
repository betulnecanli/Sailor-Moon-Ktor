package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class SailorMoonModel(
        val id : Int,
        val name : String,
        val image : String,
        val about : String,
        val family : List<String>
)
