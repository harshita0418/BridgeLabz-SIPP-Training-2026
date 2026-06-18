class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBilling {
    static double[] bills = {500.0, 1200.0, 800.0};

    static double calculateAverage(int patientIndex, int itemCount) throws InsufficientFundsException {
        try {
            double bill = bills[patientIndex];
            double avg = bill / itemCount;
            return avg;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index - " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero - bill has zero items.");
        }

        double payment = 100.0;
        double required = 500.0;
        if (payment < required) {
            throw new InsufficientFundsException("Payment failed: ₹" + payment + " is less than ₹" + required);
        }
        return -1;
    }

    static void processInput(String input) {
        try {
            double val = Double.parseDouble(input);
            System.out.println("Parsed value: " + val);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format - " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(calculateAverage(1, 3));
            System.out.println(calculateAverage(10, 3));
            System.out.println(calculateAverage(0, 0));
            System.out.println(calculateAverage(0, 2));
        } catch (InsufficientFundsException e) {
            System.out.println("Payment Error: " + e.getMessage());
        }
        processInput("abc");
    }
}