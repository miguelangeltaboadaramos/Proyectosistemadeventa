package sistemaDeVentasFinal.sistemaventas.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "facturas")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idfactura;
    private String ruc;
    private Date fecha;


    @ManyToOne
    @JoinColumn(name = "idestado")
    private Estado estado;

    public Integer getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(Integer idfactura) {
        this.idfactura = idfactura;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
