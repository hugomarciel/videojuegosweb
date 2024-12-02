package DBD.VideojuegosWeb.repositories;


import DBD.VideojuegosWeb.entity.Comuna;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComunaRepository extends CrudRepository<Comuna, Long>{
}
