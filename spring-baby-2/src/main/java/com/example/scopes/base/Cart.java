package com.example.scopes.base;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.*;
@Component
public class Cart {
    private final List<ProductS> productList = new ArrayList<>();

    public void addProduct(ProductS product) {
        this.productList.add(product);
    }

    public List<ProductS> getProducts() {
        return this.productList;
    }
}
