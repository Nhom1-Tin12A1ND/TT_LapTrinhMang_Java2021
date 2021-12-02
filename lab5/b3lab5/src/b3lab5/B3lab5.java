/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b3lab5;

/**
 *
 * @author Admin
 */
public class B3lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Square square = new Square();
        square.start();
        Generator generator = new Generator(square);
        generator.start();
    }
    
}
