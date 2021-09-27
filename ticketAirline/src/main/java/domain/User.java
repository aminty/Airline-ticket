package domain;

import base.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class User extends BaseEntity<Long> {
    private String name;
    private String lastName;
    private String username;
    private String password;
}
