import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.border.LineBorder;

class signin extends JFrame implements ActionListener {
    Choice security;
    JButton jb3, jb2, jb1;
    JTextField jtfname, jtfusername, jtfpassword, jtfanswer, securityans, jtfmail;

    signin() {
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

        JLabel name = new JLabel("NAME");
        name.setBounds(60, 160, 200, 100);
        name.setForeground(Color.black);
        name.setFont(new Font("Tahoma", Font.BOLD, 35));
        p1.add(name);

        jtfname = new JTextField();
        jtfname.setBounds(320, 190, 300, 40);
        jtfname.setFont(new Font("SAN_SERIF", Font.PLAIN, 25));
        jtfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(jtfname);

        JLabel jlbusername = new JLabel("USERNAME");
        jlbusername.setBounds(60, 220, 250, 100);
        jlbusername.setForeground(Color.black);
        jlbusername.setFont(new Font("Tahoma", Font.BOLD, 35));
        p1.add(jlbusername);

        jtfusername = new JTextField();
        jtfusername.setBounds(320, 250, 300, 40);
        jtfusername.setFont(new Font("SAN_SERIF", Font.PLAIN, 25));
        jtfusername.setBorder(BorderFactory.createEmptyBorder());
        jtfusername.setForeground(Color.BLACK);
        jtfusername.setBackground(Color.WHITE);
        p1.add(jtfusername);

        JLabel jlbpassword = new JLabel("PASSWORD");
        jlbpassword.setBounds(60, 280, 250, 100);
        jlbpassword.setForeground(Color.black);
        jlbpassword.setFont(new Font("Tahoma", Font.BOLD, 35));
        p1.add(jlbpassword);

        jtfpassword = new JTextField();
        jtfpassword.setBounds(320, 310, 300, 40);
        jtfpassword.setFont(new Font("SAN_SERIF", Font.PLAIN, 25));
        jtfpassword.setBorder(BorderFactory.createEmptyBorder());
        jtfpassword.setForeground(Color.black);
        jtfpassword.setBackground(Color.WHITE);
        p1.add(jtfpassword);

        JLabel jlbmail = new JLabel("MAIL ID ");
        jlbmail.setBounds(60, 350, 250, 100);
        jlbmail.setForeground(Color.black);
        jlbmail.setFont(new Font("Tahoma", Font.BOLD, 35));
        p1.add(jlbmail);

        jtfmail = new JTextField();
        jtfmail.setBounds(320, 380, 300, 40);
        jtfmail.setFont(new Font("SAN_SERIF", Font.PLAIN, 25));
        jtfmail.setBorder(BorderFactory.createEmptyBorder());
        jtfmail.setForeground(Color.black);
        jtfmail.setBackground(Color.WHITE);
        p1.add(jtfmail);

        JLabel jlbquestion = new JLabel("SECURITY QUESTION");
        jlbquestion.setBounds(60, 420, 400, 100);
        jlbquestion.setForeground(Color.black);
        jlbquestion.setFont(new Font("Tahoma", Font.BOLD, 35));
        p1.add(jlbquestion);

        security = new Choice();
        security.setFont(new Font("SAN_SERIF", Font.PLAIN, 22));
        security.add("Lucky Number:");
        security.add("Lucky Color:");
        security.add("Favourite Actor/Actress:");
        security.add("Favourite Food:");
        security.setBounds(490, 450, 300, 40);
        security.setForeground(Color.WHITE);
        security.setBackground(Color.black);
        p1.add(security);

        JLabel jlbsecurityans = new JLabel("SECURITY ANSWER");
        jlbsecurityans.setBounds(60, 480, 400, 100);
        jlbsecurityans.setForeground(Color.black);
        jlbsecurityans.setFont(new Font("Tahoma", Font.BOLD, 35));
        p1.add(jlbsecurityans);

        securityans = new JTextField();
        securityans.setBounds(490, 510, 300, 40);
        securityans.setFont(new Font("SAN_SERIF", Font.PLAIN, 25));
        securityans.setBorder(BorderFactory.createEmptyBorder());
        securityans.setForeground(Color.BLACK);
        securityans.setBackground(Color.WHITE);
        p1.add(securityans);

        jb2 = new JButton("SIGNIN");
        jb2.setBounds(540, 620, 200, 50);
        jb2.setBackground(Color.BLACK);
        jb2.setForeground(Color.WHITE);
        jb2.setFont(new Font("SAN_SERIF", Font.PLAIN, 35));
        p1.add(jb2);
        jb2.addActionListener(this);

        jb3 = new JButton("BACK");
        jb3.setBounds(100, 620, 200, 50);
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
            String name = jtfname.getText();
            String username = jtfusername.getText();
            String password = jtfpassword.getText();
            String mail = jtfmail.getText();
            String question = security.getSelectedItem();
            String answer = securityans.getText();

            if (name.isEmpty() || username.isEmpty() || password.isEmpty() || mail.isEmpty() || answer.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill all fields!");
                return;
            }

            try {
                Mcon c = new Mcon();

                String queryEmail = "SELECT * FROM information WHERE mail = ?";
                PreparedStatement pstmtEmail = c.con.prepareStatement(queryEmail);
                pstmtEmail.setString(1, mail);
                ResultSet rsEmail = pstmtEmail.executeQuery();

                if (rsEmail.next()) {
                    JOptionPane.showMessageDialog(null, "Email already used. Enter a new email.");
                    return;
                }

                String queryUsername = "SELECT * FROM information WHERE username = ?";
                PreparedStatement pstmtUsername = c.con.prepareStatement(queryUsername);
                pstmtUsername.setString(1, username);
                ResultSet rsUsername = pstmtUsername.executeQuery();

                if (rsUsername.next()) {
                    JOptionPane.showMessageDialog(null, "Username already used. Enter a new username.");
                    return;
                }

                String insertQuery = "INSERT INTO information (name, username, password, mail, question, answer) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement pstmtInsert = c.con.prepareStatement(insertQuery);
                pstmtInsert.setString(1, name);
                pstmtInsert.setString(2, username);
                pstmtInsert.setString(3, password);
                pstmtInsert.setString(4, mail);
                pstmtInsert.setString(5, question);
                pstmtInsert.setString(6, answer);
                pstmtInsert.executeUpdate();

                JOptionPane.showMessageDialog(null, "Account created successfully!");
                new login();

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        } else if (ae.getSource() == jb3) {
            new login();
        }
    }

    public static void main(String args[]) {
        new signin();
    }
}
