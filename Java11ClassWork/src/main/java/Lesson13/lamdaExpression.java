/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Y520
 */
public class lamdaExpression {
    public static void main(String[] args) {
        String[] names = {"Rick","Morty","Summer","Beth"};
        List<String> myList = new ArrayList(Arrays.asList(names));
        
//        for (String s :myList){
//           
//        }

        myList.replaceAll(s -> s.toUpperCase());
        
        System.out.println("after for loop: "+ myList);
    }
    
}
