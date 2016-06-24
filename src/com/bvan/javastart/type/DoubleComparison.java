package com.bvan.javastart.type;

/**
 * Сравнение чисел с плавающей точкой.<br/>
 * Так как числа с плавающей точкой являются неточными,
 * то выполнение обычной операции сравнения (==) может привести к неверному результату.
 * Правильным решением будет сравнение с погрешностью.
 *
 * @author bvanchuhov
 */
public class DoubleComparison {

    public static void main(String[] args) {
        double a = 0.1 + 0.2;
        double b = 0.3;

        boolean incorrectEquals = (a == b);
        System.out.println("Incorrect: " + incorrectEquals);

        double precision = 1.E-6; // 1 * 10^6
        boolean correctEquals = Math.abs(a - b) < precision;
        System.out.println("Correct: " + correctEquals);
    }
}
