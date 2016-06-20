package com.bvan.javastart.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Поиск всех положительных элеметнов списка.
 *
 * @author bvanchuhov
 */
public class AllPositiveElemsFinder {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, -20, -30, 40, 50);
        List<Integer> positiveElems = findPositiveElems(list);
        System.out.println(positiveElems);
    }

    /**
     * Находит все положительные елементы в заданном списке.
     *
     * @param list исходный список.
     * @return список положительных элементов.
     */
    public static List<Integer> findPositiveElems(List<Integer> list) {
        checkNotNull(list);

        List<Integer> result = new ArrayList<>();
        for (Integer elem : list) {
            if (elem > 0) {
                result.add(elem);
            }
        }

        return result;
    }

    private static void checkNotNull(List<Integer> list) {
        if (list == null) {
            throw new IllegalArgumentException("null list");
        }
    }
}
