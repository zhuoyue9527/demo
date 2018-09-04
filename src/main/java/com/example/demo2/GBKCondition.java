package com.example.demo2;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class GBKCondition implements Condition {

	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
			String property = System.getProperty("file.encoding");
			if(property != null){
				return "gbk".equals(property.toLowerCase());
			}
			return false;
	}

	

}
