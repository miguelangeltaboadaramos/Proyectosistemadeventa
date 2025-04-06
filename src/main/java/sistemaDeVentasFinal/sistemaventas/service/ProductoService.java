package sistemaDeVentasFinal.sistemaventas.service;

import org.springframework.stereotype.Service;
import sistemaDeVentasFinal.sistemaventas.model.Producto;
import sistemaDeVentasFinal.sistemaventas.repository.ProductoRepository;

import java.util.List;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> obtenerProductos() {
        return productoRepository.findAll();
    }

    public Producto obtenerProductoXid(int id) {
        return productoRepository.findById(id).orElse(null);
    }

    public void guardarProducto(Producto producto) {
        productoRepository.save(producto);
    }
}

