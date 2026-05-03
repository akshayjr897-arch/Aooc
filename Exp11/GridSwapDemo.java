import java.awt.*;
import java.awt.event.*;

public class GridSwapDemo extends Frame implements ActionListener {

    Button[] buttons = new Button[6];
    int selectedIndex = -1;

    GridSwapDemo() {
        setLayout(new GridLayout(2, 3, 5, 5));

        for (int i = 0; i < 6; i++) {
            buttons[i] = new Button("" + (i + 1));
            buttons[i].addActionListener(this);
            add(buttons[i]);
        }

        setSize(320, 220);
        setTitle("Grid Button Swap");
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Button clickedBtn = (Button) e.getSource();

        if (selectedIndex == -1) {
            for (int i = 0; i < 6; i++) {
                if (buttons[i] == clickedBtn) {
                    selectedIndex = i;
                    break;
                }
            }
        } else {
            for (int i = 0; i < 6; i++) {
                if (buttons[i] == clickedBtn) {

                    String tempValue = buttons[selectedIndex].getLabel();
                    buttons[selectedIndex].setLabel(buttons[i].getLabel());
                    buttons[i].setLabel(tempValue);

                    selectedIndex = -1;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        new GridSwapDemo();
    }
}