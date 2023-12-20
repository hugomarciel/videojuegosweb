package DBD.GamestoreWeb.services;

import DBD.GamestoreWeb.models.Usersiguedev;
import DBD.GamestoreWeb.repositories.UsersiguedevRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersiguedevService {
    @Autowired
    UsersiguedevRepository usersiuedevRepository;

    public Usersiguedev guardarUsersiguedev(Usersiguedev nuevo_usersiguedev) {
        return usersiuedevRepository.save(nuevo_usersiguedev);
    }

    public List<Usersiguedev> verUsersiguedevs() {
        return (List<Usersiguedev>) usersiuedevRepository.findAll();
    }

    public Usersiguedev verUsersiguedev(Long id) {
        return usersiuedevRepository.findById(id).orElse(null);
    }

    public Usersiguedev editarUsersiguedev(Usersiguedev usersiguedev) {
        return usersiuedevRepository.save(usersiguedev);
    }

    public void eliminarUsersiguedev(Usersiguedev usersiguedev) {
        usersiuedevRepository.delete(usersiguedev);
    }
}
