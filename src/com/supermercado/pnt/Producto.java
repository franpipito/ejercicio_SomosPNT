package com.supermercado.pnt;

public abstract class Producto implements Comparable<Producto> {

    //atributos - para encapsular los datos
    private String nombre;
    private double precio;

    //constructor - para inicializar los datos
    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    //propiedades - para acceder fuera de la clase
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    //metodos

    //@ Es buena practica para no tener bugs
    @Override
    //compara el precio de un producto con otro
    public int compareTo(Producto p) {
        return Double.compare(this.precio, p.precio);
    }

    @Override
    //cada clase implementa su Tostring()
    public abstract String toString();
}
