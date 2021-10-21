package co.edu.uniquindio.proyecto.entidades;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@ToString
public class Subasta {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    private LocalDate fechaLimite;

    @OneToMany(mappedBy = "subasta")
    private List<Producto> productos;

    @OneToMany(mappedBy = "subasta")
    private List<SubastaUsuario> subastaUsuarios;
}
