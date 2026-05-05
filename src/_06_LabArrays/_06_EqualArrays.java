package _06_LabArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _06_EqualArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextLine()) return;
        String lineOne = scanner.nextLine();
        int[] arrayOne = Arrays
                .stream(lineOne.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        if (!scanner.hasNextLine()) return;
        String lineTwo = scanner.nextLine();
        int[] arrayTwo = Arrays
                .stream(lineTwo.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean thereIsDifference = false;
        int indexOfDifference = 0;
        int sumIfThereAreEqual = 0;

        if (arrayOne.length != arrayTwo.length) {
            System.out.println("Arrays are not identical. Found difference at 0 index.");
        }

        for (int i = 0; i <= arrayOne.length - 1; i++) {
            if (arrayOne[i] == arrayTwo[i]) {
                sumIfThereAreEqual += arrayOne[i];
            } else {
                thereIsDifference = true;
            }

            if (thereIsDifference) {
                indexOfDifference = i;
                break;
            }

        }
        if (thereIsDifference) {
            System.out.printf("Arrays are not identical. Found difference at %d index.", indexOfDifference);
        } else {
            System.out.printf("Arrays are identical. Sum: %d", sumIfThereAreEqual);
        }
    }
}
