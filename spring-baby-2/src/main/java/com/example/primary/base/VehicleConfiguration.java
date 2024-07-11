package com.example.primary.base;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class VehicleConfiguration {
    @Bean
    public Vehicle bike() {
        return new Car();
    }
    @Bean
    public Vehicle car() {
        return new Bike();
    }

    @Bean(name = "ladzani")
    public Person person() {
        return new Person();
    }

    //@primary can be used to specify which bean should be the preferred choice for injection in other beans that require it
    // @Qualifier is used at the Autowired level... in the bean exactly!!!
    // there is @Qualifier as well which specifies which bean "qualifiers" to be injected in other beans
}
