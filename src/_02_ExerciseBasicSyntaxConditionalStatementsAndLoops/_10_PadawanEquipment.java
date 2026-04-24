package _02_ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class _10_PadawanEquipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightsabers  = Double.parseDouble(scanner.nextLine());
        double priceOfRobes  = Double.parseDouble(scanner.nextLine());
        double price0fBelts  = Double.parseDouble(scanner.nextLine());
        //Needed equipment for 2 padawans:
        //sabresPrice * (studentsCount + 10%) + robesPrice * (studentsCount) + beltsPrice * (studentsCount - freeBelts)

        int countOfFreeBelts = 0;

        double sabers = Math.ceil(countOfStudents * 1.10);

        if (countOfStudents % 6 == 0) {
            countOfFreeBelts += countOfStudents / 6;
        } else {
            countOfFreeBelts += countOfStudents / 6;
        }

        double neededEquipmentPrice = priceOfLightsabers * (sabers)
        + priceOfRobes * (countOfStudents)
        + price0fBelts * (countOfStudents - countOfFreeBelts);


        if (neededEquipmentPrice <= amountOfMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", neededEquipmentPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", neededEquipmentPrice - amountOfMoney);
        }


    }
}
