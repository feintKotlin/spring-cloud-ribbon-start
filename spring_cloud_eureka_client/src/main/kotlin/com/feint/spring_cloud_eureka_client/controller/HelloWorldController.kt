package com.feint.spring_cloud_eureka_client.controller

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController{
    @GetMapping("/hello")
    fun sayHello()="Hello world";
}