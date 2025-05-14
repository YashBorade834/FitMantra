import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Mydiet extends JFrame implements ActionListener {
    JButton day1, day2, day3, day4, day5, day6, day7;

    Mydiet() {

        setBounds(355, 135, 1545, 850);
        setTitle("FitMantra");
        setBackground(Color.white);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/diet.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 860, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 500, 500);
        add(image);

        day1 = new JButton("Day 1");
        day1.setBackground(new Color(147, 215, 11));
        day1.setForeground(new Color(5, 54, 94));
        day1.setBounds(20, 10, 200, 50);
        day1.setFont(new Font("SAN_SERIF", Font.PLAIN, 40));
        day1.setBorder(new LineBorder(Color.WHITE));
        image.add(day1);
        day1.addActionListener(this);

        day2 = new JButton("Day 2");
        day2.setBackground(new Color(147, 215, 11));
        day2.setForeground(new Color(5, 54, 94));
        day2.setBounds(20, 70, 200, 50);
        day2.setFont(new Font("SAN_SERIF", Font.PLAIN, 40));
        day2.setBorder(new LineBorder(Color.WHITE));
        image.add(day2);
        day2.addActionListener(this);

        day3 = new JButton("Day 3");
        day3.setBackground(new Color(147, 215, 11));
        day3.setForeground(new Color(5, 54, 94));
        day3.setBounds(20, 130, 200, 50);
        day3.setFont(new Font("SAN_SERIF", Font.PLAIN, 40));
        day3.setBorder(new LineBorder(Color.WHITE));
        image.add(day3);
        day3.addActionListener(this);

        day4 = new JButton("Day 4");
        day4.setBackground(new Color(147, 215, 11));
        day4.setForeground(new Color(5, 54, 94));
        day4.setBounds(20, 190, 200, 50);
        day4.setFont(new Font("SAN_SERIF", Font.PLAIN, 40));
        day4.setBorder(new LineBorder(Color.WHITE));
        image.add(day4);
        day4.addActionListener(this);

        day5 = new JButton("Day 5");
        day5.setBackground(new Color(147, 215, 11));
        day5.setForeground(new Color(5, 54, 94));
        day5.setBounds(20, 250, 200, 50);
        day5.setFont(new Font("SAN_SERIF", Font.PLAIN, 40));
        day5.setBorder(new LineBorder(Color.WHITE));
        image.add(day5);
        day5.addActionListener(this);

        day6 = new JButton("Day 6");
        day6.setBackground(new Color(147, 215, 11));
        day6.setForeground(new Color(5, 54, 94));
        day6.setBounds(20, 310, 200, 50);
        day6.setFont(new Font("SAN_SERIF", Font.PLAIN, 40));
        day6.setBorder(new LineBorder(Color.WHITE));
        image.add(day6);
        day6.addActionListener(this);

        day7 = new JButton("Day 7");
        day7.setBackground(new Color(147, 215, 11));
        day7.setForeground(new Color(5, 54, 94));
        day7.setBounds(20, 370, 200, 50);
        day7.setFont(new Font("SAN_SERIF", Font.PLAIN, 40));
        day7.setBorder(new LineBorder(Color.WHITE));
        image.add(day7);
        day7.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == day1) {
            new Day1diet();
        } else if (ae.getSource() == day2) {
            new Day2diet();
        } else if (ae.getSource() == day3) {
            new Day3diet();
        } else if (ae.getSource() == day4) {
            new Day4diet();
        } else if (ae.getSource() == day5) {
            new Day5diet();
        } else if (ae.getSource() == day6) {
            new Day6diet();
        } else if (ae.getSource() == day7) {
            new Day7diet();
        }
    }

    public static void main(String[] args) {
        new Mydiet();

    }
}
