import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class UpdateInfo extends JFrame implements ActionListener{
    
    UpdateInfo(){
        setBounds(1400, 135, 500, 550);
        setTitle("FitMantra");
        setLayout(null);
        setBackground(Color.white);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){

    }

    public static void main(String[] args) {
        new UpdateInfo();

    }
}
