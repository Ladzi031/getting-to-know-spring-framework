package com.example.collection.base;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class ProductViewer {


    @Autowired
    private Map<String, Product> products;
    /*
      private Set<Product> products;
      private List<Product> products

    * */
    public void viewProduct() {
        for(Map.Entry<String, Product> productEntry: products.entrySet()) {
            System.out.println(productEntry.getKey() + " is mapped to "+ productEntry.getValue());
        }
    }

    // auto-wiring is amazing, but don't forget it has drawback!

    // for Map<String, Product> products, it is still able to inject the beans with it sets the 'String' to the methodName that returned that bean in the configuration file

    // key take away here is that spring injects every single bean of type product in the array and makes it available her without us having to explicitly stating that


    // with the autowired annotation on an array, let's spring know that there are more than one Product types registered in the container
    // and spring than injects all those beans in this ProductViewer bean and stores them in that array
    // and we access them as you can see here!
    // the is a nifty trick that we didn't even have to do much but the beans are injected by the container for us!
}
