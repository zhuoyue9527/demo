package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Jdbc {

	@Value("${url}")
	private String url ;
	@Value("${driverclass}")
	private String driverclass ;

	public void show() {
		System.out.println( url);
		System.out.println(driverclass);
	}
	
}
