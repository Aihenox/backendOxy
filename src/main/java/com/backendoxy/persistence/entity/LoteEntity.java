package com.backendoxy.persistence.entity;

import java.util.List;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "lote")
@Setter
@Getter
@NoArgsConstructor
public class LoteEntity {
    @Id
    @Column(name= "id_lote")
    private String idLote;
    private LocalDateTime fecha;

    @OneToMany(mappedBy = "lote")
    private List<CilindroEntity> cilindros;

    public String getIdLote(){
        return idLote;
    }

    public void setIdCategoria(String idLote){
        this.idLote = idLote;
    }
}
