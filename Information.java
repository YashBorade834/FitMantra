import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Information extends JFrame implements ActionListener {
    String username, age, height, weight;
    JTextField jtfheight, jtfweight, jtfage;
    JButton jb2;

    Information(String username, String age, String height, String weight) {
        this.username = username;
        this.username = age;
        this.username = height;
        this.username = weight;

        setBounds(1400, 135, 500, 550);
        setTitle("FitMantra");
        setLayout(null);
        setBackground(Color.white);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane);

        JLabel user1 = new JLabel("Username~ " + username);
        user1.setBounds(80, 20, 350, 100);
        user1.setForeground(Color.black);
        user1.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(user1);

        JLabel height1 = new JLabel("Height~ " + height);
        height1.setBounds(100, 100, 300, 100);
        height1.setForeground(Color.black);
        height1.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(height1);

        JLabel weight1 = new JLabel("Weight~ " + weight);
        weight1.setBounds(100, 210, 300, 50);
        weight1.setForeground(Color.black);
        weight1.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(weight1);

        JLabel age1 = new JLabel("Age~ " + age);
        age1.setBounds(100, 290, 300, 50);
        age1.setForeground(Color.black);
        age1.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(age1);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String[] args) {
        new Information("", "", "", "");

    }
}
