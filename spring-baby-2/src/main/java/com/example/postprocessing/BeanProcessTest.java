package com.example.postprocessing;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class BeanProcessTest implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(" object BEFORE: "+ bean.getClass().getName());
        System.out.println("name BEFORE: "+ beanName);
        if(bean instanceof Task) {
            ((Task) bean).setName("mastering spring boot!");
            ((Task) bean).setId("12345");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(" object AFTER: "+ bean.getClass().getName());
        System.out.println("name AFTER: "+ beanName);
        return bean;
    }
}
