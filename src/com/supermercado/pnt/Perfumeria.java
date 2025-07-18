package com.supermercado.pnt;

public class Perfumeria extends Producto {

    //atributos
    private int contenido;

    //Constructor
    public Perfumeria(String nombre, int contenido, double precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    //metodos
    @Override
    public String toString() {
        return String.format("Nombre: %s /// Contenido: %dml /// Precio: $%.0f", getNombre(), contenido, getPrecio());
    }
}
