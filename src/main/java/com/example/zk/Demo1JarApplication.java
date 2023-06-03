package com.example.zk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication()
@ComponentScan("com")
@EntityScan("com")
@EnableJpaRepositories("com")
@ComponentScan("com")
public class Demo1JarApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo1JarApplication.class, args);
	}

}
