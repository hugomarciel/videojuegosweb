package DBD.GamestoreWeb.models;

import DBD.GamestoreWeb.controllers.DesarrolladorController;
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

    @ManyToOne
    @JoinColumn(name = "Desarrollador_ID_fk")
    private Desarrollador desarrolladorIdFk;

    @ManyToOne
    @JoinColumn(name = "restriccion_id_fk")
    private Restriccion restriccionIdFk;

    @Column(name = "Precio_original")
    private Double precioOriginal;

    @Column(name = "Precio_dcto")
    private Double precioDescuento;

    @Column(name = "Total")
    private Double total;
}

