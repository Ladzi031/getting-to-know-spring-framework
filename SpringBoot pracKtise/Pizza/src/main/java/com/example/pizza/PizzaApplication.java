package com.example.pizza;

import com.example.pizza.config.PizzaConfig;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Log
@SpringBootApplication
public class PizzaApplication implements CommandLineRunner {
    private final PizzaConfig pizzaConfig;

    public PizzaApplication(PizzaConfig pizzaConfig) {
        this.pizzaConfig = pizzaConfig;
    }

    public static void main(String[] args) {

        SpringApplication.run(PizzaApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        log.info(
                String.format(
                        "I want a pizza with %s sauce and with %s toppings and nice %s crust please",
                        pizzaConfig.getSauce(),
                        pizzaConfig.getTopping(),
                        pizzaConfig.getCrust()
                )
        );
    }
}
