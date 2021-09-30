package service.impl;

import base.service.impl.BaseServiceImpl;
import domain.Ticket;
import repository.TicketRepository;
import service.TicketService;
import ui.City;

import java.util.List;

public class TicketServiceImpl extends BaseServiceImpl<Ticket,Long, TicketRepository> implements TicketService {
    public TicketServiceImpl(TicketRepository repository) {
        super(repository);
    }

    @Override
    public List<Ticket> findByDA(City departure, City arrival) {
        return repository.findByDA(departure,arrival);
    }
}
