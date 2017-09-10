package com.teststudy.springbootstudy.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Value("${id}")
    int id;

    @Value("${name}")
    String name;

    @Bean
    public Greet greet() {
        return new Greet(id, name);
    }

}
