import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BgColorApp extends JFrame implements ActionListener {

    JComboBox<String> colorBox;

    String[] colorList = {"Red", "Green", "Blue", "Yellow"};

    BgColorApp() {
        setTitle("Color Selector");
        setSize(300, 250);
        setLayout(null);

        colorBox = new JComboBox<>(colorList);
        colorBox.setBounds(90, 90, 140, 30);

        add(colorBox);

        colorBox.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String selectedColor = (String) colorBox.getSelectedItem();

        if (selectedColor.equals("Red")) {
            getContentPane().setBackground(Color.RED);
        } 
        else if (selectedColor.equals("Green")) {
            getContentPane().setBackground(Color.GREEN);
        } 
        else if (selectedColor.equals("Blue")) {
            getContentPane().setBackground(Color.BLUE);
        } 
        else {
            getContentPane().setBackground(Color.YELLOW);
        }
    }

    public static void main(String[] args) {
        new BgColorApp();
    }
}