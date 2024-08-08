package com.MicroService1.Microservice_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class Microservice1Application {
	@GetMapping("/greeting")
   public String getMessage()
   {
	   return "welcome..... You ..........!";
   }
	public static void main(String[] args) {
		SpringApplication.run(Microservice1Application.class, args);
	}

}
