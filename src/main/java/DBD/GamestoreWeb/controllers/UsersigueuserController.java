package DBD.GamestoreWeb.controllers;

import DBD.GamestoreWeb.models.Usersigueuser;
import DBD.GamestoreWeb.services.UsersigueuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersigueuserController {
    @Autowired
    UsersigueuserService usersigueuserService;

    @PostMapping(value = "/usersigueuser/")
    public ResponseEntity<Usersigueuser> guardarUsersigueuser(@RequestBody Usersigueuser usersigueuserEntityNuevo) {
        Usersigueuser objeto = usersigueuserService.guardarUsersigueuser(usersigueuserEntityNuevo);
        return new ResponseEntity<>(objeto, HttpStatus.OK);
    }

    @GetMapping("/usersigueuser/")
    public ResponseEntity<List<Usersigueuser>> verUsersigueusers() {
        return ResponseEntity.ok(usersigueuserService.verUsersigueusers());
    }

    @PutMapping("/usersigueuser/")
    public ResponseEntity<Usersigueuser> editar(@RequestBody Usersigueuser usersigueuserEntity) {
        Usersigueuser usersigueuser = usersigueuserService.editarUsersigueuser(usersigueuserEntity);
        return new ResponseEntity<>(usersigueuser, HttpStatus.OK);
    }

    @DeleteMapping("/usersigueuser/{id}")
    @ResponseBody
    public String eliminarUsersigueuser(@PathVariable Long id) {
        Usersigueuser usersigueuser = usersigueuserService.verUsersigueuser(id);
        if (usersigueuser != null) {
            usersigueuserService.eliminarUsersigueuser(usersigueuser);
            return "Usersigueuser eliminado";
        } else {
            return "No existe el usersigueuser con id " + id;
        }
    }
}
