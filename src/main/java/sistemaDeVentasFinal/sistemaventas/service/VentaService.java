package sistemaDeVentasFinal.sistemaventas.service;

import org.springframework.stereotype.Service;
import sistemaDeVentasFinal.sistemaventas.model.Venta;
import sistemaDeVentasFinal.sistemaventas.repository.VentaRepository;

import java.util.List;

@Service
public class VentaService {

    private final VentaRepository ventaRepository;

    public VentaService(VentaRepository ventaRepository) {
        this.ventaRepository = ventaRepository;
    }

    public List<Venta> obtenerVentas() {
        return ventaRepository.findAll();
    }

    public Venta obtenerVentaXid(int id) {
        return ventaRepository.findById(id).orElse(null);
    }

    public void guardarVenta(Venta venta) {
        ventaRepository.save(venta);
    }
}
