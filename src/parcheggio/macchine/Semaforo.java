
package parcheggio.macchine;
import java.util.ArrayList;

public class Semaforo {
    private static int valore = 10; //Posti del parcheggio
    static ArrayList<Mythread> wait = new ArrayList();//Wait list
    
    public static void riduci(Mythread t)
    {
        if(valore == 0 || valore < 0)
        {
            wait.add(t);
            System.out.println("La macchina di " + wait.get(wait.size() - 1).getNome() + " è ora in attesa" );
            try {
                t.suspend();//Uso questo metodo perché wait() non funziona
            }
             catch (Exception e) {
            }
            
        }
        valore--;
    }
    
    public static void aumenta()
    {
         valore++;
         if(wait.size() != 0)
         {
            wait.get(0).resume();//USo questo metodo perché notifyAll() non funziona
            wait.remove(0);
         }
    }

    public static ArrayList<Mythread> getWait() {
        return wait;
    }
    
    public static int getValore() {
        return valore;
    }
     
}
