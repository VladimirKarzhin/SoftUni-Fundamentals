package _05_ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class _04_SumOfChars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 0; i < count; i++) {
            char ch = scanner.nextLine().charAt(0);
            sum += ch;
        }

        System.out.printf("The sum equals: %d", sum);
    }
}
