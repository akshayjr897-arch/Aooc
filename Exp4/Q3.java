class Student {
    int rollNo;
    void setRollNo(int r) { rollNo = r; }
    int getRollNo() { return rollNo; }
}

class Test extends Student {
    float sub1, sub2;
    void setMarks(float m1, float m2) { sub1 = m1; sub2 = m2; }
    void getMarks() {
        System.out.println("Marks - Subject 1: " + sub1 + ", Subject 2: " + sub2);
    }
}

interface Sports {
    float sMarks = 10.0f; // Fixed sports weightage
    void set(); // Method to display sports marks
}

class Result extends Test implements Sports {
    public void set() {
        System.out.println("Sports Marks: " + sMarks);
    }

    void display() {
        float total = sub1 + sub2 + sMarks;
        System.out.println("--- Student Result ---");
        System.out.println("Roll No: " + getRollNo());
        getMarks();
        set();
        System.out.println("Total Score: " + total);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Result res = new Result();
        res.setRollNo(101);
        res.setMarks(85.5f, 90.0f);
        res.display();
    }
}
