import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        if (years > 5) {
            double bonus = salary * 5 / 100;
            System.out.println("Employee is eligible for a bonus.");
            System.out.println("Bonus Amount: " + bonus);
        } else {
            System.out.println("Employee is not eligible for a bonus.");
        }
        sc.close();
    }
}