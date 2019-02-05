package com.fsd.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages= {"com.fsd.task.*"})
@EntityScan(value ="com.fsd.task.entity")
@EnableJpaRepositories(value = "com.fsd.task.repository")
public class FSDApplication {
	public static void main(String[] args) {
		SpringApplication.run(FSDApplication.class, args);
	}

}

