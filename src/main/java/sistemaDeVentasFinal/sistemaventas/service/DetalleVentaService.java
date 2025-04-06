package sistemaDeVentasFinal.sistemaventas.service;

import org.springframework.stereotype.Service;
import sistemaDeVentasFinal.sistemaventas.model.DetalleVenta;
import sistemaDeVentasFinal.sistemaventas.repository.DetalleVentaRepository;

import java.util.List;

@Service
public class DetalleVentaService {

    private final DetalleVentaRepository detalleVentaRepository;

    public DetalleVentaService(DetalleVentaRepository detalleVentaRepository) {
        this.detalleVentaRepository = detalleVentaRepository;
    }

    public List<DetalleVenta> obtenerDetalleVentas() {
        return detalleVentaRepository.findAll();
    }

    public DetalleVenta obtenerDetalleVentaXid(int id) {
        return detalleVentaRepository.findById(id).orElse(null);
    }

    public void guardarDetalleVenta(DetalleVenta detalleVenta) {
        detalleVentaRepository.save(detalleVenta);
    }
}
