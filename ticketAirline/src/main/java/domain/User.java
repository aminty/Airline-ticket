package domain;

import base.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import ui.Subject;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Getter
@Setter
public class User extends BaseEntity<Long> {
    private String name;
    private String lastName;
    private String username;
    private String password;
    @Enumerated(EnumType.STRING)
    private Subject title;
}
