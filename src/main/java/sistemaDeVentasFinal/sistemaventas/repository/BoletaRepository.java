package sistemaDeVentasFinal.sistemaventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sistemaDeVentasFinal.sistemaventas.model.Boleta;

public interface BoletaRepository extends JpaRepository<Boleta,Integer> {
}
