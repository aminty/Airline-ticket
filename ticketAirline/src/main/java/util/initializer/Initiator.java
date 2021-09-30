package util.initializer;

import service.UserService;
import util.ApplicationContext;

public class Initiator {

    public static void init() {
        UserService userService=ApplicationContext.getUserService();
    }
}
