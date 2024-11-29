package DBD.VideojuegosWeb.services;

import DBD.VideojuegosWeb.entity.Carrito_compras;
import DBD.VideojuegosWeb.repositories.Carrito_comprasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Carrito_comprasService {
    @Autowired
    Carrito_comprasRepository carrito_comprasRepository;

    public Carrito_compras guardarCarrito_compras(Carrito_compras nuevoCarrito_compras) {
        return carrito_comprasRepository.save(nuevoCarrito_compras);
    }

    public List<Carrito_compras> verCarritos_compras() {
        return (List<Carrito_compras>) carrito_comprasRepository.findAll();
    }

    public Carrito_compras verCarrito_compras(Long id) {
        return carrito_comprasRepository.findById(id).orElse(null);
    }

    public Carrito_compras editarCarrito_compras(Carrito_compras carrito_compras) {
        return carrito_comprasRepository.save(carrito_compras);
    }

    public void eliminarCarrito_compras(Carrito_compras carrito_compras) {
        carrito_comprasRepository.delete(carrito_compras);
    }
}
