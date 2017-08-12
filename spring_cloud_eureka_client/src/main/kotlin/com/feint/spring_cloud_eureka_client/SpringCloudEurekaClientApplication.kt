package com.feint.spring_cloud_eureka_client

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class SpringCloudEurekaClientApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringCloudEurekaClientApplication::class.java, *args)
}
