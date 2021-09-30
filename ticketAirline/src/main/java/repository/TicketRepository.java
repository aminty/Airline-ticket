package repository;

import base.repository.BaseRepository;
import domain.Ticket;
import ui.City;

import java.util.List;

public interface TicketRepository extends BaseRepository<Ticket,Long> {
    List<Ticket> findByDA(City departure, City arrival);
}
