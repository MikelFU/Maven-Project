package com.ipartek.formacion.uf2216.ejemplos.poo;

public class EjemploClasesAbstract {
	public static void main(String[] args) {
		Number[] numeros = new Number[2];
		
		numeros[0] = 5;		// new Integer(5);
		numeros[1] = 7.2; 	// new Double(7.2);
		
		for (Number numero: numeros) {
			System.out.println(numero.doubleValue())
			;
		}
	}
}
