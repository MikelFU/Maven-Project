package com.ipartek.formacion.uf2216.ejemplos.poo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploConsola {	
	public static void main(String[] args) throws IOException {
		System.out.print("Dime tu nombre: ");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String nombre = br.readLine();

		System.out.println("Hola " + nombre);

		int numero = 0;
		boolean hayError;
		do {
			hayError = false;
			try {
				System.out.println("Dime un numero: ");

				String sNumero = br.readLine();
				numero = Integer.parseInt(sNumero);
			} catch (NumberFormatException e) {
				System.out.println("No es un número");
				hayError = true;
			}
		} while (hayError);
//		br.close();
		System.out.println(numero * 2);
		
	}

}
