package _04_LabDataTypesAndVariables;

import java.util.Scanner;

public class _09_CenturiesToMinutes {
    public static void main(String[] args) {

        //years, days, hours, and minutes
        Scanner scanner = new Scanner(System.in);
        int countCenturies = Integer.parseInt(scanner.nextLine());

        System.out.printf("%d centuries = %d years = %.0f days = %.0f hours = %.0f minutes", countCenturies,
                countCenturies * 100,
                (countCenturies * 100) * 365.2422 ,
                ((countCenturies * 100) * 365.2422 ) * 24,
                (((countCenturies * 100) * 365.2422 ) * 24) * 60);

    }
}
