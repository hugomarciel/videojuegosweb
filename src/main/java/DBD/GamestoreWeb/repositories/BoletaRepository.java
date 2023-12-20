package DBD.GamestoreWeb.repositories;

import DBD.GamestoreWeb.models.Boleta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoletaRepository extends CrudRepository<Boleta, Long> {

}
