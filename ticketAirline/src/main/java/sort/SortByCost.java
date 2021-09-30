package sort;

import domain.Ticket;

import java.util.Comparator;

public class SortByCost implements Comparator<Ticket> {
    @Override
    public int compare(Ticket t1, Ticket t2) {
        return (int) (t1.getCost() - t2.getCost());
    }

}
