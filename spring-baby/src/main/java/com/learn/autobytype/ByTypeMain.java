package com.learn.autobytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ByTypeMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("autobytype.xml");
		System.out.println(ctx.getBean(PersonByType.class).toString());
	}

}
