package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@ToString
public class SubastaUsuario implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;
    private Double valor;
    private LocalDate fechaSubasta;

    @ManyToOne
    private Subasta subasta;

    @ManyToOne
    private Usuario usuario;

    public SubastaUsuario(String codigo, Double valor, LocalDate fechaSubasta, Subasta subasta, Usuario usuario) {
        this.codigo = codigo;
        this.valor = valor;
        this.fechaSubasta = fechaSubasta;
        this.subasta = subasta;
        this.usuario = usuario;
    }
}
