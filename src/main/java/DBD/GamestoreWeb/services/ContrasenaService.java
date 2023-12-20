package DBD.GamestoreWeb.services;

import DBD.GamestoreWeb.models.Contrasena;
import DBD.GamestoreWeb.repositories.ContrasenaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContrasenaService {
    @Autowired
    ContrasenaRepository contrasenaRepository;

    public Contrasena guardarContrasena(Contrasena nuevaContrasena) {
        return contrasenaRepository.save(nuevaContrasena);
    }

    public List<Contrasena> verContrasenas() {
        return (List<Contrasena>) contrasenaRepository.findAll();
    }

    public Contrasena verContrasena(Long id) {
        return contrasenaRepository.findById(id).orElse(null);
    }

    public Contrasena editarContrasena(Contrasena contrasena) {
        return contrasenaRepository.save(contrasena);
    }

    public void eliminarContrasena(Contrasena contrasena) {
        contrasenaRepository.delete(contrasena);
    }
}
