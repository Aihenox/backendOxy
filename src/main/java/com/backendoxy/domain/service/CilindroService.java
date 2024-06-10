package com.backendoxy.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendoxy.persistence.crud.CilindroCRUDRepository;
import com.backendoxy.persistence.entity.CilindroEntity;

@Service
public class CilindroService {
    @Autowired
    CilindroCRUDRepository cilindroCRUDRepository;
    
    public List<CilindroEntity> findAll()    {
        return (List<CilindroEntity>) cilindroCRUDRepository.findAll();

    }

    public CilindroEntity save(CilindroEntity cilindroEntity){
        return cilindroCRUDRepository.save(cilindroEntity);

    }

    public String delete(int id){
        cilindroCRUDRepository.deleteById(id);
        return "Registro eliminado";
    }
}
