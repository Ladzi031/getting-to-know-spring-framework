package com.learn.propertymerging;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DetailsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("propmerging.xml");
		
		EmailDetails emailDetails = (EmailDetails)applicationContext.getBean("emailDetails");
		emailDetails.getDetails().forEach((k, v) -> {System.out.println(k+" maps to "+ v);});
	}

}
