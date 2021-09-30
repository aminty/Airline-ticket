package service.impl;

import base.service.impl.BaseServiceImpl;
import domain.Airline;
import domain.User;
import repository.UserRepository;
import service.UserService;
import ui.GetDataFromUser;
import ui.Menu;
import ui.PrintData;
import ui.Subject;
import util.ApplicationContext;
import util.CurrentData;

import java.util.Scanner;

public class UserServiceImpl extends BaseServiceImpl<User,Long, UserRepository> implements UserService {
    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }

    @Override
    public boolean isExistsByUsername(String username) {
        return repository.isExistsByUsername(username);
    }
    @Override
    public boolean login(Subject title) {
        System.out.printf("\t %s enter username: ", Menu.NEXTLINE);
        String username = new Scanner(System.in).next();
        System.out.printf("\t %s enter password: ", Menu.NEXTLINE);
        String password = new Scanner(System.in).next();
        if (repository.isExistsByUsername(username)) {
            User user = repository.fingByUsername(username);
            if (user.getTitle().equals(Subject.Customer) && title.equals(Subject.Airline)){
                PrintData.errorMessage("Access denied!");
                return false;

            }
            if (user.getPassword().equals(password)) {
                CurrentData.setCurrentUser(user);
                CurrentData.setAirline(ApplicationContext.getAirlineService().findByOwnerId(user));

            }
            PrintData.printMessage(Menu.LOGIN_SUCCESS__MSG);
            return true;
        } else {
            PrintData.errorMessage("This user does not exists!");
            return false;
        }
    }
    @Override
    public void signup(Subject title) {
        User user= GetDataFromUser.getDataForSignUp(title);
        if (title.equals(Subject.Airline)){
            Airline airline= new Airline();
            airline.setAirlineName(GetDataFromUser.airlineName());
            airline.setOwner(user);
            ApplicationContext.getAirlineService().saveOrUpdate(airline);

        }else{
            ApplicationContext.getUserService().saveOrUpdate(user);

        }

    }

}
