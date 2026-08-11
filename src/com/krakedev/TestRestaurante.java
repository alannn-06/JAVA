package com.krakedev;

public class TestRestaurante {

    public static void main(String[] args) {

        Restaurante rest1;
        rest1 = new Restaurante();

        System.out.println("===========Restaurante 1 : Creado===========");
        System.out.println("Nombre: " + rest1.getNombre());
        System.out.println("Direccion: " + rest1.getDireccion());
        System.out.println("Calificacion: " + rest1.getCalificacion());

        System.out.println("===========Restaurante 1 : Valores Asignados===========");
        rest1.setNombre("Los pollos de la J");
        rest1.setDireccion("El troje");
        rest1.setCalificacion(9.2);
        System.out.println("Nombre: " + rest1.getNombre());
        System.out.println("Direccion: " + rest1.getDireccion());
        System.out.println("Calificacion: " + rest1.getCalificacion());

        System.out.println("===========Restaurante 2 : Creado===========");
        Restaurante rest2 = new Restaurante();
        System.out.println("Nombre: " + rest2.getNombre());
        System.out.println("Direccion: " + rest2.getDireccion());
        System.out.println("Calificacion: " + rest2.getCalificacion());

        System.out.println("===========Restaurante 2 : Valores Asignados===========");
        rest2.setNombre("El Pepazo");
        rest2.setDireccion("Caupicho");
        rest2.setCalificacion(7.4);
        System.out.println("Nombre: " + rest2.getNombre());
        System.out.println("Direccion: " + rest2.getDireccion());
        System.out.println("Calificacion: " + rest2.getCalificacion());
    }
}