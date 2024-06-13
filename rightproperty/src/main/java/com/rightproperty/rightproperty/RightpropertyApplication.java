package com.rightproperty.rightproperty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.rightproperty.repository")
@EntityScan("com.rightproperty.entity")
@ComponentScan("com.rightproperty.service")
@ComponentScan("com.rightproperty.controller")
@SpringBootApplication
public class RightpropertyApplication {

	public static void main(String[] args) {
		SpringApplication.run(RightpropertyApplication.class, args);
		System.out.println("Project running successfully");
	}

}
