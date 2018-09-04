package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:jdbc.properties")
@PropertySource("e:/temp/jdbc.properties")
public class fileConfig {

	

}
