package _04_LabDataTypesAndVariables;

import java.util.Scanner;

public class _08_LowerOrUpper {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String char1 = scanner.nextLine();

        if (char1.equals(char1.toLowerCase())) {
            System.out.println("lower-case");
        } else {
            System.out.println("upper-case");
        }

    }
}
