package _02_ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class _07_VendingMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sumOfTheMoney = 0;
        while (true) {
            String currentData = scanner.nextLine();
            if (currentData.equals("Start")) {
                break;
            }
            double currentMoney = Double.parseDouble(currentData);
            if (currentMoney == 0.1 || currentMoney == 0.2 || currentMoney == 0.5 || currentMoney == 1 || currentMoney == 2) {
                sumOfTheMoney += currentMoney;
            } else {
                System.out.printf("Cannot accept %.2f%n", currentMoney);
            }
        }
//"Nuts", "Water", "Crisps", "Soda", "Coke". The prices are: 2.0, 0.7, 1.5, 0.8, 1.0
        while (true) {
            String currentData = scanner.nextLine();
            if (currentData.equals("End")) {
                break;
            }

            switch (currentData) {
                case "Nuts":
                    if (sumOfTheMoney < 2.0) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.println("Purchased Nuts");
                        sumOfTheMoney -= 2.0;
                    }
                    break;
                case "Water":
                    if (sumOfTheMoney < 0.7) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.println("Purchased Water");
                        sumOfTheMoney -= 0.7;
                    }
                    break;
                case "Crisps":
                    if (sumOfTheMoney < 1.5) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.println("Purchased Crisps");
                        sumOfTheMoney -= 1.5;
                    }
                    break;
                case "Soda":
                    if (sumOfTheMoney < 0.8) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.println("Purchased Soda");
                        sumOfTheMoney -= 0.8;
                    }
                    break;
                case "Coke":
                    if (sumOfTheMoney < 1.0) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.println("Purchased Coke");
                        sumOfTheMoney -= 1.0;
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }


        }
        System.out.printf("Change: %.2f", sumOfTheMoney);
    }
}
