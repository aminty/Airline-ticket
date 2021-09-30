package repository.impl;

import base.repository.impl.BaseRepositoryImpl;
import domain.User;
import repository.UserRepository;

import javax.persistence.EntityManager;

public class UserRepositoryImpl extends BaseRepositoryImpl<User,Long> implements UserRepository {
    public UserRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<User> getEntityClass() {
        return User.class;
    }

    @Override
    public boolean isExistsByUsername(String username) {
        return entityManager.createQuery(
                "select count(username) from "+ getEntityClass().getSimpleName()+" where username =:username",
                Long.class).setParameter("username",username).getSingleResult()==1L;
    }
    @Override
    public User fingByUsername(String username) {
        return entityManager.createQuery(
                "from "+getEntityClass().getSimpleName()+ " where username=:username",getEntityClass())
                .setParameter("username",username).getSingleResult();
    }
}
