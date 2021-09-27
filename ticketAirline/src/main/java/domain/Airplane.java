package domain;

import base.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter

public class Airplane extends BaseEntity<Long> {
    private String model;


}
