package org.example;

import java.util.Arrays;

public class LevelExpert {
    public static void main(String[] args) {
//        System.out.println(reverseString("abc"));
        int[] numbers = new int[]{6, 2, 8, 3, 9, 6};

        System.out.println(Arrays.toString(sortArrayAscending(numbers)));
        System.out.println(Arrays.toString(convertStringToArray("as,dasdtr,test,hu")));
        System.out.println(checksum(312));
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

    public static String[] convertStringToArray(String input) {
        return input.split(",");
    }

    public static int checksum(int number) {
        String numStr = String.valueOf(number);
        int sum = 0;
        for (int i = 0; i < (numStr.length()); i++) {
            sum += Integer.parseInt(numStr.substring(i,i+1));
        }
        return sum;
    }
}
