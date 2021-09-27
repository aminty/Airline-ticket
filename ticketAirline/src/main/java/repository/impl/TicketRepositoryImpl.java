package repository.impl;

import base.repository.impl.BaseRepositoryImpl;
import domain.Ticket;

import javax.persistence.EntityManager;

public class TicketRepositoryImpl extends BaseRepositoryImpl<Ticket,Long> {
    protected TicketRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Ticket> getEntityClass() {
        return Ticket.class;
    }
}
