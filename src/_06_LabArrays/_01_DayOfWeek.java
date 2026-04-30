package _06_LabArrays;

import java.util.Scanner;

public class _01_DayOfWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());

        String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (day >= 1 && day <= 7) {
            System.out.println(daysOfTheWeek[day - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
