package _01_LabBasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class _09_SumOfOddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int count = 0;
        int currentNumber = 1;
        int sum = 0;
        while (number != count) {

            if (count == 0) {
                sum += 1;
                System.out.println(1);
            } else {
                currentNumber += 2;
                sum += currentNumber;
                System.out.println(currentNumber);
            }

            count++;
        }
        System.out.printf("Sum: %d", sum);
    }
}
