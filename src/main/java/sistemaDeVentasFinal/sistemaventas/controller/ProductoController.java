package sistemaDeVentasFinal.sistemaventas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sistemaDeVentasFinal.sistemaventas.model.Producto;
import sistemaDeVentasFinal.sistemaventas.service.ProductoService;
import sistemaDeVentasFinal.sistemaventas.service.CategoriaService;
import sistemaDeVentasFinal.sistemaventas.service.EstadoService;
import sistemaDeVentasFinal.sistemaventas.service.ProveedorService;

@Controller
@RequestMapping("/producto")
public class ProductoController {

    private final ProductoService productoService;
    private final CategoriaService categoriaService;
    private final EstadoService estadoService;
    private final ProveedorService proveedorService;

    public ProductoController(ProductoService productoService, CategoriaService categoriaService, EstadoService estadoService, ProveedorService proveedorService) {
        this.productoService = productoService;
        this.categoriaService = categoriaService;
        this.estadoService = estadoService;
        this.proveedorService = proveedorService;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("productos", productoService.obtenerProductos());
        return "producto/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("producto", new Producto());
        model.addAttribute("categorias", categoriaService.obtenerCategorias());
        model.addAttribute("estados", estadoService.obtenerEstados());
        model.addAttribute("proveedores", proveedorService.obtenerProveedores());
        return "producto/create";
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable int id) {
        model.addAttribute("producto", productoService.obtenerProductoXid(id));
        model.addAttribute("categorias", categoriaService.obtenerCategorias());
        model.addAttribute("estados", estadoService.obtenerEstados());
        model.addAttribute("proveedores", proveedorService.obtenerProveedores());
        return "producto/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("producto") Producto producto) {
        productoService.guardarProducto(producto);
        return "redirect:/producto";
    }
}
