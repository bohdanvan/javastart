package com.bvan.javastart.condition.with_method;

/**
 * Посчет минимума/максимума двух целочисленных значений.
 *
 * @author bvanchuhov
 */
public class MinMaxCalculator {

    public static void main(String[] args) {
        System.out.println("max(1, 2) = " + max(1, 2));
        System.out.println("max(2, 1) = " + max(1, 2));
        System.out.println("max(1, 1) = " + max(1, 2));
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }
}
