import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StationeryOrder extends JFrame implements ActionListener {

    JCheckBox chkNotebook, chkPen, chkPencil;
    JButton btnOrder;

    StationeryOrder() {
        setTitle("Stationery Billing System");
        setSize(360, 300);
        setLayout(new FlowLayout());

        chkNotebook = new JCheckBox("Notebook (Rs 50)");
        chkPen = new JCheckBox("Pen (Rs 20)");
        chkPencil = new JCheckBox("Pencil (Rs 10)");

        btnOrder = new JButton("Submit Order");

        add(chkNotebook);
        add(chkPen);
        add(chkPencil);
        add(btnOrder);

        btnOrder.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        int totalAmount = 0;
        String details = "";

        if (chkNotebook.isSelected()) {
            int q = Integer.parseInt(
                JOptionPane.showInputDialog("Enter Notebook quantity")
            );
            totalAmount += q * 50;
            details += "Notebook: " + q + "\n";
        }

        if (chkPen.isSelected()) {
            int q = Integer.parseInt(
                JOptionPane.showInputDialog("Enter Pen quantity")
            );
            totalAmount += q * 20;
            details += "Pen: " + q + "\n";
        }

        if (chkPencil.isSelected()) {
            int q = Integer.parseInt(
                JOptionPane.showInputDialog("Enter Pencil quantity")
            );
            totalAmount += q * 10;
            details += "Pencil: " + q + "\n";
        }

        details += "\nTotal Bill: " + totalAmount;

        JOptionPane.showMessageDialog(this, details, "Order Summary", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(this, "Order Completed!", "Status", JOptionPane.WARNING_MESSAGE);
    }

    public static void main(String[] args) {
        new StationeryOrder();
    }
}