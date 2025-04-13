package sistemaDeVentasFinal.sistemaventas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sistemaDeVentasFinal.sistemaventas.model.Boleta;
import sistemaDeVentasFinal.sistemaventas.model.Cliente;
import sistemaDeVentasFinal.sistemaventas.service.BoletaService;
import sistemaDeVentasFinal.sistemaventas.service.ClienteService;
import sistemaDeVentasFinal.sistemaventas.service.EstadoService;

@Controller
@RequestMapping("venta/boleta")
public class BoletaController {

    private final BoletaService boletaService;
    private final EstadoService estadoService;
    private final ClienteService clienteService;

    public BoletaController(BoletaService boletaService, EstadoService estadoService, ClienteService clienteService) {
        this.boletaService = boletaService;
        this.estadoService = estadoService;
        this.clienteService = clienteService;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("boletas", boletaService.obtenerBoletas());
        return "venta/boleta/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("boleta", new Boleta());
        model.addAttribute("estados", estadoService.obtenerEstados());
        return "venta/boleta/create";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("boleta", boletaService.obtenerBoletaXid(id));
        model.addAttribute("estados", estadoService.obtenerEstados());
        return "venta/boleta/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("boleta") Boleta boleta) {
        Cliente cliente = clienteService.obtenerClientePorDni(boleta.getCliente().getDni());

        if (cliente == null) {
            cliente = new Cliente();
            cliente.setDni(boleta.getCliente().getDni());
        }

        cliente.setNombre(boleta.getCliente().getNombre());
        clienteService.guardarCliente(cliente);

        boleta.setCliente(cliente);

        boletaService.guardarBoleta(boleta);

        return "redirect:/venta/boleta";
    }
}


