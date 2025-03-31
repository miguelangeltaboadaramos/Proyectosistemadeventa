package sistemaDeVentasFinal.sistemaventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sistemaDeVentasFinal.sistemaventas.model.Factura;

public interface FacturaRepository extends JpaRepository<Factura, Integer> {
}
