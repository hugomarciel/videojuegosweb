package DBD.GamestoreWeb.repositories;

import DBD.GamestoreWeb.models.Permisos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermisosRepository extends CrudRepository<Permisos, Long> {
}

