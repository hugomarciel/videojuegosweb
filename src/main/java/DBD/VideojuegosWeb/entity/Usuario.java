package DBD.VideojuegosWeb.entity;

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


    @Column(name = "Nombre", length = 50)
    private String nombre;

    @OneToOne
    @JoinColumn(name = "pass_id_fk")
    private Contrasena passIdfk;

    @ManyToOne
    @JoinColumn(name = "roll_id_fk")
    private Rol rolid;

   @Column(name = "Email", length = 50)
    private String email;

    @Column(name = "nombrecalle", length = 50)
    private String nombreCalle;

    @Column (name = "numerocasa")
    private Integer numerocasa;

    @ManyToOne
    @JoinColumn(name = "comuna_id_fk")
    private Comuna comunaid;

    @Column(name = "Fecharegistro", length = 50)
    private String fecharegistro;

    @Column(name = "Fechanacimiento", length = 50)
    private String fechanacimiento;
}
