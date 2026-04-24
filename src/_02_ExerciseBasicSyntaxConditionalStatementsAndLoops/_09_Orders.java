package _02_ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class _09_Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int countOfTheOrders = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        for (int i = 1; i <= countOfTheOrders; i++) {

            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            double day = Double.parseDouble(scanner.nextLine());
            double capsulesCount = Double.parseDouble(scanner.nextLine());

            double currentPrice = (day * capsulesCount) * pricePerCapsule;
            System.out.printf("The price for the coffee is: $%.2f%n", currentPrice);
            sum += currentPrice;
        }

        System.out.printf("Total: $%.2f", sum);

    }
}
