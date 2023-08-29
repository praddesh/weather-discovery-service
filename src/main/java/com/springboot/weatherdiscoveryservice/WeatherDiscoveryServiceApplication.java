package com.springboot.weatherdiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WeatherDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherDiscoveryServiceApplication.class, args);
	}

}
