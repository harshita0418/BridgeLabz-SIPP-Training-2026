import java.util.Scanner;

public class SplitTextWithoutSplit {

    
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
    public static String[] splitText(String text) {

        int len = findLength(text);

        int words = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words++;
            }
        }

        int[] spaces = new int[words + 1];
        int index = 0;

        spaces[index++] = -1; // Starting boundary

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaces[index++] = i;
            }
        }

        spaces[index] = len; // Ending boundary

        String[] result = new String[words];

        for (int i = 0; i < words; i++) {
            String word = "";

            for (int j = spaces[i] + 1; j < spaces[i + 1]; j++) {
                word = word + text.charAt(j);
            }

            result[i] = word;
        }

        return result;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] customSplit = splitText(text);
        String[] builtInSplit = text.split(" ");
        boolean result = compareArrays(customSplit, builtInSplit);

        System.out.println("\nWords using user-defined split:");
        for (String word : customSplit) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split():");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("\nAre both arrays equal? " + result);

        sc.close();
    }
}