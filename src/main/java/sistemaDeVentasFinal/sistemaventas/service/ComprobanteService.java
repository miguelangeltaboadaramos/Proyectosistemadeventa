package sistemaDeVentasFinal.sistemaventas.service;

import sistemaDeVentasFinal.sistemaventas.model.Comprobante;
import sistemaDeVentasFinal.sistemaventas.repository.ComprobanteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComprobanteService {
    private final ComprobanteRepository comprobanteRepository;

    public ComprobanteService(ComprobanteRepository comprobanteRepository) {
        this.comprobanteRepository = comprobanteRepository;
    }

    public List<Comprobante> obtenerComprobantes() {
        return comprobanteRepository.findAll();
    }

    public void guardarComprobante(Comprobante comprobante) {
        comprobanteRepository.save(comprobante);
    }
}
