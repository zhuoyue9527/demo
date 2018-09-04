package com.example.demo2;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

@SpringBootConfiguration
@Conditional(UTF8Condition.class)
public class EncodingConvertConfigration {

	@Bean
//	@Conditional(UTF8Condition.class)
	public EncodingConvert createUTF8EncodingCovert() {
		return new UTF8EncodingConvert();
	}
	@Bean
//	@Conditional(GBKCondition.class)
	public EncodingConvert createGBKEncodingConvert() {
		return new GBKEncodingConvert();
	}
	
	
}
