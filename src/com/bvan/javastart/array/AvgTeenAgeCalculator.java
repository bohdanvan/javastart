package com.bvan.javastart.array;

/**
 * Подсчет среднего возраста подростков.
 *
 * @author bvanchuhov
 */
public class AvgTeenAgeCalculator {

    public static void main(String[] args) {
        int avgTeenAge = findAvgTeenAge(new int[]{5, 62});
        System.out.println(avgTeenAge);
    }

    /**
     * Подсчитывает средний возраст продростков.
     * Если подростков не найдено, возвращает -1.
     *
     * @param ages массив из корректно заданных возрастов.
     * @return средний возраст подростков или -1, если подростков не найдено.
     */
    public static int findAvgTeenAge(int[] ages) {
        int teensCount = 0;
        int teenAgesSum = 0;

        for (int age : ages) {
            if (isTeenAge(age)) {
                teensCount++;
                teenAgesSum += age;
            }
        }

        if (teensCount == 0) {
            return -1;
        }
        return teenAgesSum / teensCount;
    }

    /**
     * Является ли возраст подростковым?
     *
     * @param age возраст человека.
     * @return {@code true}, если возраст является подростковым.
     */
    private static boolean isTeenAge(int age) {
        return age >= 12 && age <= 17;
    }
}
