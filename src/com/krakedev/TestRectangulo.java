package com.krakedev;

public class TestRectangulo {

    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo(4, 5);

        int resultadoArea = r1.calcularArea();
        double perimetro1 = r1.calcularPerimetro();

        System.out.println("Resultado area r1: " + resultadoArea);
        System.out.println("Resultado perimetro r1: " + perimetro1);

        Rectangulo r2 = new Rectangulo(2, 8);

        int resultadoArea2 = r2.calcularArea();
        double perimetro2 = r2.calcularPerimetro();

        System.out.println("Resultado rectangulo 2 area: " + resultadoArea2);
        System.out.println("Resultado rectangulo 2 perimetro: " + perimetro2);
    }

}