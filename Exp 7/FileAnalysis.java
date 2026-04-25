import java.io.*;

public class FileAnalysis {
    public static void main(String[] args) {

        int vowelCount = 0;
        int wordCount = 0;
        int aOccurrences = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
            String text;

            while ((text = reader.readLine()) != null) {

                wordCount += text.trim().isEmpty() ? 0 : text.trim().split("\\s+").length;

                for (int i = 0; i < text.length(); i++) {
                    char ch = Character.toLowerCase(text.charAt(i));

                    if (ch == 'a') {
                        aOccurrences++;
                    }

                    if ("aeiou".indexOf(ch) != -1) {
                        vowelCount++;
                    }
                }
            }

            reader.close();

            System.out.println("Total Vowels: " + vowelCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Count of 'a': " + aOccurrences);

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}