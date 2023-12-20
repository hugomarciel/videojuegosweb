package DBD.GamestoreWeb.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Permisos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Permisos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Permisosid", unique = true, nullable = false)
    private Long permisosid;

    @Column(name = "Nombrepermiso", length = 50)
    private String nombrepermiso;
}
