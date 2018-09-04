package com.zhuo.enable;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="tomcat")
public class TomcatProperties {

	private String host;
	
	private Integer post ;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public Integer getPost() {
		return post;
	}

	public void setPost(Integer post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "TomcatProperties [host=" + host + ", post=" + post + "]";
	}
	
	
}
