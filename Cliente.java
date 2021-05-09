/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bar;

import java.util.Random;


public class Cliente extends Thread
{
    int numeroCafe;

    public Cliente(String name) 
    {
        super(name);
    }
    
    
    @Override
    public void run() 
    {
        try 
        {
            System.out.println("\nCliente " + getName() + " attende cameriere...");
            Cameriere.semaforo.acquire();
            
            System.out.println("\nADESSO IL CAMERIERE RICEVE ORDINAZIONI!");
            numeroCafe = new Random().nextInt(4) +1;
            Cameriere.ordinazioni += numeroCafe;
            System.out.println(getName() + " ha ordinato " + numeroCafe);
            
            System.out.println("\nIl cemeriere ha ricevuto le ordinazioni di " + getName());
            Cameriere.semaforo.release();
            
        } catch (Exception e) 
        {
            
        }


    }
    
}
