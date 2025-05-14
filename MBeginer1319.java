import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class MBeginer1319 extends JFrame implements ActionListener {

    JButton diet, workout, bmi, info, back, updateinfo;
    String username, age, height, weight;

    MBeginer1319(String username) {
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle("FitMantra");
        setLayout(null);
        setForeground(Color.BLACK);

        JPanel jp3 = new JPanel();
        jp3.setBounds(0, 0, 7000, 7050);
        jp3.setBackground(Color.BLACK);
        add(jp3);
        jp3.setLayout(null);

        JPanel jp1 = new JPanel();
        jp1.setBounds(0, 0, 5000, 100);
        jp1.setBackground(Color.BLACK);
        jp3.add(jp1);
        jp1.setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("work.jpg"));
        Image i2 = i1.getImage().getScaledInstance(2000, 1400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(355, 0, 1700, 1200);
        jp3.add(image);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("images/mylogo.jpg"));
        Image i12 = i11.getImage().getScaledInstance(150, 100, Image.SCALE_DEFAULT);
        ImageIcon i13 = new ImageIcon(i12);
        JLabel image1 = new JLabel(i13);
        image1.setBounds(5, 0, 150, 100);
        jp1.add(image1);

        JLabel head = new JLabel("FitMantra");
        head.setBounds(170, 5, 210, 100);
        head.setForeground(new Color(147, 215, 11));
        head.setFont(new Font("Serif", Font.BOLD, 45));
        jp1.add(head);
        ;

        JLabel uname = new JLabel(username);
        uname.setBounds(1565, 5, 250, 100);
        uname.setForeground(new Color(147, 215, 11));
        uname.setFont(new Font("SAN_SERIF", Font.PLAIN, 40));
        jp1.add(uname);

        JPanel jp2 = new JPanel();
        jp2.setBounds(0, 100, 350, 5000);
        jp2.setBackground(new Color(30, 30, 30));
        jp3.add(jp2);
        jp2.setLayout(null);

        workout = new JButton("Workout");
        workout.setBackground(new Color(147, 215, 11));
        workout.setForeground(new Color(5, 54, 94));
        workout.setBounds(0, 0, 350, 100);
        workout.setFont(new Font("SAN_SERIF", Font.PLAIN, 40));
        workout.setBorder(new LineBorder(Color.WHITE));
        jp2.add(workout);
        workout.addActionListener(this);

        diet = new JButton("Diet");
        diet.setBackground(new Color(147, 215, 11));
        diet.setForeground(new Color(5, 54, 94));
        diet.setBounds(0, 110, 350, 100);
        diet.setFont(new Font("SAN_SERIF", Font.PLAIN, 40));
        diet.setBorder(new LineBorder(Color.WHITE));
        jp2.add(diet);
        diet.addActionListener(this);

        bmi = new JButton("BMI Calculator");
        bmi.setBackground(new Color(147, 215, 11));
        bmi.setForeground(new Color(5, 54, 94));
        bmi.setBounds(0, 220, 350, 100);
        bmi.setFont(new Font("SAN_SERIF", Font.PLAIN, 40));
        bmi.setBorder(new LineBorder(Color.WHITE));
        jp2.add(bmi);
        bmi.addActionListener(this);

        info = new JButton("Profile");
        info.setBackground(new Color(147, 215, 11));
        info.setForeground(new Color(5, 54, 94));
        info.setBounds(0, 330, 350, 100);
        info.setFont(new Font("SAN_SERIF", Font.PLAIN, 40));
        info.setBorder(new LineBorder(Color.WHITE));
        jp2.add(info);
        info.addActionListener(this);

        updateinfo = new JButton("Update Profile");
        updateinfo.setBackground(new Color(147, 215, 11));
        updateinfo.setForeground(new Color(5, 54, 94));
        updateinfo.setBounds(0, 440, 350, 100);
        updateinfo.setFont(new Font("SAN_SERIF", Font.PLAIN, 40));
        updateinfo.setBorder(new LineBorder(Color.WHITE));
        jp2.add(updateinfo);
        updateinfo.addActionListener(this);

        back = new JButton("Back");
        back.setBackground(new Color(147, 215, 11));
        back.setForeground(new Color(5, 54, 94));
        back.setBounds(0, 550, 350, 100);
        back.setFont(new Font("SAN_SERIF", Font.PLAIN, 40));
        back.setBorder(new LineBorder(Color.WHITE));
        jp2.add(back);
        back.addActionListener(this);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == diet) {
            new Mydiet();
        } else if (ae.getSource() == workout) {
            new MWorkout();
        } else if (ae.getSource() == info) {
            try {
                Mcon c = new Mcon();
                String query = "SELECT age, height, weight FROM personalInfo where username ='" + username + "'";
                PreparedStatement pstmt = c.con.prepareStatement(query);

                ResultSet rs = pstmt.executeQuery();

                while (rs.next()) {
                    age = rs.getString("age");
                    height = rs.getString("height");
                    weight = rs.getString("weight");

                }

            } catch (Exception e) {
                System.out.println(e);
            }
            new Information(username, age, height, weight);

        } else if (ae.getSource() == bmi) {
            new Bmi();
        } else if (ae.getSource() == updateinfo) {
            new UpdateInfo();
        } else if (ae.getSource() == back) {
            setVisible(false);
            new DirectEntry("");
        }
    }

    public static void main(String args[]) {
        new MBeginer1319("");
    }
}