package com.backendoxy.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendoxy.domain.service.CilindroService;
import com.backendoxy.persistence.entity.CilindroEntity;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/cilindro")
public class CilindroController {

    @Autowired
    CilindroService cilindroService;

    @GetMapping("/all")
    public List<CilindroEntity> getAll(){
        return cilindroService.findAll();
    }

    @PostMapping("/save")
    public CilindroEntity save(@Valid @RequestBody CilindroEntity cilindroEntity){
        return cilindroService.save(cilindroEntity);
    }
    
}
