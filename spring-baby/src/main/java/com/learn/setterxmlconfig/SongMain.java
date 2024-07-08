package com.learn.setterxmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SongMain {

	// setter based XML configuration quick overview
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("song.xml");
		Song mySong = applicationContext.getBean(Song.class);
		System.out.print(mySong.toString());
	}

}
