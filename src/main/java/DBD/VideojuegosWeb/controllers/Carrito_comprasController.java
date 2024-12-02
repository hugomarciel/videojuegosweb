package DBD.VideojuegosWeb.controllers;

import DBD.VideojuegosWeb.entity.Carrito_compras;
import DBD.VideojuegosWeb.services.Carrito_comprasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carrito-compras")
public class Carrito_comprasController {
    @Autowired
    Carrito_comprasService carrito_comprasService;

    @PostMapping(value = "/add")
    public ResponseEntity<Carrito_compras> guardarCarrito_compras(@RequestBody Carrito_compras carrito_comprasEntityNuevo) {
        Carrito_compras objeto = carrito_comprasService.guardarCarrito_compras(carrito_comprasEntityNuevo);
        return new ResponseEntity<>(objeto, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Carrito_compras> obtenerCarrito(@PathVariable Long id) {
        Carrito_compras carrito = carrito_comprasService.verCarrito_compras(id);
        if (carrito != null) {
            return ResponseEntity.ok(carrito);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @GetMapping
    public ResponseEntity<List<Carrito_compras>> verCarritos_compras() {
        return ResponseEntity.ok(carrito_comprasService.verCarritos_compras());
    }

    @PutMapping("/update")
    public ResponseEntity<Carrito_compras> editar(@RequestBody Carrito_compras carrito_comprasEntity) {
        Carrito_compras carrito_compras = carrito_comprasService.editarCarrito_compras(carrito_comprasEntity);
        return new ResponseEntity<>(carrito_compras, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public String eliminarCarrito_compras(@PathVariable Long id) {
        Carrito_compras carrito_compras = carrito_comprasService.verCarrito_compras(id);
        if (carrito_compras != null) {
            carrito_comprasService.eliminarCarrito_compras(carrito_compras);
            return "Carrito de compras eliminado";
        } else {
            return "No existe el carrito de compras con id " + id;
        }
    }
}
