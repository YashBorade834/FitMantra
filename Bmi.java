import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Bmi extends JFrame implements ActionListener {
    JTextField jtfheight, jtfweight, jtfbmi, jtfcatagory;
    JButton jb2;

    Bmi() {

        setBounds(1400, 135, 500, 550);
        setTitle("FitMantra");
        setLayout(null);
        setBackground(Color.white);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane);

        JLabel height = new JLabel("Height");
        height.setBounds(120, 20, 100, 100);
        height.setForeground(Color.black);
        height.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(height);

        jtfheight = new JTextField();
        jtfheight.setBounds(240, 50, 100, 40);
        jtfheight.setFont(new Font("SAN_SERIF", Font.PLAIN, 25));
        jtfheight.setBorder(BorderFactory.createEmptyBorder());
        add(jtfheight);

        JLabel weight = new JLabel("Weight");
        weight.setBounds(120, 100, 140, 100);
        weight.setForeground(Color.black);
        weight.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(weight);

        jtfweight = new JTextField();
        jtfweight.setBounds(240, 130, 100, 40);
        jtfweight.setFont(new Font("SAN_SERIF", Font.PLAIN, 25));
        jtfweight.setBorder(BorderFactory.createEmptyBorder());
        add(jtfweight);

        jb2 = new JButton("Calculate");
        jb2.setBounds(140, 210, 200, 50);
        jb2.setForeground(new Color(147, 215, 11));
        jb2.setBackground(Color.black);
        jb2.setFont(new Font("SAN_SERIF", Font.PLAIN, 35));
        add(jb2);
        jb2.addActionListener(this);

        JLabel bmi = new JLabel("Body-Mass-Index");
        bmi.setBounds(40, 270, 310, 100);
        bmi.setForeground(Color.black);
        bmi.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(bmi);

        jtfbmi = new JTextField();
        jtfbmi.setBounds(320, 300, 100, 40);
        jtfbmi.setFont(new Font("SAN_SERIF", Font.PLAIN, 25));
        jtfbmi.setBorder(BorderFactory.createEmptyBorder());
        add(jtfbmi);

        JLabel catagory = new JLabel("Category");
        catagory.setBounds(40, 340, 310, 100);
        catagory.setForeground(Color.black);
        catagory.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(catagory);

        jtfcatagory = new JTextField();
        jtfcatagory.setBounds(230, 370, 200, 40);
        jtfcatagory.setFont(new Font("SAN_SERIF", Font.PLAIN, 25));
        jtfcatagory.setBorder(BorderFactory.createEmptyBorder());
        add(jtfcatagory);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == jb2) {
            Float h = Float.parseFloat(jtfheight.getText());

            Float w = Float.parseFloat(jtfweight.getText());

            Float ans = w / (h * h);
            String sans = Float.toString(Math.round(ans));
            jtfbmi.setText(sans);

            if (ans < 18.5) {
                jtfcatagory.setText("Under Weight");
            } else if (ans >= 18.5 && ans < 24.5) {
                jtfcatagory.setText("Normal Weight");
            } else if (ans >= 25 && ans < 29.5) {
                jtfcatagory.setText("Over Weight");
            } else if (ans >= 30) {
                jtfcatagory.setText("Obese");
            }
        }
    }

    public static void main(String[] args) {
        new Bmi();

    }
}
