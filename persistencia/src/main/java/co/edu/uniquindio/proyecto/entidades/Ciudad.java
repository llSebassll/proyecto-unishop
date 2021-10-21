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
public class Ciudad implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;
    private String nombre;


    @OneToMany(mappedBy = "codigoCiudad")
    private List<Usuario> usuarios;

    @OneToMany(mappedBy = "ciudad")
    private List<Producto> productos;


    public Ciudad(String codigo, String nombre, List<Usuario> usuarios, List<Producto> productos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.usuarios = usuarios;
        this.productos = productos;
    }
}
