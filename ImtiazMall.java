import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ImtiazMall implements ActionListener {
    JLabel l1, l2, l3, l4, l5;
    JTextField tf1, tf2, tf3, tf4;
    JButton b1;

    ImtiazMall() {
        JFrame f = new JFrame("Imtiaz Mall");

        l2 = new JLabel("Welcome To Imtiaz Mall");
        l2.setBounds(150, 40, 200, 20);
        l1 = new JLabel("Enter Customer Name");
        l1.setBounds(10, 80, 150, 20);
        tf1 = new JTextField();
        tf1.setBounds(150, 80, 150, 20);
        l3 = new JLabel("Enter Item Name");
        l3.setBounds(10, 120, 150, 20);
        tf2 = new JTextField();
        tf2.setBounds(150, 120, 150, 20);
        l4 = new JLabel("Enter Item Quantity");
        l4.setBounds(10, 160, 150, 20);
        tf3 = new JTextField();
        tf3.setBounds(150, 160, 150, 20);
        l5 = new JLabel("Enter Item Price");
        l5.setBounds(10, 200, 150, 20);
        tf4 = new JTextField();
        tf4.setBounds(150, 200, 150, 20);
        b1 = new JButton("Cart");
        b1.setBounds(180, 240, 80, 30);
        b1.addActionListener(this);

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(tf4);
        f.add(b1);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String cname = tf1.getText();
            String iname = tf2.getText();
            String quat = tf3.getText();
            String pr = tf4.getText();

            int quantity = Integer.parseInt(quat);
            double price = Double.parseDouble(pr);
            double total = quantity * price;

            JFrame wf = new JFrame("Slip");
            JLabel wl = new JLabel("<html>Customer Name: " + cname + "<br/>"
                                    + "Item Name: " + iname + "<br/>"
                                    + "Quantity: " + quantity + "<br/>"
                                    + "Price: " + price + "<br/>"
                                    + "Total Price: " + total + "</html>");
            wl.setBounds(50, 50, 300, 100);
            wf.add(wl);

            wf.setSize(400, 200);
            wf.setLayout(null);
            wf.setVisible(true);
            wf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }

    public static void main(String[] args) {
        new ImtiazMall();
    }
}
