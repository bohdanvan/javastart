package com.bvan.javastart.condition.with_method;

/**
 * Преобразование имя -> id игрушки.
 *
 * @author bvanchuhov
 */
public class ToyNameToIdConverter {

    public static void main(String[] args) {
        System.out.println(getToyId("Doll"));
        System.out.println(getToyId("Lego"));
    }

    public static int getToyId(String name) {
        switch (name) {
            case "Car": return 0;
            case "Lego": return 1;
            case "Doll": return 2;
            case "Puzzle": return 3;
            default: throw new IllegalArgumentException("no toy with name " + name);
        }
    }
}
