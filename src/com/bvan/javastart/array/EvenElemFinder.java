package com.bvan.javastart.array;

/**
 * @author bvanchuhov
 */
public class EvenElemFinder {

    public static void main(String[] args) {
        int[] array = {3, 5, -1, 30, 0, 10, 5};

        System.out.println("First even elem: " + findFirstEvenElem(array));
        System.out.println("First even elem index: " + findFirstEvenIndex(array));
        System.out.println("Last even elem: " + findLastEvenElem(array));
        System.out.println("Last even elem index: " + findLastEvenIndex(array));
    }

    public static int findFirstEvenElem(int[] array) {
        checkNotNull(array);

        for (int elem : array) {
            if (isEven(elem)) {
                return elem;
            }
        }

        return Integer.MIN_VALUE;
    }

    public static int findLastEvenElem(int[] array) {
        checkNotNull(array);

        for (int i = array.length - 1; i >= 0; i--) {
            int elem = array[i];
            if (isEven(elem)) {
                return elem;
            }
        }

        return Integer.MIN_VALUE;
    }

    public static int findFirstEvenIndex(int[] array) {
        checkNotNull(array);

        for (int i = 0; i < array.length; i++) {
            int elem = array[i];
            if (isEven(elem)) {
                return i;
            }
        }

        return -1;
    }

    public static int findLastEvenIndex(int[] array) {
        checkNotNull(array);

        for (int i = array.length - 1; i >= 0; i--) {
            int elem = array[i];
            if (isEven(elem)) {
                return i;
            }
        }

        return -1;
    }

    private static boolean isEven(int elem) {
        return elem % 2 == 0;
    }

    private static void checkNotNull(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("null array");
        }
    }
}
