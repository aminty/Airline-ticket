package repository.impl;

import base.repository.impl.BaseRepositoryImpl;
import domain.airline_service.AirlineService;

import javax.persistence.EntityManager;

public class AirlineServiceRepositoryImpl extends BaseRepositoryImpl<AirlineService,Long> {
    protected AirlineServiceRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<AirlineService> getEntityClass() {
        return AirlineService.class;
    }
}
