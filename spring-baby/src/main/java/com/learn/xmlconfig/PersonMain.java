package com.learn.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("person.xml");
		Person person = appContext.getBean(Person.class);
		System.out.println(person.toString());
	}

}
