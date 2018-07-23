/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FieraDelFumetto;

import calendar.api.CalendarEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author PC20
 */
public class FiereMangement implements calendar.api.CalendarEventDatabase {

    public void populate(ArrayList<CalendarEvent> fiere){
        fiere.add(new Fiera.Builder()
                .setNomeEvento("Anastasia-Comix")
                .setLuogoEvento("Sant'Anastasia - Piazza Catteneo")
                .setDataEvento(LocalDate.parse("12/12/2012", DateTimeFormatter.ofPattern("dd/MM/yyyy")))
                .setDescription("Una grandissima fiera del fumetto")
                .build());
    }
    
    
    public void populateManually(ArrayList<CalendarEvent> fiere) {
        System.out.println("Dimmi quante fiere del fumetto vuoi inserire (^--^)/ \n");
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
        }
    }
}
