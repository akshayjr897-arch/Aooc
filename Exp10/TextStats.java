import javax.swing.*;
import java.awt.event.*;

public class TextStats extends JFrame implements KeyListener {

    JTextArea inputArea;
    JLabel statsLabel;

    TextStats() {
        inputArea = new JTextArea();
        statsLabel = new JLabel("Chars: 0  Words: 0");

        inputArea.setBounds(45, 45, 230, 110);
        statsLabel.setBounds(45, 165, 260, 30);

        inputArea.addKeyListener(this);

        add(inputArea);
        add(statsLabel);

        setSize(330, 270);
        setLayout(null);
        setTitle("Text Statistics");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void keyReleased(KeyEvent e) {
        String textData = inputArea.getText();

        int totalChars = textData.length();
        int totalWords = textData.trim().isEmpty()
                         ? 0
                         : textData.trim().split("\\s+").length;

        statsLabel.setText("Chars: " + totalChars + "  Words: " + totalWords);
    }

    public void keyTyped(KeyEvent e) {
        // nothing here
    }

    public void keyPressed(KeyEvent e) {
        // nothing here
    }

    public static void main(String[] args) {
        new TextStats();
    }
}