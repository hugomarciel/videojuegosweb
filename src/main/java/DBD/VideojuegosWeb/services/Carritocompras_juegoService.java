package DBD.VideojuegosWeb.services;

import DBD.VideojuegosWeb.entity.Carritocompras_juego;
import DBD.VideojuegosWeb.repositories.Carritocompras_juegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Carritocompras_juegoService {
    @Autowired
    Carritocompras_juegoRepository carritoComprasJuegoRepository;

    public Carritocompras_juego guardarCarritoComprasJuego(Carritocompras_juego nuevoCarritoComprasJuego) {
        return carritoComprasJuegoRepository.save(nuevoCarritoComprasJuego);
    }

    public List<Carritocompras_juego> verCarritoComprasJuegos() {
        return (List<Carritocompras_juego>) carritoComprasJuegoRepository.findAll();
    }

    public Carritocompras_juego verCarritoComprasJuego(Long id) {
        return carritoComprasJuegoRepository.findById(id).orElse(null);
    }

    public Carritocompras_juego editarCarritoComprasJuego(Carritocompras_juego carritoComprasJuego) {
        return carritoComprasJuegoRepository.save(carritoComprasJuego);
    }

    public void eliminarCarritoComprasJuego(Carritocompras_juego carritoComprasJuego) {
        carritoComprasJuegoRepository.delete(carritoComprasJuego);
    }
}
