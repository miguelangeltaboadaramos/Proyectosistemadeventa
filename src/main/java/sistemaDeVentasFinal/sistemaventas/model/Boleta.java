package sistemaDeVentasFinal.sistemaventas.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "boletas")
public class Boleta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idboleta;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date fecha;
    private Double total;

    @ManyToOne
    @JoinColumn(name = "idestado")
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "idcliente")
    private Cliente cliente;

    public Integer getIdboleta() {
        return idboleta;
    }

    public void setIdboleta(Integer idboleta) {
        this.idboleta = idboleta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

