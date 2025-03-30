package sistemaDeVentasFinal.sistemaventas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "facturas")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idfactura;

    @ManyToOne
    @JoinColumn(name = "idcomprobante")
    private Comprobante comprobante;

    private String ruccliente;

    public Integer getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(Integer idfactura) {
        this.idfactura = idfactura;
    }

    public Comprobante getComprobante() {
        return comprobante;
    }

    public void setComprobante(Comprobante comprobante) {
        this.comprobante = comprobante;
    }

    public String getRuccliente() {
        return ruccliente;
    }

    public void setRuccliente(String ruccliente) {
        this.ruccliente = ruccliente;
    }
}
