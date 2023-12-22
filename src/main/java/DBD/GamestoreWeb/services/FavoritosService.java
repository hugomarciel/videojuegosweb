package DBD.GamestoreWeb.services;

import DBD.GamestoreWeb.models.Favoritos;
import DBD.GamestoreWeb.repositories.FavoritosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoritosService {
    @Autowired
    FavoritosRepository favoritosRepository;

    public Favoritos guardarFavoritos(Favoritos nuevosFavoritos) {
        return favoritosRepository.save(nuevosFavoritos);
    }

    public List<Favoritos> verFavoritos() {
        return (List<Favoritos>) favoritosRepository.findAll();
    }

    public Favoritos verFavoritos(Long id) {
        return favoritosRepository.findById(id).orElse(null);
    }

    public Favoritos editarFavoritos(Favoritos favoritos) {
        return favoritosRepository.save(favoritos);
    }

    public void eliminarFavoritos(Favoritos favoritos) {
        favoritosRepository.delete(favoritos);
    }

    public List<Favoritos> obtenerFavoritosporusuario() {return favoritosRepository.findByUsuarioUsuarioIdFk();
    }

}
