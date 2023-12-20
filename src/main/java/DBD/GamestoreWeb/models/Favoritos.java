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

    @Column(name = "usuario_id_fk")
    private Long usuarioIdFk;

    @Column(name = "juego_id_fk")
    private Long juegoIdFk;
}
