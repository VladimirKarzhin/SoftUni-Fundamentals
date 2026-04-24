package _02_ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class _08_Triangle0fNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());


            for (int i = 1; i <= number; i++) {
                for (int j = 0; j < i ; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }

    }

