package repository.impl;

import base.repository.impl.BaseRepositoryImpl;
import domain.Airline;
import domain.User;
import repository.AirlineRepository;

import javax.persistence.EntityManager;

public class AirlineRepositoryImpl extends BaseRepositoryImpl<Airline,Long> implements AirlineRepository {
    public AirlineRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Airline> getEntityClass() {
        return Airline.class;
    }

    @Override
    public Airline findByOwnerId(User user) {
        return entityManager.createQuery(
                "from " + getEntityClass().getSimpleName() + " where owner_id=:id",
                getEntityClass()).setParameter("id", user.getId()).getSingleResult();
    }
}