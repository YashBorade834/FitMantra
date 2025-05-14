import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.sql.*;

class login extends JFrame implements ActionListener {
    JButton jb2, jb3, jb1;
    JTextField jtfusername, jtfpassword;

    login() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle("FitMantra");
        setLayout(null);

        JPanel jp1 = new JPanel();
        jp1.setBounds(0, 0, 5000, 100);
        jp1.setBackground(Color.BLACK);
        add(jp1);
        jp1.setLayout(null);

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


        JPanel p1 = new JPanel();
        p1.setBounds(0, 0, 900, 1000);
        p1.setBackground(new Color(128, 128, 128));
        add(p1);
        p1.setLayout(null);

        JLabel jlbusername = new JLabel("USERNAME");
        jlbusername.setBounds(340, 150, 200, 100);
        jlbusername.setForeground(Color.black);
        jlbusername.setFont(new Font("Tahoma", Font.BOLD, 35));
        p1.add(jlbusername);

        jtfusername = new JTextField();
        jtfusername.setBounds(300, 250, 300, 40);
        jtfusername.setFont(new Font("SAN_SERIF", Font.PLAIN, 25));
        jtfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(jtfusername);

        JLabel jlbpassword = new JLabel("PASSWORD");
        jlbpassword.setBounds(340, 300, 250, 100);
        jlbpassword.setForeground(Color.black);
        jlbpassword.setFont(new Font("Tahoma", Font.BOLD, 35));
        p1.add(jlbpassword);

        jtfpassword = new JTextField();
        jtfpassword.setBounds(300, 400, 300, 40);
        jtfpassword.setFont(new Font("SAN_SERIF", Font.PLAIN, 25));
        jtfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(jtfpassword);

        jb1 = new JButton("LOGIN");
        jb1.setBounds(100, 500, 200, 50);
        jb1.setBackground(Color.BLACK);
        jb1.setForeground(Color.WHITE);
        jb1.setFont(new Font("SAN_SERIF", Font.PLAIN, 35));
        p1.add(jb1);
        jb1.addActionListener(this);

        jb2 = new JButton("SIGNIN");
        jb2.setBounds(600, 500, 200, 50);
        jb2.setBackground(Color.BLACK);
        jb2.setForeground(Color.WHITE);
        jb2.setFont(new Font("SAN_SERIF", Font.PLAIN, 35));
        p1.add(jb2);
        jb2.addActionListener(this);

        jb3 = new JButton("FORGOT PASSWORD");
        jb3.setBounds(250, 650, 400, 60);
        jb3.setBackground(Color.BLACK);
        jb3.setForeground(Color.WHITE);
        jb3.setFont(new Font("SAN_SERIF", Font.PLAIN, 35));
        p1.add(jb3);
        jb3.addActionListener(this);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("login1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(874, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(850, 100, 874, 700);
        add(image);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == jb2) {
            setVisible(false);
            new signin();
        } else if (ae.getSource() == jb1) {
            try {
                Mcon c = new Mcon();
                String username = jtfusername.getText();
                String password = jtfpassword.getText();

                String Query = "select * from information where username = '" + username + "' and password = '"
                        + password + "'";
                ResultSet rs = c.stmt.executeQuery(Query);

                String query = "SELECT * FROM personalInfo where username ='" + username + "'";

                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Login Sucessfully!!!");
                    PreparedStatement pstmt = c.con.prepareStatement(query);
                    ResultSet rs1 = pstmt.executeQuery();
                    if (rs1.next()) {
                        new DirectEntry(username);
                    } else {
                        setVisible(false);
                        new Info1(username);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Username and Password!!!");
                }

            } catch (Exception e) {
                System.out.println(e);
            }

        } else if (ae.getSource() == jb3) {
            new Forgetpass();
        }
    }

    public static void main(String args[]) {
        new login();
    }
}
