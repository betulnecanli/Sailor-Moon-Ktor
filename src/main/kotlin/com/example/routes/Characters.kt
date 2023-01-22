package com.example.routes

import com.example.models.ApiResponse
import com.example.repository.SailorMoonRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.characters(){

    val sailorMoonRepository : SailorMoonRepository by inject()

    get("/sailormoon/characters"){
       try {
           val page = call.request.queryParameters["page"]?.toInt() ?: 1
           require(page in 1..5)

           val apiResponse = sailorMoonRepository.gelAllCharacters(page)

           call.respond(message = apiResponse,
               status = HttpStatusCode.OK)

       }
       catch (e: NumberFormatException){
           call.respond(
               message = ApiResponse(success = false, message = "Only Numbers Allowed."),
               status = HttpStatusCode.BadRequest
           )
       }
        catch (e :IllegalArgumentException){
            call.respond(
                message = ApiResponse(success = false, message = "Heroes not found."),
                status = HttpStatusCode.BadRequest
            )
        }
    }
}