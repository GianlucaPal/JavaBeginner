/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap09;

/**
 *
 * @author Y520
 */
public class Item {
    private double price = 15.50;    
    public void setPrice(double Price){
        this.price = price;       
    }    
     
    public Item( double price){
        this.price= price;
    }

    public double getPrice() {
        return price;
    }
    
    
    

}