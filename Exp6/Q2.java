import java.io.*;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        String fileName = "student_info.dat";
        Scanner sc = new Scanner(System.in);

        try {
            // 1. Accept student information from the user
            System.out.println("--- Enter Student Information ---");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Weight: ");
            double weight = sc.nextDouble();
            System.out.print("Height: ");
            double height = sc.nextDouble();
            System.out.print("City: ");
            String city = sc.next();
            System.out.print("Phone Number: ");
            long phone = sc.nextLong();

            // 2. Store information in a file using DataOutputStream and FileOutputStream
            FileOutputStream fos = new FileOutputStream(fileName);
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeUTF(name);
            dos.writeInt(age);
            dos.writeDouble(weight);
            dos.writeDouble(height);
            dos.writeUTF(city);
            dos.writeLong(phone);

            dos.close();
            System.out.println("\nData successfully stored in " + fileName);

            // 3. Retrieve and display the data using DataInputStream and FileInputStream
            System.out.println("\n--- Retrieving Data from File ---");
            FileInputStream fis = new FileInputStream(fileName);
            DataInputStream dis = new DataInputStream(fis);

            System.out.println("Name: " + dis.readUTF());
            System.out.println("Age: " + dis.readInt());
            System.out.println("Weight: " + dis.readDouble() + " kg");
            System.out.println("Height: " + dis.readDouble() + " cm");
            System.out.println("City: " + dis.readUTF());
            System.out.println("Phone: " + dis.readLong());

            dis.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
