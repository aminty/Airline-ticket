package domain.airline_service;

import base.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public abstract class AirlineService extends BaseEntity<Long> {

    public abstract double cost();

    public abstract String description();


}
