package DBD.GamestoreWeb.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "boleta")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Boleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "boletaid", unique = true, nullable = false)
    private Long boletaId;

    @ManyToOne
    @JoinColumn(name = "carrito_id_fk")
    private Carrito_compras carritoIdFk;

    @Column(name = "fechacompra")
    private String fechaCompra;

    @Column(name = "metodo_pago")
    private String metodoPago;

    @Column(name = "monto_total")
    private Double montoTotal;

    @Column(name = "estado_compra")
    private String estadoCompra;
}
