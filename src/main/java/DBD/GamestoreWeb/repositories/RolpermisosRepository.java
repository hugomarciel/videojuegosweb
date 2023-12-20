package DBD.GamestoreWeb.repositories;

import DBD.GamestoreWeb.models.Rolpermisos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolpermisosRepository extends CrudRepository<Rolpermisos, Long> {
}
