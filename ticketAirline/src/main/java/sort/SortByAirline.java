package sort;

import domain.Ticket;

import java.util.Comparator;

public class SortByAirline implements Comparator<Ticket> {
    @Override
    public int compare(Ticket t1, Ticket t2) {
        return t1.getAirline().getAirlineName().compareTo(t2.getAirline().getAirlineName());
    }
}
