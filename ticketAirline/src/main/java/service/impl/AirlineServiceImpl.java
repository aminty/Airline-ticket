package service.impl;

import base.service.impl.BaseServiceImpl;
import domain.Airline;
import domain.User;
import repository.AirlineRepository;
import service.AirlineService;

public class AirlineServiceImpl extends BaseServiceImpl<Airline,Long, AirlineRepository> implements AirlineService {
    public AirlineServiceImpl(AirlineRepository repository) {
        super(repository);
    }
    public Airline findByOwnerId(User user){
        return repository.findByOwnerId(user);
    }

}
