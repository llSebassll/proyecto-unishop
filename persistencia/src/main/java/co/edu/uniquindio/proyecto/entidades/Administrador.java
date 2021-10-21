package co.edu.uniquindio.proyecto.entidades;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@ToString
public class Administrador extends Persona implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    public Administrador(String codigo, String nombre, String email, String password, String codigo1) {
        super(codigo, nombre, email, password);
        this.codigo = codigo1;
    }
}
