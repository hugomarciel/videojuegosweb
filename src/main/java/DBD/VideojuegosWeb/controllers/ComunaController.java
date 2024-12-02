package DBD.VideojuegosWeb.controllers;


import DBD.VideojuegosWeb.entity.Comuna;
import DBD.VideojuegosWeb.services.ComunaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comuna")
public class ComunaController {
    @Autowired
    ComunaService comunaService;

    @PostMapping(value = "/add")
    public ResponseEntity<Comuna>guardarComuna(@RequestBody Comuna comunaEntityNuevo){
        Comuna objeto = comunaService.guardarComuna(comunaEntityNuevo);
        return new ResponseEntity<>(objeto, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Comuna> obtenerComuna(@PathVariable Long id) {
        Comuna comuna = comunaService.verComuna(id);
        if (comuna != null) {
            return ResponseEntity.ok(comuna);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @GetMapping
    public ResponseEntity<List<Comuna>> verComunas() {return ResponseEntity.ok(comunaService.verComunas());}

    @PutMapping("/update")
    public ResponseEntity<Comuna> editar(@RequestBody Comuna comunaEntity) {
        Comuna comuna = comunaService.editarComuna(comunaEntity);
        return new ResponseEntity<>(comuna, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public String eliminarComuna(@PathVariable Long id) {
        Comuna comuna = comunaService.verComuna(id);
        if (comuna != null) {
            comunaService.eliminarComuna(comuna);
            return "Comuna eliminada";
        } else {
            return "No existe la comuna con id " + id;
        }
    }


}
