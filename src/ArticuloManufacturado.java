import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArticuloManufacturado extends Articulo{
    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;
    private Set<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles=new HashSet<>();


    public ArticuloManufacturado(String denominacion, Double precioVenta, String descripcion, Integer tiempoEstimadoMinutos, String preparacion) {
        super(denominacion, precioVenta);
        this.descripcion = descripcion;
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
        this.preparacion = preparacion;
    }

    public ArticuloManufacturado(String denominacion, Double precioVenta, UnidadMedida unidadMedida, String descripcion, Integer tiempoEstimadoMinutos, String preparacion) {
        super(denominacion, precioVenta, unidadMedida);
        this.descripcion = descripcion;
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
        this.preparacion = preparacion;
    }

    public void addArticuloDetalle(ArticuloManufacturadoDetalle articuloManufacturadoDetalle){
        this.articuloManufacturadoDetalles.add(articuloManufacturadoDetalle);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getTiempoEstimadoMinutos() {
        return tiempoEstimadoMinutos;
    }

    public void setTiempoEstimadoMinutos(Integer tiempoEstimadoMinutos) {
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public Set<ArticuloManufacturadoDetalle> getArticuloManufacturadoDetalles() {
        return articuloManufacturadoDetalles;
    }

    public void setArticuloManufacturadoDetalles(Set<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles) {
        this.articuloManufacturadoDetalles = articuloManufacturadoDetalles;
    }

    @Override
    public String toString() {
        return "ArticuloManufacturado{" +
                "descripcion='" + descripcion + '\'' +
                ", tiempoEstimadoMinutos=" + tiempoEstimadoMinutos +
                ", preparacion='" + preparacion + '\'' +
                ", articuloManufacturadoDetalles=" + articuloManufacturadoDetalles +
                '}';
    }
}
