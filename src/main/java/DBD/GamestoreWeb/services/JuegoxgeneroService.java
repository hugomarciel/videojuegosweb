package DBD.GamestoreWeb.services;

import DBD.GamestoreWeb.models.Juegoxgenero;
import DBD.GamestoreWeb.repositories.JuegoxgeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JuegoxgeneroService {
    @Autowired
    JuegoxgeneroRepository juegoxgeneroRepository;

    public Juegoxgenero guardarJuegoxgenero(Juegoxgenero nuevoJuegoxgenero) {
        return juegoxgeneroRepository.save(nuevoJuegoxgenero);
    }

    public List<Juegoxgenero> verJuegosxgenero() {
        return (List<Juegoxgenero>) juegoxgeneroRepository.findAll();
    }

    public Juegoxgenero verJuegoxgenero(Long id) {
        return juegoxgeneroRepository.findById(id).orElse(null);
    }

    public Juegoxgenero editarJuegoxgenero(Juegoxgenero juegoxgenero) {
        return juegoxgeneroRepository.save(juegoxgenero);
    }

    public void eliminarJuegoxgenero(Juegoxgenero juegoxgenero) {
        juegoxgeneroRepository.delete(juegoxgenero);
    }
}
