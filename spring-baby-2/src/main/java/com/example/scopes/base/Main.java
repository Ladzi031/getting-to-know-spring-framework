package com.example.scopes.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProductSConfiguration.class);

        ProductS laptop = applicationContext.getBean("lappy", ProductS.class);
        Cart cart1 = applicationContext.getBean(Cart.class);
        cart1.addProduct(laptop);
        System.out.println(cart1.getProducts().size());
        System.out.println("above from cart 1");

        ProductS monitor = applicationContext.getBean("monitor", ProductS.class);
        Cart cart2 = applicationContext.getBean(Cart.class);
        cart2.addProduct(monitor);
        System.out.println(cart2.getProducts().size());


        if(Objects.deepEquals(cart1, cart2)) {
            System.out.println("objects are equal");
        }else {
            System.out.println("objects are NOT equal");
        }
    }

}
