package DBD.GamestoreWeb.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Juego")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Juego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "JuegoID", unique = true, nullable = false)
    private Long juegoId;

    @Column(name = "Nombre", length = 50)
    private String nombre;

    @Column(name = "Desarrollador_ID_fk")
    private Long desarrolladorIdFk;

    @Column(name = "restriccion_id_fk")
    private Long restriccionIdFk;

    @Column(name = "Precio_original")
    private Double precioOriginal;

    @Column(name = "Precio_dcto")
    private Double precioDescuento;

    @Column(name = "Total")
    private Double total;
}

