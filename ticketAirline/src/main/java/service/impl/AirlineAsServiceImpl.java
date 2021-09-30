package service.impl;

import base.service.impl.BaseServiceImpl;
import domain.Airline;
import domain.airline_service.AirlineAs;
import repository.AirlineAsRepository;
import service.AirlineAsService;

public class AirlineAsServiceImpl extends BaseServiceImpl<AirlineAs,Long, AirlineAsRepository> implements AirlineAsService {
    public AirlineAsServiceImpl(AirlineAsRepository repository) {
        super(repository);
    }
}
