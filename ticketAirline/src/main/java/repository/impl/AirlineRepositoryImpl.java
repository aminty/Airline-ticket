package repository.impl;

import base.repository.impl.BaseRepositoryImpl;
import domain.Airline;

import javax.persistence.EntityManager;

public class AirlineRepositoryImpl extends BaseRepositoryImpl<Airline,Long> {
    protected AirlineRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Airline> getEntityClass() {
        return Airline.class;
    }
}
