package FieraDelFumetto;

import calendar.api.CalendarEvent;
import calendar.api.CalendarEventException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Fiera implements Comparator<Fiera>, CalendarEvent {

    private String nomeEvento;
    private String luogoEvento;
    private int numPersone;

    /*public Fiera inserimento(String nomeEvento, String luogoEvento){
         Fiera myFiera = new Fiera(nomeEvento, luogoEvento);
         return myFiera;
    }*/

    public Fiera(String nomeEvento, String luogoEvento)
    {
        this.nomeEvento = nomeEvento;
        this.luogoEvento = luogoEvento;
    }
    
    
    @Override
    public String toString(){
       return "Fiera Fumetto{" +
            "Nome Fiera=" + nomeEvento +
            ", Luogo Fiera='" + luogoEvento + '\'' +
            '}'; 
    }
        @Override
        public int compare(Fiera o1, Fiera o2)
        {

            return  o1.nomeEvento.compareTo(o2.nomeEvento);
        }

    @Override
    public String getTitle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LocalDate getStartDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LocalDate getEndDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCategory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getLocation() throws CalendarEventException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
