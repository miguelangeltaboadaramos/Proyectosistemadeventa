package sistemaDeVentasFinal.sistemaventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sistemaDeVentasFinal.sistemaventas.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
