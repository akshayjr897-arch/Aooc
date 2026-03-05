import java.io.*;

public class Q1{
    public static void main(String[] args) {
        // Specify the path to your sample.txt file
        File file = new File("sample.txt");
        
        int vowels = 0;
        int words = 0;
        int countA = 0;
        StringBuilder content = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Count words by splitting line by whitespace
                if (!line.trim().isEmpty()) {
                    words += line.trim().split("\\s+").length;
                }
                
                // Process characters for vowels and 'a'
                String lowerLine = line.toLowerCase();
                for (int i = 0; i < lowerLine.length(); i++) {
                    char ch = lowerLine.charAt(i);
                    
                    // Check for vowels
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowels++;
                    }
                    
                    // Count occurrences of character 'a'
                    if (ch == 'a') {
                        countA++;
                    }
                }
            }

            // Display results in the required format
            System.out.println("--- File Analysis Results ---");
            System.out.println("Total number of vowels: " + vowels);
            System.out.println("Total number of words: " + words);
            System.out.println("Occurrences of character 'a': " + countA);

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file 'sample.txt' was not found.");
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}