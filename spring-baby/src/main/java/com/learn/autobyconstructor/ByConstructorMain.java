package com.learn.autobyconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ByConstructorMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("autobyconstructor.xml");
		System.out.println(ctx.getBean(PersonByConstructor.class).toString());
	}
}
