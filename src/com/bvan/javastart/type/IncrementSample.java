package com.bvan.javastart.type;

/**
 * Применение операции инкремента (++).
 * Префиксная и постфиксная формы записи.
 *
 * @author bvanchuhov
 */
public class IncrementSample {

    public static void main(String[] args) {
        int x = 10;

        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);

        //---------------------------
        int y = 10;

        System.out.println(y);
        y++;

        System.out.println(y);

        y++;
        System.out.println(y);
    }
}
