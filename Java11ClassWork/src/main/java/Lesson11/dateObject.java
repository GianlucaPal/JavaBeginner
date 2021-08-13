/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11;
import java.time.LocalDate;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Y520
 */
public class dateObject {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        JapaneseDate jDate = JapaneseDate.from(myDate);
//        TaibudhistDate GDate = TaibudhistDate.from(myDate);
        String sDate = myDate.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Date in ISO_DATE_TIME format"+ sDate);
        
        String fDate = myDate.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Date in ISO_DATE_TIME format"+ sDate);      
        
        
        System.out.println("Today's date: "+ myDate);
        System.out.println("Japanaese date: "+ jDate);
        
    }
    
}
