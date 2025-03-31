package sistemaDeVentasFinal.sistemaventas.service;

import sistemaDeVentasFinal.sistemaventas.model.Empleado;
import sistemaDeVentasFinal.sistemaventas.repository.EmpleadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {
    private final EmpleadoRepository empleadoRepository;

    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public List<Empleado> obtenerEmpleados() {
        return empleadoRepository.findAll();
    }

    public void guardarEmpleado(Empleado empleado) {
        empleadoRepository.save(empleado);
    }
}
