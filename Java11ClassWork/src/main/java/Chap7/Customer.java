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
public class Customer {
    public String name = "Chuck barry";
    public int custID = 1205;
    public String address;
    public int orderNum;
    public int age;
    
    public Customer(String name, int CustID, String address, int orderNum, int age){
        this.name = name;
        this.address = address;
        this.age = age;
        this.orderNum = orderNum;
        this.custID = CustID;
    }
    
    public void displayCustomer() {
        System.out.println("Customer: "+name); 
        System.out.println("ID: "+custID);
        System.out.println("Address: "+address);
        System.out.println("Order Number: "+orderNum);
        System.out.println("Age: "+age);
    }
    
}
