package com.zhuo.event;

import org.springframework.aop.framework.AdvisedSupportListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(App.class, args);
//		run.addApplicationListener(new MyApplicationListener());
		run.publishEvent(new MyApplicationEvent(new Object()));
		System.out.println("--------end-------------");
		run.close();
	}
}
