package DBD.GamestoreWeb.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Restriccion")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restriccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RestriccionID", unique = true, nullable = false)
    private Long restriccionId;

    @Column(name = "desde")
    private Integer desde;
}
