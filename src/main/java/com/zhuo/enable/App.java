package com.zhuo.enable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

//@SpringBootApplication
@EnableConfigurationProperties
@EnableAsync
@ComponentScan
public class App {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(App.class, args);
	
		System.out.println(run.getBean(TomcatProperties.class));
		run.getBean(Jeep.class).run();
		System.out.println("--------end-------------");
		run.close();
	}
}
