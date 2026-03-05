class Employee {
    String name;
    String address;
    double salary;
    String jobTitle;

    Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    void calculateBonus() {
        System.out.println("Bonus: " + (salary * 0.1));
    }

    void performanceReport() {
        System.out.println("Performance: Good");
    }

    void manageProject() {
        System.out.println("Managing general tasks");
    }
}

class Manager extends Employee {
    Manager(String n, String a, double s) {
        super(n, a, s, "Manager");
    }

    void manageProject() {
        System.out.println("Managing company projects");
    }
}

class Developer extends Employee {
    Developer(String n, String a, double s) {
        super(n, a, s, "Developer");
    }

    void calculateBonus() {
        System.out.println("Bonus: " + (salary * 0.15));
    }
}

class Programmer extends Employee {
    Programmer(String n, String a, double s) {
        super(n, a, s, "Programmer");
    }

    void performanceReport() {
        System.out.println("Performance: Excellent coding skills");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Manager m = new Manager("Sneha", "Kolhapur", 50000);
        Developer d = new Developer("Riya", "Pune", 40000);
        Programmer p = new Programmer("Ankit", "Mumbai", 35000);

        m.calculateBonus();
        m.manageProject();

        d.calculateBonus();
        d.performanceReport();

        p.calculateBonus();
        p.performanceReport();
    }
}