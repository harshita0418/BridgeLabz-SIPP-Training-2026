import java.io.*;
import java.util.*;

public class SchoolResultPortal {
    public static void main(String[] args) {
        String inputFile = "students.txt";
        String outputFile = "report_card.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile, true))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0].trim();
                double total = 0;
                int count = parts.length - 1;

                for (int i = 1; i < parts.length; i++) {
                    total += Double.parseDouble(parts[i].trim());
                }

                double average = total / count;
                bw.write("Student: " + name + " | Average: " + average);
                bw.newLine();
            }

            System.out.println("Report card written successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}