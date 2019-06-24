package com.webshop.webshoppromotionsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WebshopPromotionsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebshopPromotionsServiceApplication.class, args);
	}

}
