package com.learn.dependson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependsOnMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("dependson.xml");
		
		
		
	}

}