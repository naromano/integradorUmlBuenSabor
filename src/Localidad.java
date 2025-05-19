public class Localidad {
    private String nombre;
    private Provincia provicia;

    public Localidad(String nombre, Provincia provicia) {
        this.nombre = nombre;
        this.provicia = provicia;
    }

    @Override
    public String toString() {
        return "Localidad{" +
                "nombre='" + nombre + '\'' +
                ", provicia=" + provicia +
                '}';
    }
}
