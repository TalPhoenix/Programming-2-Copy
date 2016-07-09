/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.time.Instant;
import java.time.ZoneId;
/**
 *
 * @author taloh
 */
public class Clock{
    
    //Implement a class Clock whose getHours and getMinutes methods return the current time at your location.
    public String getHours(){
        int hours = Instant.now().atZone(ZoneId.systemDefault()).getHour();      
        return String.valueOf(hours);
    }
    public String getMinutes(){
      int minutes = Instant.now().atZone(ZoneId.systemDefault()).getMinute();
      return String.valueOf(minutes);
    }
    //Also provide a getTime method that returns a string with the hours and minutes by calling the getHours and getMinutes methods.
    public String getTime(){
      return getHours() + ":" + getMinutes();   
    }
    
}
