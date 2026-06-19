import java.io.*;

public class CustomerFeedbackAnalyzer {
    public static void main(String[] args) {
        String keyword = "good";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter 5 feedback messages:");
            for (int i = 0; i < 5; i++) {
                String line = br.readLine();
                if (line != null && line.toLowerCase().contains(keyword)) {
                    count++;
                }
            }
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }

        System.out.println("Good Feedback Count = " + count);
    }
}