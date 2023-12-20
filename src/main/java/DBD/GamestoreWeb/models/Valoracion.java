package DBD.GamestoreWeb.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "valoracion")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Valoracion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    Long valoracionID;

    @Column(name = "usuario_id_fk")
    private Long usuarioId;

    @Column(name = "juego_id_fk")
    private Long juegoId;

    private String calificacion;

    private String comentario;
}
