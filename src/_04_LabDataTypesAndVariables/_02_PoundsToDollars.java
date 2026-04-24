package _04_LabDataTypesAndVariables;

import java.util.Scanner;

public class _02_PoundsToDollars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.3f", number * 1.36);

    }
}
