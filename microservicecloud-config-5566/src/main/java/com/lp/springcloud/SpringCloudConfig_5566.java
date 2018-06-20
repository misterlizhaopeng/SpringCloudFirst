package com.lp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableConfigServer
@RestController
public class SpringCloudConfig_5566 {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfig_5566.class, args);
	}

	@RequestMapping("/ggg/ddd")
	public String getTestString() {
		return "lgggxxx";
	}
}
