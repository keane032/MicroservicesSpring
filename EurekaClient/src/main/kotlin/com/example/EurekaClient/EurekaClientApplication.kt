package com.example.EurekaClient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@SpringBootApplication
@EnableEurekaClient
@RestController
class EurekaClientApplication

	fun main(args: Array<String>) {
		runApplication<EurekaClientApplication>(*args)
	}
