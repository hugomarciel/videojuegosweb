package DBD.VideojuegosWeb.controllers;

import DBD.VideojuegosWeb.entity.Juego;
import DBD.VideojuegosWeb.services.JuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/juego")
public class JuegoController {
    @Autowired
    JuegoService juegoService;

    @PostMapping(value = "/add")
    public ResponseEntity<Juego> guardarJuego(@RequestBody Juego juegoEntityNuevo) {
        Juego objeto = juegoService.guardarJuego(juegoEntityNuevo);
        return new ResponseEntity<>(objeto, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Juego> obtenerJuego(@PathVariable Long id) {
        Juego juego = juegoService.verJuego(id);
        if (juego != null) {
            return ResponseEntity.ok(juego);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @GetMapping
    public ResponseEntity<List<Juego>> verJuegos() {
        return ResponseEntity.ok(juegoService.verJuegos());
    }

    @PutMapping("/update")
    public ResponseEntity<Juego> editar(@RequestBody Juego juegoEntity) {
        Juego juego = juegoService.editarJuego(juegoEntity);
        return new ResponseEntity<>(juego, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public String eliminarJuego(@PathVariable Long id) {
        Juego juego = juegoService.verJuego(id);
        if (juego != null) {
            juegoService.eliminarJuego(juego);
            return "Juego eliminado";
        } else {
            return "No existe el juego con id " + id;
        }
    }

    @GetMapping("/ranking")
    public ResponseEntity<List<Juego>> obtenerRankingJuegosMasComprados() {
        List<Juego> rankingJuegos = juegoService.obtenerRankingJuegosMasComprados();
        return new ResponseEntity<>(rankingJuegos, HttpStatus.OK);
    }
}
