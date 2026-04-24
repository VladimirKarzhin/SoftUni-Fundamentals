package _03_MoreExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class _03_GamingStore {
    public static void main(String[] args) {

        //OutFall 4	$39.99
        //CS: OG	$15.99
        //Zplinter Zell	$19.99
        //Honored 2	$59.99
        //RoverWatch	$29.99
        //RoverWatch Origins Edition	$39.99

        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());

        double savedBalance = balance;

        while (true) {
            String currentData = scanner.nextLine();
            if (currentData.equals("Game Time")) {
                break;
            }

            switch (currentData) {
                case "OutFall 4":
                    if (balance - 39.99 == 0) {
                        balance -= 39.99;
                        System.out.println("Bought OutFall 4");
                        System.out.println("Out of money!");
                    } else if (balance - 39.99 < 0) {
                        System.out.println("Too Expensive");
                    } else {
                        balance -= 39.99;
                        System.out.println("Bought OutFall 4");
                    }
                    break;
                case "CS: OG":
                    if (balance - 15.99 == 0) {
                        balance -= 15.99;
                        System.out.println("Bought CS: OG");
                        System.out.println("Out of money!");
                    } else if (balance - 15.99 < 0) {
                        System.out.println("Too Expensive");
                    } else {
                        balance -= 15.99;
                        System.out.println("Bought CS: OG");
                    }
                    break;
                case "Zplinter Zell":
                    if (balance - 19.99 == 0) {
                        balance -= 19.99;
                        System.out.println("Bought Zplinter Zell");
                        System.out.println("Out of money!");
                    } else if (balance - 19.99 < 0) {
                        System.out.println("Too Expensive");
                    } else {
                        balance -= 19.99;
                        System.out.println("Bought Zplinter Zell");
                    }
                    break;
                case "Honored 2":
                    if (balance - 59.99 == 0) {
                        balance -= 59.99;
                        System.out.println("Bought Zplinter Zell");
                        System.out.println("Out of money!");
                    } else if (balance - 59.99 < 0) {
                        System.out.println("Too Expensive");
                    } else {
                        balance -= 59.99;
                        System.out.println("Bought Honored 2");
                    }
                    break;
                case "RoverWatch":
                    if (balance - 29.99 == 0) {
                        balance -= 29.99;
                        System.out.println("Bought RoverWatch");
                        System.out.println("Out of money!");
                    } else if (balance - 29.99 < 0) {
                        System.out.println("Too Expensive");
                    } else {
                        balance -= 29.99;
                        System.out.println("Bought RoverWatch");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if (balance - 39.99 == 0) {
                        balance -= 39.99;
                        System.out.println("Bought RoverWatch Origins Edition");
                        System.out.println("Out of money!");
                    } else if (balance - 39.99 < 0) {
                        System.out.println("Too Expensive");
                    } else {
                        balance -= 39.99;
                        System.out.println("Bought RoverWatch Origins Edition");
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;

            }
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", savedBalance - balance, balance);
    }
}
