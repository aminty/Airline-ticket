package base.repository;

import base.domain.BaseEntity;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

public interface BaseRepository<E extends BaseEntity<ID>, ID extends Serializable> {
    E saveOrUpdate(E e);

    E findById(ID id);

    void remove(E e);

    boolean isExistsById(ID id);

    List<E> findAll();

    Long countAll();

    EntityManager getEntityManager();
}
