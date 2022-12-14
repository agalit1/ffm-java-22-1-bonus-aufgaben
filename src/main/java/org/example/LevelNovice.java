package org.example;

import java.util.Scanner;

public class LevelNovice {
    public static void main(String[] args) {
        System.out.println();

        //System.out.println(printName5Times());

        System.out.println(greetUser());
    }

    public static String printName5Times() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        String output = "Your name:";
        for (int i = 0; i < 5; i++) {
            output = output.concat("\n").concat(name);
        }
        return output;
    }

    public static boolean checkNumberGreaterThan0(int number) {
        return number > 0;
    }

    public static int squareOfNumber(int number) {
        return number * number;
    }

    public static String greetUser() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        return "Hello " + name + "!";
    }
}
