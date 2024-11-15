package com.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  1. instantiate the IoC container...
		//  2. get the bean information...
		//  3. use the bean
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*
		 * Product product = (Product) appContext.getBean("product"); 
		 * // this method is not the recommended way of getting the bean instance though
		*/
		
		/*
		 * Product product = appContext.getBean(Product.class); 
		 *  when we have multiple product types this could be risky
		 */
		Product product = appContext.getBean("product",Product.class);
		System.out.print(product.getDescription());
		
	}

}
