package parcheggio.macchine;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Mythread extends Thread {
    
     String nome;
    ArrayList<Mythread> parcheggio;
    static Semaphore sem; 
    
    public Mythread(String nome) {
        this.nome = nome;
        parcheggio = new ArrayList();
    }

    public String getNome() {
        return nome;
    }
    
    public static int controllo(Semaforo s)
    {
        return s.getValore();
    }
    
    public void liberaIlposto()
    {
        System.out.println("Liberato il posto di " + nome);
        Semaforo.aumenta();
    }
    
    @Override
    public void run()
    {
        Semaforo.riduci(this);
        System.out.println("Parcheggiando la macchina di: " + nome);
        parcheggio.add(this);
        System.out.println("Posti liberi al momento: " + Semaforo.getValore());
    }
}
