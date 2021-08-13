/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson13;

import Lesson12.*;

/**
 *
 * @author Y520
 */
public class Shirt extends Clothing implements Returnable{
    private char fit = 'U';
    private String sleeve;
    private char colour;

    public Shirt(int itemID, String description, char colorCode, double price, char fit, String sleeve){
        super(itemID, description, colorCode, price);
        this.fit = fit;
        this.sleeve = sleeve;

    }

    @Override
    public void display(){
        super.display();
        System.out.println("fit :"+ getFit());
        System.out.println("Sleeve: " + getSleeve());


    }

    public char getFit() {
        return fit;
    }

    public String getSleeve() {
        return sleeve;
    }

    public char getColour() {
        return colour;
    }

    public void setFit(char fit) {
        this.fit = fit;
    }

    public void setSleeve(String sleeve) {
        this.sleeve = sleeve;
    }
    
    public String doReturn(){
        return "This item is returnable for 1 week.";
    }
    
}
