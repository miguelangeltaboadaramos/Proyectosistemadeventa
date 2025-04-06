package sistemaDeVentasFinal.sistemaventas.service;

import org.springframework.stereotype.Service;
import sistemaDeVentasFinal.sistemaventas.model.MetodoPago;
import sistemaDeVentasFinal.sistemaventas.repository.MetodoPagoRepository;

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

    public MetodoPago obtenerMetodoPagoXid(int id) {
        return metodoPagoRepository.findById(id).orElse(null);
    }

    public void guardarMetodoPago(MetodoPago metodoPago) {
        metodoPagoRepository.save(metodoPago);
    }
}
