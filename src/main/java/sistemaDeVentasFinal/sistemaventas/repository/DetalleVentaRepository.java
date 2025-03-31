package sistemaDeVentasFinal.sistemaventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sistemaDeVentasFinal.sistemaventas.model.DetalleVenta;

public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Integer> {
}
