package com.learn.autoconfig;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ArtistMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ArtistConfig.class);
		Artist artist = applicationContext.getBean(Artist.class);
		//System.out.println(artist.toString());
		
		// accessing beans that are annotation-definede, we use a different implementation of the applicationContext, which makes sense if you think about...
		// we can access these beans via beanFactory as well!
		
		BeanFactory beanFactory = new AnnotationConfigApplicationContext(ArtistConfig.class);
		Artist artist2 = (Artist)beanFactory.getBean("ladzi");
		System.out.println(artist2.toString());
		
	}

}
