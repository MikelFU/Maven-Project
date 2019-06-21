package com.ipartek.formacion.uf2216.ejemplos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Lenguaje {

	public static void main(String[] args) {
		System.out.println("Hola");

		// TIPOS PRIMITIVOS

		// ENTEROS CON SIGNO
		// byte 8 -> Byte
		// short 16 -> Short
		// int 32 -> Integer
		// long 64 -> Long
		// 2^(n-1) a 2^(n-1) -1 (complemento a dos)

		// COMA FLOTANTE
		// float 32 -> Float
		// double 64 -> Double

		// boolean 16 true o false -> Boolean
		// char 16 Unicode'a' -> Character

		// Resto de tipos

		String s1 = new String("javi");
		String s2 = new String("javi");

		System.out.println(s1 == s2);
		System.out.println("¿Son la misma? " + (s1 == s2));
		System.out.println("¿Son iguales? " + (s1.equals(s2)));

		int tamano = 3;
		int[] arr = new int[tamano];

		arr[0] = 5;
		arr[1] = 123;
		arr[2] = 2;

		System.out.println(arr.length);
		System.out.println(arr[1]);

		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Uno");
		lista.add("Dos");
		System.out.println(lista.get(0));

		// Operadores

		// Aritmeticos
		// +, -, /, * % (resto de division entera)

		// A nivel de bits
		// &&, ||, ^ (XOR),
		// >>, <<, >>>

		System.out.println("--------");
		System.out.println(5 & 3);
		System.out.println(5 | 3);
		System.out.println(5 ^ 3);
		System.out.println();

		System.out.println(5 >> 1);
		System.out.println(-5 >> 1);
		System.out.println(10 << 1);
		System.out.println(10 >>> 1);
		System.out.println(-5 >>> 1);

		// Comparacion
		// <, >, <=, >=, ==, !=

		// Logicos
		// (&, | normales) (&&, || cortocircuito), !

		int x = 3;
		System.out.println((1 <= x && x <= 10));

		// +=. -=, *=, /= ...
		x = x + 2;
		x += 2;

		// =
//		int a, b, c;
//		a = b = c = 10;

		// ++, --

		System.out.println(x);
		System.out.println(x++);
		System.out.println(x);
		System.out.println(++x);
		System.out.println(x);

		// ?: --------> boolean ? Object: object

		boolean bool = true;
		System.out.println(bool ? "VERDADERO" : "FALSO");
		int x1 = 5, x2 = 10;
		int res;
		res = x1 > x2 ? x1 : x2;
		System.out.println(res);

		// Sentencias de control
		if (x1 > x2) {
			res = x1;
		} else {
			res = x2;
		}
		System.out.println(res);

		// switch soporta enteros y char
		// Java 5 soporta String en switch

		String opcion = "tres";
		switch (opcion) {
		case "uno":
			System.out.println(1);
			break;
		case "dos":
			System.out.println(2);
			break;
		case "tres":
			System.out.println(3);
			break;
		}

		@SuppressWarnings("unused")
		int mes = 5, dias;
		switch (mes) {
		case 2:
			dias = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			dias = 30;
			break;
		default:
			dias = 31;
		}

		x = 1;
		while (x <= 10) {
			System.out.println(x++);
		}
		x = 1;
		do {
			System.out.println(x++);
		} while (x <= 10);

		for (x = 1; x <= 10; x++) {
			System.out.println(x);
		}
		
		/*for(;;) {
			System.out.println("INFINITO");
		}*/
		
		
		//Java5
		int[] enteros = {5, 2, 5, 78, 9, 7, 5, 3};
		
		for (int entero: enteros) {
			System.out.println(entero);
		}
		
		for (int i = 0; i < enteros.length; i++) {
			System.out.println(enteros[i]);
		}
		
		//Cuidado con los String
		
		String fichero = "C:\\nuevos\\trabajos";
		
		System.out.println(fichero);
		
		//Diccionario
		HashMap<String, String> diccionario = new HashMap<String, String>();
		
		diccionario.put("casa", "home");
		diccionario.put("coche", "car");
		System.out.println(diccionario.get("coche"));
		
		for (String clave : diccionario.keySet()) {
			System.out.println(clave);
		}
		
		for (String valor : diccionario.values()) {
			System.out.println(valor);
		}
		
		String linea;
		for (Entry<String, String> par: diccionario.entrySet()) {
//			System.out.println(par.getKey());
//			System.out.println(par.getValue());
			linea = String.format("(%s,%s)", par.getKey(), par.getValue());
			System.out.println(linea);
		}
		
		//Conversiones
		
		String sNumero = "5";
		int iNumero = Integer.parseInt(sNumero);
		System.out.println(iNumero);
		
		String texto = String.valueOf(iNumero);
		System.out.println(texto);
		
		java.util.Date fecha = new java.util.Date();
		texto = fecha.toString();
		System.out.println(texto);
	}
}
