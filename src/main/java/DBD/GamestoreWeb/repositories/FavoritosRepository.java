package DBD.GamestoreWeb.repositories;

import DBD.GamestoreWeb.models.Favoritos;
import DBD.GamestoreWeb.models.Juego;
import DBD.GamestoreWeb.models.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.util.List;

@Repository
public interface FavoritosRepository extends CrudRepository<Favoritos, Long> {

    @Query("SELECT u, j FROM Usuario u " +
            "JOIN Favoritos f ON u.usuarioid  = f.usuarioIdFk.usuarioid " +
            "JOIN Juego j ON f.juegoIdFk.juegoId = j.juegoId")
    List<Favoritos> findByUsuarioUsuarioIdFk();

}
