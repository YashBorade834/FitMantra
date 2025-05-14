
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.sql.*;

public class Forgetpass extends JFrame implements ActionListener {

    JButton search, back, retrive;
    JTextField jtfpassword, jtfquestion, jtfname, jtfanswer, jtfusername;
    

    Forgetpass() {

        setSize(900, 500);
        setLocation(350, 200);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBounds(20, 20, 450, 410);
        p1.setLayout(null);
        add(p1);

        ImageIcon i1 = new ImageIcon(
                ClassLoader.getSystemResource("forgot.jpg"));
        Image i2 = i1.getImage().getScaledInstance(410, 410, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        image.setBounds(480, 20, 390, 390);

        add(image);

        JLabel jlbusername = new JLabel("USERNAME");
        jlbusername.setBounds(20, 20, 140, 25);
        jlbusername.setFont(new Font("Tahoma", Font.BOLD, 18));
        p1.add(jlbusername);

        jtfusername = new JTextField();
        jtfusername.setBounds(20, 50, 160, 25);
        jtfusername.setFont(new Font("Tahoma", Font.PLAIN, 18));
        p1.add(jtfusername);

        search = new JButton("SEARCH");
        search.setBounds(240, 20, 100, 25);
        search.setBackground(new Color(133, 193, 233));
        search.setForeground(Color.WHITE);
        search.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        search.setBorder(new LineBorder(new Color(133, 193, 233)));
        search.addActionListener(this);
        p1.add(search);

        JLabel jlbname = new JLabel("NAME");
        jlbname.setBounds(20, 90, 140, 25);
        jlbname.setFont(new Font("Tahoma", Font.BOLD, 18));
        p1.add(jlbname);

        jtfname = new JTextField();
        jtfname.setBounds(20, 120, 160, 25);
        jtfname.setFont(new Font("Tahoma", Font.PLAIN, 18));
        p1.add(jtfname);

        JLabel jlbquestion = new JLabel("SECURITY QUESTION");
        jlbquestion.setBounds(20, 160, 200, 25);
        jlbquestion.setFont(new Font("Tahoma", Font.BOLD, 18));
        p1.add(jlbquestion);

        jtfquestion = new JTextField();
        jtfquestion.setBounds(20, 190, 160, 25);
        jtfquestion.setFont(new Font("Tahoma", Font.PLAIN, 18));
        p1.add(jtfquestion);

        JLabel jlbanswer = new JLabel("ANSWER");
        jlbanswer.setBounds(20, 230, 140, 25);
        jlbanswer.setFont(new Font("Tahoma", Font.BOLD, 18));
        p1.add(jlbanswer);

        jtfanswer = new JTextField();
        jtfanswer.setBounds(20, 260, 160, 25);
        jtfanswer.setFont(new Font("Tahoma", Font.PLAIN, 18));
        p1.add(jtfanswer);

        retrive = new JButton("RETRIVE");
        retrive.setBounds(240, 230, 100, 25);
        retrive.setBackground(new Color(133, 193, 233));
        retrive.setForeground(Color.WHITE);
        retrive.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        retrive.setBorder(new LineBorder(new Color(133, 193, 233)));
        retrive.addActionListener(this);
        p1.add(retrive);

        JLabel jlbpassword = new JLabel("PASSWORD");
        jlbpassword.setBounds(20, 300, 140, 25);
        jlbpassword.setFont(new Font("Tahoma", Font.BOLD, 18));
        p1.add(jlbpassword);

        jtfpassword = new JTextField();
        jtfpassword.setBounds(20, 330, 160, 25);
        jtfpassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
        p1.add(jtfpassword);

        back = new JButton("BACK");
        back.setBounds(120, 370, 100, 25);
        back.setBackground(new Color(133, 193, 233));
        back.setForeground(Color.WHITE);
        back.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        back.setBorder(new LineBorder(new Color(133, 193, 233)));
        back.addActionListener(this);
        p1.add(back);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == search) {

            String query = "select * from information where username = '" + jtfusername.getText() + "'";

            try {
                mycon c = new mycon();
                ResultSet rs = c.stmt.executeQuery(query);
                while (rs.next()) {
                    jtfname.setText(rs.getString(4));
                    jtfquestion.setText(rs.getString());
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == retrive) {
            String Query = "select * from account where username = '" + jtfusername.getText() + "' AND answer = '" + jtfanswer.getText() + "'";
            
            try {
                mycon c = new mycon();
                ResultSet rs = c.stmt.executeQuery(Query);
                if(rs.next()) {
                    jtfpassword.setText(rs.getString(3));
                }


                else{
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
 