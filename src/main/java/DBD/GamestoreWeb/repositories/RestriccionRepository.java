package DBD.GamestoreWeb.repositories;

import DBD.GamestoreWeb.models.Restriccion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestriccionRepository extends CrudRepository<Restriccion, Long> {
}