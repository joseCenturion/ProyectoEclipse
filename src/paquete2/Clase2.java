package paquete2;

import java.util.Scanner;

public class Clase2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String nombre;
		System.out.println("¿Cual es tu nombre?");
		nombre=teclado.nextLine();
		System.out.println("Hola, "+nombre);

	}

}
