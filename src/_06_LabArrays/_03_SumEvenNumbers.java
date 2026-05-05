package _06_LabArrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class _03_SumEvenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        int sum = 0;

        for (int i = 0; i <= array.length - 1; i++) {
            int currentNum = array[i];
         if (currentNum % 2 == 0) {
             sum += currentNum;
         }
        }

        System.out.println(sum);

    }
}
