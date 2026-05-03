import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class StopwatchApp extends JFrame implements Runnable {

    JLabel timeLabel;
    JButton btnStart, btnStop, btnReset;

    int time = 0;
    boolean isRunning = false;
    Thread thread;

    public StopwatchApp() {
        timeLabel = new JLabel("Time: 0 sec");
        timeLabel.setFont(new Font("Arial", Font.BOLD, 20));

        btnStart = new JButton("Start");
        btnStop = new JButton("Stop");
        btnReset = new JButton("Clear");

        btnStart.addActionListener(e -> {
            if (!isRunning) {
                isRunning = true;
                thread = new Thread(this);
                thread.start();
            }
        });

        btnStop.addActionListener(e -> isRunning = false);

        btnReset.addActionListener(e -> {
            isRunning = false;
            time = 0;
            timeLabel.setText("Time: 0 sec");
        });

        setLayout(new FlowLayout());
        add(timeLabel);
        add(btnStart);
        add(btnStop);
        add(btnReset);

        setSize(320, 160);
        setTitle("Stopwatch App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void run() {
        while (isRunning) {
            time++;
            timeLabel.setText("Time: " + time + " sec");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                // ignore
            }
        }
    }

    public static void main(String[] args) {
        new StopwatchApp();
    }
}