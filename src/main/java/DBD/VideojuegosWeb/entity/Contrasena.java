package DBD.VideojuegosWeb.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "contrasena")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contrasena {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "passid", unique = true, nullable = false)
    private Long passid;

    @Column(name = "pass", length = 50)
    private String pass;
}

