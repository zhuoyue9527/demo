package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(App.class, args);
	
		System.out.println(System.getProperty("file.encoding"));
		System.out.println(run.getBeansOfType(EncodingConvert.class));
	
		run.close();
	}
}
