package util;

import domain.Airline;
import domain.User;

public class CurrentData {
     public  static User currentUser;
     public static Airline airline;

    public static void logout() {
        currentUser = null;
        airline=null;
    }

    public static User getCurrentUser() {
        return currentUser;
    }

    public static void setCurrentUser(User currentUser) {
        CurrentData.currentUser = currentUser;
    }

    public static Airline getAirline() {
        return airline;
    }

    public static void setAirline(Airline airline) {
        CurrentData.airline = airline;
    }
}
