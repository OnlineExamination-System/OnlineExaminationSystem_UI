<<<<<<< Updated upstream
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
=======
>>>>>>> Stashed changes
package onlineexaminationsystem_ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    
<<<<<<< Updated upstream
    Score(String username, int score){
=======
    Score(String username, String email){
>>>>>>> Stashed changes
        setBounds(600, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
<<<<<<< Updated upstream
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("simple/minds/icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 200, 300, 250);
        add(l1);
        
        JLabel l2 = new JLabel("Thankyou " + username + " for Playing Simple Minds");
=======
      
        System.out.println(email);
        JLabel l2 = new JLabel("Thankyou " + username + " for taking your examination");
>>>>>>> Stashed changes
        l2.setBounds(45, 30, 700, 30);
        l2.setFont(new Font("RALEWAY", Font.PLAIN, 26));
        add(l2);
        
<<<<<<< Updated upstream
        JLabel l3 = new JLabel("Your Score is " + score);
        l3.setBounds(350, 200, 300, 30);
=======
        JLabel l3 = new JLabel("Result willl be sent to your registered Email-id");
        l3.setBounds(150, 200, 300, 30);
>>>>>>> Stashed changes
        l3.setFont(new Font("Jokerman", Font.PLAIN, 26));
        l3.setForeground(new Color(199, 21, 133));
        add(l3);
        
<<<<<<< Updated upstream
        JButton b1 = new JButton("Play Again");
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        
        b1.setBounds(400, 270, 120, 30);
        add(b1);
    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new OnlineExaminationSystem_UI().setVisible(true);
    }
    
    public static void main(String[] args){
        new Score("", 0).setVisible(true);
=======
       
    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new Front_page().setVisible(true);
    }
    
    public static void main(String[] args){
        new Score("", "").setVisible(true);
>>>>>>> Stashed changes
    }
}
