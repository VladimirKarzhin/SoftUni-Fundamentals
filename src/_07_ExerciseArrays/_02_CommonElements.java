package _07_ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _02_CommonElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] arrayOne = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(String::toString)
                .toArray(String[]:: new);
        String[] arrayTwo = (String[]) Arrays
                .stream(scanner.nextLine().split(" "))
                .map(String::toString)
                .toArray(String[]:: new);


        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = 0; j < arrayOne.length; j++) {
                String elementInArrayTwo = String.valueOf(arrayTwo[i]);
                String elementInArrayOne = String.valueOf(arrayOne[j]);
                if (elementInArrayTwo.equals(elementInArrayOne)) {
                    System.out.print(elementInArrayTwo + " ");
                }
            }
        }

    }
}
