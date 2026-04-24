package _05_ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class _03_Elevator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int countOfPeopleToElevate = Integer.parseInt(scanner.nextLine());
        int elevatorCapacity = Integer.parseInt(scanner.nextLine());

        if (countOfPeopleToElevate / elevatorCapacity == 0) {
            System.out.println(1);
        } else {
            double result = Math.ceil((double) countOfPeopleToElevate / elevatorCapacity);
            System.out.printf("%.0f", result);

        }
    }
}
