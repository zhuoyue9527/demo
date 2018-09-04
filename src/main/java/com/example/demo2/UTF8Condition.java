package com.example.demo2;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class UTF8Condition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		String property = System.getProperty("file.encoding");
		if(property != null){
			return "utf-8".equals(property.toLowerCase());
		}
		return false;
	}

}
