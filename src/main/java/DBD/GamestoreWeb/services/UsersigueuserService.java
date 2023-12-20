package DBD.GamestoreWeb.services;

import DBD.GamestoreWeb.models.Usersigueuser;
import DBD.GamestoreWeb.repositories.UsersigueuserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersigueuserService {
    @Autowired
    UsersigueuserRepository usersigueuserRepository;

    public Usersigueuser guardarUsersigueuser(Usersigueuser nuevoUsersigueuser) {
        return usersigueuserRepository.save(nuevoUsersigueuser);
    }

    public List<Usersigueuser> verUsersigueusers() {
        return (List<Usersigueuser>) usersigueuserRepository.findAll();
    }

    public Usersigueuser verUsersigueuser(Long id) {
        return usersigueuserRepository.findById(id).orElse(null);
    }

    public Usersigueuser editarUsersigueuser(Usersigueuser usersigueuser) {
        return usersigueuserRepository.save(usersigueuser);
    }

    public void eliminarUsersigueuser(Usersigueuser usersigueuser) {
        usersigueuserRepository.delete(usersigueuser);
    }
}

