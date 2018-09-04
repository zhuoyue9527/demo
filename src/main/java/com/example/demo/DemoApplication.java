package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		String ip = context.getEnvironment().getProperty("local.ip");
		System.out.println(ip);
		context.getBean(UserConfig.class).show();
		
		String name = context.getEnvironment().getProperty("name");
		String appName = context.getEnvironment().getProperty("app.name");
		
		System.out.println(name+appName);
		
		System.out.println("-----------------------------------------------------------");
		context.getBean(Jdbc.class).show();
		context.close();
	}
}
