package sistemaDeVentasFinal.sistemaventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sistemaDeVentasFinal.sistemaventas.model.Comprobante;

public interface ComprobanteRepository extends JpaRepository<Comprobante, Integer> {
}
