package DBD.VideojuegosWeb.controllers;

import DBD.VideojuegosWeb.entity.Genero;
import DBD.VideojuegosWeb.services.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GeneroController {
    @Autowired
    GeneroService generoService;

    @PostMapping(value = "/genero/")
    public ResponseEntity<Genero> guardarGenero(@RequestBody Genero generoEntityNuevo) {
        Genero objeto = generoService.guardarGenero(generoEntityNuevo);
        return new ResponseEntity<>(objeto, HttpStatus.OK);
    }

    @GetMapping("/genero/")
    public ResponseEntity<List<Genero>> verGeneros() {
        return ResponseEntity.ok(generoService.verGeneros());
    }

    @PutMapping("/genero/")
    public ResponseEntity<Genero> editar(@RequestBody Genero generoEntity) {
        Genero genero = generoService.editarGenero(generoEntity);
        return new ResponseEntity<>(genero, HttpStatus.OK);
    }

    @DeleteMapping("/genero/{id}")
    @ResponseBody
    public String eliminarGenero(@PathVariable Long id) {
        Genero genero = generoService.verGenero(id);
        if (genero != null) {
            generoService.eliminarGenero(genero);
            return "Género eliminado";
        } else {
            return "No existe el género con id " + id;
        }
    }
}
