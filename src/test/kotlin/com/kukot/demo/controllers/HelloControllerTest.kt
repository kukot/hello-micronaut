package com.kukot.demo.controllers

import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

@MicronautTest
class HelloControllerTest {

    @Test
    fun test_hello(@Client("/") client: HttpClient) {
        val message = client
            .toBlocking()
            .retrieve("/hello/Kevin")
        assertEquals("Hello, Kevin", message)
    }

}