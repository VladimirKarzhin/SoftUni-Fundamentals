package _02_ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class _05_Login {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        int count = 0;
        while (scanner.hasNext()) {
            count++;
            StringBuilder reversedUsername = new StringBuilder();
            String currentUsername = scanner.nextLine();

            for (int i = currentUsername.length() - 1; i >= 0; i--) {
                reversedUsername.append(currentUsername.charAt(i));
            }

            if (reversedUsername.toString().equals(username)) {
                System.out.printf("User %s logged in.", username);
            } else {
                if (count == 4) {
                    System.out.printf("User %s blocked!", username);
                    break;
                }
                System.out.println("Incorrect password. Try again.");
            }
        }

    }
}
