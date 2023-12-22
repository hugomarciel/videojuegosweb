package DBD.GamestoreWeb.controllers;

import DBD.GamestoreWeb.models.Favoritos;
import DBD.GamestoreWeb.models.Juego;
import DBD.GamestoreWeb.models.Usuario;
import DBD.GamestoreWeb.services.FavoritosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FavoritosController {
    @Autowired
    FavoritosService favoritosService;

    @PostMapping(value = "/favoritos/")
    public ResponseEntity<Favoritos> guardarFavoritos(@RequestBody Favoritos favoritosEntityNuevo){
        Favoritos objeto = favoritosService.guardarFavoritos(favoritosEntityNuevo);
        return new ResponseEntity<>(objeto, HttpStatus.OK);
    }

    @GetMapping("/favoritos/")
    public ResponseEntity<List<Favoritos>> verFavoritos() {
        return ResponseEntity.ok(favoritosService.verFavoritos());
    }

    @PutMapping("/favoritos/")
    public ResponseEntity<Favoritos> editar(@RequestBody Favoritos favoritosEntity) {
        Favoritos favoritos = favoritosService.editarFavoritos(favoritosEntity);
        return new ResponseEntity<>(favoritos, HttpStatus.OK);
    }

    @DeleteMapping("/favoritos/{id}")
    @ResponseBody
    public String eliminarFavoritos(@PathVariable Long id) {
        Favoritos favoritos = favoritosService.verFavoritos(id);
        if (favoritos != null) {
            favoritosService.eliminarFavoritos(favoritos);
            return "Favoritos eliminados";
        } else {
            return "No existen favoritos con id " + id;
        }
    }

   @GetMapping("/favoritos/porusuario/")
    public ResponseEntity<List<Favoritos>> obtenerFavoritosporusuario() {
        List<Favoritos> favoritoslist = favoritosService.obtenerFavoritosporusuario();
        return new ResponseEntity <>( favoritoslist, HttpStatus.OK);
    }
}

