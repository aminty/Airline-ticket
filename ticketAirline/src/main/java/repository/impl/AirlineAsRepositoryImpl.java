package repository.impl;

import base.repository.impl.BaseRepositoryImpl;
import domain.Airline;
import domain.User;
import domain.airline_service.AirlineAs;
import repository.AirlineAsRepository;

import javax.persistence.EntityManager;

public class AirlineAsRepositoryImpl extends BaseRepositoryImpl<AirlineAs,Long> implements AirlineAsRepository {
    public AirlineAsRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<AirlineAs> getEntityClass() {
        return AirlineAs.class;
    }



}
