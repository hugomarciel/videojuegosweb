package DBD.VideojuegosWeb.controllers;

import DBD.VideojuegosWeb.entity.Permisos;
import DBD.VideojuegosWeb.services.PermisosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/permisos")
public class PermisosController {
    @Autowired
    PermisosService permisosService;

    @PostMapping(value = "/add")
    public ResponseEntity<Permisos> guardarPermiso(@RequestBody Permisos permisosEntityNuevo){
        Permisos objeto = permisosService.guardarPermiso(permisosEntityNuevo);
        return new ResponseEntity<>(objeto, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Permisos> obtenerPermiso(@PathVariable Long id) {
        Permisos permisos = permisosService.verPermiso(id);
        if (permisos != null) {
            return ResponseEntity.ok(permisos);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @GetMapping
    public ResponseEntity<List<Permisos>> verPermisos() {
        return ResponseEntity.ok(permisosService.verPermisos());
    }

    @PutMapping("/update")
    public ResponseEntity<Permisos> editar(@RequestBody Permisos permisosEntity) {
        Permisos permiso = permisosService.editarPermiso(permisosEntity);
        return new ResponseEntity<>(permiso, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
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
