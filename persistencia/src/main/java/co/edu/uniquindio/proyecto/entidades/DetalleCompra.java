package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.io.Serializable;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@ToString
public class DetalleCompra implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;
    private int unidades;
    private Double precioProducto;

    @ManyToOne
    private Producto producto;

    @ManyToOne
    private Compra compra;


    public DetalleCompra(String codigo, int unidades, Double precioProducto, Producto codigoProducto, Compra compra) {
        this.codigo = codigo;
        this.unidades = unidades;
        this.precioProducto = precioProducto;
        this.producto = codigoProducto;
        this.compra = compra;
    }
}
