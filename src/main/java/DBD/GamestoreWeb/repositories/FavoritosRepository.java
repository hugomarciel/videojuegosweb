package DBD.GamestoreWeb.repositories;

import DBD.GamestoreWeb.models.Favoritos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoritosRepository extends CrudRepository<Favoritos, Long> {
}
