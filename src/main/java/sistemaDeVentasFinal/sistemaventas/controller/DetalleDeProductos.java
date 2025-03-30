package sistemaDeVentasFinal.sistemaventas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DetalleDeProductos {
    @GetMapping("/DetalleDeProductos")
    public String DetalleDeProductos(){
        return "DetalleDeProductos";
    }
}
