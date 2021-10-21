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
public class Comentario implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;
    private String mesanje;
    private String respuesta;
    private LocalDate fechaComentario;
    private double calificacion;

    @ManyToOne
    private Producto producto;

    @ManyToOne
    private Usuario usuario;

    public Comentario(String codigo, String mesanje, String respuesta, LocalDate fechaComentario, double calificacion, Producto producto, Usuario usuario) {
        this.codigo = codigo;
        this.mesanje = mesanje;
        this.respuesta = respuesta;
        this.fechaComentario = fechaComentario;
        this.calificacion = calificacion;
        this.producto = producto;
        this.usuario = usuario;
    }
}
