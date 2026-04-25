import java.io.*;
import java.util.Scanner;

public class StudentFileData {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            FileOutputStream fout = new FileOutputStream("student.dat");
            DataOutputStream dout = new DataOutputStream(fout);

            System.out.print("Enter Name: ");
            String studentName = input.nextLine();

            System.out.print("Enter Age: ");
            int studentAge = input.nextInt();

            System.out.print("Enter Weight: ");
            double studentWeight = input.nextDouble();

            System.out.print("Enter Height: ");
            double studentHeight = input.nextDouble();
            input.nextLine();

            System.out.print("Enter City: ");
            String studentCity = input.nextLine();

            System.out.print("Enter Phone Number: ");
            long studentPhone = input.nextLong();

            // Writing data
            dout.writeUTF(studentName);
            dout.writeInt(studentAge);
            dout.writeDouble(studentWeight);
            dout.writeDouble(studentHeight);
            dout.writeUTF(studentCity);
            dout.writeLong(studentPhone);

            dout.close();
            fout.close();

            System.out.println("\nData saved successfully!\n");

            FileInputStream fin = new FileInputStream("student.dat");
            DataInputStream din = new DataInputStream(fin);

            // Reading data
            System.out.println("Name: " + din.readUTF());
            System.out.println("Age: " + din.readInt());
            System.out.println("Weight: " + din.readDouble());
            System.out.println("Height: " + din.readDouble());
            System.out.println("City: " + din.readUTF());
            System.out.println("Phone: " + din.readLong());

            din.close();
            fin.close();

        } catch (IOException ex) {
            System.out.println("Error occurred: " + ex.getMessage());
        }

        input.close();
    }
}