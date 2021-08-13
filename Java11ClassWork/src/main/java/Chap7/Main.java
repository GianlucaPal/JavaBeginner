/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap7;

/**
 *
 * @author Y520
 */
public class Main {
    public static void main(String[] args) {
        
        Customer customer01 = new Customer("Chuck Barry", 78,"C-137", 255, 32);
        //customer01.displayCustomer();
        
        Customer customer02 = new Customer("Rick Sanchez", 25,"Washington", 365, 70);
      //  customer01.displayCustomer();
        
        Customer customer03 = new Customer("Morty Smith", 56,"New York", 242, 14);
       // customer01.displayCustomer();
        
        Customer customer04 = new Customer("Beth Smith", 35,"Gauteng", 154, 35);
        //customer01.displayCustomer();
        
        Customer[] Customers = {customer01, customer02, customer03, customer04};
        
        for (Customer Cust : Customers){
            System.out.println("Customer: " + Cust.name); 
            System.out.println("ID: " + Cust.custID);
            System.out.println("Address: " + Cust.address);
            System.out.println("Order Number: " + Cust.orderNum);
            System.out.println("Age: " + Cust.age);
            
        }
    }
}
