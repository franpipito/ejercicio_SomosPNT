package com.supermercado.pnt;

public class Producto implements Comparable<Producto> {

    //atributos - para encapsular los datos
    private String nombre;
    private String unidad;
    private int cantidad;
    private double precio;

    //constructor - para inicializar los datos
    public Producto(String nombre,String unidad,int cantidad,double precio){
        this.nombre = nombre;
        this.unidad = unidad;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    //propiedades - para acceder fuera de la clase

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    //metodos

    //@ Es buena practica para no tener bugs
    @Override
    //compara el precio de un producto con otro
    public int compareTo(Producto o) {
        return Double.compare(this.precio, o.precio);
    }

    @Override
    //muestra los datos de producto como string
    public String toString() {
        return String.format("Nombre: %s /// %s: %d /// Precio: $%.0f",nombre, unidad, cantidad, precio);
    }
}
