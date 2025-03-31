package sistemaDeVentasFinal.sistemaventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sistemaDeVentasFinal.sistemaventas.model.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> {
}
