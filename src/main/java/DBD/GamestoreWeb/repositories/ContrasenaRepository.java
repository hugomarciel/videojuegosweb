package DBD.GamestoreWeb.repositories;

import DBD.GamestoreWeb.models.Contrasena;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContrasenaRepository extends CrudRepository<Contrasena, Long> {
}
