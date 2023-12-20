package DBD.GamestoreWeb.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Usersiguedev")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usersiguedev {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long usersiguedevid;

    @Column(name = "desarrollador_id_fk")
    private Long desarrolladorIdFk;

    @Column(name = "user_id_fk")
    private Long userIdFk;

}
