package DBD.GamestoreWeb.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Juegoxgenero")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Juegoxgenero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Juegoxgeneroid", unique = true, nullable = false)
    private Long juegoxgeneroid;

    @Column(name = "Juego_ID_fk")
    private Long juegoIdFk;

    @Column(name = "Genero_id_fk")
    private Long generoIdFk;
}
