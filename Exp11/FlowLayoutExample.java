import java.awt.*;

public class FlowLayoutExample extends Frame {

    FlowLayoutExample() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 15, 25));

        Checkbox cbJava = new Checkbox("Java");
        Checkbox cbPython = new Checkbox("Python");
        Checkbox cbCpp = new Checkbox("C++");

        add(cbJava);
        add(cbPython);
        add(cbCpp);

        setSize(320, 220);
        setTitle("Flow Layout Example");
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutExample();
    }
}