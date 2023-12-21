package DBD.GamestoreWeb.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "favoritos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Favoritos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    Long favoritosid;

    @ManyToOne
    @JoinColumn(name = "usuario_id_fk")
    private Usuario usuarioIdFk;

    @ManyToOne
    @JoinColumn(name = "juego_id_fk")
    private Juego juegoIdFk;
}
