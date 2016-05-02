package com.bvan.javastart.condition.with_method;

/**
 * Преобразование id -> имя для игрушки.
 *
 * @author bvanchuhov
 */
public class ToyIdToNameConverter {

    public static void main(String[] args) {
        System.out.println(getToyName(2));
        System.out.println(getToyName(3));
    }

    public static String getToyName(int id) {
        if (id == 0) return "Car";
        if (id == 1) return "Lego";
        if (id == 2) return "Doll";
        if (id == 3) return "Puzzle";
        throw new IllegalArgumentException("no toy with id " + id);
    }
}
