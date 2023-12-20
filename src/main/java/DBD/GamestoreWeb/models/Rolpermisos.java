package DBD.GamestoreWeb.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Rolpermisos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rolpermisos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    Long Rolpermisosid;

    @Column(name = "Rol_id_fk")
    private Long Rol_id_fk;

    @Column(name = "permiso_id_fk")
    private Long permiso_id_fk;
}
