import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class DirectEntry extends JFrame implements ActionListener {
    JRadioButton male, female, advanced, intermediate, beginer;
    JButton musclegain, keepfit, maxstrength, weightloss;
    JTextField jtfheight, jtfweight;
    String username;
    JComboBox box;

    @SuppressWarnings({ "rawtypes", "unchecked" })
    DirectEntry(String username) {
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        setTitle("FitMantra");
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

        JLabel uname;
        uname = new JLabel(username);
        uname.setBounds(250, 5, 250, 100);
        uname.setForeground(new Color(147, 215, 11));
        uname.setFont(new Font("SAN_SERIF", Font.PLAIN, 40));
        jp1.add(uname);

        JPanel jp2 = new JPanel();
        jp2.setBounds(480, 100, 600, 650);
        jp2.setBackground(new Color(150, 150, 150));
        jp3.add(jp2);
        jp2.setLayout(null);


        JLabel age = new JLabel("Age");
        age.setBounds(40, 50, 100, 50);
        age.setForeground(new Color(5, 54, 94));
        age.setFont(new Font("SAN_SERIF", Font.BOLD, 40));
        jp2.add(age);

        box = new JComboBox(new String[] { "13~19", "20~29", "30~39", "40~49", "50~59", "60 Above" });
        box.setBounds(250, 60, 200, 30);
        box.setFont(new Font("Tahoma", Font.PLAIN, 30));
        box.setBackground(new Color(150, 150, 150, 150));
        jp2.add(box);

        JLabel level = new JLabel("Fitness Level");
        level.setBounds(40, 140, 300, 50);
        level.setForeground(new Color(5, 54, 94));
        level.setFont(new Font("SAN_SERIF", Font.BOLD, 40));
        jp2.add(level);

        beginer = new JRadioButton("Beginer");
        beginer.setFont(new Font("SAN_SERIF", Font.PLAIN, 40));
        beginer.setBackground(new Color(150, 150, 150, 150));
        beginer.setBounds(350, 140, 250, 50);
        jp2.add(beginer);

        intermediate = new JRadioButton("Intermediate");
        intermediate.setFont(new Font("SAN_SERIF", Font.PLAIN, 40));
        intermediate.setBackground(new Color(150, 150, 150, 150));
        intermediate.setBounds(350, 190, 250, 50);
        jp2.add(intermediate);

        advanced = new JRadioButton("Advanced");
        advanced.setFont(new Font("SAN_SERIF", Font.PLAIN, 40));
        advanced.setBackground(new Color(150, 150, 150, 150));
        advanced.setBounds(350, 240, 250, 50);
        jp2.add(advanced);

        ButtonGroup group2 = new ButtonGroup();
        group2.add(beginer);
        group2.add(intermediate);
        group2.add(advanced);

        JLabel goal = new JLabel("Current Goal");
        goal.setBounds(40, 280, 250, 100);
        goal.setFont(new Font("SAN_SERIF", Font.BOLD, 40));
        goal.setForeground(new Color(5, 54, 94));
        jp2.add(goal);

        musclegain = new JButton("Muscle Gain");
        musclegain.setBackground(Color.WHITE);
        musclegain.setForeground(new Color(5, 54, 94));
        musclegain.setBounds(350, 320, 240, 50);
        musclegain.setFont(new Font("SAN_SERIF", Font.PLAIN, 30));
        musclegain.setBorder(new LineBorder(Color.WHITE));
        jp2.add(musclegain);
        musclegain.addActionListener(this);

        keepfit = new JButton("Keep Fit");
        keepfit.setBackground(Color.WHITE);
        keepfit.setForeground(new Color(5, 54, 94));
        keepfit.setBounds(350, 380, 240, 50);
        keepfit.setFont(new Font("SAN_SERIF", Font.PLAIN, 30));
        keepfit.setBorder(new LineBorder(Color.WHITE));
        jp2.add(keepfit);
        keepfit.addActionListener(this);

        maxstrength = new JButton("Max Strength");
        maxstrength.setBackground(Color.WHITE);
        maxstrength.setForeground(new Color(5, 54, 94));
        maxstrength.setBounds(350, 440, 240, 50);
        maxstrength.setFont(new Font("SAN_SERIF", Font.PLAIN, 30));
        maxstrength.setBorder(new LineBorder(Color.WHITE));
        jp2.add(maxstrength);
        maxstrength.addActionListener(this);

        weightloss = new JButton("Weight Loss");
        weightloss.setBackground(Color.WHITE);
        weightloss.setForeground(new Color(5, 54, 94));
        weightloss.setBounds(350, 500, 240, 50);
        weightloss.setFont(new Font("SAN_SERIF", Font.PLAIN, 30));
        weightloss.setBorder(new LineBorder(Color.WHITE));
        jp2.add(weightloss);
        weightloss.addActionListener(this);

        ImageIcon i21 = new ImageIcon(ClassLoader.getSystemResource("malebody.jpg"));
        Image i22 = i21.getImage().getScaledInstance(500, 730, Image.SCALE_DEFAULT);
        ImageIcon i23 = new ImageIcon(i22);
        JLabel image2 = new JLabel(i23);
        image2.setBounds(0, 150, 550, 750);
        jp3.add(image2);

        ImageIcon i31 = new ImageIcon(ClassLoader.getSystemResource("fembody.jpg"));
        Image i32 = i31.getImage().getScaledInstance(500, 730, Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i32);
        JLabel image3 = new JLabel(i33);
        image3.setBounds(1090, 100, 490, 750);
        jp3.add(image3);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String age = (String) box.getSelectedItem();
         if (ae.getSource() == musclegain) {
                if (beginer.isSelected()) {
                    if (age == "13~19") {
                        setVisible(false);
                        new MGBeginer1319(username);
                    } else if (age == "20~29") {
                        setVisible(false);
                        new MGBeginer1319(username);
                    } else if (age == "30~39") {
                        setVisible(false);
                        new MGBeginer1319(username);
                    } else if (age == "40~49") {
                        setVisible(false);
                        new MGBeginer1319(username);
                    } else if (age == "50~59") {
                        setVisible(false);
                        new MGBeginer1319(username);
                    } else if (age == "60 Above") {
                        setVisible(false);
                        new MGBeginer1319(username);
                    }
                } else if (intermediate.isSelected()) {
                    if (age == "13~19") {
                        setVisible(false);
                        new MGBeginer1319(username);
                    } else if (age == "20~29") {
                        setVisible(false);
                        new MGBeginer1319(username);
                    } else if (age == "30~39") {
                        setVisible(false);
                        new MGBeginer1319(username);
                    } else if (age == "40~49") {
                        setVisible(false);
                        new MGBeginer1319(username);
                    } else if (age == "50~59") {
                        setVisible(false);
                        new MGBeginer1319(username);
                    } else if (age == "60 Above") {
                        setVisible(false);
                        new MGBeginer1319(username);
                    }
                } else if (advanced.isSelected()) {
                    if (age == "13~19") {
                        setVisible(false);
                        new MGBeginer1319(username);
                    } else if (age == "20~29") {
                        setVisible(false);
                        new MGBeginer1319(username);
                    } else if (age == "30~39") {
                        setVisible(false);
                        new MGBeginer1319(username);
                    } else if (age == "40~49") {
                        setVisible(false);
                        new MGBeginer1319(username);
                    } else if (age == "50~59") {
                        setVisible(false);
                        new MGBeginer1319(username);
                    } else if (age == "60 Above") {
                        setVisible(false);
                        new MGBeginer1319(username);
                    }
                }

            } else if (ae.getSource() == keepfit) {
               
                if (beginer.isSelected()) {
                    if (age == "13~19") {
                        setVisible(false);
                        new KBeginer1319(username);
                    } else if (age == "20~29") {
                        setVisible(false);
                        new KBeginer1319(username);
                    } else if (age == "30~39") {
                        setVisible(false);
                        new KBeginer1319(username);
                    } else if (age == "40~49") {
                        setVisible(false);
                        new KBeginer1319(username);
                    } else if (age == "50~59") {
                        setVisible(false);
                        new KBeginer1319(username);
                    } else if (age == "60 Above") {
                        setVisible(false);
                        new KBeginer1319(username);
                    }
                } else if (intermediate.isSelected()) {
                    if (age == "13~19") {
                        setVisible(false);
                        new KBeginer1319(username);
                    } else if (age == "20~29") {
                        setVisible(false);
                        new KBeginer1319(username);
                    } else if (age == "30~39") {
                        setVisible(false);
                        new KBeginer1319(username);
                    } else if (age == "40~49") {
                        setVisible(false);
                        new KBeginer1319(username);
                    } else if (age == "50~59") {
                        setVisible(false);
                        new KBeginer1319(username);
                    } else if (age == "60 Above") {
                        setVisible(false);
                        new KBeginer1319(username);
                    }
                } else if (advanced.isSelected()) {
                    if (age == "13~19") {
                        setVisible(false);
                        new KBeginer1319(username);
                    } else if (age == "20~29") {
                        setVisible(false);
                        new KBeginer1319(username);
                    } else if (age == "30~39") {
                        setVisible(false);
                        new KBeginer1319(username);
                    } else if (age == "40~49") {
                        setVisible(false);
                        new KBeginer1319(username);
                    } else if (age == "50~59") {
                        setVisible(false);
                        new KBeginer1319(username);
                    } else if (age == "60 Above") {
                        setVisible(false);
                        new KBeginer1319(username);
                    }
                }
            } else if (ae.getSource() == maxstrength) {
               
                if (beginer.isSelected()) {
                    if (age == "13~19") {
                        setVisible(false);
                        new MBeginer1319(username);
                    } else if (age == "20~29") {
                        setVisible(false);
                        new MBeginer1319(username);
                    } else if (age == "30~39") {
                        setVisible(false);
                        new MBeginer1319(username);
                    } else if (age == "40~49") {
                        setVisible(false);
                        new MBeginer1319(username);
                    } else if (age == "50~59") {
                        setVisible(false);
                        new MBeginer1319(username);
                    } else if (age == "60 Above") {
                        setVisible(false);
                        new MBeginer1319(username);
                    }
                } else if (intermediate.isSelected()) {
                    if (age == "13~19") {
                        setVisible(false);
                        new MBeginer1319(username);
                    } else if (age == "20~29") {
                        setVisible(false);
                        new MBeginer1319(username);
                    } else if (age == "30~39") {
                        setVisible(false);
                        new MBeginer1319(username);
                    } else if (age == "40~49") {
                        setVisible(false);
                        new MBeginer1319(username);
                    } else if (age == "50~59") {
                        setVisible(false);
                        new MBeginer1319(username);
                    } else if (age == "60 Above") {
                        setVisible(false);
                        new MBeginer1319(username);
                    }
                } else if (advanced.isSelected()) {
                    if (age == "13~19") {
                        setVisible(false);
                        new MBeginer1319(username);
                    } else if (age == "20~29") {
                        setVisible(false);
                        new MBeginer1319(username);
                    } else if (age == "30~39") {
                        setVisible(false);
                        new MBeginer1319(username);
                    } else if (age == "40~49") {
                        setVisible(false);
                        new MBeginer1319(username);
                    } else if (age == "50~59") {
                        setVisible(false);
                        new MBeginer1319(username);
                    } else if (age == "60 Above") {
                        setVisible(false);
                        new MBeginer1319(username);
                    }
                }
            } else if (ae.getSource() == weightloss) {
                
                if (beginer.isSelected()) {
                    if (age == "13~19") {
                        setVisible(false);
                        new WBeginer1319(username);
                    } else if (age == "20~29") {
                        setVisible(false);
                        new WBeginer1319(username);
                    } else if (age == "30~39") {
                        setVisible(false);
                        new WBeginer1319(username);
                    } else if (age == "40~49") {
                        setVisible(false);
                        new WBeginer1319(username);
                    } else if (age == "50~59") {
                        setVisible(false);
                        new WBeginer1319(username);
                    } else if (age == "60 Above") {
                        setVisible(false);
                        new WBeginer1319(username);
                    }
                } else if (intermediate.isSelected()) {
                    if (age == "13~19") {
                        setVisible(false);
                        new WBeginer1319(username);
                    } else if (age == "20~29") {
                        setVisible(false);
                        new WBeginer1319(username);
                    } else if (age == "30~39") {
                        setVisible(false);
                        new WBeginer1319(username);
                    } else if (age == "40~49") {
                        setVisible(false);
                        new WBeginer1319(username);
                    } else if (age == "50~59") {
                        setVisible(false);
                        new WBeginer1319(username);
                    } else if (age == "60 Above") {
                        setVisible(false);
                        new WBeginer1319(username);
                    }
                } else if (advanced.isSelected()) {
                    if (age == "13~19") {
                        setVisible(false);
                        new WBeginer1319(username);
                    } else if (age == "20~29") {
                        setVisible(false);
                        new WBeginer1319(username);
                    } else if (age == "30~39") {
                        setVisible(false);
                        new WBeginer1319(username);
                    } else if (age == "40~49") {
                        setVisible(false);
                        new WBeginer1319(username);
                    } else if (age == "50~59") {
                        setVisible(false);
                        new WBeginer1319(username);
                    } else if (age == "60 Above") {
                        setVisible(false);
                        new WBeginer1319(username);
                    }
                }
            }
        }
    

    public static void main(String[] args) {
        new DirectEntry("");

    }
}
