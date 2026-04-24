package _02_ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class _03_Vacation {
    public static void main(String[] args) {
        //	       Friday saturday	  Sunday
        //Students	8.45	9.80	10.46
        //Business	10.90	15.60	16
        //Regular	15	20	22.50
        Scanner scanner = new Scanner(System.in);

        int countOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfPeople = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();

        double totalPrice = 0;
        switch (dayOfTheWeek) {
            case "Friday":
                if (typeOfPeople.equals("Students")) {
                    totalPrice = countOfPeople * 8.45;
                    if (countOfPeople >= 30) {
                        totalPrice *= 0.85;
                    }
                } else if (typeOfPeople.equals("Business")) {
                    totalPrice = countOfPeople * 10.90;
                    if (countOfPeople >= 100) {
                        totalPrice -= 10 * 10.90;
                    }
                } else if (typeOfPeople.equals("Regular")) {
                    totalPrice = countOfPeople * 15;
                    if (countOfPeople >= 10 && countOfPeople <= 20) {
                        totalPrice *= 0.95;
                    }
                }
                break;
            case "Saturday":
                if (typeOfPeople.equals("Students")) {
                    totalPrice = countOfPeople * 9.80;
                    if (countOfPeople >= 30) {
                        totalPrice *= 0.85;
                    }
                } else if (typeOfPeople.equals("Business")) {
                    totalPrice = countOfPeople * 15.60;
                    if (countOfPeople >= 100) {
                        totalPrice -= 10 * 15.60;
                    }
                } else if (typeOfPeople.equals("Regular")) {
                    totalPrice = countOfPeople * 20;
                    if (countOfPeople >= 10 && countOfPeople <= 20) {
                        totalPrice *= 0.95;
                    }
                }
                break;
            case "Sunday":
                if (typeOfPeople.equals("Students")) {
                    totalPrice = countOfPeople * 10.46;
                    if (countOfPeople >= 30) {
                        totalPrice *= 0.85;
                    }
                } else if (typeOfPeople.equals("Business")) {
                    totalPrice = countOfPeople * 16;
                    if (countOfPeople >= 100) {
                        totalPrice -= 10 * 16;
                    }
                } else if (typeOfPeople.equals("Regular")) {
                    totalPrice = countOfPeople * 22.50;
                    if (countOfPeople >= 10 && countOfPeople <= 20) {
                        totalPrice *= 0.95;
                    }
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
