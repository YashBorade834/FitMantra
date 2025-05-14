
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Forgetpass extends JFrame implements ActionListener {

    JButton search, back, retrive;
    JTextField jtfpassword, jtfquestion, jtfname, jtfanswer, jtfusername;

    Forgetpass() {

        setBounds(600, 200, 1210, 750);
        setTitle("FitMantra");
        getContentPane().setBackground(new Color(90, 90, 90));
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBounds(20, 20, 605, 660);
        p1.setBackground(new Color(128, 128, 128));
        p1.setLayout(null);
        add(p1);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("images/pic - Copy.jpeg"));
        Image i12 = i11.getImage().getScaledInstance(205, 246, Image.SCALE_DEFAULT);
        ImageIcon i13 = new ImageIcon(i12);
        JLabel image1 = new JLabel(i13);
        image1.setBounds(635, 40, 205, 246);
        add(image1);

        JLabel jlbusername = new JLabel("USERNAME");
        jlbusername.setBounds(20, 40, 200, 25);
        jlbusername.setForeground(Color.WHITE);
        jlbusername.setFont(new Font("Tahoma", Font.PLAIN, 30));
        p1.add(jlbusername);

        jtfusername = new JTextField();
        jtfusername.setBounds(20, 80, 200, 30);
        jtfusername.setFont(new Font("Tahoma", Font.PLAIN, 25));
        p1.add(jtfusername);

        search = new JButton("SEARCH");
        search.setBounds(280, 80, 200, 35);
        search.setBackground(Color.black);
        search.setForeground(new Color(147, 215, 11));
        search.setFont(new Font("SAN_SERIF", Font.PLAIN, 30));
        search.setBorder(new LineBorder(Color.BLACK));
        search.addActionListener(this);
        p1.add(search);

        JLabel jlbname = new JLabel("NAME");
        jlbname.setBounds(20, 130, 200, 25);
        jlbname.setForeground(Color.WHITE);
        jlbname.setFont(new Font("Tahoma", Font.PLAIN, 30));
        p1.add(jlbname);

        jtfname = new JTextField();
        jtfname.setBounds(20, 170, 200, 30);
        jtfname.setFont(new Font("Tahoma", Font.PLAIN, 25));
        p1.add(jtfname);

        JLabel jlbquestion = new JLabel("SECURITY QUESTION");
        jlbquestion.setBounds(20, 220, 350, 25);
        jlbquestion.setForeground(Color.WHITE);
        jlbquestion.setFont(new Font("Tahoma", Font.PLAIN, 30));
        p1.add(jlbquestion);

        jtfquestion = new JTextField();
        jtfquestion.setBounds(20, 260, 200, 30);
        jtfquestion.setFont(new Font("Tahoma", Font.PLAIN, 25));
        p1.add(jtfquestion);

        JLabel jlbanswer = new JLabel("ANSWER");
        jlbanswer.setBounds(20, 310, 200, 25);
        jlbanswer.setForeground(Color.WHITE);
        jlbanswer.setFont(new Font("Tahoma", Font.PLAIN, 30));
        p1.add(jlbanswer);

        jtfanswer = new JTextField();
        jtfanswer.setBounds(20, 350, 200, 30);
        jtfanswer.setFont(new Font("Tahoma", Font.PLAIN, 25));
        p1.add(jtfanswer);

        retrive = new JButton("RETRIVE");
        retrive.setBounds(280, 350, 200, 35);
        retrive.setBackground(Color.black);
        retrive.setForeground(new Color(147, 215, 11));
        retrive.setFont(new Font("SAN_SERIF", Font.PLAIN, 30));
        retrive.setBorder(new LineBorder(Color.BLACK));
        retrive.addActionListener(this);
        p1.add(retrive);

        JLabel jlbpassword = new JLabel("PASSWORD");
        jlbpassword.setBounds(20, 400, 200, 25);
        jlbpassword.setForeground(Color.WHITE);
        jlbpassword.setFont(new Font("Tahoma", Font.PLAIN, 30));
        p1.add(jlbpassword);

        jtfpassword = new JTextField();
        jtfpassword.setBounds(20, 440, 200, 30);
        jtfpassword.setFont(new Font("Tahoma", Font.PLAIN, 25));
        p1.add(jtfpassword);

        back = new JButton("BACK");
        back.setBounds(150, 520, 200, 35);
        back.setBackground(Color.black);
        back.setForeground(new Color(147, 215, 11));
        back.setFont(new Font("SAN_SERIF", Font.PLAIN, 30));
        back.setBorder(new LineBorder(Color.BLACK));
        back.addActionListener(this);
        p1.add(back);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == search) {

            String query = "select * from information where username = '" + jtfusername.getText() + "'";

            try {
                Mcon c = new Mcon();
                ResultSet rs = c.stmt.executeQuery(query);
                while (rs.next()) {
                    jtfname.setText(rs.getString(1));
                    jtfquestion.setText(rs.getString(5));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == retrive) {
            String Query = "select * from information where username = '" + jtfusername.getText() + "' AND answer = '"
                    + jtfanswer.getText() + "'";

            try {
                Mcon c = new Mcon();
                ResultSet rs = c.stmt.executeQuery(Query);
                if (rs.next()) {
                    jtfpassword.setText(rs.getString(3));
                }

                else {
                    JOptionPane.showMessageDialog(null, "Incorrect Answer!!!");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == back) {
            setVisible(false);
            new login();
        } else {

        }
    }

    public static void main(String[] args) {
        new Forgetpass();
    }
}
