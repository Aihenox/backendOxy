package com.backendoxy.persistence.entity;

import java.util.List;
import org.hibernate.validator.constraints.Length;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer idCategoria;
    private int Id;
    private String nombreCliente;
    private String direccionCliente;
    @Length(min=10,max = 10, message = "El numero de telefono no es valido")
    private int Telefono;
    @Email (message = "No corresponde a un correo")
    private String email;

    @OneToMany(mappedBy = "cliente")
    private List<CilindroEntity> cilindros;
}
 