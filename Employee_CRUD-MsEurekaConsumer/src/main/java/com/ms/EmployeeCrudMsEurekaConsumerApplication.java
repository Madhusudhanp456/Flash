package com.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EmployeeCrudMsEurekaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeCrudMsEurekaConsumerApplication.class, args);
	}

}
