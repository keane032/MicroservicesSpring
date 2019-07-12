package com.example.blog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class BlogApplication

fun main(args: Array<String>) {
	runApplication<BlogApplication>(*args)
}
