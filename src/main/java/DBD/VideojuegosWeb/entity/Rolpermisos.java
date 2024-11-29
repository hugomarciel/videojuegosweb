package DBD.VideojuegosWeb.entity;

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

    @ManyToOne
    @JoinColumn(name = "Rol_id_fk")
    private Rol Rol_id_fk;


    @ManyToOne
    @JoinColumn(name = "permiso_id_fk")
    private Permisos permiso_id_fk;
}
