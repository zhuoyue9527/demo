package com.zhuo.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

//@Component
public class MyApplicationListener  implements ApplicationListener<MyApplicationEvent>{

	public void onApplicationEvent(MyApplicationEvent event) {
		System.out.println("接受到事件"+event.getClass());
	}



}
