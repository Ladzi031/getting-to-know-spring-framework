package com.example.scopes.base;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


// we are going to learn about bean scopes here!

@Configuration
public class ProductSConfiguration {
    @Bean(name = "lappy")
    public ProductS laptop() {
        return new ProductS("Laptop", "34");
    }

    @Bean
    public ProductS monitor() {
        return new ProductS("monitor 32-inch", "234");
    }

    @Bean
    @Scope("prototype")
    public Cart shoppingCart() {
        return new Cart();
    }

    /*

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
usage:
    @Scope("prototype")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

with the scope we can specify mainly two things
1. how many beans get instantiated and for how long
2. within the context of spring-core and spring-context we have main two types of scopes
the singleton(default) and prototype
the prototype scope of a bean simply tells the spring container to provide a new instance of the bean for every time we call want the bean of that type from the container

there is other bean scope types as well like: session, request, application, websocket, these are available from an WebApplicationContext
* */
}
