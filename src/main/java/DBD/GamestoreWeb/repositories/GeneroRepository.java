package DBD.GamestoreWeb.repositories;

import DBD.GamestoreWeb.models.Genero;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends CrudRepository<Genero, Long> {
}
