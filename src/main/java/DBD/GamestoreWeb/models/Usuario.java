package DBD.GamestoreWeb.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long usuarioid;

    //@Column(name = "carrito_id_fk")
    private Long carritoIdFk;

    //@Column(name = "Nombre", length = 50)
    private String nombre;

    //@Column(name = "pass_id_fk")
    private Long passIdFk;

    //@Column(name = "roll_id_fk")
    private Long rollIdFk;

   // @Column(name = "Email", length = 50)
    private String email;

    //@Column(name = "nombreCalle", length = 50)
    private String nombreCalle;

    //Column(name = "numerocasa")
    private Integer numerocasa;

    //@Column(name = "nomuna_id_fk")
    private Long comunaIdFk;

    //@Column(name = "Fecharegistro", length = 50)
    private String fecharegistro;

    //@Column(name = "Fechanacimiento", length = 50)
    private String fechanacimiento;
}
