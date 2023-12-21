package DBD.GamestoreWeb.controllers;

import DBD.GamestoreWeb.models.Carritocompras_juego;
import DBD.GamestoreWeb.services.Carritocompras_juegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Carritocompras_juegoController {
    @Autowired
    Carritocompras_juegoService carritoComprasJuegoService;

    @PostMapping(value = "/carritocompras_juego/")
    public ResponseEntity<Carritocompras_juego> guardarCarritoComprasJuego(@RequestBody Carritocompras_juego carritoComprasJuegoEntityNuevo) {
        Carritocompras_juego objeto = carritoComprasJuegoService.guardarCarritoComprasJuego(carritoComprasJuegoEntityNuevo);
        return new ResponseEntity<>(objeto, HttpStatus.OK);
    }

    @GetMapping("/carritocompras_juego/")
    public ResponseEntity<List<Carritocompras_juego>> verCarritoComprasJuegos() {
        return ResponseEntity.ok(carritoComprasJuegoService.verCarritoComprasJuegos());
    }

    @PutMapping("/carritocompras_juego/")
    public ResponseEntity<Carritocompras_juego> editar(@RequestBody Carritocompras_juego carritoComprasJuegoEntity) {
        Carritocompras_juego carritoComprasJuego = carritoComprasJuegoService.editarCarritoComprasJuego(carritoComprasJuegoEntity);
        return new ResponseEntity<>(carritoComprasJuego, HttpStatus.OK);
    }

    @DeleteMapping("/carritocompras_juego/{id}")
    @ResponseBody
    public String eliminarCarritoComprasJuego(@PathVariable Long id) {
        Carritocompras_juego carritoComprasJuego = carritoComprasJuegoService.verCarritoComprasJuego(id);
        if (carritoComprasJuego != null) {
            carritoComprasJuegoService.eliminarCarritoComprasJuego(carritoComprasJuego);
            return "Carrito de compras de juego eliminado";
        } else {
            return "No existe el carrito de compras de juego con id " + id;
        }
    }
}
