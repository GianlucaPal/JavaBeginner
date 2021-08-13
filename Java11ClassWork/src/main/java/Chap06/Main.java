/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap06;

/**
 *
 * @author Y520
 */
public class Main {
    public static void main(String[] args) {
        Customer customer01 = new Customer();
        Customer customer02 = customer01;
        
//        customer01.name = "Keagan";
//        customer01.age = 19;
//        customer01.custID = 1332;
//        customer01.orderNum = 25;
//        customer01.address = "245 Woodlane Road";

    customer01.setName("Rick Sanchez");
    customer01.setAddress("C-137");
    customer01.setAge(70);
    customer01.setCustID(678);
    customer01.setOrderNum(20);
    
    System.out.println(customer01.getName()); 
    System.out.println(customer01.getAddress()); 
    System.out.println(customer01.getAge()); 
    System.out.println(customer01.getCustID()); 
    System.out.println(customer01.getOrderNum()); 
        
        customer02.displayCustomer();
        
    }
    
}
