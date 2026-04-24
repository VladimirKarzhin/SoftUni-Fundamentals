package _03_MoreExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.*;

public class _01_SortNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> arr = new LinkedList<>();

        for (int i = 0; i < 3; i++) {
            arr.add(Integer.parseInt(scanner.nextLine()));
        }

        Collections.sort(arr);
        Collections.reverse(arr);

        for (int current : arr) {
            System.out.println(current);
        }
    }
}
