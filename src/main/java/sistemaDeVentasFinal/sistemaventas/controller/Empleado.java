package sistemaDeVentasFinal.sistemaventas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Empleado {
    @GetMapping("/Empleado")
    public String Empleado(){
        return "Empleado";
    }
}
