/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson14;

import java.io.IOException;
import java.io.File;

/**
 *
 * @author Y520
 */
public class TestClass {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        
        try{
            testClass.testCheckedException();
        }catch(IOException e){
            System.out.println(e.getMessage());            
        }
    }
    public void testCheckedException() throws IOException{
        File testFile = new File("//TEstFile.txt");
        testFile.createNewFile();
        System.out.println("testFile exists: " + testFile.exists());
    }
    
}
