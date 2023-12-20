package DBD.GamestoreWeb.services;

import DBD.GamestoreWeb.models.Rol;
import DBD.GamestoreWeb.repositories.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolService {
    @Autowired
    RolRepository rolRepository;

    public Rol guardarRol(Rol nuevoRol) {
        return rolRepository.save(nuevoRol);
    }

    public List<Rol> verRoles() {
        return (List<Rol>) rolRepository.findAll();
    }

    public Rol verRol(Long id) {
        return rolRepository.findById(id).orElse(null);
    }

    public Rol editarRol(Rol rol) {
        return rolRepository.save(rol);
    }

    public void eliminarRol(Rol rol) {
        rolRepository.delete(rol);
    }
}
