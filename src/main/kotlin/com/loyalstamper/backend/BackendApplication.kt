package com.loyalstamper.backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.loyalstamper.backend.repositories"])
class BackendApplication

fun main(args: Array<String>) {
	runApplication<BackendApplication>(*args)
}