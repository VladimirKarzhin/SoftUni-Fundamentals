package _05_ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class _10_PokeMon {
    public static void main(String[] args) {

        //You will be given the poke power the Poke Mon has, N – an integer.
        //Then you will be given the distance between the poke targets, M – an integer.
        //Then you will be given the exhaustionFactor Y – an integer.

        Scanner scanner = new Scanner(System.in);

        int pokeMonPokePowerN = Integer.parseInt(scanner.nextLine());
        int distanceM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());

        //Your task is to start subtracting M from N until N becomes less than M
        //IF N becomes equal to EXACTLY 50 %
        // of its original value, you must divide N by Y,
        // if it is POSSIBLE.
        int countOfPokes = 0;
        int pokeMonPokePowerNOriginalValue = pokeMonPokePowerN;

        while (pokeMonPokePowerN >= distanceM) {

                pokeMonPokePowerN -= distanceM;
                countOfPokes++;

            if (pokeMonPokePowerN == pokeMonPokePowerNOriginalValue / 2) {
                if (exhaustionFactorY != 0) {
                pokeMonPokePowerN /= exhaustionFactorY;
                }
            }
        }
        System.out.println(pokeMonPokePowerN);
        System.out.println(countOfPokes);
    }
}
