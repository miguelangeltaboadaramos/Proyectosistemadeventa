package sistemaDeVentasFinal.sistemaventas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sistemaDeVentasFinal.sistemaventas.model.Proveedor;
import sistemaDeVentasFinal.sistemaventas.service.ProveedorService;
import sistemaDeVentasFinal.sistemaventas.service.EstadoService;

@Controller
@RequestMapping("/proveedor")
public class ProveedorController {

    private final ProveedorService proveedorService;
    private final EstadoService estadoService;

    public ProveedorController(ProveedorService proveedorService, EstadoService estadoService) {
        this.proveedorService = proveedorService;
        this.estadoService = estadoService;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("proveedores", proveedorService.obtenerProveedores());
        return "proveedor/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("proveedor", new Proveedor());
        model.addAttribute("estados", estadoService.obtenerEstados());
        return "proveedor/create";
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable int id) {
        model.addAttribute("proveedor", proveedorService.obtenerProveedorXid(id));
        model.addAttribute("estados", estadoService.obtenerEstados());
        return "proveedor/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("proveedor") Proveedor proveedor) {
        proveedorService.guardarProveedor(proveedor);
        return "redirect:/proveedor";
    }
}
