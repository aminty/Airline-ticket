package sort;

import domain.Ticket;

import java.util.Comparator;

public class SortByDeparture implements Comparator<Ticket> {
    @Override
    public int compare(Ticket o1, Ticket o2) {
        return o1.getDeparturePlace().compareTo(o2.getDeparturePlace());
    }
}
