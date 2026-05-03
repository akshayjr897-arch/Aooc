import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MovingBallPanel extends JPanel implements Runnable {

    int posX = 60, posY = 60;
    int speedX = 2, speedY = 2;
    int size = 20;
    Thread thread;

    public MovingBallPanel() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (thread == null) {
                    thread = new Thread(MovingBallPanel.this);
                    thread.start();
                }
            }
        });
    }

    public void run() {
        while (true) {
            posX += speedX;
            posY += speedY;

            if (posX <= 0 || posX + size >= getWidth()) {
                speedX = -speedX;
            }
            if (posY <= 0 || posY + size >= getHeight()) {
                speedY = -speedY;
            }

            repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                // ignore
            }
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(posX, posY, size, size);
    }
}

public class BallAnimationApp {
    public static void main(String[] args) {

        JFrame window = new JFrame("Ball Animation");
        MovingBallPanel panel = new MovingBallPanel();

        window.add(panel);
        window.setSize(420, 420);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}