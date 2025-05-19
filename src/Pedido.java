import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Pedido {
    private LocalTime horaEstimadaFinalizacion;
    private Double total;
    private Double totalcosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate FechaPedido;
    private Factura factura;
    private Sucursal sucursal;
    private Domicilio domicilio;
    private Set<DetallePedido>detallePedidos=new HashSet<>();

    public Pedido(LocalTime horaEstimadaFinalizacion, Double total, Double totalcosto, Estado estado, TipoEnvio tipoEnvio, FormaPago formaPago, LocalDate fechaPedido, Factura factura) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
        this.total = total;
        this.totalcosto = totalcosto;
        this.estado = estado;
        this.tipoEnvio = tipoEnvio;
        this.formaPago = formaPago;
        FechaPedido = fechaPedido;
        this.factura = factura;
    }

    public LocalTime getHoraEstimadaFinalizacion() {
        return horaEstimadaFinalizacion;
    }

    public void setHoraEstimadaFinalizacion(LocalTime horaEstimadaFinalizacion) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getTotalcosto() {
        return totalcosto;
    }

    public void setTotalcosto(Double totalcosto) {
        this.totalcosto = totalcosto;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public TipoEnvio getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(TipoEnvio tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public LocalDate getFechaPedido() {
        return FechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        FechaPedido = fechaPedido;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    public void addDetallePedido(DetallePedido detallePedido){
        this.detallePedidos.add(detallePedido);
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Set<DetallePedido> getDetallePedidos() {
        return detallePedidos;
    }

    public void setDetallePedidos(Set<DetallePedido> detallePedidos) {
        this.detallePedidos = detallePedidos;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "horaEstimadaFinalizacion=" + horaEstimadaFinalizacion +
                ", total=" + total +
                ", totalcosto=" + totalcosto +
                ", estado=" + estado +
                ", tipoEnvio=" + tipoEnvio +
                ", formaPago=" + formaPago +
                ", FechaPedido=" + FechaPedido +
                ", factura=" + factura +
                '}';
    }
}
