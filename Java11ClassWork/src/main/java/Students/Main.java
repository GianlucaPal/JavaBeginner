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
public class Main {
    public static void main(String[] args) {
        Students student1 = new Students("Pickle","Rick",70,"PickRick@gmail.com","074 364 4682",1);
        Students student2 = new Students("Tiny","Rick",14,"TinyRick@gmail.com","074 254 3684",5);
        Students student3 = new Students("Holographic","Rick",21,"HolokRick@gmail.com","074 324 546",2);
    
    
    Students[] Allstudents = {student1,student2,student3 };

    for (Students students: Allstudents){
        System.out.println(students.getStudentDeatails());
        System.out.println("==================================");
}

}
} 