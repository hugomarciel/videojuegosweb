package DBD.VideojuegosWeb.repositories;

import DBD.VideojuegosWeb.entity.Genero;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends CrudRepository<Genero, Long> {
}
