package com.bvan.javastart.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Read a name and an age from the file and output a hello message.
 * No validation is required.
 *
 * @author bvanchuhov
 */
public class PersonInfoFileIO {

    public static void main(String[] args) throws FileNotFoundException {
        // Input
        File source = new File("files/person.txt");
        Scanner scanner = new Scanner(source);

        String name = scanner.next();
        int age = scanner.nextInt();

        scanner.close();

        // BL
        String message = "Hello, I'm " + name + ", "
                + age + " years old";

        // Output
        System.out.println(message);
    }
}
