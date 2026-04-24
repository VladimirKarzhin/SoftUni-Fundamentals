package _03_MoreExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class _05_Messages {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        StringBuilder message = new StringBuilder();

        for (int i = 0; i < count; i++) {

            int currentData = Integer.parseInt(scanner.nextLine());

            switch (currentData) {
                case 2:
                    message.append("a");
                    break;
                case 22:
                    message.append("b");
                    break;
                case 222:
                    message.append("c");
                    break;
                case 3:
                    message.append("d");
                    break;
                case 33:
                    message.append("e");
                    break;
                case 333:
                    message.append("f");
                    break;
                case 4:
                    message.append("g");
                    break;
                case 44:
                    message.append("h");
                    break;
                case 444:
                    message.append("i");
                    break;
                case 5:
                    message.append("j");
                    break;
                case 55:
                    message.append("k");
                    break;
                case 555:
                    message.append("l");
                    break;
                case 6:
                    message.append("m");
                    break;
                case 66:
                    message.append("n");
                    break;
                case 666:
                    message.append("o");
                    break;
                case 7:
                    message.append("p");
                    break;
                case 77:
                    message.append("q");
                    break;
                case 777:
                    message.append("r");
                    break;
                case 7777:
                    message.append("s");
                    break;
                case 8:
                    message.append("t");
                    break;
                case 88:
                    message.append("u");
                    break;
                case 888:
                    message.append("v");
                    break;
                case 9:
                    message.append("w");
                    break;
                case 99:
                    message.append("x");
                    break;
                case 999:
                    message.append("y");
                    break;
                case 9999:
                    message.append("z");
                    break;
                case 0:
                    message.append(" ");
                    break;
            }
        }
        System.out.println(message);
    }
}
