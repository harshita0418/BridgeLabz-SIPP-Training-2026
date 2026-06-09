import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double userValue;

        System.out.print("Enter a number (0 to stop): ");
        userValue = scanner.nextDouble();

        while (userValue != 0) {
            total += userValue;
            System.out.print("Enter a number (0 to stop): ");
            userValue = scanner.nextDouble();
        }

        System.out.println("Total = " + total);
        scanner.close();
    }
}