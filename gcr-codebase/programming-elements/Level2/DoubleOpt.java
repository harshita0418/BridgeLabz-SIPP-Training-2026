import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();

        double result1 = a + b * c;      // b*c first, then + a
        double result2 = a * b + c;      // a*b first, then + c
        double result3 = c + a / b;      // a/b first, then + c
        double result4 = a % b + c;      // a%b first, then + c

        System.out.println("The results of Double Operations are " 
                + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        input.close();
    }
}