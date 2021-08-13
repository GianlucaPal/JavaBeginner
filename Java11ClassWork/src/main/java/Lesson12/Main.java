/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson12;

/**
 *
 * @author Y520
 */
public class Main {
    public static void main(String[] args) {
        Shirt shirt01 = new Shirt(15, "Hawaiain",'R',55.9,'M',"Short Sleeve");
        shirt01.display();
        System.out.println("============================");
        Pants pant01 = new Pants(32.5, 76.5, 'M', 87, "Jean PAnt", 'B', 99.99);
        pant01.display();
        System.out.println("============================");
        Clothing Pant02 = new Pants (32.5, 76.5, 'M', 87, "Jean PAnt", 'B', 99.99);
//        System.out.println("Pant gender: " +((Pants)Pant02).getGender());
//        Pant02.display();
        
        if (Pant02 instanceof Pants){
            System.out.println("Pant gender: " +((Pants)Pant02).getGender());
        }else{
            System.out.println("Item is not a pant");
        }
       
        System.out.println(Pant02.toString());
        
        
    }
    
}
