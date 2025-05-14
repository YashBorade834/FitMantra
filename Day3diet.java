import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Day3diet extends JFrame {
    Day3diet() {

        setLayout(null);
        setBounds(600, 200, 1210, 750);
        setTitle("FitMantra");
        setLayout(null);
        setBackground(Color.BLACK);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/banana.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(30, 10, 350, 300);
        add(image);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("images/oatmeal.jpg"));
        Image i12 = i11.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon i13 = new ImageIcon(i12);
        JLabel image1 = new JLabel(i13);
        image1.setBounds(30, 350, 350, 300);
        add(image1);

        ImageIcon i21 = new ImageIcon(ClassLoader.getSystemResource("images/milk.jpg"));
        Image i22 = i21.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon i23 = new ImageIcon(i22);
        JLabel image2 = new JLabel(i23);
        image2.setBounds(410, 10, 350, 300);
        add(image2);

        ImageIcon i31 = new ImageIcon(ClassLoader.getSystemResource("images/pulses.jpg"));
        Image i32 = i31.getImage().getScaledInstance(350, 300, Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i32);
        JLabel image3 = new JLabel(i33);
        image3.setBounds(810, 10, 350, 300);
        add(image3);

        ImageIcon i41 = new ImageIcon(ClassLoader.getSystemResource("images/cabage.jpg"));
        Image i42 = i41.getImage().getScaledInstance(350, 300, Image.SCALE_DEFAULT);
        ImageIcon i43 = new ImageIcon(i42);
        JLabel image4 = new JLabel(i43);
        image4.setBounds(410, 350, 350, 300);
        add(image4);

        ImageIcon i51 = new ImageIcon(ClassLoader.getSystemResource("images/amla.jpg"));
        Image i52 = i51.getImage().getScaledInstance(350, 350, Image.SCALE_DEFAULT);
        ImageIcon i53 = new ImageIcon(i52);
        JLabel image5 = new JLabel(i53);
        image5.setBounds(810, 350, 350, 300);
        add(image5);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Day3diet();

    }
}
