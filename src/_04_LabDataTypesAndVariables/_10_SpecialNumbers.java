package _04_LabDataTypesAndVariables;

import java.util.Scanner;

public class _10_SpecialNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int num = i;
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            boolean isSpecial = (sum == 5 || sum == 7 || sum == 11);

            String printTrueOrFalse = String.valueOf(isSpecial);

            if (printTrueOrFalse.equals("true")) {
                printTrueOrFalse = "True";
            } else {
                printTrueOrFalse = "False";

            }

            System.out.println(i + " -> " + printTrueOrFalse);
        }

    }
}
