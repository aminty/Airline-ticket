package ui;

import domain.Ticket;
import domain.User;
import util.ApplicationContext;
import util.CurrentData;

import java.util.Scanner;



public class GetDataFromUser {

    public static User getDataForSignUp(Subject title) {
        User user = new User();
        user.setTitle(title);
        System.out.println("-*-*-*-*-*-* sign up -*-*-*-*-*-*");
        System.out.printf("\t %s enter first name: ", Menu.NEXTLINE);
        user.setName(new Scanner(System.in).next());
        System.out.printf("\t %s enter last name: ", Menu.NEXTLINE);
        user.setLastName(new Scanner(System.in).next());
        while (true) {
            System.out.printf("\t %s choose username: ", Menu.NEXTLINE);
            String username = new Scanner(System.in).next();
            if (!ApplicationContext.getUserService().isExistsByUsername(username)) {
                user.setUsername(username);
                break;
            } else
                System.out.println("\t" + " >>>  " + Menu.PROHIBITED + " This user is exist !");
        }
        System.out.printf("\t %s choose password: ", Menu.NEXTLINE);
        user.setPassword(new Scanner(System.in).next());
        return user;
    }

    public static String airlineName() {
        System.out.printf("\t %s enter airline name: ", Menu.NEXTLINE);
        return new Scanner(System.in).next();
    }
    public static Ticket getNewTicket(){
        Ticket tk=new Ticket();
        tk.setAirline(CurrentData.getAirline());
        System.out.println("-*-*-*-*-*-* Add new service -*-*-*-*-*-*");

        System.out.printf("\t %s enter date of ticket: ", Menu.NEXTLINE);
        String date= new Scanner(System.in).next();
        tk.setDate(date);
        tk.setAirplane("A380");
        System.out.printf("\t %s enter cost of ticket: ", Menu.NEXTLINE);
        double cost= new Scanner(System.in).nextDouble();
        tk.setCost(cost);
        PrintData.printcity(City.values(),"departure");
        City [] city=City.values();
        tk.setDeparturePlace(city[new Scanner(System.in).nextInt()]);
        PrintData.printcity(City.values(),"arrival");
        tk.setArrivalPlace(city[new Scanner(System.in).nextInt()]);
        return tk;
        }

    public static City getArrival() {
        City [] city=City.values();
        PrintData.printcity(City.values(),"arrival");
        return city[new Scanner(System.in).nextInt()];

    }
    public static City getDeparture() {
        City [] city=City.values();
        PrintData.printcity(City.values(),"departure");
        return city[new Scanner(System.in).nextInt()];

    }

}




