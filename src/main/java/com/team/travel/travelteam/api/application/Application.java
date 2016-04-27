package com.team.travel.travelteam.api.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.team.travel.travelteam.api")
@EnableJpaRepositories("com.team.travel.travelteam.api.data.repository")
@EntityScan(basePackages = "com.team.travel.travelteam.api.data.entities")
public class Application{

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
