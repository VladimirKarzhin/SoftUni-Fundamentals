package _06_LabArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _07_CondenseArrayToNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isDone = true;


        if (numbers.length > 1) {
            while (numbers.length > 1) {

                int[] condensed = new int[numbers.length - 1];

                for (int i = 0; i < condensed.length; i++) {
                    condensed[i] = numbers[i] + numbers[i + 1];
                }
                numbers = condensed;
            }
        } else {
            System.out.println(numbers[0]);
            isDone = false;
        }

        if (isDone) {
            System.out.println(numbers[0]);
        }
    }
}
