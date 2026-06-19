import java.io.*;
import java.util.Scanner;

public class DailyExpenseLogger {
    public static void main(String[] args) {
        String fileName = "expenses.txt";

        try (Scanner scanner = new Scanner(System.in);
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {

            System.out.print("Enter number of expenses: ");
            int n = Integer.parseInt(scanner.nextLine().trim());

            for (int i = 0; i < n; i++) {
                System.out.print("Enter category: ");
                String category = scanner.nextLine().trim();
                System.out.print("Enter amount: ");
                String amount = scanner.nextLine().trim();
                bw.write(category + " - " + amount);
                bw.newLine();
            }

            System.out.println("Expenses saved to " + fileName);

        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}