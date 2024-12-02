package DBD.VideojuegosWeb.repositories;

import DBD.VideojuegosWeb.entity.Permisos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermisosRepository extends CrudRepository<Permisos, Long> {
}

