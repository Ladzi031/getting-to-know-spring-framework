package com.example.aware.base.name;

import org.springframework.beans.factory.BeanNameAware;

public class Person implements BeanNameAware {
    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name "+ name);
    }
    // the name of the registered bean name is returned here in the parameter, as per method name
    // this bean is made aware of it's name!
}
