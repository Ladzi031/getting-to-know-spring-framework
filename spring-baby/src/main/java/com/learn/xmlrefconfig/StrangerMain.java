package com.learn.xmlrefconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StrangerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("stranger.xml");
		Stranger stranger = applicationContext.getBean(Stranger.class);
		System.out.println(stranger.toString());
		
		Address addy = applicationContext.getBean(Address.class);
		System.out.println(addy.toString());
	}

}
