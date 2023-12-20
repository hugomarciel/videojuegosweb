package DBD.GamestoreWeb.repositories;

import DBD.GamestoreWeb.models.Desarrollador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesarrolladorRepository extends CrudRepository<Desarrollador, Long> {
}
