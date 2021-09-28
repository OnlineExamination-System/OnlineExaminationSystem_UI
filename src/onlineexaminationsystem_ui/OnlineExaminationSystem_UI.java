/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package onlineexaminationsystem_ui;
import javax.swing.*;
import java.awt.*;


public class OnlineExaminationSystem_UI extends JFrame 
{
    OnlineExaminationSystem_UI()
    {
        setBounds(500,200,1000,500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("onlineexaminationsystem_ui/icons/welcome_exam.jpg"));
        JLabel l1=new JLabel(i1);
        l1.setBounds(200,200,1000,500); 
        add(l1);
        
        JLabel l2=new JLabel("Welcome  to Examination");
        l2.setFont(new Font("Times New roman",Font.BOLD,36));
        l2.setForeground(Color.BLACK);
        l2.setBounds(500,100,500,100);
        add(l2);
        
        
        JLabel l3=new JLabel("Enter your Name");
        l3.setFont(new Font("Raleway",Font.BOLD,26));
        l3.setForeground(Color.darkGray);
        l3.setBounds(1300,130,400,90);
        add(l3);
        
        JLabel l4=new JLabel("Enter your E-Mail");
        l4.setFont(new Font("Raleway",Font.BOLD,26));
        l4.setForeground(Color.darkGray);
        l4.setBounds(1300,250,400,90);
        add(l4);
        
        JLabel l5=new JLabel("Enter your Roll Number");
        l5.setFont(new Font("Raleway",Font.BOLD,26));
        l5.setForeground(Color.darkGray);
        l5.setBounds(1300,400,400,90);
        add(l5);
        
        JLabel l6=new JLabel("Enter your Class");
        l6.setFont(new Font("Raleway",Font.BOLD,26));
        l6.setForeground(Color.darkGray);
        l6.setBounds(1300,550,400,90);
        add(l6);
        
        JTextField t1=new JTextField();
        t1.setBounds(1300,200,300,25);
        t1.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(t1);
        
         JTextField t2=new JTextField();
        t2.setBounds(1300,320,300,25);
        t2.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(t2);
        
        JTextField t3=new JTextField();
        t3.setBounds(1300,470,300,25);
        t3.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(t3);
        
        JTextField t4=new JTextField();
        t4.setBounds(1300,620,300,25);
        t4.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(t4);
        
        
        JButton b1=new JButton("Take Examination");
        b1.setBounds(1300,750,400,50);
        b1.setBackground(new Color(30,144,254));
        add(b1);
        
        setVisible(true);
    }
    
    
    public static void main(String[] args)
    {
       new OnlineExaminationSystem_UI(); 
    }
}

