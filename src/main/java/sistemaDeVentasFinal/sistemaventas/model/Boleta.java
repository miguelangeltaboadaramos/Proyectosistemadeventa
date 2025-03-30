package sistemaDeVentasFinal.sistemaventas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "boletas")
public class Boleta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idboleta;

    @ManyToOne
    @JoinColumn(name = "idcomprobante")
    private Comprobante comprobante;

    private String dnicliente;

    public Integer getIdboleta() {
        return idboleta;
    }

    public void setIdboleta(Integer idboleta) {
        this.idboleta = idboleta;
    }

    public Comprobante getComprobante() {
        return comprobante;
    }

    public void setComprobante(Comprobante comprobante) {
        this.comprobante = comprobante;
    }

    public String getDnicliente() {
        return dnicliente;
    }

    public void setDnicliente(String dnicliente) {
        this.dnicliente = dnicliente;
    }
}

