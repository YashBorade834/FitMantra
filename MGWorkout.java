import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class MGWorkout extends JFrame implements ActionListener {
    JButton chest,  abs,  shoulder, back, leg, bicep;

    MGWorkout() {

        setBounds(355, 135, 1160, 680);
        setTitle("FitMantra");
        setLayout(null);
        setBackground(Color.white);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/muscle.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1520, 825, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1520, 825);
        add(image);

        chest = new JButton("Chest");
        chest.setBackground(new Color(147, 215, 11));
        chest.setForeground(new Color(5, 54, 94));
        chest.setBounds(20, 10, 200, 50);
        chest.setFont(new Font("SAN_SERIF", Font.PLAIN, 40));
        chest.setBorder(new LineBorder(Color.WHITE));
        image.add(chest);
        chest.addActionListener(this);

        abs = new JButton("Abs");
        abs.setBackground(new Color(147, 215, 11));
        abs.setForeground(new Color(5, 54, 94));
        abs.setBounds(20, 70, 200, 50);
        abs.setFont(new Font("SAN_SERIF", Font.PLAIN, 40));
        abs.setBorder(new LineBorder(Color.WHITE));
        image.add(abs);
        abs.addActionListener(this);

        shoulder = new JButton("Shoulder");
        shoulder.setBackground(new Color(147, 215, 11));
        shoulder.setForeground(new Color(5, 54, 94));
        shoulder.setBounds(20, 130, 200, 50);
        shoulder.setFont(new Font("SAN_SERIF", Font.PLAIN, 40));
        shoulder.setBorder(new LineBorder(Color.WHITE));
        image.add(shoulder);
        shoulder.addActionListener(this);

        back = new JButton("Back");
        back.setBackground(new Color(147, 215, 11));
        back.setForeground(new Color(5, 54, 94));
        back.setBounds(20, 190, 200, 50);
        back.setFont(new Font("SAN_SERIF", Font.PLAIN, 40));
        back.setBorder(new LineBorder(Color.WHITE));
        image.add(back);
        back.addActionListener(this);

        leg = new JButton("Legs");
        leg.setBackground(new Color(147, 215, 11));
        leg.setForeground(new Color(5, 54, 94));
        leg.setBounds(20, 250, 200, 50);
        leg.setFont(new Font("SAN_SERIF", Font.PLAIN, 40));
        leg.setBorder(new LineBorder(Color.WHITE));
        image.add( leg);
        leg.addActionListener(this);

        bicep = new JButton("Bicep");
        bicep.setBackground(new Color(147, 215, 11));
        bicep.setForeground(new Color(5, 54, 94));
        bicep.setBounds(20, 310, 200, 50);
        bicep.setFont(new Font("SAN_SERIF", Font.PLAIN, 40));
        bicep.setBorder(new LineBorder(Color.WHITE));
        image.add(bicep);
        bicep.addActionListener(this);

       

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == chest) {
            new Chest();
        } else if (ae.getSource() == abs) {
            new Abs();
        } else if (ae.getSource() == shoulder) {
            new Shoulder();
        } else if (ae.getSource() == back) {
            new Back();
        } else if (ae.getSource() == leg) {
            new Leg();
        } else if (ae.getSource() == bicep) {
            new Bicep();
        } 
    }

    public static void main(String[] args) {
        new MGWorkout();

    }
}
