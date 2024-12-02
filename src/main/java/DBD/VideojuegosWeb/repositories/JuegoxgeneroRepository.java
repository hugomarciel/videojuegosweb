package DBD.VideojuegosWeb.repositories;

import DBD.VideojuegosWeb.entity.Juegoxgenero;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JuegoxgeneroRepository extends CrudRepository<Juegoxgenero, Long> {
}
