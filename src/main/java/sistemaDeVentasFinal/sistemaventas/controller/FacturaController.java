package sistemaDeVentasFinal.sistemaventas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sistemaDeVentasFinal.sistemaventas.model.Factura;
import sistemaDeVentasFinal.sistemaventas.service.EstadoService;
import sistemaDeVentasFinal.sistemaventas.service.FacturaService;

@Controller
@RequestMapping("venta/factura")
public class FacturaController {
    private final FacturaService facturaService;
    private final EstadoService estadoService;

    public FacturaController(FacturaService facturaService, EstadoService estadoService) {
        this.facturaService = facturaService;
        this.estadoService = estadoService;
    }


    @GetMapping
    public String index(Model model) {
        model.addAttribute("facturas", facturaService.obtenerFacturas());
        return "venta/factura/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("factura", new Factura());
        model.addAttribute("estados", estadoService.obtenerEstados());
        return "venta/factura/create";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("factura", facturaService.obtenerFacturaXid(id));
        model.addAttribute("estados", estadoService.obtenerEstados());
        return "venta/factura/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("factura") Factura factura) {
        facturaService.guardarFactura(factura);
        return "redirect:/venta/factura";
    }
}