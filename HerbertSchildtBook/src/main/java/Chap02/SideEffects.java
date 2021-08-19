/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap02;

/**
 *
 * @author Y520
 */
public class SideEffects {

    public static void main(String args[]) {
        int i;

        i = 0;

        if (false & (++i < 100)) {
            System.out.println("this won't be displayed");
        }
        System.out.println("if statements executed: " + i);

        if (false && (++i < 100)) {
            System.out.println("this won't be displayed");
        }
        System.out.println("if statements executed: " + i);
    }

}
