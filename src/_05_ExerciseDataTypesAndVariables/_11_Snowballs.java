package _05_ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class _11_Snowballs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        double snowballValueMax = 0;
        int snowballSnowMax = 0;
        int snowballTimeMax = 0;
        int snowballQualityMax = 0;

        for (int i = 0; i < N; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime  = Integer.parseInt(scanner.nextLine());
            int snowballQuality  = Integer.parseInt(scanner.nextLine());

            double snowballValueInside = Math.pow((double) snowballSnow / snowballTime, snowballQuality);

            if (snowballValueInside > snowballValueMax) {
                snowballValueMax = snowballValueInside;
                snowballSnowMax = snowballSnow;
                snowballTimeMax = snowballTime;
                snowballQualityMax = snowballQuality;
            }


        }
        System.out.printf("%d : %d = %.0f (%d)", snowballSnowMax, snowballTimeMax, snowballValueMax, snowballQualityMax);
    }
}
