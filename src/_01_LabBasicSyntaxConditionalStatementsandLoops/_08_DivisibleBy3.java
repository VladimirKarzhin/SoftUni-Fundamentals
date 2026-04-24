package _01_LabBasicSyntaxConditionalStatementsandLoops;

public class _08_DivisibleBy3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i+=3) {
            if (i != 1) {
                System.out.println(i - 1);
            }
        }

    }
}
