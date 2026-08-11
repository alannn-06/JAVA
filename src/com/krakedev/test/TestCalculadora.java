package com.krakedev.test;

import com.krakedev.Calculadora;

public class TestCalculadora {

    public static void main(String[] args) {
        Calculadora c1 = new Calculadora();

        int r1;
        r1 = c1.sumar(4, 2);
        System.out.println("Resultado Suma: " + r1);

        int r2;
        r2 = c1.restar(4, 2);
        System.out.println("Resultado Resta: " + r2);

        double resultadoMultiplicar;
        resultadoMultiplicar = c1.multiplicar(10.0, 5.0);
        System.out.println("Resultado Multiplicación: " + resultadoMultiplicar);

        double resultadoDividir;
        resultadoDividir = c1.dividir(10.0, 2.0);
        System.out.println("Resultado División: " + resultadoDividir);

        double resultadoPromedio;
        resultadoPromedio = c1.promediar(10.0, 8.0, 9.0);
        System.out.println("Resultado Promedio: " + resultadoPromedio);

        c1.mostrarResultado();
    }

}