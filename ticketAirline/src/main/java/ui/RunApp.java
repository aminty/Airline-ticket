package ui;

import domain.Ticket;
import sort.SortByAirline;
import sort.SortByArrival;
import sort.SortByCost;
import sort.SortByDeparture;
import util.ApplicationContext;
import util.CurrentData;

import java.util.Collections;
import java.util.List;


public class RunApp {
    private static boolean toggleSorting = false;


    public static void run() {

        outer:
        {
            while (true) {
                PrintData.printMenu(Menu.STARTMENU);
                PrintData.printMessage("Select item : ");
                switch (Integer.parseInt(Validator.validator("\\d+"))) {
                    case 1:
                        login();
                        break;

                    case 2:
                        signup();
                        break;


                    case 3:
                        break outer;
                    default:
                        PrintData.errorMessage("Item does not exists !");

                }
            }
        }
    }

    private static void signup() {
        outer:
        {
            while (true) {
                System.out.println("-*-*-*-*-*-* sign up -*-*-*-*-*-*");
                PrintData.printMenu(Menu.LOGINAS);
                PrintData.printMessage("Signup as : ");
                switch (Integer.parseInt(Validator.validator("\\d+"))) {
                    case 1:
                        ApplicationContext.getUserService().signup(Subject.Airline);
                        break;

                    case 2:
                        ApplicationContext.getUserService().signup(Subject.Customer);
                        break;
                    case 3:
                        break outer;
                    default:
                        PrintData.errorMessage("Item does not exists !");
                }
            }
        }

    }


    private static void login() {
        outer:
        {
            while (true) {
                System.out.println("-*-*-*-*-*-* login -*-*-*-*-*-*");
                PrintData.printMenu(Menu.LOGINAS);
                PrintData.printMessage("Login as : ");
                switch (Integer.parseInt(Validator.validator("\\d+"))) {
                    case 1:
                        if (ApplicationContext.getUserService().login(Subject.Airline))
                            loginAsAirline();

                        break;

                    case 2:
                        if (ApplicationContext.getUserService().login(Subject.Customer))
                            loginAsCustomer();


                        break;

                    case 3:
                        break outer;
                    default:
                        PrintData.errorMessage("Item does not exists !");
                }
            }
        }
    }

    private static void loginAsCustomer() {
        City arrival=GetDataFromUser.getArrival();
        City departure=GetDataFromUser.getDeparture();

        List<Ticket> ticketList = ApplicationContext.getTicketService().findByDA(departure,arrival);
        if (ticketList.isEmpty()){
            PrintData.errorMessage("No ticket yet");
            loginAsCustomer();
        }
        outer:
        {
            while (true) {


                PrintData.printDashboard(Menu.WHENCUSTOMERLOGIN);
                PrintData.printTicket(ticketList);
                PrintData.printMessage("Select item : ");
                switch (Integer.parseInt(Validator.validator("\\d+"))) {

                    case 1:
                        toggleSorting = !toggleSorting;
                        if (toggleSorting) {
                            Collections.sort(ticketList, new SortByCost());
                            PrintData.printTicket(ticketList);
                        } else {
                            Collections.sort(ticketList, new SortByCost().reversed());
                            PrintData.printTicket(ticketList);
                        }
                        break;
                    case 2:
                        toggleSorting = !toggleSorting;
                        if (toggleSorting) {
                            Collections.sort(ticketList, new SortByAirline());
                            PrintData.printTicket(ticketList);
                        } else {
                            Collections.sort(ticketList, new SortByAirline().reversed());
                            PrintData.printTicket(ticketList);
                        }
                        break;
                    case 3:

                        toggleSorting = !toggleSorting;
                        if (toggleSorting) {
                            Collections.sort(ticketList, new SortByArrival());
                            PrintData.printTicket(ticketList);
                        } else {
                            Collections.sort(ticketList, new SortByArrival().reversed());
                            PrintData.printTicket(ticketList);
                        }
                        break;
                    case 4:
                        toggleSorting = !toggleSorting;
                        if (toggleSorting) {
                            Collections.sort(ticketList, new SortByDeparture());
                            PrintData.printTicket(ticketList);
                        } else {
                            Collections.sort(ticketList, new SortByDeparture().reversed());
                            PrintData.printTicket(ticketList);
                        }
                        break;

                    case 5:
                        CurrentData.logout();
                        break outer;
                    default:
                        PrintData.errorMessage("Item does not exists !");

                }
            }
        }
    }


    private static void loginAsAirline() {

        outer:
        {
            while (true) {
                int selectedItem;
                PrintData.printDashboard(Menu.WHENAIRLINELOGIN);
                PrintData.printMessage("Select item : ");
                switch (Integer.parseInt(Validator.validator("\\d+"))) {
                    case 1:
                        Ticket ticket = GetDataFromUser.getNewTicket();
                        //ApplicationContext.getTicketService().saveOrUpdate(ticket);
                        CurrentData.getAirline().getTickets().add(ticket);
                        ApplicationContext.getAirlineService().saveOrUpdate(CurrentData.getAirline());

                        break;

                    case 2:

                        break;


                    case 3:
                        CurrentData.logout();
                        break outer;
                    default:
                        PrintData.errorMessage("Item does not exists !");

                }
            }
        }
    }
}
