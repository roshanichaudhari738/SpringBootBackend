package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {
		"com.BusinessService","com.Controller"	
})
@EntityScan("com.beans")
@EnableJpaRepositories("com.Repository")
public class SpringbootmvcapplicationviewlayerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootmvcapplicationviewlayerApplication.class, args);
	}

}
