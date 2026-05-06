package _07_ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Train {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int countOfThePassengers = 0;
        int[] train = new int[n];

        for (int i = 0; i < n; i++) {
            int currentWagon = Integer.parseInt(scanner.nextLine());
            countOfThePassengers += currentWagon;
            train[i] = currentWagon;
        }
        String formattedString = Arrays.toString(train)
                .replace(",", "")  //remove the commas
                .replace("[", "")  //remove the right bracket
                .replace("]", "")  //remove the left bracket
                .trim();
        System.out.println(formattedString);
        System.out.println(countOfThePassengers);

    }
}
