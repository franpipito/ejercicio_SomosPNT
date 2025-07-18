package com.supermercado.pnt;

public class Bebida extends Producto{
    //atributos
    private double litros;

    //constructor
    public Bebida(String nombre, double litros, double precio){
        super(nombre, precio);
        this.litros = litros;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s /// " +
                        "Litros: %.1f /// Precio: $%.0f",
                getNombre(),litros, getPrecio());
    }
}
