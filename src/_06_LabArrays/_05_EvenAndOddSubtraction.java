package _06_LabArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _05_EvenAndOddSubtraction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i <= array.length - 1; i++) {
            int currentNum = array[i];
            if (currentNum % 2 == 0) {
                sumEven += currentNum;
            } else {
                sumOdd += currentNum;
            }
        }

        System.out.println(sumEven - sumOdd);

    }
}
