package DBD.GamestoreWeb.repositories;

import DBD.GamestoreWeb.models.Juegoxgenero;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JuegoxgeneroRepository extends CrudRepository<Juegoxgenero, Long> {
}
