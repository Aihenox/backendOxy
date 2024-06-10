package com.backendoxy.persistence.crud;

import org.springframework.data.repository.CrudRepository;
import com.backendoxy.persistence.entity.CilindroEntity;
public interface CilindroCRUDRepository extends
    CrudRepository<CilindroEntity,Integer> {

}
