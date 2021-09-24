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
        l1.setBounds(0,0,1000,500);
        add(l1);
        
        JLabel l2=new JLabel("Welcome to take your Examination");
        l2.setFont(new Font("Raleway",Font.BOLD,26));
        l2.setBounds(750,40,300,100);
        
        
        setVisible(true);
    }
    public static void main(String[] args)
    {
       new OnlineExaminationSystem_UI(); 
    }
}

