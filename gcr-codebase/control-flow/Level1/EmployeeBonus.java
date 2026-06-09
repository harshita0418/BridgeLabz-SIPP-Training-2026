import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter years of service: ");
        int yearsOfService = scanner.nextInt();

        if (yearsOfService > 5) {
            double bonus = salary * 5 / 100;
            System.out.println("Years of service: " + yearsOfService + " years");
            System.out.println("Bonus amount:     " + bonus);
        } else {
            System.out.println("Years of service: " + yearsOfService + " years");
            System.out.println("No bonus applicable (less than or equal to 5 years of service).");
        }

        scanner.close();
    }
}