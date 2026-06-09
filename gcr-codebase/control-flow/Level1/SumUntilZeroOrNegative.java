import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double userValue = scanner.nextDouble();

            if (userValue <= 0) {
                break;
            }

            total += userValue;
        }

        System.out.println("Total = " + total);
        scanner.close();
    }
}