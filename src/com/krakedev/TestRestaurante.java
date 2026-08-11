package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		
		Restaurante rest1;
		rest1 = new Restaurante ();
		
		System.out.println("===========Restaurante 1 : Creado===========");
		System.out.println("Nombre: " + rest1.nombre);
		System.out.println("Direccion: " + rest1.direccion);
		System.out.println("Calificacion: " + rest1.calificacion);
		
		
		System.out.println("===========Restaurante 1 : Valores Asignados===========");
		rest1.nombre = "Los pollos de la J";
		rest1.direccion = "El troje";
		rest1.calificacion = 9.2;
		System.out.println("Nombre: " + rest1.nombre);
		System.out.println("Direccion: " + rest1.direccion);
		System.out.println("Calificacion: " + rest1.calificacion);
		
		System.out.println("===========Restaurante 2 : Creado===========");
		Restaurante rest2 = new Restaurante();
		System.out.println("Nombre: " + rest2.nombre);
		System.out.println("Direccion: " + rest2.direccion);
		System.out.println("Calificacion: " + rest2.calificacion);
		
		System.out.println("===========Restaurante 2 : Valores Asignados===========");
		rest2.nombre = "El Pepazo";
		rest2.direccion = "Caupicho";
		rest2.calificacion = 7.4;
		System.out.println("Nombre: " + rest2.nombre);
		System.out.println("Direccion: " + rest2.direccion);
		System.out.println("Calificacion: " + rest2.calificacion);
	}
}
