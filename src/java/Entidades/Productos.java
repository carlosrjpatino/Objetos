package Entidades;

public class Productos {

    private String nombre;
    private String color;
    private double precio;
    private String modelo;
    private String marca;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Productos(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public Productos(String nombre, String color, double precio) {
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;
        
    }

//    @Override
//    public String toString() {
//    return "Productos{" + "nombre=" + nombre + ", color=" + color + ", precio=" + precio    };
    @Override
    public String toString() {
        return "Productos{" + "nombre=" + nombre + ", color=" + color + ", precio=" + precio + '}';
    }

}
