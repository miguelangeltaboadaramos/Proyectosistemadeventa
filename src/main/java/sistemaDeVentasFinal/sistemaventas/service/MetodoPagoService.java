package sistemaDeVentasFinal.sistemaventas.service;

import sistemaDeVentasFinal.sistemaventas.model.MetodoPago;
import sistemaDeVentasFinal.sistemaventas.repository.MetodoPagoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetodoPagoService {
    private final MetodoPagoRepository metodoPagoRepository;

    public MetodoPagoService(MetodoPagoRepository metodoPagoRepository) {
        this.metodoPagoRepository = metodoPagoRepository;
    }

    public List<MetodoPago> obtenerMetodosPago() {
        return metodoPagoRepository.findAll();
    }

    public void guardarMetodoPago(MetodoPago metodoPago) {
        metodoPagoRepository.save(metodoPago);
    }
}
