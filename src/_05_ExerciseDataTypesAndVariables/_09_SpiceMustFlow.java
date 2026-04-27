package _05_ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class _09_SpiceMustFlow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int extractedSpices = 0;

        int days = 0;

        while (true) {
            if (startingYield < 100) {
                if (extractedSpices >= 26) {
                    extractedSpices -= 26;
                }
                break;
            }

            extractedSpices += startingYield;

                if (extractedSpices >= 26) {
                    extractedSpices -= 26;
                }


            startingYield -= 10;

            days++;

        }

        System.out.println(days);
        System.out.println(extractedSpices);

    }
}
