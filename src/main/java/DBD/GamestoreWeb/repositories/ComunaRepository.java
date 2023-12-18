package DBD.GamestoreWeb.repositories;


import DBD.GamestoreWeb.models.Comuna;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComunaRepository extends CrudRepository<Comuna, Long>{
}
