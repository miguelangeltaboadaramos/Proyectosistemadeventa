package sistemaDeVentasFinal.sistemaventas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sistemaDeVentasFinal.sistemaventas.model.Empleado;
import sistemaDeVentasFinal.sistemaventas.service.EmpleadoService;
import sistemaDeVentasFinal.sistemaventas.service.EstadoService;

@Controller
@RequestMapping("/empleado")
public class EmpleadoController {

    private final EmpleadoService empleadoService;
    private final EstadoService estadoService;

    public EmpleadoController(EmpleadoService empleadoService, EstadoService estadoService) {
        this.empleadoService = empleadoService;
        this.estadoService = estadoService;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("empleados", empleadoService.obtenerEmpleados());
        return "empleado/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("empleado", new Empleado());
        model.addAttribute("estados", estadoService.obtenerEstados());
        return "empleado/create";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("empleado", empleadoService.obtenerEmpleadoXid(id));
        model.addAttribute("estados", estadoService.obtenerEstados());
        return "empleado/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("empleado") Empleado empleado) {
        empleadoService.guardarEmpleado(empleado);
        return "redirect:/empleado";
    }
}




