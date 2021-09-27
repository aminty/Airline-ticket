package base.repository.impl;

import base.domain.BaseEntity;
import base.repository.BaseRepository;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

public  abstract class BaseRepositoryImpl <E extends BaseEntity<ID>,ID extends Serializable>
        implements BaseRepository<E,ID> {

    protected  final EntityManager entityManager;

    protected BaseRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public abstract Class<E> getEntityClass();

    @Override
    public E saveOrUpdate(E e) {
        if (e.getId()==null )
            entityManager.persist(e);
        else
            entityManager.merge(e);
        return e;
    }

    @Override
    public E findById(ID id) {
        return entityManager.find(getEntityClass(),id);
    }

    @Override
    public List<E> findAll() {
        return entityManager.createQuery(
                "from " + getEntityClass().getSimpleName(),
                getEntityClass()
        ).getResultList();
    }

    @Override
    public void remove(E e) {
        entityManager.remove(e);
    }

    @Override
    public boolean isExistsById(ID id) {
        return entityManager.createQuery(
                "select count(id) from " + getEntityClass().getSimpleName() +
                        " where id = :id",
                Long.class
        ).setParameter("id", id)
                .getSingleResult() == 1L;
    }

    @Override
    public Long countAll() {
        return entityManager.createQuery(
                "select count(id) from " + getEntityClass().getSimpleName(),
                Long.class
        ).getSingleResult();
    }

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }
}
