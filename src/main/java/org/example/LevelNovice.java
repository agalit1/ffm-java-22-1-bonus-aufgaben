package org.example;

import java.util.Scanner;

public class LevelNovice {
    public static void main(String[] args) {
        System.out.println();

        System.out.println(printName5Times());
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
}
