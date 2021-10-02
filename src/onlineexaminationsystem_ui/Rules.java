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

public class Rules extends JFrame implements ActionListener{
<<<<<<< Updated upstream

         JButton b1, b2;
    String username;
    Rules(String username){

        this.username = username;
=======
    JButton b1, b2;
    String username;
    String email;
    String rollno;
    String clss;
    
    Rules(String username,String email,String rollno,String clss){
        this.username = username;
        this.email = email;
        this.rollno = rollno;
        this.clss = clss;
        
>>>>>>> Stashed changes
        setBounds(600, 200, 800, 650);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
<<<<<<< Updated upstream
        JLabel l1 = new JLabel("Welcome " + username + " to Simple Minds");
      l1.setForeground(new Color(30, 144, 255));
=======
        JLabel l1 = new JLabel("Welcome " + username + ". Please take your Exam");
        l1.setForeground(new Color(30, 144, 255));
>>>>>>> Stashed changes
        l1.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        l1.setBounds(50, 20, 700, 30);
        add(l1);
        
        JLabel l2 = new JLabel("");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setBounds(20, 90, 600, 350);
        l2.setText(
<<<<<<< Updated upstream
                "<html>"+ 
                    "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                        "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                   "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                    "4. Crying is allowed but please do so quietly." + "<br><br>" +
                    "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                  "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                  "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
=======
            "<html>"+ 
                "1. Take the examination within the specified time limit" + "<br><br>" +
                "2. Each question has a individual timer" + "<br><br>" +
                "3. You cannot navigate back to the previous question" + "<br><br>" +
                "4. For any queries,contact your advisor" + "<br><br>" +
>>>>>>> Stashed changes
            "<html>"
        );
        add(l2);
        
        b1 = new JButton("Back");
        b1.setBounds(250, 500, 100, 30);
        b1.setBackground(new Color(30, 144, 255));
<<<<<<< Updated upstream
         b1.setForeground(Color.WHITE);
=======
        b1.setForeground(Color.WHITE);
>>>>>>> Stashed changes
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Start");
<<<<<<< Updated upstream
           b2.setBounds(400, 500, 100, 30);
=======
        b2.setBounds(400, 500, 100, 30);
>>>>>>> Stashed changes
        b2.setBackground(new Color(30, 144, 255));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
<<<<<<< Updated upstream
            new OnlineExaminationSystem_UI().setVisible(true);
        }else if(ae.getSource() == b2){
            this.setVisible(false);
            new Quiz(username).setVisible(true);
    }
    }
    
    public static void main(String[] args){
        new Rules("");
 }
=======
            new Front_page().setVisible(true);
        }else if(ae.getSource() == b2){
            this.setVisible(false);
            new Quiz(username,email,rollno,clss).setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new Rules("","","","");
    }
>>>>>>> Stashed changes
}
