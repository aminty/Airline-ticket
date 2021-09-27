package repository.impl;

import base.repository.impl.BaseRepositoryImpl;
import domain.User;

import javax.persistence.EntityManager;

public class UserRepositoryImpl extends BaseRepositoryImpl<User,Long> {
    protected UserRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<User> getEntityClass() {
        return User.class;
    }
}
