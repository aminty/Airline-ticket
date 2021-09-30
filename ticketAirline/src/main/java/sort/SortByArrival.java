package sort;

import domain.Ticket;

import java.util.Comparator;

public class SortByArrival implements Comparator<Ticket> {
    @Override
    public int compare(Ticket o1, Ticket o2) {
        return o1.getArrivalPlace().compareTo(o2.getArrivalPlace());
    }
}
