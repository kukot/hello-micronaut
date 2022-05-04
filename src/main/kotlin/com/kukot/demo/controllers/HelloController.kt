package com.kukot.demo.controllers

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/hello")
class HelloController {

    @Get(uri = "/{name}", produces = [MediaType.TEXT_PLAIN])
    fun hello(name: String): String {
        return "Hello, $name"
    }
}