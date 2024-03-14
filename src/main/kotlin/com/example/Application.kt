package com.example

import com.example.dao.DatabaseSingleton
import com.example.plugins.*
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    DatabaseSingleton.init()
    configureTemplating()
    configureRouting()
}
