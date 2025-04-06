package sistemaDeVentasFinal.sistemaventas.service;

import org.springframework.stereotype.Service;
import sistemaDeVentasFinal.sistemaventas.model.Boleta;
import sistemaDeVentasFinal.sistemaventas.repository.BoletaRepository;

import java.util.List;

@Service
public class BoletaService {

    private final BoletaRepository boletaRepository;

    public BoletaService(BoletaRepository boletaRepository) {
        this.boletaRepository = boletaRepository;
    }

    public List<Boleta> obtenerBoletas() {
        return boletaRepository.findAll();
    }

    public Boleta obtenerBoletaXid(int id) {
        return boletaRepository.findById(id).orElse(null);
    }

    public void guardarBoleta(Boleta boleta) {
        boletaRepository.save(boleta);
    }
}
