package DBD.VideojuegosWeb.services;

import DBD.VideojuegosWeb.entity.Rolpermisos;
import DBD.VideojuegosWeb.repositories.RolpermisosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolpermisosService {
    @Autowired
    RolpermisosRepository rolpermisosRepository;

    public Rolpermisos guardarRolpermisos(Rolpermisos nuevoRolpermisos) {
        return rolpermisosRepository.save(nuevoRolpermisos);
    }

    public List<Rolpermisos> verRolpermisos() {
        return (List<Rolpermisos>) rolpermisosRepository.findAll();
    }

    public Rolpermisos verRolpermisos(Long id) {
        return rolpermisosRepository.findById(id).orElse(null);
    }

    public Rolpermisos editarRolpermisos(Rolpermisos rolpermisos) {
        return rolpermisosRepository.save(rolpermisos);
    }

    public void eliminarRolpermisos(Rolpermisos rolpermisos) {
        rolpermisosRepository.delete(rolpermisos);
    }
}
