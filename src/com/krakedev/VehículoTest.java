package com.krakedev;

public class VehículoTest {

    public static void main(String[] args) {

        Vehiculo v;

        v = new Vehiculo();

        System.out.println("===========Vehículo 1 : Creado===========");
        System.out.println("Año: " + v.getAnio());
        System.out.println("Marca: " + v.getMarca());
        System.out.println("Modelo: " + v.getModelo());

        System.out.println("===========Vehículo 1 : Valores Asignados===========");
        v.setAnio("2012");
        v.setMarca("Chevrolet");
        v.setModelo("Nuevo");
        System.out.println("Año: " + v.getAnio());
        System.out.println("Marca: " + v.getMarca());
        System.out.println("Modelo: " + v.getModelo());

        System.out.println("===========Vehículo 2 : Creado===========");
        Vehiculo v2 = new Vehiculo();
        System.out.println("Año: " + v2.getAnio());
        System.out.println("Marca: " + v2.getMarca());
        System.out.println("Modelo: " + v2.getModelo());

        System.out.println("===========Vehículo 2 : Valores Asignados===========");
        v2.setAnio("2025");
        v2.setMarca("Chevrolet");
        v2.setModelo("De paquete");
        System.out.println("Año: " + v2.getAnio());
        System.out.println("Marca: " + v2.getMarca());
        System.out.println("Modelo: " + v2.getModelo());

    }

}