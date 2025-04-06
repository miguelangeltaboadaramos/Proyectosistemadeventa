package sistemaDeVentasFinal.sistemaventas.service;

import org.springframework.stereotype.Service;
import sistemaDeVentasFinal.sistemaventas.model.Estado;
import sistemaDeVentasFinal.sistemaventas.repository.EstadoRepository;

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

    public Estado obtenerEstadoXid(int id) {
        return estadoRepository.findById(id).orElse(null);
    }

    public void guardarEstado(Estado estado) {
        estadoRepository.save(estado);
    }
}
