package domain;

import base.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.time.ZonedDateTime;

@Entity
@Setter
@Getter
public class Ticket extends BaseEntity<Long> {


    @OneToOne
    private Airplane airplane;

    private String origin;

    private String destination;

    private double cost;

    private ZonedDateTime date;

}
