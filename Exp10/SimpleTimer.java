import javax.swing.*;
import java.awt.event.*;

public class SimpleTimer extends JFrame implements ActionListener {

    JButton btnStart, btnStop;
    JLabel lblTime;
    Timer t;
    int seconds = 0;

    SimpleTimer() {
        btnStart = new JButton("Start Timer");
        btnStop = new JButton("Stop Timer");
        lblTime = new JLabel("0");

        btnStart.setBounds(40, 100, 100, 30);
        btnStop.setBounds(150, 100, 100, 30);
        lblTime.setBounds(130, 50, 100, 30);

        add(btnStart);
        add(btnStop);
        add(lblTime);

        btnStart.addActionListener(this);
        btnStop.addActionListener(this);

        t = new Timer(1000, e -> {
            seconds++;
            lblTime.setText(Integer.toString(seconds));
        });

        setSize(320, 250);
        setLayout(null);
        setTitle("Simple Timer App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == btnStart) {
            t.start();
        } else if (src == btnStop) {
            t.stop();
        }
    }

    public static void main(String[] args) {
        new SimpleTimer();
    }
}