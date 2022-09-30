package org.example;

public class LevelExpert {
    public static void main(String[] args) {
        System.out.println(reverseString("abc"));

    }

    public static String reverseString(String input) {
        String output = "";
        for (int i = input.length(); i > 0; i--) {
            output = output.concat(String.valueOf(input.charAt(i-1)));

        }
        return output;
    }

}
