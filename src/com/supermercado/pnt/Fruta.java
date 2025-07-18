package com.supermercado.pnt;

public class Fruta extends Producto {

    //atributos
    private String unidadVenta;

    //constructor
    public Fruta(String nombre, double precio, String unidadVenta) {
        super(nombre, precio);
        this.unidadVenta = unidadVenta;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s /// Precio: $%.0f /// Unidad de venta: %s", getNombre(), getPrecio()
        , unidadVenta);
    }
}
