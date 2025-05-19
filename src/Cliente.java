import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cliente {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimineto;
    private Set<Pedido> pedidos=new HashSet<>();
    private Set<Domicilio> domicilios=new HashSet<>();
    private Imagen imagen;
    private Usuario usuario;

    public Cliente(String nombre, String apellido, String telefono, String email, LocalDate fechaNacimineto, Imagen imagen, Usuario usuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimineto = fechaNacimineto;
        this.imagen = imagen;
        this.usuario = usuario;
    }

    public Cliente(String nombre, String apellido, String telefono, String email, LocalDate fechaNacimineto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimineto = fechaNacimineto;
    }
    public void addPedido(Pedido pedido){
        this.pedidos.add(pedido);
    }
    public void addDomicilio(Domicilio domicilio){
        this.domicilios.add(domicilio);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNacimineto() {
        return fechaNacimineto;
    }

    public void setFechaNacimineto(LocalDate fechaNacimineto) {
        this.fechaNacimineto = fechaNacimineto;
    }

    public Set<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Set<Domicilio> getDomicilios() {
        return domicilios;
    }

    public void setDomicilios(Set<Domicilio> domicilios) {
        this.domicilios = domicilios;
    }

    public Imagen getImagen() {
        return imagen;
    }

    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", fechaNacimineto=" + fechaNacimineto +
                ", pedidos=" + pedidos +
                ", imagen=" + imagen +
                ", usuario=" + usuario +
                '}';
    }
}
