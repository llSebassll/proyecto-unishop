package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@ToString
public class Chat implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Producto producto;

    @OneToMany(mappedBy = "chat")
    private List<Mensaje> mensajes;

    public Chat(String codigo, Usuario usuario, Producto producto, List<Mensaje> mensajes) {
        this.codigo = codigo;
        this.usuario = usuario;
        this.producto = producto;
        this.mensajes = mensajes;
    }
}

