package com.backendoxy.persistence.entity;

import java.util.List;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "clientes")
@Setter
@Getter
@NoArgsConstructor

public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer idCliente;
    private String nombreCliente;
    private String direccionCliente;
    @Length(min=10,max = 10, message = "El numero de telefono no es valido")
    private int Telefono;
    @Email (message = "No corresponde a un correo")
    private String email;

    @OneToMany(mappedBy = "cliente")
    private List<CilindroEntity> cilindros;
}
 