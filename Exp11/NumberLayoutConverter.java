import java.awt.*;
import java.awt.event.*;

public class NumberLayoutConverter extends Frame implements ActionListener {

    TextField inputField, outputField;
    Button binBtn, octBtn, hexBtn;

    NumberLayoutConverter() {
        setLayout(new BorderLayout());

        Panel northPanel = new Panel();
        northPanel.add(new Label("Enter Number:"));
        inputField = new TextField(12);
        northPanel.add(inputField);
        add(northPanel, BorderLayout.NORTH);

        Panel centerPanel = new Panel();
        binBtn = new Button("Binary");
        octBtn = new Button("Octal");
        hexBtn = new Button("Hexadecimal");

        centerPanel.add(binBtn);
        centerPanel.add(octBtn);
        centerPanel.add(hexBtn);
        add(centerPanel, BorderLayout.CENTER);

        Panel southPanel = new Panel();
        southPanel.add(new Label("Result:"));
        outputField = new TextField(12);
        southPanel.add(outputField);
        add(southPanel, BorderLayout.SOUTH);

        binBtn.addActionListener(this);
        octBtn.addActionListener(this);
        hexBtn.addActionListener(this);

        setSize(330, 210);
        setTitle("Layout Converter");
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int num = Integer.parseInt(inputField.getText());

        if (e.getSource() == binBtn) {
            outputField.setText(Integer.toBinaryString(num));
        } 
        else if (e.getSource() == octBtn) {
            outputField.setText(Integer.toOctalString(num));
        } 
        else if (e.getSource() == hexBtn) {
            outputField.setText(Integer.toHexString(num));
        }
    }

    public static void main(String[] args) {
        new NumberLayoutConverter();
    }
}