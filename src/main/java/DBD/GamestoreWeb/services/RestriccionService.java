package DBD.GamestoreWeb.services;

import DBD.GamestoreWeb.models.Restriccion;
import DBD.GamestoreWeb.repositories.RestriccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestriccionService {
    @Autowired
    RestriccionRepository restriccionRepository;

    public Restriccion guardarRestriccion(Restriccion nuevaRestriccion) {
        return restriccionRepository.save(nuevaRestriccion);
    }

    public List<Restriccion> verRestricciones() {
        return (List<Restriccion>) restriccionRepository.findAll();
    }

    public Restriccion verRestriccion(Long id) {
        return restriccionRepository.findById(id).orElse(null);
    }

    public Restriccion editarRestriccion(Restriccion restriccion) {
        return restriccionRepository.save(restriccion);
    }

    public void eliminarRestriccion(Restriccion restriccion) {
        restriccionRepository.delete(restriccion);
    }
}

