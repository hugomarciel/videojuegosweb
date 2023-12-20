package DBD.GamestoreWeb.services;

import DBD.GamestoreWeb.models.Boleta;
import DBD.GamestoreWeb.repositories.BoletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoletaService {
    @Autowired
    BoletaRepository boletaRepository;

    public Boleta guardarBoleta(Boleta nuevaBoleta) {
        return boletaRepository.save(nuevaBoleta);
    }

    public List<Boleta> verBoletas() {
        return (List<Boleta>) boletaRepository.findAll();
    }

    public Boleta verBoleta(Long id) {
        return boletaRepository.findById(id).orElse(null);
    }

    public Boleta editarBoleta(Boleta boleta) {
        return boletaRepository.save(boleta);
    }

    public void eliminarBoleta(Boleta boleta) {
        boletaRepository.delete(boleta);
    }
}
