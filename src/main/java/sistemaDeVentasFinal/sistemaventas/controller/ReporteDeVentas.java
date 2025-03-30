package sistemaDeVentasFinal.sistemaventas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReporteDeVentas {
    @GetMapping("/ReporteDeVentas")
        public String ReporteDeVentas(){
        return "ReporteDeVentas";
        }
}
