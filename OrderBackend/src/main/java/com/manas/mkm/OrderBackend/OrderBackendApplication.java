package com.manas.mkm.OrderBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class OrderBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderBackendApplication.class, args);
	}
}
