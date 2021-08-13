/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Students;

/**
 *
 * @author Y520
 */
public class Students {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String cellNumber;
    private int ID;

    public Students(String firstName, String lastName, int age, String email, String cellNumber, int ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.cellNumber = cellNumber;
        this.ID = ID;
    }
    
    

    public String getStudentDeatails() {
        String Temp = (ID +"\n"+firstName +"\n"+lastName+"\n"+age+"\n"+email+"\n"+cellNumber);
        return Temp;
    }
    
    
    
    
}
