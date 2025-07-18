package com.supermercado.pnt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;





public class Main {
    public static void main(String[] args) {
        List<Producto> productos = Arrays.asList(
                new Bebida("Coca-Cola Zero", 1.5, 20),
                new Bebida("Coca-Cola", 1.5,  18),
                new Perfumeria("Shampoo Sedal", 500, 19),
                new Fruta("Frutillas", 64, "kilo"));


        for (Producto p : productos) {
            System.out.println(p);
        }


        System.out.println("=============================");


        Producto masBarato = Collections.min(productos);
        Producto masCaro = Collections.max(productos);

        System.out.println("Producto más caro: " + masCaro.getNombre());
        System.out.println("Producto más barato: " + masBarato.getNombre());

    }
}
