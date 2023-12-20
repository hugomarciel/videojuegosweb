package DBD.GamestoreWeb.controllers;

import DBD.GamestoreWeb.models.Rolpermisos;
import DBD.GamestoreWeb.services.RolpermisosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RolpermisosController {
    @Autowired
    RolpermisosService rolpermisosService;

    @PostMapping(value = "/rolpermisos/")
    public ResponseEntity<Rolpermisos> guardarRolpermisos(@RequestBody Rolpermisos rolpermisosEntityNuevo){
        Rolpermisos objeto = rolpermisosService.guardarRolpermisos(rolpermisosEntityNuevo);
        return new ResponseEntity<>(objeto, HttpStatus.OK);
    }

    @GetMapping("/rolpermisos/")
    public ResponseEntity<List<Rolpermisos>> verRolpermisos() {
        return ResponseEntity.ok(rolpermisosService.verRolpermisos());
    }

    @PutMapping("/rolpermisos/")
    public ResponseEntity<Rolpermisos> editar(@RequestBody Rolpermisos rolpermisosEntity) {
        Rolpermisos rolpermisos = rolpermisosService.editarRolpermisos(rolpermisosEntity);
        return new ResponseEntity<>(rolpermisos, HttpStatus.OK);
    }

    @DeleteMapping("/rolpermisos/{id}")
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
