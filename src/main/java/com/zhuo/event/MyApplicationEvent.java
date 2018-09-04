package com.zhuo.event;

import org.springframework.context.ApplicationEvent;
/**
 * 定义事件
 * @author Administrator
 *
 */
public class MyApplicationEvent extends ApplicationEvent {

	public MyApplicationEvent(Object source) {
		super(source);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
}
