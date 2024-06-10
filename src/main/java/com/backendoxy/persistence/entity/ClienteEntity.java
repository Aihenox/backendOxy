package com.backendoxy.persistence.entity;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "clientes")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class ClienteEntity {
    @Id
    @Column(name = "id_cliente")
    private Integer idCliente;
    private String nombreCliente;
    private String direccionCliente;
    @Length(min=10,max = 10, message = "El numero de telefono no es valido")
    private int Telefono;
    @Email (message = "No corresponde a un correo")
    private String email;
}
 