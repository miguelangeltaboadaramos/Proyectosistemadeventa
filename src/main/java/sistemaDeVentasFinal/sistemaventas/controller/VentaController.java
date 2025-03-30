package sistemaDeVentasFinal.sistemaventas.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VentaController {

    @GetMapping("/NuevaVenta")
    public String NuevaVenta(){
        return "NuevaVenta";
    }
}
