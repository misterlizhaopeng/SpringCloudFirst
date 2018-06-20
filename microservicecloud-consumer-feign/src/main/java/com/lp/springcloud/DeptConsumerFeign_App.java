package com.lp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.lp.springcloud"})
@ComponentScan("com.lp.springcloud")
@EnableHystrix//对hystrix熔断机制的支持
public class DeptConsumerFeign_App {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumerFeign_App.class, args);
	}
}
