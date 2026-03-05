import java.util.Scanner;

class Student {
    int rollNo;

    void getRoll(int r) {
        rollNo = r;
    }

    void displayRoll() {
        System.out.println("Roll No: " + rollNo);
    }
}

class Test extends Student {
    int sub1, sub2;

    void getMarks(int m1, int m2) {
        sub1 = m1;
        sub2 = m2;
    }

    void displayMarks() {
        System.out.println("Subject1: " + sub1);
        System.out.println("Subject2: " + sub2);
    }
}

class Result extends Test {
    void displayResult() {
        int total = sub1 + sub2;
        System.out.println("Total: " + total);
        System.out.println("Average: " + (total / 2.0));
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Result r = new Result();

        System.out.print("Enter roll no: ");
        r.getRoll(sc.nextInt());

        System.out.print("Enter marks of subject1 and subject2: ");
        r.getMarks(sc.nextInt(), sc.nextInt());

        r.displayRoll();
        r.displayMarks();
        r.displayResult();
    }
}