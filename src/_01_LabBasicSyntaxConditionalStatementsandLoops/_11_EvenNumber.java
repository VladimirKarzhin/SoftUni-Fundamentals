package _01_LabBasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class _11_EvenNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.printf("The number is: %d", Math.abs(number));
            } else {
                System.out.println("Please write an even number.");
            }


        }
    }
}
