package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@ToString
public class Telefono implements Serializable {


    private String numTelefono;

    @Id
    @ManyToOne
    @EqualsAndHashCode.Include
    private Usuario usuario;

    public Telefono(String numTelefono, Usuario usuario) {
        this.numTelefono = numTelefono;
        this.usuario = usuario;
    }
}
