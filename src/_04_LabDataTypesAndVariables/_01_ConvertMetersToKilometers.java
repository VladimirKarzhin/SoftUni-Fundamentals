package _04_LabDataTypesAndVariables;

import java.util.Scanner;

public class _01_ConvertMetersToKilometers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.2f",number / 1000);
    }
}
