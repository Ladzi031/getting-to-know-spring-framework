package com.example.AopLesson.basic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.example.AopLesson.basic")
@EnableAspectJAutoProxy
public class CalculatorConfiguration {
    @Bean
    public BasicCalculator arithmeticCalculator() {
        return new ArithmeticCalculator();
    }
}
