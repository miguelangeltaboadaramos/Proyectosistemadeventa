package sistemaDeVentasFinal.sistemaventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sistemaDeVentasFinal.sistemaventas.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    Cliente findByDni(String dni);
}

