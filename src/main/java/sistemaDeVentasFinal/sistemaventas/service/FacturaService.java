package sistemaDeVentasFinal.sistemaventas.service;

import org.springframework.stereotype.Service;
import sistemaDeVentasFinal.sistemaventas.model.Factura;
import sistemaDeVentasFinal.sistemaventas.repository.FacturaRepository;

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

    public Factura obtenerFacturaXid(int id) {
        return facturaRepository.findById(id).orElse(null);
    }

    public void guardarFactura(Factura factura) {
        facturaRepository.save(factura);
    }
}

