package domain;

import base.domain.BaseEntity;
import domain.airline_service.AirlineService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    @OneToOne
    private User owner;

    private String airlineName;
    @OneToMany
    private Set<Airplane> airplanes = new HashSet<>();
    @OneToMany
    private Set<AirlineService> airlineServices= new HashSet<>();
    @OneToMany
    private Set<Ticket> tickets = new HashSet<>();

}
