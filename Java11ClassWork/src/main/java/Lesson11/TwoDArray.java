/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11;

/**
 *
 * @author Y520
 */
public class TwoDArray {
    public static void main(String[] args) {
        int [][] numbers = new int [4][4];
        
        numbers [0] [1] = 1;
        numbers [0] [2] = 2;
        numbers [0] [3] = 3;
        numbers [0] [0] = 4;
        numbers [1] [0] = 5;
        numbers [1] [1] = 6;
        numbers [1] [2] = 7;
        numbers [1] [3] = 8;
        numbers [2] [0] = 9;
        numbers [2] [1] = 10;
        numbers [2] [2] = 11;
        numbers [2] [3] = 12;  
        numbers [3] [0] = 13;
        numbers [3] [1] = 14;
        numbers [3] [2] = 15;
        numbers [3] [3] = 16;
        
        for (var i= 0;i <numbers.length;i++){
            for (var j =0; j <numbers[1].length;j++){
                System.out.println("\tQ" + (j+i)+ ": " +numbers[i][j]);
            }
            System.out.println("\n");
        
        
    }
    }
}
