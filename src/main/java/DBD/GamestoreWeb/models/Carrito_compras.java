package DBD.GamestoreWeb.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    @Column(name = "Juego_id_fk")
    private Long juegoIdFk;

    @Column(name = "usuario_id_fk")
    private Long usuarioIdFk;

    @Column(name = "Cantidad")
    private Integer cantidad;

    @Column(name = "Estado", length = 50)
    private String estado;

    @Column(name = "Total")
    private Double total;
}