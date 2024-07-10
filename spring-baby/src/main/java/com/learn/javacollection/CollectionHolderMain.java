package com.learn.javacollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionHolderMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("javacollection.xml");
		CollectionHolder collectionHolder = applicationContext.getBean(CollectionHolder.class);
		collectionHolder.getMyList().forEach( (item) -> {
			System.out.println(item);
		});
		
		System.out.println("we about to print the player list of this club");
		collectionHolder.getMyPlayers().forEach( (p) -> System.out.println(p.getPlayerName()));
		
		System.out.println("let us print the propeties data from the properties object:");
		collectionHolder.getProperties().forEach((k, v) -> {
			System.out.println(k + " is mapped to "+ v)	;
			});
		
		
	}
}
