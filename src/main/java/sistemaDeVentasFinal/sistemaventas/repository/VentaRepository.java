package sistemaDeVentasFinal.sistemaventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sistemaDeVentasFinal.sistemaventas.model.Venta;

public interface VentaRepository extends JpaRepository<Venta, Integer> {
}
