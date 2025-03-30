package sistemaDeVentasFinal.sistemaventas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "metodospago")
public class MetodoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idmetodopago;
    private String nombre;

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
}
