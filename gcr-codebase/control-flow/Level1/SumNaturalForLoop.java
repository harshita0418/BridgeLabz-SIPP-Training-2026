import java.util.Scanner;

public class SumNaturalForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
        
            long formulaResult = (long) n * (n + 1) / 2;

            long loopResult = 0;
            for (int i = 1; i <= n; i++) {
                loopResult += i;
            }

            System.out.println("Sum using formula    n*(n+1)/2 = " + formulaResult);
            System.out.println("Sum using for loop             = " + loopResult);

            if (formulaResult == loopResult) {
                System.out.println("Both results match! The computation is correct.");
            } else {
                System.out.println("Results do not match! Something went wrong.");
            }
        }

        scanner.close();
    }
}