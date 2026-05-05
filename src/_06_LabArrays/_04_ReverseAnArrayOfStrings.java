package _06_LabArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _04_ReverseAnArrayOfStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(String::toString)
                .toArray(String[]:: new);


        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }
}
