
package bar;

import java.util.ArrayList;

public class Bar 
{

    public static void main(String[] args) 
    {
        ArrayList <Cliente> listaClienti = new ArrayList<>();
        
        Cliente c1 = new Cliente("Niru");
        Cliente c2 = new Cliente("Beri");
        Cliente c3 = new Cliente("Josh");
        
        listaClienti.add(c1);
        listaClienti.add(c2);
        listaClienti.add(c3);
        
        System.out.println("\nBAR APERTO ANCHE CON IL COVID");
        
        for(int i = 0; i < listaClienti.size(); i++)
        {
            listaClienti.get(i).start();
        }
        
        for(int i = 0; i < listaClienti.size(); i++)
        {
            try 
            {
                
                listaClienti.get(i).join();
                
            } catch (Exception e) 
            {
                
            }
            
        }
        
        System.out.println("\nBAR CHIUSO");
        System.out.println("\nGuadagno della giornata: " + Cameriere.ordinazioni + "$");
    }
    
}
