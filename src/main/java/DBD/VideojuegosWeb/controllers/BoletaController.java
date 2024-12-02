package DBD.VideojuegosWeb.controllers;

import DBD.VideojuegosWeb.entity.Boleta;
import DBD.VideojuegosWeb.services.BoletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boleta")
public class BoletaController {
    @Autowired
    BoletaService boletaService;

    @PostMapping(value = "/add")
    public ResponseEntity<Boleta> guardarBoleta(@RequestBody Boleta boletaEntityNuevo) {
        Boleta objeto = boletaService.guardarBoleta(boletaEntityNuevo);
        return new ResponseEntity<>(objeto, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Boleta> obtenerBoleta(@PathVariable Long id) {
        Boleta boleta = boletaService.verBoleta(id);
        if (boleta != null) {
            return ResponseEntity.ok(boleta);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @GetMapping
    public ResponseEntity<List<Boleta>> verBoletas() {
        return ResponseEntity.ok(boletaService.verBoletas());
    }

    @PutMapping("/update")
    public ResponseEntity<Boleta> editar(@RequestBody Boleta boletaEntity) {
        Boleta boleta = boletaService.editarBoleta(boletaEntity);
        return new ResponseEntity<>(boleta, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public String eliminarBoleta(@PathVariable Long id) {
        Boleta boleta = boletaService.verBoleta(id);
        if (boleta != null) {
            boletaService.eliminarBoleta(boleta);
            return "Boleta eliminada";
        } else {
            return "No existe la boleta con id " + id;
        }
    }
}
