package DBD.VideojuegosWeb.controllers;

import DBD.VideojuegosWeb.entity.Permisos;
import DBD.VideojuegosWeb.services.PermisosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PermisosController {
    @Autowired
    PermisosService permisosService;

    @PostMapping(value = "/permisos/")
    public ResponseEntity<Permisos> guardarPermiso(@RequestBody Permisos permisosEntityNuevo){
        Permisos objeto = permisosService.guardarPermiso(permisosEntityNuevo);
        return new ResponseEntity<>(objeto, HttpStatus.OK);
    }

    @GetMapping("/permisos/")
    public ResponseEntity<List<Permisos>> verPermisos() {
        return ResponseEntity.ok(permisosService.verPermisos());
    }

    @PutMapping("/permisos/")
    public ResponseEntity<Permisos> editar(@RequestBody Permisos permisosEntity) {
        Permisos permiso = permisosService.editarPermiso(permisosEntity);
        return new ResponseEntity<>(permiso, HttpStatus.OK);
    }

    @DeleteMapping("/permisos/{id}")
    @ResponseBody
    public String eliminarPermiso(@PathVariable Long id) {
        Permisos permiso = permisosService.verPermiso(id);
        if (permiso != null) {
            permisosService.eliminarPermiso(permiso);
            return "Permiso eliminado";
        } else {
            return "No existe el permiso con id " + id;
        }
    }
}
