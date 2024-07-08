package com.learn.autoconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ArtistConfig {
	
	// this is now a special type of class...
	
	@Bean(name= "ladzi")
	public Artist artist() {
		return new Artist("farooq", "Doe");
	}
}
