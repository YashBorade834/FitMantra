import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Chest extends JFrame {
    Chest() {
        setBounds(600, 200, 1210, 750);
        setTitle("FitMantra");
        setLayout(null);
        setBackground(Color.BLACK);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/chest.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1042, 678, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(80, 15, 1042, 678);
        add(image);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Chest();

    }
}
