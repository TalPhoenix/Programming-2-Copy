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
public class WorldClock extends Clock{
    
    private int offSetMinutes;
    //Provide a subclass WorldClock whose constructor accepts a time offset.
    public WorldClock(int offSetMinutes) {
       this.offSetMinutes = offSetMinutes;
       getTime(); 

    }
  
    //For example, if you live in California, a new WorldClock(3) should show the time in New York, three time zones ahead. 
    //Which methods did you override? (You should not override getTime)
    @Override
	public String getHours(){
        int hours = Instant.now().atZone(ZoneId.of( "-4" )).getHour();
        int calculatedHour = offSetMinutes/60;
        hours += calculatedHour;
        
        if(offSetMinutes == -30){
            hours = hours - 1;
        }
        else{
            hours = hours;
        }
        
        String hoursStr = String.valueOf(hours);
        if(String.valueOf(hours).length() == 1){
            hoursStr = "0"+hoursStr;
        }
         
        return hoursStr;
    }
    
    @Override
    public String getMinutes(){
        /*boolean negativeOffSet = false;
        if(offSetMinutes < 0){
            negativeOffSet = true;
        }*/
    	String offSetMinutesStr = String.valueOf(offSetMinutes).replace("-", "");
    	int offSetMinutesValue = Integer.valueOf(offSetMinutesStr);
    	if(offSetMinutesValue >= 60){
    		offSetMinutesValue = 00;
    	} 
        else if(offSetMinutesValue == 0){
    		offSetMinutesValue = 00;
    	}      
        else{
            offSetMinutesValue = 30;
        }
    	
        int minutes = Instant.now().atZone(ZoneId.of( "-4" )).getMinute();
            
            if(offSetMinutes == 30){
                offSetMinutesValue += minutes;
                }
            else if(offSetMinutes == 0){
                offSetMinutesValue = minutes; 
            }               
            else{
                offSetMinutesValue += minutes;
                }
      
        String minsStr = String.valueOf(offSetMinutesValue);
        if(String.valueOf(minsStr).length() == 1){
            minsStr = "0"+minsStr;
        }  
        
        return minsStr;       
    }
    
    public String getTime(){
       return getHours() + ":" + getMinutes();   
    }
    
}
