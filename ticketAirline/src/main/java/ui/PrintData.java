package ui;


import domain.Ticket;
import util.CurrentData;

import java.util.List;
import java.util.stream.Stream;

public class PrintData {
    public static void printMenu(String[] items) {
        Stream.of(items).forEach(System.out::println);

    }

    public static void printcity(City[] city,String place){
        System.out.printf("\t %s enter %s place : \n", Menu.NEXTLINE,place);

        for (int i = 0; i < city.length; i++) {
            System.out.printf("\t\t[%d] - %s \n",i,city[i]);

        }
        PrintData.printMessage("Select item : ");

    }

    public static void printDashboard(String[] items) {
        System.out.println("|-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-|");
        System.out.printf("|Name: %S   -   Airline: %S   -    Customer id: %d   \n",
                CurrentData.currentUser.getName()+ " " +
                        CurrentData.getCurrentUser().getLastName(), CurrentData.getAirline().getAirlineName(),
                CurrentData.getCurrentUser().getId());
        System.out.println("|-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-|");
        Stream.of(items).forEach(System.out::println);

    }

    public static void printMessage(String title) {
        System.out.print("->> " + title);
    }

    public static void errorMessage(String title) {
        System.out.println("\t" + " >>>  " + Menu.DELETE + " " + title);
    }

    public static void successMessage(String title) {
        System.out.println("\t" + " >>>  " + Menu.CHECKMARK + " " + title);
    }


    public static void printTicket(List<Ticket> ticketList){

        ticketList.forEach(t -> System.out.printf
                ("\t " + Menu.NEXTLINE + "   %s   [%d] - Airline: %s  Departure: %s  Arrival: %s  Cost: %s  Date: %s  \n",
                        Menu.AIRPLANE,
                        t.getId(),
                        t.getAirline().getAirlineName(),
                        t.getDeparturePlace(),
                        t.getArrivalPlace(),
                        t.getCost(),
                        t.getDate()));

    }



}
