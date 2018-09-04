package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class UserConfig {
    
	@Value("${local.ip}")
	private String ip ;
	
	private Integer port ;
	
	@Value("${tomcatPort:9090}")
	private String tomcatPort;
	
	@Autowired
	private Environment env ;
	
	public void show() {
		System.out.println("local.ip:======"+env.getProperty("local.ip"));
		System.out.println("ip++"+ip);
		System.out.println("tomcatPort++"+tomcatPort);
	}

}
