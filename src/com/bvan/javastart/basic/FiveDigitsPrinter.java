package com.bvan.javastart.basic;

/**
 * @author bvanchuhov
 */
public class FiveDigitsPrinter {

    public static void main(String[] args) {
        int n = 7654321;

        System.out.println(n / 10_000 % 10);
        System.out.println(n / 1_000 % 10);
        System.out.println(n / 100 % 10);
        System.out.println(n / 10 % 10);
        System.out.println(n % 10);
    }
}
