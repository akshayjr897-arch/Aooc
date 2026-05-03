import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CounterApp extends JFrame implements ActionListener {

    JTextField textField;
    JButton btnUp, btnDown, btnReset;
    int value = 0;

    CounterApp() {
        setTitle("Simple Counter");
        setLayout(new FlowLayout());

        JLabel label = new JLabel("Counter:");
        add(label);

        textField = new JTextField("0", 10);
        add(textField);

        btnUp = new JButton("Increment");
        btnDown = new JButton("Decrement");
        btnReset = new JButton("Clear");

        add(btnUp);
        add(btnDown);
        add(btnReset);

        btnUp.addActionListener(this);
        btnDown.addActionListener(this);
        btnReset.addActionListener(this);

        setSize(320, 150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == btnUp) {
            value++;
        } else if (src == btnDown) {
            value--;
        } else if (src == btnReset) {
            value = 0;
        }

        textField.setText(Integer.toString(value));
    }

    public static void main(String[] args) {
        new CounterApp();
    }
}