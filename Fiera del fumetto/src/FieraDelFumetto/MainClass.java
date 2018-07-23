/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FieraDelFumetto;

import java.util.ArrayList;
import java.util.Collections;
import FieraDelFumetto.Fiera.CustomComparator;
import calendar.api.CalendarEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author PC20
 */
public class MainClass {

    private static boolean controllo = true;
    static ArrayList<Fiera> fiere = new ArrayList<>();
    static ArrayList<CalendarEvent> array = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here

        /*Fiera myFiera = new Fiera("Comicon", "Napoli - Mostra d'Oltremare");
        Fiera myFiera2 = new Fiera("Anastasia-Comix", "Sant'Anastasia - Piazza Catteneo");
        Fiera myFiera3 = new Fiera("Lucca Comics and Games", "Lucca - Centro Storico");
        Fiera myFiera4 = new Fiera("Romics", "Roma - Fiera di Roma");
        Fiera myFiera5 = new Fiera("FantaExpo", "Salerno");*/
        
        /*System.out.println("Dimmi quante fiere del fumetto vuoi inserire (^--^)/ \n");
        int size = fiere.size();
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for (int j = 0; j < i; j++) {

            System.out.println("Inserisci il nome della fiera: \n");
            Scanner sc1 = new Scanner(System.in);
            String str = sc1.nextLine();
            String nomeEvento = str;
            System.out.println("Inserisci il luogo della fiera: \n");
            Scanner sc2 = new Scanner(System.in);
            String luogoEvento = sc2.nextLine();
            System.out.println("Inserisci una descrizione della fiera: \n");
            Scanner sc3 = new Scanner(System.in);
            String description = sc3.nextLine();
            System.out.println("Inserisci la data di inizio della fiera (Formato DD/MM/YYYY): \n");
            Scanner sc4 = new Scanner(System.in);
            String date = sc4.nextLine();
            LocalDate startDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.println(nomeEvento + luogoEvento + description + startDate);
            Fiera.Builder fiera = new Fiera.Builder();
            fiera.setNomeEvento(nomeEvento);
            fiera.setLuogoEvento(luogoEvento);
            fiera.setDescription(description);
            fiera.setDataEvento(startDate);
            fiere.add(fiera.build());
        }*/

        /*fiere.add(0, myFiera);
        fiere.add(1, myFiera2);
        fiere.add(2, myFiera3);
        fiere.add(3, myFiera4);
        fiere.add(4, myFiera5);*/
        FiereMangement manager = new FiereMangement();
        manager.populate(array);
        stampaFiere(fiere);

        Collections.sort(fiere, new CustomComparator());

        System.out.println("ArrayList Ordinata FINALMENTE!!!!!!!! ");
        /*for (Fiera fiera : fiere) {
            System.out.println(fiera);
        }*/
        stampaFiere(fiere);
        stampaCalendar(array);

    }

    public static void stampaFiere(ArrayList<Fiera> fiere) {
        for (Fiera fiera : fiere) {
            System.out.println(fiera);
        }
    }
    
    public static void stampaCalendar(ArrayList<CalendarEvent> array){
        for (CalendarEvent Array : array){
            System.out.println(Array);
        }
    }
}

   
    

