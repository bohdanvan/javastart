package com.bvan.javastart.io;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Read a name and an age from the console and output a hello message.
 * Age validation is required.
 *
 * @author bvanchuhov
 */
public class PersonInfoIOWithValidation {

    public static void main(String[] args) throws FileNotFoundException {
        // Input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.next();

        System.out.print("Enter age: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Sorry, illegal age");
            System.exit(0); // exit from the program
        }
        int age = scanner.nextInt();

        scanner.close();

        // BL
        String message = "Hello, I'm " + name + ", "
                + age + " years old";

        // Output
        System.out.println(message);
    }
}
