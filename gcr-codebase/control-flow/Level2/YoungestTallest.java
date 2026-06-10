import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ages of Amar, Akbar, and Anthony:");
        int amarAge = sc.nextInt();
        int akbarAge = sc.nextInt();
        int anthonyAge = sc.nextInt();

        System.out.println("Enter heights of Amar, Akbar, and Anthony (in cm):");
        double amarHeight = sc.nextDouble();
        double akbarHeight = sc.nextDouble();
        double anthonyHeight = sc.nextDouble();

        // Find youngest
        int minAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        if (minAge == amarAge) {
            System.out.println("Youngest friend: Amar (Age: " + amarAge + ")");
        } else if (minAge == akbarAge) {
            System.out.println("Youngest friend: Akbar (Age: " + akbarAge + ")");
        } else {
            System.out.println("Youngest friend: Anthony (Age: " + anthonyAge + ")");
        }

        // Find tallest
        double maxHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        if (maxHeight == amarHeight) {
            System.out.println("Tallest friend: Amar (Height: " + amarHeight + " cm)");
        } else if (maxHeight == akbarHeight) {
            System.out.println("Tallest friend: Akbar (Height: " + akbarHeight + " cm)");
        } else {
            System.out.println("Tallest friend: Anthony (Height: " + anthonyHeight + " cm)");
        }

        sc.close();
    }
}