import java.util.ArrayList;
import java.util.List;

public class ArticuloInsumo extends Articulo{
    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private boolean esParaElaborar;

    public ArticuloInsumo(String denominacion, Double precioVenta, Double precioCompra, Integer stockActual, Integer stockMaximo, boolean esParaElaborar) {
        super(denominacion, precioVenta);
        this.precioCompra = precioCompra;
        this.stockActual = stockActual;
        this.stockMaximo = stockMaximo;
        this.esParaElaborar = esParaElaborar;
    }

    public ArticuloInsumo(String denominacion, Double precioVenta, UnidadMedida unidadMedida, Double precioCompra, Integer stockActual, Integer stockMaximo, boolean esParaElaborar) {
        super(denominacion, precioVenta, unidadMedida);
        this.precioCompra = precioCompra;
        this.stockActual = stockActual;
        this.stockMaximo = stockMaximo;
        this.esParaElaborar = esParaElaborar;
    }

    public Double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Integer getStockActual() {
        return stockActual;
    }

    public void setStockActual(Integer stockActual) {
        this.stockActual = stockActual;
    }

    public Integer getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(Integer stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    public boolean isEsParaElaborar() {
        return esParaElaborar;
    }

    public void setEsParaElaborar(boolean esParaElaborar) {
        this.esParaElaborar = esParaElaborar;
    }


    @Override
    public String toString() {
        return "ArticuloInsumo{" +
                "precioCompra=" + precioCompra +
                ", stockActual=" + stockActual +
                ", stockMaximo=" + stockMaximo +
                ", esParaElaborar=" + esParaElaborar +
                '}';
    }
}
