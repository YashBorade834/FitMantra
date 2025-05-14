import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Weightloss3 extends JFrame {
    Weightloss3() {

        setLayout(null);
        setBounds(600, 200, 1210, 750);
        setTitle("FitMantra");
        setLayout(null);
        setBackground(Color.BLACK);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/stretching1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1112, 596, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(10, 10, 1160, 650);
        add(image);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Weightloss3();

    }
}
