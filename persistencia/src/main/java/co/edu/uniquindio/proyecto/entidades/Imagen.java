package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@ToString
public class Imagen implements Serializable {

    private String ruta;

    @Id
    @ManyToOne
    @EqualsAndHashCode.Include
    private Producto producto;

    public Imagen(String ruta, Producto producto) {
        this.ruta = ruta;
        this.producto = producto;
    }
}
