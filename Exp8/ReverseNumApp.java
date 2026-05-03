import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReverseNumApp extends JFrame implements ActionListener {

    JTextField txtInput, txtOutput;
    JButton btnReverse;

    ReverseNumApp() {
        setLayout(new FlowLayout());

        JLabel lbl1 = new JLabel("Enter Number:");
        add(lbl1);

        txtInput = new JTextField(10);
        add(txtInput);

        btnReverse = new JButton("Reverse Now");
        add(btnReverse);

        JLabel lbl2 = new JLabel("Result:");
        add(lbl2);

        txtOutput = new JTextField(10);
        txtOutput.setEditable(false);
        add(txtOutput);

        btnReverse.addActionListener(this);

        setSize(320, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String value = txtInput.getText();

        String reversedValue = new StringBuilder(value).reverse().toString();

        txtOutput.setText(reversedValue);
    }

    public static void main(String[] args) {
        new ReverseNumApp();
    }
}