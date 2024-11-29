package DBD.VideojuegosWeb.services;

import DBD.VideojuegosWeb.entity.Juego;
import DBD.VideojuegosWeb.repositories.JuegoRepository;
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

    // Método para obtener un ranking de juegos más comprados
    public List<Juego> obtenerRankingJuegosMasComprados() {return juegoRepository.findRankingJuegosMasComprados();
    }


}

