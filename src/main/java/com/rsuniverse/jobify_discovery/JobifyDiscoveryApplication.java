package com.rsuniverse.jobify_discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class JobifyDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobifyDiscoveryApplication.class, args);
	}

}
