package com.backendoxy.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendoxy.domain.service.LoteService;
import com.backendoxy.persistence.entity.LoteEntity;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/lote")

public class LoteController {
    @Autowired
    LoteService loteService;

    @GetMapping("/all")
    public List<LoteEntity> getAll(){
        return loteService.findAll();
    }

    @PostMapping("/save")
    public LoteEntity save(@Valid @RequestBody LoteEntity loteEntity){
        return loteService.save(loteEntity);
    }
}
