package DBD.VideojuegosWeb.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Carrito_compras")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Carrito_compras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CarritoID", unique = true, nullable = false)
    private Long carritoId;


    @ManyToOne
    @JoinColumn(name = "usuario_id_fk")
    private Usuario usuario;

    @Column(name = "Cantidad")
    private Integer cantidad;

    @Column(name = "Estado", length = 50)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "JuegoID")
    private Juego juegoid;

    @Column(name = "Total")
    private Double total;
}
