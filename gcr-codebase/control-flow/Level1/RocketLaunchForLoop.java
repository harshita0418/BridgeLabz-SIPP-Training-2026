import java.util.Scanner;

public class RocketLaunchForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter countdown start value: ");
        int start = scanner.nextInt();

        System.out.println("\n--- Rocket Launch Countdown ---");

        for (int counter = start; counter >= 1; counter--) {
            System.out.println(counter + "...");
        }

        System.out.println("🚀 Blast Off!");

        scanner.close();
    }
}