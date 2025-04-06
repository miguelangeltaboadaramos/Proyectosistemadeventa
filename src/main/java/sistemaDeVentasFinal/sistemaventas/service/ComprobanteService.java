package sistemaDeVentasFinal.sistemaventas.service;

import org.springframework.stereotype.Service;
import sistemaDeVentasFinal.sistemaventas.model.Comprobante;
import sistemaDeVentasFinal.sistemaventas.repository.ComprobanteRepository;

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

    public Comprobante obtenerComprobanteXid(int id) {
        return comprobanteRepository.findById(id).orElse(null);
    }

    public void guardarComprobante(Comprobante comprobante) {
        comprobanteRepository.save(comprobante);
    }
}
