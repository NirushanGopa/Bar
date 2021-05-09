
package bar;

import java.util.concurrent.Semaphore;
import javax.print.attribute.standard.SheetCollate;

public class Cameriere extends Thread
{
    protected static int ordinazioni = 0;
    protected static Semaphore semaforo = new Semaphore(1);
    
}
