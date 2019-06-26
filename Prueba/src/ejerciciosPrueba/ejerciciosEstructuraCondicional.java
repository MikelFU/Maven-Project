package ejerciciosPrueba;

import java.util.Scanner;

public class ejerciciosEstructuraCondicional {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un numero");
		int numero = teclado.nextInt();
		teclado.nextLine();
		if (numero % 2 == 0) {
			System.out.println("El número " + numero + " es par");
		} else {
			System.out.println("El número " + numero + " es impar");
		}

		System.out.println("------------------------------");

		System.out.println("Introduzca un numero");
		int multiplo10 = teclado.nextInt();
		teclado.nextLine();

		if (multiplo10 % 10 == 0) {
			System.out.println("El número " + multiplo10 + " es multiplo de 10");
		} else {
			System.out.println("El número " + multiplo10 + " NO es multiplo de 10");
		}
		teclado.close();
	}

}
