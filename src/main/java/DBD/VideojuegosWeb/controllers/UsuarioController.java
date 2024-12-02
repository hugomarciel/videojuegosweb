package DBD.VideojuegosWeb.controllers;

import DBD.VideojuegosWeb.entity.Usuario;
import DBD.VideojuegosWeb.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @PostMapping(value = "/add")
    public ResponseEntity<Usuario> guardarUsuario(@RequestBody Usuario usuarioEntityNuevo) {
        Usuario objeto = usuarioService.guardarUsuario(usuarioEntityNuevo);
        return new ResponseEntity<>(objeto, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> obtenerUsuario(@PathVariable Long id) {
        Usuario usuario = usuarioService.verUsuario(id);
        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @GetMapping("/")
    public ResponseEntity<List<Usuario>> verUsuarios() { return ResponseEntity.ok(usuarioService.verUsuarios());
    }

    @PutMapping("/usuario/actualizar")
    public ResponseEntity<Usuario> editar(@RequestBody Usuario usuarioEntity) {
        Usuario usuario = usuarioService.editarUsuario(usuarioEntity);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }

    @DeleteMapping("/usuario/{id}")
    @ResponseBody
    public String eliminarUsuario(@PathVariable Long id) {
        Usuario usuario = usuarioService.verUsuario(id);
        if (usuario != null) {
            usuarioService.eliminarUsuario(usuario);
            return "Usuario eliminado";
        } else {
            return "No existe el usuario con id " + id;
        }
    }
}
