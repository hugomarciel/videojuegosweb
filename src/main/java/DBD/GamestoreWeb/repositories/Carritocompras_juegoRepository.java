package DBD.GamestoreWeb.repositories;

import DBD.GamestoreWeb.models.Carritocompras_juego;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Carritocompras_juegoRepository extends CrudRepository<Carritocompras_juego, Long> {

}

