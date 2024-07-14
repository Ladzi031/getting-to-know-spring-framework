package com.example.AopLesson.basic;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class CalculatorLoggingAspect {
    private Logger logger  = Logger.getLogger(CalculatorConfiguration.class.getName());

    @Before("execution(* ArithmeticCalculator.multiplication(..))")
    public void logBefore() {
        logger.info("Before multiplication method");
    }
}
