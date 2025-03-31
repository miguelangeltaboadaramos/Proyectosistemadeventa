package sistemaDeVentasFinal.sistemaventas.service;

import sistemaDeVentasFinal.sistemaventas.model.Factura;
import sistemaDeVentasFinal.sistemaventas.repository.FacturaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaService {
    private final FacturaRepository facturaRepository;

    public FacturaService(FacturaRepository facturaRepository) {
        this.facturaRepository = facturaRepository;
    }

    public List<Factura> obtenerFacturas() {
        return facturaRepository.findAll();
    }

    public void guardarFactura(Factura factura) {
        facturaRepository.save(factura);
    }
}
