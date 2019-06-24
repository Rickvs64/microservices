package com.webshop.webshopstoresservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WebshopStoresServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebshopStoresServiceApplication.class, args);
	}

}
