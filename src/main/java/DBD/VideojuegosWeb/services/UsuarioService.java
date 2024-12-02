package DBD.VideojuegosWeb.services;

import DBD.VideojuegosWeb.entity.Usuario;
import DBD.VideojuegosWeb.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario guardarUsuario(Usuario nuevoUsuario) {
        return usuarioRepository.save(nuevoUsuario);
    }

    public List<Usuario> verUsuarios() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    public Usuario verUsuario(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario editarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void eliminarUsuario(Usuario usuario) {
        usuarioRepository.delete(usuario);
    }
}

