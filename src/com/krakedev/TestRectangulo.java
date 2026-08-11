package com.krakedev;

public class TestRectangulo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Rectangulo r1 = new Rectangulo();
        r1.setAltura(5);
        r1.setBase(4);

        int resultadoArea;
        resultadoArea = r1.calcularArea();
        double perimetro1 = r1.calcularPerimetro();

        System.out.println("Resultado area r1: " + resultadoArea);
        System.out.println("Resultado perimetro r1: " + perimetro1);

        Rectangulo r2 = new Rectangulo();
        r2.setAltura(8);
        r2.setBase(2);

        int resultadoArea2;
        resultadoArea2 = r2.calcularArea();
        double perimetro2 = r2.calcularPerimetro();

        System.out.println("Resultado rectangulo 2 area: " + resultadoArea2);
        System.out.println("Resultado rectangulo 2 perimetro: " + perimetro2);
    }

}