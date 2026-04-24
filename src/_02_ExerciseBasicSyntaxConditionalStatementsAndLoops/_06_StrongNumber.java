package _02_ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Arrays;
import java.util.Scanner;

public class _06_StrongNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        char[] array = number.toCharArray();

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            int currentDigit = Integer.parseInt(String.valueOf(array[i]));

            int factorial = 1;

            for (int j = 1; j <= currentDigit; j++) {
                 factorial *= j;

            }
            sum += factorial;

        }

        String sumNew = "" + sum;

        if (number.equals(sumNew)) {
            System.out.println("yes");

        } else {
            System.out.println("no");

        }

    }
}
