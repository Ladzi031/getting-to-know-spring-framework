package com.example.javaconfig.base;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfiguration {
    @Bean
    public Product product() {
        Product product = new Product();
        product.setProductId("123");
        product.setProductDescription("a laptop");
        return product;
    }

    @Bean
    public Address address() {
        Address address = new Address();
        address.setStreet("phiri");
        return address;
    }
}
