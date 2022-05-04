package com.kukot.demo

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com/kukot/demo/")
		.start()
}

