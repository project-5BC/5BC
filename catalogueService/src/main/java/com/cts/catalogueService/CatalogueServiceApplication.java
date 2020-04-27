package com.cts.catalogueService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.cts.catalogueService.feignProxy")
public class CatalogueServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogueServiceApplication.class, args);
	}

}
