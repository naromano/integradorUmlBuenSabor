import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Articulo  {
    protected String denominacion;
    protected Double precioVenta;
    private Set<Imagen> imagens= new HashSet<>();
    private UnidadMedida unidadMedida;
    public void addImagen(Imagen imagen){
        this.imagens.add(imagen);
    }

    public Articulo(String denominacion, Double precioVenta) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
    }

    public Articulo(UnidadMedida unidadMedida,Double precioVenta, String denominacion) {
        this.unidadMedida = unidadMedida;
        this.precioVenta = precioVenta;
        this.denominacion = denominacion;
    }

    public Articulo(String denominacion, Double precioVenta, UnidadMedida unidadMedida) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
        this.unidadMedida = unidadMedida;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "denominacion='" + denominacion + '\'' +
                ", precioVenta=" + precioVenta +
                ", imagens=" + imagens +
                '}';
    }
}

