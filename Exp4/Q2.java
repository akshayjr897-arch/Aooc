interface Shape {
    void area();
}

class Rectangle implements Shape {
    double length, width;
    Rectangle(double l, double w) { length = l; width = w; }

    public void area() {
        System.out.println("Rectangle Area: " + (length * width));
    }
}

class Triangle implements Shape {
    double base, height;
    Triangle(double b, double h) { base = b; height = h; }

    public void area() {
        System.out.println("Triangle Area: " + (0.5 * base * height));
    }
}

public class Q2 {
    public static void main(String[] args) {
        Shape rect = new Rectangle(10, 5);
        Shape tri = new Triangle(10, 8);
        rect.area();
        tri.area();
    }
}