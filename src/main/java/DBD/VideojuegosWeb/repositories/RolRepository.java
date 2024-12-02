package DBD.VideojuegosWeb.repositories;

import DBD.VideojuegosWeb.entity.Rol;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends CrudRepository<Rol, Long> {
}
