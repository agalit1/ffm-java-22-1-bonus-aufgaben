package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println(name);
        }

    }
}
