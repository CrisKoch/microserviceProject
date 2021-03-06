package com.kochmann.hreurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HrEurekaServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(HrEurekaServer1Application.class, args);
	}

}
