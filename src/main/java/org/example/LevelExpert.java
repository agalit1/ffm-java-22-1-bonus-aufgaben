package org.example;

import java.util.Arrays;

public class LevelExpert {
    public static void main(String[] args) {
//        System.out.println(reverseString("abc"));
        int[] numbers = new int[]{6, 2, 8, 3, 9, 6};

        System.out.println(Arrays.toString(sortArrayAscending(numbers)));

    }

    public static String reverseString(String input) {
        String output = "";
        for (int i = input.length(); i > 0; i--) {
            output = output.concat(String.valueOf(input.charAt(i-1)));

        }
        return output;
    }


    public static int[] sortArrayAscending(int[] numbers) {
        Arrays.sort(numbers);
        return numbers;


    }
}
