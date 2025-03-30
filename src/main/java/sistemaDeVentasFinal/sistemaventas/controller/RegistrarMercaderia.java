package sistemaDeVentasFinal.sistemaventas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrarMercaderia {
    @GetMapping("/RegistrarMercaderia")
    public String RegistrarMercaderia(){
return "RegistrarMercaderia";
    }
}
