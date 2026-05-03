import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class FactorialApplet extends Applet implements ActionListener {

    TextField txtInput, txtResult;
    Button btnCalc;

    public void init() {
        add(new Label("Enter Number:"));

        txtInput = new TextField(10);
        add(txtInput);

        btnCalc = new Button("Calculate");
        add(btnCalc);

        add(new Label("Output:"));

        txtResult = new TextField(10);
        add(txtResult);

        btnCalc.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int n = Integer.parseInt(txtInput.getText());
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        txtResult.setText(Integer.toString(result));
    }
}