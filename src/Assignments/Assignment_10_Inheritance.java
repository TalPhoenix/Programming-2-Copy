/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments;

import java.time.Instant;
import java.time.ZoneId;

/**
 *
 * @author taloh
 */
public class Assignment_10_Inheritance {
     public static void main (String args[]) {
        ZoneId.of("-4");
        Instant.now();
        ZoneId.systemDefault();

        System.out.println(Instant.now());
        System.out.println(Instant.now().atZone(ZoneId.of("-4")));
        System.out.println(Instant.now().atZone(ZoneId.of( "America/New_York" )));
        System.out.println(Instant.now().atZone(ZoneId.of( "America/Mexico_City" )));
        System.out.println(Instant.now().atZone(ZoneId.of( "Asia/Tokyo" )));
  
}
}
