import java.time.LocalDate;

public class Factura {
    private LocalDate fechaFacturacion;
    private Integer mpPaymentID;
    private Integer mpMerchantOrderID;
    private String mpPreferenceID;
    private String mpPaymentType;
    private FormaPago formaPago;
    private Double totalVenta;

    public Factura(LocalDate fechaFacturacion, Double totalVenta, FormaPago formaPago, Integer mpMerchantOrderID, Integer mpPaymentID, String mpPreferenceID, String mpPaymentType) {
        this.fechaFacturacion = fechaFacturacion;
        this.totalVenta = totalVenta;
        this.formaPago = formaPago;
        this.mpMerchantOrderID = mpMerchantOrderID;
        this.mpPaymentID = mpPaymentID;
        this.mpPreferenceID = mpPreferenceID;
        this.mpPaymentType = mpPaymentType;
    }

    public LocalDate getFechaFacturacion() {
        return fechaFacturacion;
    }

    public void setFechaFacturacion(LocalDate fechaFacturacion) {
        this.fechaFacturacion = fechaFacturacion;
    }

    public Integer getMpPaymentID() {
        return mpPaymentID;
    }

    public void setMpPaymentID(Integer mpPaymentID) {
        this.mpPaymentID = mpPaymentID;
    }

    public Integer getMpMerchantOrderID() {
        return mpMerchantOrderID;
    }

    public void setMpMerchantOrderID(Integer mpMerchantOrderID) {
        this.mpMerchantOrderID = mpMerchantOrderID;
    }

    public String getMpPreferenceID() {
        return mpPreferenceID;
    }

    public void setMpPreferenceID(String mpPreferenceID) {
        this.mpPreferenceID = mpPreferenceID;
    }

    public String getMpPaymentType() {
        return mpPaymentType;
    }

    public void setMpPaymentType(String mpPaymentType) {
        this.mpPaymentType = mpPaymentType;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public Double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(Double totalVenta) {
        this.totalVenta = totalVenta;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "fechaFacturacion=" + fechaFacturacion +
                ", mpPaymentID=" + mpPaymentID +
                ", mpMerchantOrderID=" + mpMerchantOrderID +
                ", mpPreferenceID='" + mpPreferenceID + '\'' +
                ", mpPaymentType='" + mpPaymentType + '\'' +
                ", formaPago=" + formaPago +
                ", totalVenta=" + totalVenta +
                '}';
    }
}
