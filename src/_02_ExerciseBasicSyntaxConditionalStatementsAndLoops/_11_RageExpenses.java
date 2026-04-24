package _02_ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class _11_RageExpenses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lostGameCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double sum = 0;
        int keyboardCount = 0;

        for (int i = 1; i <= lostGameCount; i++) {

            if (i % 2 == 0) {
                sum += headsetPrice;
            }
            if (i % 3 == 0) {
                sum += mousePrice;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                sum += keyboardPrice;
                keyboardCount++;
            }
            if (keyboardCount == 2) {
                sum += displayPrice;
                keyboardCount = 0;
            }
        }
        System.out.printf("Rage expenses: %.2f lv.", sum);

    }
}
