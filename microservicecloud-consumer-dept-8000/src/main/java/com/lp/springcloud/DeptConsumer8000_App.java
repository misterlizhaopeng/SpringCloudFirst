package com.lp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.lp.myrule.MySelfRule;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "microservicecloud-dept", configuration = { MySelfRule.class })//microservicecloud-dept(小写的可以，到具体的服务spring.application.name的值) ; MICROSERVICECLOUD-DEPT(大写的服务名称下，自定义的不行)
//RibbonClient：表示请求那个服务，configuration表示通过自定义的配置规则；
// 注意，自定义的MySelfRule，不能在和主启动类同一个被扫描的包或者子包里面，所以此类所属的包为：com.lp.myrule;
public class DeptConsumer8000_App {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer8000_App.class, args);
	}
}
