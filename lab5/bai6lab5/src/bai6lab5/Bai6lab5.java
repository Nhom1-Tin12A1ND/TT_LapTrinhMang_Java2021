/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6lab5;

/**
 *
 * @author Admin
 */
public class Bai6lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        myObject obj = new myObject();
        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);
        t1.start();
        t2.start();
    }

}
