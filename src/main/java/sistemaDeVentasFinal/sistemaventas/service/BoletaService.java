package sistemaDeVentasFinal.sistemaventas.service;

import sistemaDeVentasFinal.sistemaventas.model.Boleta;
import sistemaDeVentasFinal.sistemaventas.repository.BoletaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoletaService {
    private final BoletaRepository boletaRepository;
    public BoletaService(BoletaRepository boletaRepository) {this.boletaRepository = boletaRepository;
    }

    public List<Boleta> obtenerBoletas() {
        return boletaRepository.findAll();
    }

    public void guardarBoleta(Boleta boleta) {
        boletaRepository.save(boleta);
    }
}
