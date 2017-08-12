package com.feint.spring_cloud_eureka_client_consumer.controller

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.client.ServiceInstance
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

@RestController
class UserHelloController{
    val logger=LoggerFactory.getLogger(UserHelloController::class.java)
    @Autowired
    lateinit var restTemplate:RestTemplate
    @Autowired
    lateinit var loadBlance:LoadBalancerClient
    @GetMapping("/hello")
    fun useHello()=restTemplate.getForObject("http://client-provider/hello",String::class.java)
    @GetMapping("/balance")
    fun testBalance(){
        val instance:ServiceInstance=loadBlance.choose("client-provider");
        logger.info("host:${instance.host}\tport:${instance.port}\tserviceId:${instance.serviceId}")
    }
}