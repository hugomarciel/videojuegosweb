package DBD.VideojuegosWeb.controllers;

import DBD.VideojuegosWeb.entity.Contrasena;
import DBD.VideojuegosWeb.services.ContrasenaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/password")
public class ContrasenaController {
    @Autowired
    ContrasenaService contrasenaService;

    @PostMapping(value = "/add")
    public ResponseEntity<Contrasena> guardarContrasena(@RequestBody Contrasena contrasenaEntityNuevo){
        Contrasena objeto = contrasenaService.guardarContrasena(contrasenaEntityNuevo);
        return new ResponseEntity<>(objeto, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contrasena> obtenerContrasena(@PathVariable Long id) {
        Contrasena contrasena = contrasenaService.verContrasena(id);
        if (contrasena != null) {
            return ResponseEntity.ok(contrasena);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @GetMapping
    public ResponseEntity<List<Contrasena>> verContrasenas() {
        return ResponseEntity.ok(contrasenaService.verContrasenas());
    }

    @PutMapping("/update")
    public ResponseEntity<Contrasena> editar(@RequestBody Contrasena contrasenaEntity) {
        Contrasena contrasena = contrasenaService.editarContrasena(contrasenaEntity);
        return new ResponseEntity<>(contrasena, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
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
