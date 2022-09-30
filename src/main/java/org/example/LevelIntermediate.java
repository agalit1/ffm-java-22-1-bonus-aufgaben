package org.example;

public class LevelIntermediate {

    public static void main(String[] args) {
        System.out.println(returnNumbersUpTo100());
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
}
