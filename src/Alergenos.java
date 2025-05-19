public class Alergenos {
    private String denominacion;
    private String imagen;

    public Alergenos(String denominacion, String imagen) {
        this.denominacion = denominacion;
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Alergenos{" +
                "denominacion='" + denominacion + '\'' +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}
