package DBD.VideojuegosWeb.services;

import DBD.VideojuegosWeb.entity.Genero;
import DBD.VideojuegosWeb.repositories.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroService {
    @Autowired
    GeneroRepository generoRepository;

    public Genero guardarGenero(Genero nuevoGenero) {
        return generoRepository.save(nuevoGenero);
    }

    public List<Genero> verGeneros() {
        return (List<Genero>) generoRepository.findAll();
    }

    public Genero verGenero(Long id) {
        return generoRepository.findById(id).orElse(null);
    }

    public Genero editarGenero(Genero genero) {
        return generoRepository.save(genero);
    }

    public void eliminarGenero(Genero genero) {
        generoRepository.delete(genero);
    }
}
