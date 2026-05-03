import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener {

    JTextField display;
    String firstNum = "", secondNum = "", op = "";

    SimpleCalculator() {
        setTitle("Simple Calculator");
        setSize(320, 400);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 20));
        add(display, BorderLayout.NORTH);

        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new GridLayout(5, 4));

        String keys[] = {
                "7","8","9","/",
                "4","5","6","*",
                "1","2","3","-",
                "0","C","=","+",
                "%","√","x²",""
        };

        for (String k : keys) {
            JButton b = new JButton(k);
            b.setFont(new Font("Arial", Font.BOLD, 16));
            b.addActionListener(this);
            btnPanel.add(b);
        }

        add(btnPanel, BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();

        if (action.matches("[0-9]")) {
            display.setText(display.getText() + action);
        }
        else if (action.equals("C")) {
            display.setText("");
            firstNum = secondNum = op = "";
        }
        else if (action.equals("=")) {
            secondNum = display.getText();

            double a = Double.parseDouble(firstNum);
            double b = Double.parseDouble(secondNum);
            double res = 0;

            switch (op) {
                case "+": res = a + b; break;
                case "-": res = a - b; break;
                case "*": res = a * b; break;
                case "/": res = a / b; break;
            }

            display.setText(Double.toString(res));
        }
        else if (action.equals("√")) {
            double v = Double.parseDouble(display.getText());
            display.setText(Double.toString(Math.sqrt(v)));
        }
        else if (action.equals("x²")) {
            double v = Double.parseDouble(display.getText());
            display.setText(Double.toString(v * v));
        }
        else {
            op = action;
            firstNum = display.getText();
            display.setText("");
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}