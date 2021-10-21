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
public class Compra implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;
    private String medioPago;

    @ManyToOne
    private Usuario usuario;

    @OneToMany(mappedBy = "compra")
    private List<DetalleCompra> detalleCompra;

    public Compra(String codigo, String medioPago, Usuario usuario, List<DetalleCompra> detalleCompra) {
        this.codigo = codigo;
        this.medioPago = medioPago;
        this.usuario = usuario;
        this.detalleCompra = detalleCompra;
    }
}
