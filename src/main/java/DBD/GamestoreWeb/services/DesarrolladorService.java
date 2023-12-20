package DBD.GamestoreWeb.services;

import DBD.GamestoreWeb.models.Desarrollador;
import DBD.GamestoreWeb.repositories.DesarrolladorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesarrolladorService {
    @Autowired
    DesarrolladorRepository desarrolladorRepository;

    public Desarrollador guardarDesarrollador(Desarrollador nuevoDesarrollador) {
        return desarrolladorRepository.save(nuevoDesarrollador);
    }

    public List<Desarrollador> verDesarrolladores() {
        return (List<Desarrollador>) desarrolladorRepository.findAll();
    }

    public Desarrollador verDesarrollador(Long id) {
        return desarrolladorRepository.findById(id).orElse(null);
    }

    public Desarrollador editarDesarrollador(Desarrollador desarrollador) {
        return desarrolladorRepository.save(desarrollador);
    }

    public void eliminarDesarrollador(Desarrollador desarrollador) {
        desarrolladorRepository.delete(desarrollador);
    }
}
