package base.service;

import base.domain.BaseEntity;
import base.repository.BaseRepository;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends BaseEntity<ID>, ID extends Serializable> {
    E saveOrUpdate(E e);

    E findById(ID id);

    void remove(E e);

    boolean isExistsById(ID id);

    List<E> findAll();

    Long countAll();
}
