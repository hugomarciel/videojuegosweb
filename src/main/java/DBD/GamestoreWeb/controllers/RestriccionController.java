package DBD.GamestoreWeb.controllers;

import DBD.GamestoreWeb.models.Restriccion;
import DBD.GamestoreWeb.services.RestriccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestriccionController {
    @Autowired
    RestriccionService restriccionService;

    @PostMapping(value = "/restriccion/")
    public ResponseEntity<Restriccion> guardarRestriccion(@RequestBody Restriccion restriccionEntityNuevo) {
        Restriccion objeto = restriccionService.guardarRestriccion(restriccionEntityNuevo);
        return new ResponseEntity<>(objeto, HttpStatus.OK);
    }

    @GetMapping("/restriccion/")
    public ResponseEntity<List<Restriccion>> verRestricciones() {
        return ResponseEntity.ok(restriccionService.verRestricciones());
    }

    @PutMapping("/restriccion/")
    public ResponseEntity<Restriccion> editar(@RequestBody Restriccion restriccionEntity) {
        Restriccion restriccion = restriccionService.editarRestriccion(restriccionEntity);
        return new ResponseEntity<>(restriccion, HttpStatus.OK);
    }

    @DeleteMapping("/restriccion/{id}")
    @ResponseBody
    public String eliminarRestriccion(@PathVariable Long id) {
        Restriccion restriccion = restriccionService.verRestriccion(id);
        if (restriccion != null) {
            restriccionService.eliminarRestriccion(restriccion);
            return "Restricción eliminada";
        } else {
            return "No existe la restricción con id " + id;
        }
    }
}
