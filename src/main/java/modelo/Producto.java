package modelo;

import java.math.BigInteger;

public class Producto {

    private BigInteger id;
    private String nombre;
    private String marca;
    private Double precio;

    public Producto() {
    }

    public Producto(BigInteger id, String nombre, String marca, Double precio) {
        this.id = id;
        this.nombre = nombre;
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
                ", marca=" + marca + 
                ", precio=" + precio + 
                '}';
    }
    
}
