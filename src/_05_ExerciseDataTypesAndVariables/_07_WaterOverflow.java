package _05_ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class _07_WaterOverflow {
    public static void main(String[] args) {

        //Water tank capacity of 255 liters.

        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int waterTank = 0;

        for (int i = 0; i < count; i++) {
            int waterToPour = Integer.parseInt(scanner.nextLine());
            if (waterTank + waterToPour > 255) {
                System.out.println("Insufficient capacity!");
            } else {
                waterTank += waterToPour;
            }
        }

        System.out.println(waterTank);

    }
}
