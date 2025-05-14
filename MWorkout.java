import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class MWorkout extends JFrame implements ActionListener {
    JButton clickme1,  clickme2,  clickme3;

    MWorkout() {

        setBounds(355, 135, 1545, 850);
        setTitle("FitMantra");
        setLayout(null);
        setBackground(Color.white);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/max2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 914, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 814);
        add(image);

        clickme1 = new JButton("Let's Do It");
        clickme1.setBackground(new Color(147, 215, 11));
        clickme1.setForeground(new Color(5, 54, 94));
        clickme1.setBounds(20, 10, 200, 50);
        clickme1.setFont(new Font("SAN_SERIF", Font.PLAIN, 40));
        clickme1.setBorder(new LineBorder(Color.WHITE));
        image.add(clickme1);
        clickme1.addActionListener(this);

        clickme2 = new JButton("Let's Do It");
        clickme2.setBackground(new Color(147, 215, 11));
        clickme2.setForeground(new Color(5, 54, 94));
        clickme2.setBounds(20, 70, 200, 50);
        clickme2.setFont(new Font("SAN_SERIF", Font.PLAIN, 40));
        clickme2.setBorder(new LineBorder(Color.WHITE));
        image.add(clickme2);
        clickme2.addActionListener(this);

        clickme3 = new JButton("Let's Do It");
        clickme3.setBackground(new Color(147, 215, 11));
        clickme3.setForeground(new Color(5, 54, 94));
        clickme3.setBounds(20, 130, 200, 50);
        clickme3.setFont(new Font("SAN_SERIF", Font.PLAIN, 40));
        clickme3.setBorder(new LineBorder(Color.WHITE));
        image.add(clickme3);
        clickme3.addActionListener(this);

       

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clickme1) {
            new MaxStrength1();
        } else if (ae.getSource() == clickme2) {
            new MaxStrength2();
        } else if (ae.getSource() == clickme3) {
            new MaxStrength3();
        } 
    }

    public static void main(String[] args) {
        new MWorkout();

    }
}
