package DBD.GamestoreWeb.controllers;

import DBD.GamestoreWeb.models.Valoracion;
import DBD.GamestoreWeb.services.ValoracionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ValoracionController {
    @Autowired
    ValoracionService valoracionService;

    @PostMapping(value = "/valoracion/")
    public ResponseEntity<Valoracion> guardarValoracion(@RequestBody Valoracion valoracionEntityNuevo) {
        Valoracion objeto = valoracionService.guardarValoracion(valoracionEntityNuevo);
        return new ResponseEntity<>(objeto, HttpStatus.OK);
    }

    @GetMapping("/valoracion/")
    public ResponseEntity<List<Valoracion>> verValoraciones() {
        return ResponseEntity.ok(valoracionService.verValoraciones());
    }

    @PutMapping("/valoracion/")
    public ResponseEntity<Valoracion> editar(@RequestBody Valoracion valoracionEntity) {
        Valoracion valoracion = valoracionService.editarValoracion(valoracionEntity);
        return new ResponseEntity<>(valoracion, HttpStatus.OK);
    }

    @DeleteMapping("/valoracion/{id}")
    @ResponseBody
    public String eliminarValoracion(@PathVariable Long id) {
        Valoracion valoracion = valoracionService.verValoracion(id);
        if (valoracion != null) {
            valoracionService.eliminarValoracion(valoracion);
            return "Valoracion eliminada";
        } else {
            return "No existe la valoracion con id " + id;
        }
    }
}
