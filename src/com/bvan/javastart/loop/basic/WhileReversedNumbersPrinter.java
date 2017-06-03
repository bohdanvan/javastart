package com.bvan.javastart.loop.basic;

/**
 * Output numbers from 40 to 30 with a while loop.
 *
 * @author bvanchuhov
 */
public class WhileReversedNumbersPrinter {

    public static void main(String[] args) {
        int n = 40;
        while (n >= 30) {
            System.out.println(n);
            n--;
        }
    }
}
