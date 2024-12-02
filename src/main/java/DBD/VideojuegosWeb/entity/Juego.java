package DBD.VideojuegosWeb.entity;

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

    //@ManyToOne
    //@JoinColumn(name = "Desarrollador_ID_fk")
    //private Desarrollador desarrolladorIdFk;

    @ManyToOne
    @JoinColumn(name = "juegoxgenero_id_fk")
    private Juegoxgenero juegoxgenroIdFk;

    @Column(name = "Precio_original")
    private Integer precioOriginal;

    @Column(name = "Precio_dcto")
    private Integer precioDescuento;

    @Column(name = "Total")
    private Integer total;
}

