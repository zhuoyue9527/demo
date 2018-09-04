package com.zhuo.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyListenerHandle {

	@EventListener
	public void event(MyApplicationEvent event) {
		System.out.println(event.getClass()+"----------------");
	}

}
