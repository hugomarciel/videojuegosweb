package DBD.GamestoreWeb.controllers;


import DBD.GamestoreWeb.models.Comuna;
import DBD.GamestoreWeb.services.ComunaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.tree.DefaultMutableTreeNode;
import java.util.List;

@RestController
public class ComunaController {
    @Autowired
    ComunaService comunaService;

    @PostMapping(value = "/comuna/")
    public ResponseEntity<Comuna>guardarComuna(@RequestBody Comuna comunaEntityNuevo){
        Comuna objeto = comunaService.guardarComuna(comunaEntityNuevo);
        return new ResponseEntity<>(objeto, HttpStatus.OK);
    }

    @GetMapping("/comuna/")
    public ResponseEntity<List<Comuna>> verComunas() {return ResponseEntity.ok(comunaService.verComunas());}

    @PutMapping("/comuna/")
    public ResponseEntity<Comuna> editar(@RequestBody Comuna comunaEntity) {
        Comuna comuna = comunaService.editarComuna(comunaEntity);
        return new ResponseEntity<>(comuna, HttpStatus.OK);
    }

    @DeleteMapping("/comuna/{id}")
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
