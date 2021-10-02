package onlineexaminationsystem_ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    
    Score(String username, String email){
        setBounds(600, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
      
        System.out.println(email);
        JLabel l2 = new JLabel("Thankyou " + username + " for taking your examination");
        l2.setBounds(45, 30, 700, 30);
        l2.setFont(new Font("RALEWAY", Font.PLAIN, 26));
        add(l2);
        
        JLabel l3 = new JLabel("Result willl be sent to your registered Email-id");
        l3.setBounds(150, 200, 300, 30);
        l3.setFont(new Font("Jokerman", Font.PLAIN, 26));
        l3.setForeground(new Color(199, 21, 133));
        add(l3);
        
       
    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new Front_page().setVisible(true);
    }
    
    public static void main(String[] args){
        new Score("", "").setVisible(true);
    }
}
