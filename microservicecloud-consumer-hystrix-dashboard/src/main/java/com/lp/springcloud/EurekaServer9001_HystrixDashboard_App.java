package com.lp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard // 开启仪表盘
public class EurekaServer9001_HystrixDashboard_App {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer9001_HystrixDashboard_App.class, args);
	}
}
