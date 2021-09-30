package domain;

import base.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import ui.City;
import ui.Subject;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@Entity
@Setter
@Getter
public class Ticket extends BaseEntity<Long> {
    @ManyToOne
    private Airline airline;

    private String airplane;


    @Enumerated(EnumType.STRING)
    private City departurePlace;

    @Enumerated(EnumType.STRING)

    private City arrivalPlace;

    private double cost;

    private String date;


}
