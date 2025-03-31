package sistemaDeVentasFinal.sistemaventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sistemaDeVentasFinal.sistemaventas.model.MetodoPago;

public interface MetodoPagoRepository extends JpaRepository<MetodoPago, Integer> {
}
