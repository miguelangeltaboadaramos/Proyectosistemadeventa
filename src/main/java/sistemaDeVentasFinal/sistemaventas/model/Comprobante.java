package sistemaDeVentasFinal.sistemaventas.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "comprobantes")
public class Comprobante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcomprobante;
    private Double total;
    private Date fechaini;

    public Date getFechaini() {
        return fechaini;
    }

    public void setFechaini(Date fechaini) {
        this.fechaini = fechaini;
    }

    @ManyToOne
    @JoinColumn(name = "idventa")
    private Venta venta;

    public Integer getIdcomprobante() {
        return idcomprobante;
    }

    public void setIdcomprobante(Integer idcomprobante) {
        this.idcomprobante = idcomprobante;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

}
