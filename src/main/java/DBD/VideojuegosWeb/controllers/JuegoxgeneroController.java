package DBD.VideojuegosWeb.controllers;

import DBD.VideojuegosWeb.entity.Juegoxgenero;
import DBD.VideojuegosWeb.services.JuegoxgeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/juego-genero")
public class JuegoxgeneroController {
    @Autowired
    JuegoxgeneroService juegoxgeneroService;

    @PostMapping(value = "/add")
    public ResponseEntity<Juegoxgenero> guardarJuegoxgenero(@RequestBody Juegoxgenero juegoxgeneroEntityNuevo) {
        Juegoxgenero objeto = juegoxgeneroService.guardarJuegoxgenero(juegoxgeneroEntityNuevo);
        return new ResponseEntity<>(objeto, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Juegoxgenero> obtenerJuego(@PathVariable Long id) {
        Juegoxgenero juegoxgenero = juegoxgeneroService.verJuegoxgenero(id);
        if (juegoxgenero != null) {
            return ResponseEntity.ok(juegoxgenero);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @GetMapping
    public ResponseEntity<List<Juegoxgenero>> verJuegosxgenero() {
        return ResponseEntity.ok(juegoxgeneroService.verJuegosxgenero());
    }

    @PutMapping("/update")
    public ResponseEntity<Juegoxgenero> editar(@RequestBody Juegoxgenero juegoxgeneroEntity) {
        Juegoxgenero juegoxgenero = juegoxgeneroService.editarJuegoxgenero(juegoxgeneroEntity);
        return new ResponseEntity<>(juegoxgenero, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
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
