package com.bvan.javastart.loop;

/**
 * @author bvanchuhov
 */
public class RangeSumCalculator {

    public static void main(String[] args) {
        int rangeSum = rangeSum(101, 100);
        System.out.println(rangeSum);
    }

    public static int rangeSum(int from, int to) {
        checkRangeBounds(from, to);

        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum += i;
        }
        return sum;
    }

    private static void checkRangeBounds(int from, int to) {
        if (from > to) {
            throw new IllegalArgumentException("'from' should not be greater than 'to', but actually " + from + " > " + to);
        }
    }
}
