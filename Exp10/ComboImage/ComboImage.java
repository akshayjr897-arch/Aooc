import javax.swing.*;
import java.awt.event.*;

public class ComboImage extends JFrame implements ActionListener {
    JComboBox<String> combo;
    JLabel label;

    String[] images = {"Bugatti.jpg", "Porsche.jpg"};

    ComboImage() {
        combo = new JComboBox<>(images);
        label = new JLabel();

        combo.setBounds(100, 50, 120, 30);
        label.setBounds(50, 100, 200, 150);

        combo.addActionListener(this);

        add(combo);
        add(label);

        setSize(300, 300);
        setLayout(null);
        setTitle("Image Viewer");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String img = (String) combo.getSelectedItem();
        label.setIcon(new ImageIcon(getClass().getResource(img)));
    }

    public static void main(String[] args) {
        new ComboImage();
    }
}