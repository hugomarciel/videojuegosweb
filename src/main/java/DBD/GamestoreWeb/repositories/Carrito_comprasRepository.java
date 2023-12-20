package DBD.GamestoreWeb.repositories;

import DBD.GamestoreWeb.models.Carrito_compras;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Carrito_comprasRepository extends CrudRepository<Carrito_compras, Long> {
}

