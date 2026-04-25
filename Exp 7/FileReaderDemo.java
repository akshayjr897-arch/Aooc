import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {

        try {
            File f = new File("sample.txt");
            FileInputStream input = new FileInputStream(f);
            int data;

            while ((data = input.read()) != -1) {
                System.out.print((char) data);
            }

            input.close();

        } catch (IOException ex) {
            System.out.println("Error occurred: " + ex.getMessage());
        }
    }
}