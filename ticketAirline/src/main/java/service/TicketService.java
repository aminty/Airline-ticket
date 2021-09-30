package service;

import base.service.BaseService;
import domain.Ticket;
import ui.City;

import java.util.List;

public interface TicketService extends BaseService<Ticket,Long> {
    List<Ticket> findByDA(City departure, City arrival);
}
