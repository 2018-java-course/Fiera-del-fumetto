/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FieraDelFumetto;

import java.util.ArrayList;
import java.util.Collections;
import FieraDelFumetto.Fiera.CustomComparator;

/**
 *
 * @author PC20
 */
public class MainClass {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Fiera myFiera = new Fiera("Comicon", "Napoli - Mostra d'Oltremare");
        Fiera myFiera2 = new Fiera("Anastasia-Comix", "Sant'Anastasia - Piazza Catteneo");
        Fiera myFiera3 = new Fiera("Lucca Comics and Games", "Lucca - Centro Storico");
        Fiera myFiera4 = new Fiera("Romics", "Roma - Fiera di Roma");
        Fiera myFiera5 = new Fiera("FantaExpo", "Salerno");
        ArrayList<Fiera> fiere = new ArrayList<>();
        
        

        fiere.add(0, myFiera);
        fiere.add(1, myFiera2);
        fiere.add(2, myFiera3);
        fiere.add(3, myFiera4);
        fiere.add(4, myFiera5);
       
        for (Fiera fiera : fiere) {
            System.out.println(fiera);
        }
        
         
        Collections.sort(fiere, new CustomComparator());
        
        System.out.println("ArrayList Ordinata FINALMENTE!!!!!!!! ");
        for (Fiera fiera : fiere) {
            System.out.println(fiera);
        }

    }
}
