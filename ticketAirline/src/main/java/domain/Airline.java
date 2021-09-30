package domain;

import base.domain.BaseEntity;
import domain.airline_service.AirlineAs;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Airline extends BaseEntity<Long> {
    @OneToOne(cascade = CascadeType.ALL)
    private User owner;

    private String airlineName;

    @OneToMany(cascade=CascadeType.ALL)
    private Set<Ticket> tickets = new HashSet<>();

}
