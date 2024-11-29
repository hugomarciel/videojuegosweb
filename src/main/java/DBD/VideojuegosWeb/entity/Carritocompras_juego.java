package DBD.VideojuegosWeb.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "carritocompras_juego")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Carritocompras_juego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Carritocompras_juegoID", unique = true, nullable = false)
    private Long carritoComprasJuegoID;

    @ManyToOne
    @JoinColumn(name = "carrito_id_fk")
    private Carrito_compras carritoCompras;

    @ManyToOne
    @JoinColumn(name = "juego_id_fk")
    private Juego juego;


}

