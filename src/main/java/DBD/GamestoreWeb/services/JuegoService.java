package DBD.GamestoreWeb.services;

import DBD.GamestoreWeb.models.Juego;
import DBD.GamestoreWeb.repositories.JuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JuegoService {
    @Autowired
    JuegoRepository juegoRepository;

    public Juego guardarJuego(Juego nuevoJuego) {
        return juegoRepository.save(nuevoJuego);
    }

    public List<Juego> verJuegos() {
        return (List<Juego>) juegoRepository.findAll();
    }

    public Juego verJuego(Long id) {
        return juegoRepository.findById(id).orElse(null);
    }

    public Juego editarJuego(Juego juego) {
        return juegoRepository.save(juego);
    }

    public void eliminarJuego(Juego juego) {
        juegoRepository.delete(juego);
    }
}
