package repository.impl;

import base.repository.impl.BaseRepositoryImpl;
import domain.Ticket;
import repository.TicketRepository;
import ui.City;

import javax.persistence.EntityManager;
import java.util.List;

public class TicketRepositoryImpl extends BaseRepositoryImpl<Ticket,Long> implements TicketRepository {
    public TicketRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Ticket> getEntityClass() {
        return Ticket.class;
    }

    @Override
    public List<Ticket> findByDA(City departure, City arrival) {
        return entityManager.createQuery(
                "from "+getEntityClass().getSimpleName()+
                        " where arrivalPlace=:arrival and departurePlace=:departure",getEntityClass())
                .setParameter("arrival",arrival).setParameter("departure",departure).getResultList();

    }
}
