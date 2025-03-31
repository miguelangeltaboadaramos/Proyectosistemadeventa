package sistemaDeVentasFinal.sistemaventas.service;

import sistemaDeVentasFinal.sistemaventas.model.DetalleVenta;
import sistemaDeVentasFinal.sistemaventas.repository.DetalleVentaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleVentaService {
    private final DetalleVentaRepository detalleVentaRepository;

    public DetalleVentaService(DetalleVentaRepository detalleVentaRepository) {
        this.detalleVentaRepository = detalleVentaRepository;
    }

    public List<DetalleVenta> obtenerDetallesVenta() {
        return detalleVentaRepository.findAll();
    }

    public void guardarDetalleVenta(DetalleVenta detalleVenta) {
        detalleVentaRepository.save(detalleVenta);
    }
}
