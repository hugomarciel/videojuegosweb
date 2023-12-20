package DBD.GamestoreWeb.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Usersigueuser")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usersigueuser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Usersigueuserid", unique = true, nullable = false)
    private Long usersigueuserId;

    @Column(name = "User_id_fk")
    private Long userIdFk;

    @Column(name = "Userf_id_fk")
    private Long userfIdFk;
}
