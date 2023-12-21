package DBD.GamestoreWeb.controllers;

import DBD.GamestoreWeb.models.Desarrollador;
import DBD.GamestoreWeb.services.DesarrolladorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DesarrolladorController {
    @Autowired
    DesarrolladorService desarrolladorService;

    @PostMapping(value = "/desarrollador/")
    public ResponseEntity<Desarrollador> guardarDesarrollador(@RequestBody Desarrollador desarrolladorEntityNuevo) {
        Desarrollador objeto = desarrolladorService.guardarDesarrollador(desarrolladorEntityNuevo);
        return new ResponseEntity<>(objeto, HttpStatus.OK);
    }

    @GetMapping("/desarrollador/")
    public ResponseEntity<List<Desarrollador>> verDesarrolladores() {
        return ResponseEntity.ok(desarrolladorService.verDesarrolladores());
    }

    @PutMapping("/desarrollador/actualizar")
    public ResponseEntity<Desarrollador> editar(@RequestBody Desarrollador desarrolladorEntity) {
        Desarrollador desarrollador = desarrolladorService.editarDesarrollador(desarrolladorEntity);
        return new ResponseEntity<>(desarrollador, HttpStatus.OK);
    }

    @DeleteMapping("/desarrollador/{id}")
    @ResponseBody
    public String eliminarDesarrollador(@PathVariable Long id) {
        Desarrollador desarrollador = desarrolladorService.verDesarrollador(id);
        if (desarrollador != null) {
            desarrolladorService.eliminarDesarrollador(desarrollador);
            return "Desarrollador eliminado";
        } else {
            return "No existe el desarrollador con id " + id;
        }
    }
}
