package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@ToString
public class Producto implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;
    private String nombre;
    private int  unidades;
    private String descripcion;
    private double precio;
    private LocalDate fechaLimite;
    private double descuento;

    @ManyToMany
    private List<Categoria> categorias;

    @ManyToMany
    private List<Usuario> usuarios;

    @ManyToOne
    private Ciudad ciudad;

    @OneToMany(mappedBy = "producto")
    private List<DetalleCompra> detalleCompras;

    @OneToMany(mappedBy = "producto")
    private List<Imagen> imagens;

    @ManyToOne
    private Subasta subasta;

    @OneToMany(mappedBy = "producto")
    private List<Chat> chat;

    @OneToMany(mappedBy = "producto")
    private List<Comentario> comentarios;

    public Producto(String codigo, String nombre, int unidades, String descripcion,
                    double precio, LocalDate fechaLimite, double descuento,
                    List<Categoria> categorias, List<Usuario> usuarios, Ciudad ciudad,
                    List<DetalleCompra> detalleCompras, List<Imagen> imagens,
                    Subasta subasta, List<Chat> chat, List<Comentario> Comentarios) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.unidades = unidades;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fechaLimite = fechaLimite;
        this.descuento = descuento;
        this.categorias = categorias;
        this.usuarios = usuarios;
        this.ciudad = ciudad;
        this.detalleCompras = detalleCompras;
        this.imagens = imagens;
        this.subasta = subasta;
        this.chat = chat;
        this.comentarios = Comentarios;
    }
}
