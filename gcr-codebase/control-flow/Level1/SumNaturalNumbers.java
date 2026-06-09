import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number (n > 0): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Please enter a natural number greater than 0.");
        } else {
            long formulaResult = (long) n * (n + 1) / 2;

            long loopResult = 0;
            int i = 1;
            while (i <= n) {
                loopResult += i;
                i++;
            }
            System.out.println("Sum using formula  n*(n+1)/2  = " + formulaResult);
            System.out.println("Sum using while loop          = " + loopResult);

            if (formulaResult == loopResult) {
                System.out.println("Both results match! The computation is correct.");
            } else {
                System.out.println("Results do not match. Something went wrong.");
            }
        }

        scanner.close();
    }
}