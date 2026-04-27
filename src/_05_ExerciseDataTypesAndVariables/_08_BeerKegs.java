package _05_ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class _08_BeerKegs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        double biggestKegValue = 0;
        String biggestKegName = "";

        while (count != 0) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double currentKegValue = Math.PI * Math.pow(radius, 2) * height;

            if (currentKegValue >= biggestKegValue) {
                biggestKegValue = currentKegValue;
                biggestKegName = model;
            }
            count--;
        }
        System.out.println(biggestKegName);

    }
}
