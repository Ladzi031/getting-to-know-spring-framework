package com.example.AopLesson.basic;
/**
 * Calculator Interface
* */
public interface BasicCalculator {

    /**
     * Add two numbers
     * @param number1
     * @param number2
     * @return
     */
    double addition(double number1, double number2);

    /**
     * Subtracts Two Numbers
     * @param number1
     * @param number2
     * @return
     * */
    double subtraction(double number1, double number2);
    /**
     * Multiply two numbers
     * @param number1
     * @param number2
     * @return
     */
    double multiplication(double number1, double number2);
    /**
     * Divides two numbers
     * @param number1
     * @param number2
     * @return
     * */
    double division(double number1, double number2);
}
