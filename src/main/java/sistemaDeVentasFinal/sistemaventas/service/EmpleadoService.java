package sistemaDeVentasFinal.sistemaventas.service;

import org.springframework.stereotype.Service;
import sistemaDeVentasFinal.sistemaventas.model.Empleado;
import sistemaDeVentasFinal.sistemaventas.repository.EmpleadoRepository;

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

    public Empleado obtenerEmpleadoXid(int id) {
        return empleadoRepository.findById(id).orElse(null);
    }

    public void guardarEmpleado(Empleado empleado) {
        empleadoRepository.save(empleado);
    }
}
