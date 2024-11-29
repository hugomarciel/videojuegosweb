package DBD.VideojuegosWeb.repositories;

import DBD.VideojuegosWeb.entity.Carritocompras_juego;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Carritocompras_juegoRepository extends CrudRepository<Carritocompras_juego, Long> {

}

