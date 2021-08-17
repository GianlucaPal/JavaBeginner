/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise;

/**
 *
 * @author Y520
 */
public class ShoppingCart {
    public static void main(String[] args) {
        System.out.println("Welcome to the shopping cart");        
    
    boolean OutOfStock = false;
    int quantity = 3;
    String message = "apple";
    String[] CustName = {"Morty Smith","Rick Sanchez","Mr Nimbus","Beth Smith"};
    double[] itemprices = {12.50, 19.99, 50.00, 25.99};
     
    
    if (quantity > 1){
        message = message + "s";
    }
    else{
        OutOfStock = true;
    }
    
    if (OutOfStock == true){
        System.out.println("There are no^"+" "+ message + " in stock"); 
       
    }
    else{
         System.out.println(CustName[1]+" wants to buy "+ quantity +" "+ message);        
    }
    
    for (double prices:  itemprices){
        System.out.println(prices);
    }
  
    }   
}
