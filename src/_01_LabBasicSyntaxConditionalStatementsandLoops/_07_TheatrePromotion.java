package _01_LabBasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class _07_TheatrePromotion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String typeOfTheDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        if (age >= 0 && age <= 18) {
            if (typeOfTheDay.equals("Weekday")) {
                System.out.println("12$");
            }
            if (typeOfTheDay.equals("Weekend")) {
                System.out.println("15$");
            }
            if (typeOfTheDay.equals("Holiday")) {
                System.out.println("5$");
            }
        } else if (age > 18 && age <= 64) {
            if (typeOfTheDay.equals("Weekday")) {
                System.out.println("18$");
            }
            if (typeOfTheDay.equals("Weekend")) {
                System.out.println("20$");
            }
            if (typeOfTheDay.equals("Holiday")) {
                System.out.println("12$");
            }
        } else if (age > 64 && age <= 122) {
            if (typeOfTheDay.equals("Weekday")) {
                System.out.println("12$");
            }
            if (typeOfTheDay.equals("Weekend")) {
                System.out.println("15$");
            }
            if (typeOfTheDay.equals("Holiday")) {
                System.out.println("10$");
            }
        } else {
            System.out.println("Error!");
        }




    }
}
