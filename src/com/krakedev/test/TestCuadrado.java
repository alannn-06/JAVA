package com.krakedev.test;

import com.krakedev.Cuadrado;

public class TestCuadrado {

    public static void main(String[] args) {

        Cuadrado c1 = new Cuadrado(4);
        Cuadrado c2 = new Cuadrado(3);
        Cuadrado c3 = new Cuadrado(5.5);

        double area1 = c1.calcularArea();
        double perimetro1 = c1.calcularPerimetro();

        double area2 = c2.calcularArea();
        double perimetro2 = c2.calcularPerimetro();

        double area3 = c3.calcularArea();
        double perimetro3 = c3.calcularPerimetro();

        System.out.println("Cuadrado 1 Área: " + area1 + " - Perímetro: " + perimetro1);
        System.out.println("Cuadrado 2 Área: " + area2 + " - Perímetro: " + perimetro2);
        System.out.println("Cuadrado 3 Área: " + area3 + " - Perímetro: " + perimetro3);
    }

}