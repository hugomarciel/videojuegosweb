package DBD.GamestoreWeb.repositories;

import DBD.GamestoreWeb.models.Juego;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JuegoRepository extends CrudRepository<Juego, Long> {
}

