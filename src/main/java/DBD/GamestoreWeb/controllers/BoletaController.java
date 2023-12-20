package DBD.GamestoreWeb.controllers;

import DBD.GamestoreWeb.models.Boleta;
import DBD.GamestoreWeb.services.BoletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BoletaController {
    @Autowired
    BoletaService boletaService;

    @PostMapping(value = "/boleta/")
    public ResponseEntity<Boleta> guardarBoleta(@RequestBody Boleta boletaEntityNuevo) {
        Boleta objeto = boletaService.guardarBoleta(boletaEntityNuevo);
        return new ResponseEntity<>(objeto, HttpStatus.OK);
    }

    @GetMapping("/boleta/")
    public ResponseEntity<List<Boleta>> verBoletas() {
        return ResponseEntity.ok(boletaService.verBoletas());
    }

    @PutMapping("/boleta/")
    public ResponseEntity<Boleta> editar(@RequestBody Boleta boletaEntity) {
        Boleta boleta = boletaService.editarBoleta(boletaEntity);
        return new ResponseEntity<>(boleta, HttpStatus.OK);
    }

    @DeleteMapping("/boleta/{id}")
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
