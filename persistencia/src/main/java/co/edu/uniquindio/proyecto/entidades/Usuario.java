package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@ToString
public class Usuario extends Persona implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    @ManyToOne
    private Ciudad codigoCiudad;

    @ManyToMany(mappedBy = "usuarios")
    private List<Producto> productos;

    @OneToMany(mappedBy = "usuario")
    private List<Compra> compras;

    @OneToMany(mappedBy = "usuario")
    private List<Telefono> telefono;

    @OneToMany(mappedBy = "usuario")
    private List<SubastaUsuario> subastaUsuarios;

    @OneToMany(mappedBy = "usuario")
    private List<Chat> chats;

    @OneToMany(mappedBy = "usuario")
    private List<Comentario> comentarios;

}
