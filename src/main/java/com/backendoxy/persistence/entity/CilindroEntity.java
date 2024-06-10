package com.backendoxy.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    @Column(name= "id_cilindro")
    private Integer idCilindro;
    private String propiedad;
    private int tamaño;
    private String material;
    
    @ManyToOne
    @JoinColumn(name = "id_cliente, insertable = flase, updatable= false")
    private ClienteEntity cliente;
}
