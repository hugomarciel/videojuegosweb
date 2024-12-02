package DBD.VideojuegosWeb.entity;

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

    @ManyToOne
    @JoinColumn(name = "Juego_ID_fk")
    private Juego juegoIdFk;

    @ManyToOne
    @JoinColumn(name = "Genero_id_fk")
    private Genero generoIdFk;
}
