package com.demo.mvc;

import javax.transaction.Transactional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@SpringBootApplication
@Transactional
@Configuration
@EnableAutoConfiguration
@EnableWebMvc
@ComponentScan({"com.demo.mvc"})
public class SpringBootSpringHibernateTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSpringHibernateTaskApplication.class, args);
	}

}