package FieraDelFumetto;

import calendar.api.CalendarEvent;
import calendar.api.CalendarEventException;
import java.time.LocalDate;
import java.util.Comparator;

public class Fiera implements CalendarEvent {

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getLuogoEvento() {
        return luogoEvento;
    }

    public void setLuogoEvento(String luogoEvento) {
        this.luogoEvento = luogoEvento;
    }

    private String nomeEvento;
    private String luogoEvento;
    private LocalDate startDate;
    private String description;
    private int numPersone;

    /*public Fiera inserimento(String nomeEvento, String luogoEvento){
         Fiera myFiera = new Fiera(nomeEvento, luogoEvento);
         return myFiera;
    }*/

    /*public Fiera(String nomeEvento, String luogoEvento)
    {
        this.nomeEvento = nomeEvento;
        this.luogoEvento = luogoEvento;
    }*/
    
    
    private Fiera(){
    
    }
    
    public static class Builder{
        private Fiera fiera;
        
        public Builder() {
            this.fiera = new Fiera();
        }
        
        public Builder setNomeEvento(String nomeEvento){
            this.fiera.nomeEvento = nomeEvento;
            return this;
        }
        
        public Builder setLuogoEvento(String luogoEvento){
            this.fiera.luogoEvento = luogoEvento;
            return this;
        }
        
        public Builder setDataEvento(LocalDate startDate){
            this.fiera.startDate = startDate;
            return this;
        }
        
        public Builder setDescription(String description){
            this.fiera.description = description;
            return this;
        }
        
        public Fiera build(){
            return this.fiera;
        }
    
    }
    
    
    
    @Override
    public String toString(){
       return "Fiera Fumetto{" +
            "Nome Fiera=" + nomeEvento +
            ", Luogo Fiera='" + luogoEvento + '\'' +
            ", Descrizione='" + description + '\'' +
            ", Data='" + startDate + 
            '}'; 
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

    @Override
    public String getDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*@Override
    public int compare(Fiera o1, Fiera o2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
    public static class CustomComparator implements Comparator<Fiera>{
        
        @Override
        public int compare(Fiera o1, Fiera o2) {
            return o1.getNomeEvento().compareTo(o2.getNomeEvento()); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
    
}


