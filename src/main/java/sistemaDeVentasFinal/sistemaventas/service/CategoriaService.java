package sistemaDeVentasFinal.sistemaventas.service;

import org.springframework.stereotype.Service;
import sistemaDeVentasFinal.sistemaventas.model.Categoria;
import sistemaDeVentasFinal.sistemaventas.repository.CategoriaRepository;

import java.util.List;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public List<Categoria> obtenerCategorias() {
        return categoriaRepository.findAll();
    }

    public Categoria obtenerCategoriaXid(int id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    public void guardarCategoria(Categoria categoria) {
        categoriaRepository.save(categoria);
    }
}
