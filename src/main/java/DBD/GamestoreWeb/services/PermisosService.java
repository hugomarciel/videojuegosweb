package DBD.GamestoreWeb.services;

import DBD.GamestoreWeb.models.Permisos;
import DBD.GamestoreWeb.repositories.PermisosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermisosService {
    @Autowired
    PermisosRepository permisosRepository;

    public Permisos guardarPermiso(Permisos nuevoPermiso) {
        return permisosRepository.save(nuevoPermiso);
    }

    public List<Permisos> verPermisos() {
        return (List<Permisos>) permisosRepository.findAll();
    }

    public Permisos verPermiso(Long id) {
        return permisosRepository.findById(id).orElse(null);
    }

    public Permisos editarPermiso(Permisos permiso) {
        return permisosRepository.save(permiso);
    }

    public void eliminarPermiso(Permisos permiso) {
        permisosRepository.delete(permiso);
    }
}
