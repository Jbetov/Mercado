package modelo;

import java.math.BigInteger;

public class Producto {

    private BigInteger id;
    private String nombre;
    private String categoria;
    private String marca;
    private Double precio;

    public Producto() {
    }

    public Producto(BigInteger id, String nombre, String categoria,String marca, Double precio) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.marca = marca;
        this.precio = precio;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + 
                "id=" + id + 
                ", nombre=" + nombre +
                ", categoria=" + categoria +
                ", marca=" + marca + 
                ", precio=" + precio + 
                '}';
    }
    
}
