package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class LevelIntermediate {

    public static void main(String[] args) {
        System.out.println(returnNumbersUpTo100());
        System.out.println(Arrays.toString(returnInputAsArray()));

    }

    public static String numberReturnString(int number) {
        String[] numberString = new String[]{"Eins", "Zwei", "Drei", "Vier", "Fuenf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};
        return numberString[number -1];

    }

    public static String returnNumbersUpTo100() {
        String output = "Lösung:";
        for (int i = 1; i<= 100; i++) {
            if (i % 3 == 0) {
                output = output.concat("\n#");
            } else if (i % 5 == 0) {
                output = output.concat("\n$");
            } else {
                output = output.concat("\n"+i);
            }
        }
        return output;
    }

    public static String[] returnInputAsArray() {

        Scanner scan = new Scanner(System.in);

        int numberOfTries = 4;
        String[] newArray = new String[numberOfTries];
        for(int i = 0; i < numberOfTries; i++) {
            System.out.println("Give input: ");
            String userInput = scan.nextLine();
            newArray[i] = userInput;
            System.out.println(userInput);
        }
        return newArray;
    }

}
