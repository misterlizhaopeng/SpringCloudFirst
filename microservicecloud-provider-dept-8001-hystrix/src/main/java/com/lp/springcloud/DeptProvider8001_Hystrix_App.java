package com.lp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient//本微服务启动后，会自动注册到Eureka服务中心
@EnableDiscoveryClient //服务发现
@EnableHystrix//对hystrixR熔断机制的支持
public class DeptProvider8001_Hystrix_App {
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8001_Hystrix_App.class, args);
	}
}