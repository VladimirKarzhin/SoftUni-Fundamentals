package _01_LabBasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class _12_RefactorSum0fOddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        if (n <= 0) {
            return;
        }
        for (int i = 1; i < n; i++) {
            if (i == 1) {
                sum++;
                System.out.println(1);
            }
            System.out.println(2 * i + 1);
            sum += 2 * i + 1;
        }
        System.out.printf("Sum: %d%n", sum);


    }
}
