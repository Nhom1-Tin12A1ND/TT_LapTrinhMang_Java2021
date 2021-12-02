/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b3lab5;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class Generator implements Runnable
{
    Thread t;
    Listener listener;
    public Generator(Listener listener)
    {
        this.listener = listener;
    }

    Generator(Square square) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
@Override
    public void run()
    {
        try 
        {
            while(true) 
            {
                int number = new Random().nextInt(20) + 1;
                System.out.println("Generator: " + number);
                listener.addNumber(number);
                Thread.sleep(2000);
            }
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
    public void start()
    {
        if(t == null) 
        {
            t = new Thread(this, "Generator");
            t.start();
        }
    }
}
