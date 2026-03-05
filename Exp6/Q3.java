import java.io.*;

public class Q3 {
    public static void main(String[] args) {
        // Filename as specified in the lab manual
        String fileName = "sample.txt";
        
        int vowelCount = 0;
        int wordCount = 0;
        int charACount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            
            while ((line = reader.readLine()) != null) {
                // 1. Calculate total number of words
                // Split by whitespace to identify individual words
                if (!line.trim().isEmpty()) {
                    wordCount += line.trim().split("\\s+").length;
                }

                // Convert line to lowercase for easier character matching
                String lowerLine = line.toLowerCase();
                
                for (int i = 0; i < lowerLine.length(); i++) {
                    char ch = lowerLine.charAt(i);

                    // 2. Calculate total number of vowels
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowelCount++;
                    }

                    // 3. Calculate number of times character 'a' appears
                    if (ch == 'a') {
                        charACount++;
                    }
                }
            }

            // Displaying the final results
            System.out.println("--- Analysis for " + fileName + " ---");
            System.out.println("Total number of vowels: " + vowelCount);
            System.out.println("Total number of words: " + wordCount);
            System.out.println("Frequency of character 'a': " + charACount);

        } catch (FileNotFoundException e) {
            System.err.println("Error: The file '" + fileName + "' was not found.");
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
