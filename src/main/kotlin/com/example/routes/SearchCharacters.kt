package com.example.routes

import com.example.repository.SailorMoonRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.searchCharacters(){

    val sailorMoonRepository : SailorMoonRepository by inject()

        get("/sailormoon/characters/searchcharacters"){
            val name = call.request.queryParameters["name"]

            val apiResponse = sailorMoonRepository.searchCharacters(name)

            call.respond(
                message = apiResponse,
                status = HttpStatusCode.OK
            )

        }
}