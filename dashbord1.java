import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

class dashbord1 extends JFrame implements ActionListener {
    Choice security;

    dashbord1() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle("FitMantra");
        setLayout(null);

        JPanel jp1 = new JPanel();
        jp1.setBounds(0, 0, 5000, 100);
        jp1.setBackground(new Color(90, 90, 90));
        add(jp1);
        jp1.setLayout(null);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("logonew.png"));
        Image i12 = i11.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i13 = new ImageIcon(i12);
        JLabel image1 = new JLabel(i13);
        image1.setBounds(5, 0, 100, 100);
        jp1.add(image1);

        JPanel p1 = new JPanel();
        p1.setBounds(0, 0, 900, 1000);
        p1.setBackground(new Color(128, 128, 128));
        add(p1);
        p1.setLayout(null);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String args[]) {
        new dashbord1();
    }
}
