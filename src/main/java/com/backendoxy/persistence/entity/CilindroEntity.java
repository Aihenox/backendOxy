package com.backendoxy.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name= "cilindros")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CilindroEntity {

    @Id
    @Column(name= "id_cilindro")
    private Integer idCilindro;
    private String propiedad;
    private String tamaño;
    private String material;
    @ManyToOne
    @JoinColumn(name = "id_cliente, insertable = false, updatable= false")
    private ClienteEntity cliente;
}
