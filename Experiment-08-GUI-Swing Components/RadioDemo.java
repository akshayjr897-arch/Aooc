import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioDemo extends JFrame implements ActionListener {

    JRadioButton rbMale, rbFemale;
    JButton btnSubmit;
    JLabel lblResult;

    RadioDemo() {
        setLayout(new FlowLayout());

        rbMale = new JRadioButton("Male");
        rbFemale = new JRadioButton("Female");

        ButtonGroup group = new ButtonGroup();
        group.add(rbMale);
        group.add(rbFemale);

        btnSubmit = new JButton("Check");
        lblResult = new JLabel("Result will appear here");

        add(rbMale);
        add(rbFemale);
        add(btnSubmit);
        add(lblResult);

        btnSubmit.addActionListener(this);

        setSize(320, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String message;

        if (rbMale.isSelected()) {
            message = "You selected Male";
        } else if (rbFemale.isSelected()) {
            message = "You selected Female";
        } else {
            message = "Nothing selected";
        }

        lblResult.setText(message);
    }

    public static void main(String[] args) {
        new RadioDemo();
    }
}