package _03_MoreExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class _04_ReverseString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        String reversedString = "";

        for (int i = word.length() - 1; i >=  0; i--) {
            char current = word.charAt(i);
            reversedString += current;
        }
        System.out.println(reversedString);

    }
}
