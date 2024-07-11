package com.example.multipleconfigurations.base;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ArtistConfiguration {

    @Value("#{instrument}")
    private Instrument instrument;
    @Bean
    public Artist artist() {
        return new Artist("Fuego Eddie", instrument);
    }

    // we use different configuration_files...
    // we can make use of @Value attribute...
}
