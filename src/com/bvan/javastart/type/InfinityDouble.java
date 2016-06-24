package com.bvan.javastart.type;

/**
 * Типы с плавающей точкой имеют понятия:
 * положительная бесконечность (Infinity),
 * отрицательная бесконечность (-Infinity),
 * не число, Not a Number (NaN).
 *
 * @author bvanchuhov
 */
public class InfinityDouble {

    public static void main(String[] args) {
        System.out.println(1. / 0); // Infinity
        System.out.println(-1. / 0); // -Infinity
        System.out.println(0. / 0); // NaN
    }
}
