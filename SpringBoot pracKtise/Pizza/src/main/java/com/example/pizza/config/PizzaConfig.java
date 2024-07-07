package com.example.pizza.config;


import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Configuration
@ConfigurationProperties(prefix = "pizza")
public class PizzaConfig {
    private String sauce;
    private String topping;
    private String crust;
}
