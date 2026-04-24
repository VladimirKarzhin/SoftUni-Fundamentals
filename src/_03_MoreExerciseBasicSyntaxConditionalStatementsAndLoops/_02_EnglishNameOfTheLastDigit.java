package _03_MoreExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class _02_EnglishNameOfTheLastDigit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(num(number % 10));

    }

    public static String num (int number) {

        switch (number) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 0:
                return "zero";
        }
        return "0";
    }
}
