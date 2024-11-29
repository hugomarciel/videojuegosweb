package DBD.VideojuegosWeb.repositories;

import DBD.VideojuegosWeb.entity.Juego;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JuegoRepository extends CrudRepository<Juego, Long> {

    @Query("SELECT j FROM Juego j " +
            "JOIN Carritocompras_juego ccj ON j.juegoId = ccj.juego.juegoId " +
            "GROUP BY j.juegoId, j.nombre " +
            "ORDER BY COUNT(ccj.juego.juegoId) DESC")
    List<Juego> findRankingJuegosMasComprados();


}


