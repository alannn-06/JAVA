package com.krakedev.test;

import com.krakedev.Restaurante;

public class TestRestaurante {

    public static void main(String[] args) {

        System.out.println("===========Restaurante 1===========");
        Restaurante rest1 = new Restaurante("Los pollos de la J", "El troje", 9.2);
        System.out.println("Nombre: " + rest1.getNombre());
        System.out.println("Direccion: " + rest1.getDireccion());
        System.out.println("Calificacion: " + rest1.getCalificacion());

        System.out.println("===========Restaurante 2===========");
        Restaurante rest2 = new Restaurante("El Pepazo", "Caupicho", 7.4);
        System.out.println("Nombre: " + rest2.getNombre());
        System.out.println("Direccion: " + rest2.getDireccion());
        System.out.println("Calificacion: " + rest2.getCalificacion());
    }

}