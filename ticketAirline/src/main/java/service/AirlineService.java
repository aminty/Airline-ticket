package service;

import base.service.BaseService;
import domain.Airline;
import domain.User;

public interface AirlineService extends BaseService<Airline,Long> {
    Airline findByOwnerId(User user);
}
