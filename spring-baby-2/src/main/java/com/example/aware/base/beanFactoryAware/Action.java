package com.example.aware.base.beanFactoryAware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Action implements BeanFactoryAware {
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        // same idea here buddy, spring injects the beanFactory implementation here for this bean Action
        // to be aware of...
        // we can do what-ever the fuck we want here with this beanFactory...
    }
}
