package DBD.GamestoreWeb.controllers;

import DBD.GamestoreWeb.models.Juegoxgenero;
import DBD.GamestoreWeb.services.JuegoxgeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JuegoxgeneroController {
    @Autowired
    JuegoxgeneroService juegoxgeneroService;

    @PostMapping(value = "/juegoxgenero/")
    public ResponseEntity<Juegoxgenero> guardarJuegoxgenero(@RequestBody Juegoxgenero juegoxgeneroEntityNuevo) {
        Juegoxgenero objeto = juegoxgeneroService.guardarJuegoxgenero(juegoxgeneroEntityNuevo);
        return new ResponseEntity<>(objeto, HttpStatus.OK);
    }

    @GetMapping("/juegoxgenero/")
    public ResponseEntity<List<Juegoxgenero>> verJuegosxgenero() {
        return ResponseEntity.ok(juegoxgeneroService.verJuegosxgenero());
    }

    @PutMapping("/juegoxgenero/")
    public ResponseEntity<Juegoxgenero> editar(@RequestBody Juegoxgenero juegoxgeneroEntity) {
        Juegoxgenero juegoxgenero = juegoxgeneroService.editarJuegoxgenero(juegoxgeneroEntity);
        return new ResponseEntity<>(juegoxgenero, HttpStatus.OK);
    }

    @DeleteMapping("/juegoxgenero/{id}")
    @ResponseBody
    public String eliminarJuegoxgenero(@PathVariable Long id) {
        Juegoxgenero juegoxgenero = juegoxgeneroService.verJuegoxgenero(id);
        if (juegoxgenero != null) {
            juegoxgeneroService.eliminarJuegoxgenero(juegoxgenero);
            return "Relación juegoxgenero eliminada";
        } else {
            return "No existe la relación juegoxgenero con id " + id;
        }
    }
}
