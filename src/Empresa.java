import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Empresa {
    private String nombre;
    private String razonSocial;
    private int cuit;
    private String logo;
    private Set<Sucursal> sucursals= new HashSet<>();

    public Empresa() {
    }


    public Empresa(String nombre, String razonSocial, int cuit) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cuit = cuit;
    }



    public void addscursales(Sucursal sucursal){
        this.sucursals.add(sucursal);
    }
    public void mostrar(){
        for(Sucursal s: sucursals){
            System.out.println(s);
        }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Set<Sucursal> getSucursals() {
        return sucursals;
    }

    public void setSucursals(Set<Sucursal> sucursals) {
        this.sucursals = sucursals;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", cuit=" + cuit +
                ", logo='" + logo + '\'' +
                ", sucursals=" + sucursals +
                '}';
    }
}
