package DBD.VideojuegosWeb.controllers;

import DBD.VideojuegosWeb.entity.Rol;
import DBD.VideojuegosWeb.services.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RolController {
    @Autowired
    RolService rolService;

    @PostMapping(value = "/rol/")
    public ResponseEntity<Rol> guardarRol(@RequestBody Rol rolEntityNuevo){
        Rol objeto = rolService.guardarRol(rolEntityNuevo);
        return new ResponseEntity<>(objeto, HttpStatus.OK);
    }

    @GetMapping("/rol/")
    public ResponseEntity<List<Rol>> verRoles() {
        return ResponseEntity.ok(rolService.verRoles());
    }

    @PutMapping("/rol/")
    public ResponseEntity<Rol> editar(@RequestBody Rol rolEntity) {
        Rol rol = rolService.editarRol(rolEntity);
        return new ResponseEntity<>(rol, HttpStatus.OK);
    }

    @DeleteMapping("/rol/{id}")
    @ResponseBody
    public String eliminarRol(@PathVariable Long id) {
        Rol rol = rolService.verRol(id);
        if (rol != null) {
            rolService.eliminarRol(rol);
            return "Rol eliminado";
        } else {
            return "No existe el rol con id " + id;
        }
    }
}
