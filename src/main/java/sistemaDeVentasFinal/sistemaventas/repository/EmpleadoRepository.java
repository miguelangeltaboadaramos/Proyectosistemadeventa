package sistemaDeVentasFinal.sistemaventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sistemaDeVentasFinal.sistemaventas.model.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
}
