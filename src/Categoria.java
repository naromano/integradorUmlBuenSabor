import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Categoria {
    private String denominacion;
    private Set<Categoria> subCategorias=new HashSet<>();
    private Set<Articulo > articulos=new HashSet<>();
    private Categoria categoriaPadre;

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Set<Categoria> getSubCategorias() {
        return subCategorias;
    }

    public void setSubCategorias(Set<Categoria> subCategorias) {
        this.subCategorias = subCategorias;
    }

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Set<Articulo> articulos) {
        this.articulos = articulos;
    }

    public Categoria getCategoriaPadre() {
        return categoriaPadre;
    }

    public void setCategoriaPadre(Categoria categoriaPadre) {
        this.categoriaPadre = categoriaPadre;
    }

    public void addSubcategoria(Categoria scategoria){
        this.subCategorias.add(scategoria);
        scategoria.setCategoriaPadre(this);
    }
    public void addArticulo(Articulo articulo){
        this.articulos.add(articulo);
    }

    public Categoria(String denominacion) {
        this.denominacion = denominacion;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "denominacion='" + denominacion + '\'' +
                ", subCategorias=" + subCategorias +
                ", articulos=" + articulos +
                ", categoriaPadre=" + categoriaPadre +
                '}';
    }
}
