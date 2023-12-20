package DBD.GamestoreWeb.repositories;

import DBD.GamestoreWeb.models.Valoracion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValoracionRepository extends CrudRepository<Valoracion, Long> {
}
