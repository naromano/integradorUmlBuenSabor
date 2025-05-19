import java.util.ArrayList;
import java.util.List;

public class Domicilio {
    private String calle;
    private Integer numero;
    private Integer cp;
    private Localidad localidad;
    public Domicilio(String calle, Integer numero, Integer cp, Localidad localidad) {
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
        this.localidad = localidad;
    }


    @Override
    public String toString() {
        return "Domicilio{" +
                "calle='" + calle + '\'' +
                ", numero=" + numero +
                ", cp=" + cp +
                ", localidad=" + localidad +
                '}';
    }

}
