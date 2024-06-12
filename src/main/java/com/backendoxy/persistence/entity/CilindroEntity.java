package com.backendoxy.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="cilindros")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CilindroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_cilindro")
    private Integer idCilindro;
    private String serial;

    @Column(name="id_lote")
    private Integer idLote;

    private String propiedad;
    private String tamaño;
    private String material;
    
    @Column(name="id_cliente")
    private Integer idCliente;

    @ManyToOne
    @JoinColumn(name = "id_lote", insertable=false, updatable=false)
    private LoteEntity lote;

    @ManyToOne
    @JoinColumn(name = "id_cliente", insertable=false, updatable=false)
    private ClienteEntity cliente;
}
