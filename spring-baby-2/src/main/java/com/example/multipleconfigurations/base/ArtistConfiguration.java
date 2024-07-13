package com.example.multipleconfigurations.base;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(InstrumentConfiguration.class)
public class ArtistConfiguration {
/* using the @Import annotation as a way to join two config files together, this is more effective than
letting spring know about the imported config file via the applicationContext

with this now we only have to import the ArtistConfiguration.class file in the Main class
and the InstrumentConfiguration class will be imported with it...
we can also make use of beans declared in the InstrumentationConfiguration.class as well in this class
*/




    @Value("#{instrument}")
    private Instrument instrument;
    @Bean
    public Artist artist() {
        return new Artist("Fuego Eddie", instrument);
    }

    // we use different configuration_files...
    // we can make use of @Value attribute...
}
