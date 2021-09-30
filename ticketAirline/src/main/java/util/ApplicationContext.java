package util;

import repository.AirlineAsRepository;
import repository.AirlineRepository;
import repository.TicketRepository;
import repository.UserRepository;
import repository.impl.AirlineAsRepositoryImpl;
import repository.impl.AirlineRepositoryImpl;
import repository.impl.TicketRepositoryImpl;
import repository.impl.UserRepositoryImpl;
import service.AirlineAsService;
import service.AirlineService;
import service.TicketService;
import service.UserService;
import service.impl.AirlineAsServiceImpl;
import service.impl.AirlineServiceImpl;
import service.impl.TicketServiceImpl;
import service.impl.UserServiceImpl;

import javax.persistence.EntityManager;

public class ApplicationContext {
    private static final UserService userService;
    private static final UserRepository userRepository;
    private static final TicketService ticketService;
    private static final TicketRepository tickerRepository;
    private static final AirlineService airlineService;
    private static final AirlineRepository airlineRepository;
    private static final AirlineAsService airlineAsService;
    private static final AirlineAsRepository airlineAsRepository;

    static {
        EntityManager entityManager = HibernateUtil.getEntityMangerFactory().createEntityManager();

        userRepository = new UserRepositoryImpl(entityManager);

        userService = new UserServiceImpl(userRepository);

        airlineAsRepository = new AirlineAsRepositoryImpl(entityManager);

        airlineAsService = new AirlineAsServiceImpl(airlineAsRepository);


        airlineRepository = new AirlineRepositoryImpl(entityManager);

        airlineService = new AirlineServiceImpl(airlineRepository);

        tickerRepository = new TicketRepositoryImpl(entityManager);
        ticketService = new TicketServiceImpl(tickerRepository);

    }


    public static UserService getUserService() {
        return userService;
    }

    public static TicketService getTicketService() {
        return ticketService;
    }

    public static AirlineService getAirlineService() {
        return airlineService;
    }

    public static AirlineAsService getAirlineAsService() {
        return airlineAsService;
    }
}