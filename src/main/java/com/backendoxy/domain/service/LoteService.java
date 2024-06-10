package com.backendoxy.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendoxy.persistence.crud.LoteCRUDRepository;
import com.backendoxy.persistence.entity.LoteEntity;

@Service
public class LoteService {
    @Autowired
    LoteCRUDRepository loteCRUDRepository;

    public List<LoteEntity> findAll(){
        return (List<LoteEntity>) loteCRUDRepository.findAll();
    }

    public LoteEntity save(LoteEntity loteEntity){
        return loteCRUDRepository.save(loteEntity);

    }

}
