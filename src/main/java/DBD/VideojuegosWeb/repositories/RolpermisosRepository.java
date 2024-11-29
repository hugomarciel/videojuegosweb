package DBD.VideojuegosWeb.repositories;

import DBD.VideojuegosWeb.entity.Rolpermisos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolpermisosRepository extends CrudRepository<Rolpermisos, Long> {
}
