import java.io.*;

public class GroceryBillReader {
    public static void main(String[] args) {
        String fileName = "bill.txt";
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                lineCount++;
            }
            System.out.println("Total number of lines: " + lineCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}