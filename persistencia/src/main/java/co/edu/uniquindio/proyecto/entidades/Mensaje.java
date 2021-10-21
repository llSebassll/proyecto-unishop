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
public class Mensaje implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;
    private String mensaje;
    private String emisor;
    private LocalDate fecha;

    @ManyToOne
    private Chat chat;

    public Mensaje(String codigo, String mensaje, String emisor, LocalDate fecha, Chat chat) {
        this.codigo = codigo;
        this.mensaje = mensaje;
        this.emisor = emisor;
        this.fecha = fecha;
        this.chat = chat;
    }
}
