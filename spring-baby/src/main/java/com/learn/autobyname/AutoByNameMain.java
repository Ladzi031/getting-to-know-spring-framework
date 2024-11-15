package com.learn.autobyname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoByNameMain {

	public static void main(String[] args) {
		// now let us see how this auto-wire by name works, now we normal explicit dependency injection in place, works well
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("autobyname.xml");
		System.out.println(((Person)ctx.getBean("person")).getName());
		System.out.print("address: "+((Person)ctx.getBean("person")).getAddress().getStreet());
	}

}
