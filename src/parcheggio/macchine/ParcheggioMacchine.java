package parcheggio.macchine;

import com.sun.tools.javac.Main;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ParcheggioMacchine {

    public static void main(String[] args) {
        
        //Queste sono le 10 macchine che dovranno entrare nel garage
        Mythread m1 = new Mythread("gino");
        Mythread m2 = new Mythread("franco");
        Mythread m3 = new Mythread("rocco");
        Mythread m4 = new Mythread("leo");
        Mythread m5 = new Mythread("jhonny java");
        Mythread m6 = new Mythread("giovanni");
        Mythread m7 = new Mythread("andrea");
        Mythread m8 = new Mythread("giuseppe");
        Mythread m9 = new Mythread("stefano");
        Mythread m10 = new Mythread("paulo");
        
        //Macchine in più per far vedere che il parcheggio è pieno
        Mythread m11 = new Mythread("marco");
        Mythread m12 = new Mythread("lorenzo");
        
        //Qui creiamo il semaforo che controllera l'entrata delle macchine nel garage
        Semaforo s = new Semaforo();
        
        //Ordine di arrivo delle macchine
        m1.start();
         try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        m2.start();
         try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        m3.start();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        m4.start();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        m5.start();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        m6.start();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        m7.start();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        m8.start();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        m9.start();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        m10.start();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        m11.start();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        m12.start();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Macchine in attesa: ");
        for (int i = 0; i < s.getWait().size(); i++) {
            System.out.println(s.getWait().get(i).getNome() + "");
        }
        
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        m1.liberaIlposto();
        
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        System.out.println("Macchine in attesa: ");
        for (int i = 0; i < s.getWait().size(); i++) {
            System.out.println(s.getWait().get(i).getNome() + "");
        }
        
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        m3.liberaIlposto();
        
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        System.out.println("Macchine in attesa: ");
        for (int i = 0; i < s.getWait().size(); i++) {
            System.out.println(s.getWait().get(i).getNome() + "");
        }
        
        
        try {
            m1.join();
            m2.join();
            m3.join();
            m4.join();
            m5.join();
            m6.join();
            m7.join();
            m8.join();
            m9.join();
            m10.join();
            m11.join();
        } catch (Exception e) {
        }  
    }
    
}
