package onlineexaminationsystem_ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import org.json.simple.JSONObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Score extends JFrame implements ActionListener{
    
    Score(String username, String email, String rollno, String clss, Integer score){
        setBounds(600, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
       
        JLabel l2 = new JLabel("Thankyou " + username + " for taking your examination");
        l2.setBounds(500, 30, 700, 30);
        l2.setFont(new Font("RALEWAY", Font.PLAIN, 26));
        add(l2);
        
        JLabel l3 = new JLabel("Result will be sent to your registered Email-id");
        l3.setBounds(480, 200, 700, 30);
        l3.setFont(new Font("RALEWAY", Font.PLAIN, 26));
        l3.setForeground(new Color(199, 21, 133));
        add(l3);
       
        try {
            String postEndpoint = "http://127.0.0.1:9900/submit";
            JSONObject js = new JSONObject();

            js.put("name", username);
            js.put("email",email);
            js.put("roll_no",rollno);
            js.put("class", clss);
            js.put("marks", score);


            (HttpClient.newHttpClient()).send((HttpRequest.newBuilder()
                    .uri(URI.create(postEndpoint))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(String.valueOf(js)))
                    .build()), HttpResponse.BodyHandlers.ofString());
        } 
        catch (Exception e) {
            e.printStackTrace();
        }

        
       
    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new Front_page().setVisible(true);
    }
    
    public static void main(String[] args){
        new Score("", "","","",0).setVisible(true);
    }
}