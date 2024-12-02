package DBD.VideojuegosWeb.repositories;

import DBD.VideojuegosWeb.entity.Contrasena;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContrasenaRepository extends CrudRepository<Contrasena, Long> {
}
