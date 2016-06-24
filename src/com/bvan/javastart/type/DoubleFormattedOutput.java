package com.bvan.javastart.type;

/**
 * Форматированный вывод чисел с плавающей точкой.
 *
 * @author bvanchuhov
 */
public class DoubleFormattedOutput {

    public static void main(String[] args) {
        double d = 1. / 3;

        String s = String.format("%10.3f", d);
        System.out.println(s);
    }
}
