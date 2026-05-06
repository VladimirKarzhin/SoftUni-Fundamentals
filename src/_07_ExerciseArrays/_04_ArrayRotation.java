package _07_ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _04_ArrayRotation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int countOfRotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countOfRotations; i++) {
            int currentFirstElement = numbers[0];
            for (int j = 1; j <= numbers.length - 1; j++) {
                numbers[j - 1] = numbers[j];
            }
            numbers[numbers.length - 1] = currentFirstElement;
        }
        String formattedArray = Arrays.toString(numbers)
                .replace(",", "")  //remove the commas
                .replace("[", "")  //remove the right bracket
                .replace("]", "")  //remove the left bracket
                .trim();
        System.out.println(formattedArray);

    }
}
