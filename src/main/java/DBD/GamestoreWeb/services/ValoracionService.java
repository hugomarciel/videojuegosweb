package DBD.GamestoreWeb.services;

import DBD.GamestoreWeb.models.Valoracion;
import DBD.GamestoreWeb.repositories.ValoracionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValoracionService {
    @Autowired
    ValoracionRepository valoracionRepository;

    public Valoracion guardarValoracion(Valoracion nuevaValoracion) {
        return valoracionRepository.save(nuevaValoracion);
    }

    public List<Valoracion> verValoraciones() {
        return (List<Valoracion>) valoracionRepository.findAll();
    }

    public Valoracion verValoracion(Long id) {
        return valoracionRepository.findById(id).orElse(null);
    }

    public Valoracion editarValoracion(Valoracion valoracion) {
        return valoracionRepository.save(valoracion);
    }

    public void eliminarValoracion(Valoracion valoracion) {
        valoracionRepository.delete(valoracion);
    }
}
