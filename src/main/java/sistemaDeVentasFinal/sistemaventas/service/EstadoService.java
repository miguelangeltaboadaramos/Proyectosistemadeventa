package sistemaDeVentasFinal.sistemaventas.service;

import sistemaDeVentasFinal.sistemaventas.model.Estado;
import sistemaDeVentasFinal.sistemaventas.repository.EstadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoService {
    private final EstadoRepository estadoRepository;

    public EstadoService(EstadoRepository estadoRepository) {
        this.estadoRepository = estadoRepository;
    }

    public List<Estado> obtenerEstados() {
        return estadoRepository.findAll();
    }

    public void guardarEstado(Estado estado) {
        estadoRepository.save(estado);
    }
}
