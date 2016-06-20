package com.bvan.javastart.array;

import java.util.Arrays;

/**
 * Последовательное заполнение элеметов массива.
 *
 * @author bvanchuhov
 */
public class ArraySequenceFiller {

    public static void main(String[] args) {
        int[] array = new int[10];
        sequenceFill(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * Последовательно заполняет массив числами от 0 до {@code length}-1.<br/>
     * Пример: массив из 5 элеметов должен быть заполнен {0, 1, 2, 3, 4}.
     *
     * @param array исходный массив.
     * @throws IllegalArgumentException если массив {@code null}.
     */
    public static void sequenceFill(int[] array) {
        checkNotNull(array);

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }

    private static void checkNotNull(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("null array");
        }
    }
}
