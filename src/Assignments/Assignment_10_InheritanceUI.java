/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author taloh
 */
public class Assignment_10_InheritanceUI extends JFrame{
     public static void main(String[] args) {

       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Assignment_10_InheritanceUI().setVisible(true);
            }
        });
    }
     
    public Assignment_10_InheritanceUI() {
        showClockUI();
    }
     
    private static String currentTime(String zone){
        return Instant.now().atZone(ZoneId.of( zone )).toString();   
    }

    private static int getHours(String zone ){
        return Instant.now().atZone(ZoneId.of( zone )).getHour();
    }

    private static int getMinutes(String zone ){
        return Instant.now().atZone(ZoneId.of( zone )).getMinute();
    }
    
    private static String getTime(String zone ){
        return getHours(zone) + ":" + getMinutes(zone);
    }

    private static void showClockUI(){
     JFrame myFrame = new JFrame("Test GUI");
        myFrame.setVisible(true);
        myFrame.setBounds(300, 200, 1400, 900);
        JLabel myText = new JLabel("Current EST time is: " + getTime("-4"));
        myText.setBounds(300, 500, 500, 200);
        JLabel nyTime = new JLabel("Current New York time is: " + getTime("America/New_York"));
        nyTime.setBounds(300, 400, 500, 200);
        JLabel mcTime = new JLabel("Current Mexic City time is: " + getTime("America/Mexico_City"));
        mcTime.setBounds(300, 300, 500, 200);
        JLabel tTime = new JLabel("Current Tokyo time is: " + getTime("Asia/Tokyo"));
        tTime.setBounds(300, 200, 500, 200);
        JLabel blank = new JLabel("");
        blank.setBounds(300, 100, 500, 200);
        
        myFrame.getContentPane().add(myText);
        myFrame.getContentPane().add(nyTime);
        myFrame.getContentPane().add(mcTime);
        myFrame.getContentPane().add(tTime);
        myFrame.getContentPane().add(blank);
    }
}
