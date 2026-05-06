package _07_ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _03_ZigZagArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] arrayOne = new int[n];
        int[] arrayTwo = new int[n];

        for (int i = 1; i <= n; i++) {
            int[] array = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            boolean isSecondArray = false;
            boolean isFirstArray = false;

            if (i % 2 != 0) {
                arrayOne[i - 1] = array[0];
                isSecondArray = true;
            }

            if (i % 2 == 0) {
                arrayOne[i - 1] = array[1];
                isFirstArray = true;
            }

            if (isFirstArray) {
                arrayTwo[i - 1] = array[0];
            }
            if (isSecondArray) {
                arrayTwo[i - 1] = array[1];
            }

        }
        String formattedArrayOne = Arrays.toString(arrayOne)
                .replace(",", "")  //remove the commas
                .replace("[", "")  //remove the right bracket
                .replace("]", "")  //remove the left bracket
                .trim();
        String formattedArrayTwo = Arrays.toString(arrayTwo)
                .replace(",", "")  //remove the commas
                .replace("[", "")  //remove the right bracket
                .replace("]", "")  //remove the left bracket
                .trim();
        System.out.println(formattedArrayOne);
        System.out.println(formattedArrayTwo);
    }
}
