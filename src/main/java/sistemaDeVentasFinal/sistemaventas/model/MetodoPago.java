package sistemaDeVentasFinal.sistemaventas.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "metodospago")
public class MetodoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idmetodopago;
    private String nombre;

    @OneToMany(mappedBy = "metodoPago")
    private List<Venta> ventas;

    public Integer getIdmetodopago() {
        return idmetodopago;
    }

    public void setIdmetodopago(Integer idmetodopago) {
        this.idmetodopago = idmetodopago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }
}
