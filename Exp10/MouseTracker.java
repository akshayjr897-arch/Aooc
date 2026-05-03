import javax.swing.*;
import java.awt.event.*;

public class MouseTracker extends JFrame implements MouseMotionListener {

    JLabel lblPosition;

    MouseTracker() {
        lblPosition = new JLabel("Move the mouse here");
        lblPosition.setBounds(60, 60, 250, 30);

        add(lblPosition);
        addMouseMotionListener(this);

        setSize(420, 300);
        setLayout(null);
        setTitle("Mouse Position Tracker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        lblPosition.setText("Coordinates -> X: " + x + ", Y: " + y);
    }

    public void mouseDragged(MouseEvent e) {
        // no action needed
    }

    public static void main(String[] args) {
        new MouseTracker();
    }
}