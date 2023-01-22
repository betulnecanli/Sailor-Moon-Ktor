package com.example.routes

import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*


fun Route.root(){
    get("/"){
        call.respond(
            message = "Welcome to Sailor Moon API",
            status = HttpStatusCode.OK
        )
    }
}