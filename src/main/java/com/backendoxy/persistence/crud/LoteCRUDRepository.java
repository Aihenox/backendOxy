package com.backendoxy.persistence.crud;

import org.springframework.data.repository.CrudRepository;

import com.backendoxy.persistence.entity.LoteEntity;

public interface LoteCRUDRepository extends
    CrudRepository<LoteEntity,String> {

}
