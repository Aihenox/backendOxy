package com.backendoxy.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name= "cilindros")
@Getter
@Setter
@NoArgsConstructor
public class CilindroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_cilindro")
    private Integer idCilindro;
    private String serial;
    private String propiedad;
    private int tamaño;
    private String material;
}
