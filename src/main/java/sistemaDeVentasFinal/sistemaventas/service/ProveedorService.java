package sistemaDeVentasFinal.sistemaventas.service;

import sistemaDeVentasFinal.sistemaventas.model.Proveedor;
import sistemaDeVentasFinal.sistemaventas.repository.ProveedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorService {
    private final ProveedorRepository proveedorRepository;

    public ProveedorService(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }

    public List<Proveedor> obtenerProveedores() {
        return proveedorRepository.findAll();
    }

    public void guardarProveedor(Proveedor proveedor) {
        proveedorRepository.save(proveedor);
    }
}
