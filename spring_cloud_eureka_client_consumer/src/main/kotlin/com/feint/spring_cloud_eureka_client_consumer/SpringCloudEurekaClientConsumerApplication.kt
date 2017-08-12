package com.feint.spring_cloud_eureka_client_consumer

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
@EnableEurekaClient
class SpringCloudEurekaClientConsumerApplication{
    @Bean
    @LoadBalanced
    fun restTemplate():RestTemplate=RestTemplate()
}

fun main(args: Array<String>) {
    SpringApplication.run(SpringCloudEurekaClientConsumerApplication::class.java, *args)
}
