package DBD.VideojuegosWeb.controllers;

import DBD.VideojuegosWeb.entity.Rolpermisos;
import DBD.VideojuegosWeb.services.RolpermisosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rol-permisos")
public class RolpermisosController {
    @Autowired
    RolpermisosService rolpermisosService;

    @PostMapping(value = "/add")
    public ResponseEntity<Rolpermisos> guardarRolpermisos(@RequestBody Rolpermisos rolpermisosEntityNuevo){
        Rolpermisos objeto = rolpermisosService.guardarRolpermisos(rolpermisosEntityNuevo);
        return new ResponseEntity<>(objeto, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rolpermisos> obtenerRolPermisos(@PathVariable Long id) {
        Rolpermisos rolpermisos = rolpermisosService.verRolpermisos(id);
        if (rolpermisos != null) {
            return ResponseEntity.ok(rolpermisos);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @GetMapping
    public ResponseEntity<List<Rolpermisos>> verRolpermisos() {
        return ResponseEntity.ok(rolpermisosService.verRolpermisos());
    }

    @PutMapping("/update")
    public ResponseEntity<Rolpermisos> editar(@RequestBody Rolpermisos rolpermisosEntity) {
        Rolpermisos rolpermisos = rolpermisosService.editarRolpermisos(rolpermisosEntity);
        return new ResponseEntity<>(rolpermisos, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public String eliminarRolpermisos(@PathVariable Long id) {
        Rolpermisos rolpermisos = rolpermisosService.verRolpermisos(id);
        if (rolpermisos != null) {
            rolpermisosService.eliminarRolpermisos(rolpermisos);
            return "Rolpermisos eliminado";
        } else {
            return "No existe el Rolpermisos con id " + id;
        }
    }
}
