package DBD.GamestoreWeb.controllers;

import DBD.GamestoreWeb.models.Contrasena;
import DBD.GamestoreWeb.services.ContrasenaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContrasenaController {
    @Autowired
    ContrasenaService contrasenaService;

    @PostMapping(value = "/contrasena/")
    public ResponseEntity<Contrasena> guardarContrasena(@RequestBody Contrasena contrasenaEntityNuevo){
        Contrasena objeto = contrasenaService.guardarContrasena(contrasenaEntityNuevo);
        return new ResponseEntity<>(objeto, HttpStatus.OK);
    }

    @GetMapping("/contrasena/")
    public ResponseEntity<List<Contrasena>> verContrasenas() {
        return ResponseEntity.ok(contrasenaService.verContrasenas());
    }

    @PutMapping("/contrasena/")
    public ResponseEntity<Contrasena> editar(@RequestBody Contrasena contrasenaEntity) {
        Contrasena contrasena = contrasenaService.editarContrasena(contrasenaEntity);
        return new ResponseEntity<>(contrasena, HttpStatus.OK);
    }

    @DeleteMapping("/contrasena/{id}")
    @ResponseBody
    public String eliminarContrasena(@PathVariable Long id) {
        Contrasena contrasena = contrasenaService.verContrasena(id);
        if (contrasena != null) {
            contrasenaService.eliminarContrasena(contrasena);
            return "Contraseña eliminada";
        } else {
            return "No existe la contraseña con id " + id;
        }
    }
}
