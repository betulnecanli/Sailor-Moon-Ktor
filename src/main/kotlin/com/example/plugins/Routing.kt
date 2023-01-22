package com.example.plugins

import com.example.routes.characters
import com.example.routes.root
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*

fun Application.configureRouting() {
    routing {
       root()
        characters()
        static("/images") {
            resources("/images")
        }
    }
}
