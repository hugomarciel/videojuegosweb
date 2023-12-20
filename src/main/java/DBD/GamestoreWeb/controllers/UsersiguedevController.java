package DBD.GamestoreWeb.controllers;

import DBD.GamestoreWeb.models.Usersiguedev;
import DBD.GamestoreWeb.services.UsersiguedevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersiguedevController {
    @Autowired
    UsersiguedevService usersiguedevService;

    @PostMapping(value = "/usersiguedev/")
    public ResponseEntity<Usersiguedev> guardarUsersiguedev(@RequestBody Usersiguedev usersiguedevEntityNuevo) {
        Usersiguedev objeto = usersiguedevService.guardarUsersiguedev(usersiguedevEntityNuevo);
        return new ResponseEntity<>(objeto, HttpStatus.OK);
    }

    @GetMapping("/usersiguedev/")
    public ResponseEntity<List<Usersiguedev>> verUsersiguedevs() {
        return ResponseEntity.ok(usersiguedevService.verUsersiguedevs());
    }

    @PutMapping("/usersiguedev/")
    public ResponseEntity<Usersiguedev> editar(@RequestBody Usersiguedev usersiguedevEntity) {
        Usersiguedev usersiguedev = usersiguedevService.editarUsersiguedev(usersiguedevEntity);
        return new ResponseEntity<>(usersiguedev, HttpStatus.OK);
    }

    @DeleteMapping("/usersiguedev/{id}")
    @ResponseBody
    public String eliminarUsersiguedev(@PathVariable Long id) {
        Usersiguedev usersiguedev = usersiguedevService.verUsersiguedev(id);
        if (usersiguedev != null) {
            usersiguedevService.eliminarUsersiguedev(usersiguedev);
            return "Usersiguedev eliminado";
        } else {
            return "No existe Usersiguedev con id " + id;
        }
    }
}
