package DBD.GamestoreWeb.services;


import DBD.GamestoreWeb.models.Comuna;
import DBD.GamestoreWeb.repositories.ComunaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComunaService {
    @Autowired
    ComunaRepository comunaRepository;


    public Comuna guardarComuna(Comuna nueva_comuna) {
        return comunaRepository.save(nueva_comuna);
    }

    public List<Comuna> verComunas() {
        return (List<Comuna>) comunaRepository.findAll();
    }

    public Comuna verComuna(Long id) {
        return comunaRepository.findById(id).orElse(null);
    }

    public Comuna editarComuna(Comuna comuna) {
        return comunaRepository.save(comuna);
    }

    public void eliminarComuna(Comuna comuna) {comunaRepository.delete(comuna); }
}
