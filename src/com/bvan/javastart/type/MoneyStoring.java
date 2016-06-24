package com.bvan.javastart.type;

/**
 * Хранение денег в точном значении.
 *
 * @author bvanchuhov
 */
public class MoneyStoring {

    public static final int MONEY_COEFFICIENT = 10_000_000;

    public static void main(String[] args) {
        long moneyInDollars = 248739491; // Точное хранение
        double moneyForOutput = (double) moneyInDollars / MONEY_COEFFICIENT;

        System.out.println(moneyForOutput);
    }
}
