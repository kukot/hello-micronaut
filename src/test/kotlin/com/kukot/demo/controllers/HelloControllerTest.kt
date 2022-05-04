package com.kukot.demo.controllers

import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

@MicronautTest
class HelloControllerTest {

    @Test
    fun test_display_name() {
        println("Hello")
    }

}