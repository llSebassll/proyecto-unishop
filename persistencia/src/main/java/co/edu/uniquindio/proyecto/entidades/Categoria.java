package co.edu.uniquindio.proyecto.entidades;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import java.io.Serializable;
import java.util.List;


@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@ToString
public class Categoria implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;
    private String nombre;

    @ManyToMany(mappedBy = "categorias")
    private List<Producto> productos;

}
