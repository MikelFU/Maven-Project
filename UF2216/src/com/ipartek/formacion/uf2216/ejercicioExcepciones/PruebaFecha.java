package com.ipartek.formacion.uf2216.ejercicioExcepciones;

public class PruebaFecha {

	public static final int MAX_FECHAS = 100;

	public static int random(int min, int max) {
		return (int) (Math.random() * (max - min + 1)) + min;
	}

	public static void main(String[] args) {
		for (int i = 0; i < MAX_FECHAS; i++) {
			try {
				Fecha f = new Fecha(random(1, 2019), random(1, Fecha.MESES_ANO), random(1, 31));
				System.out.println("fecha correcta : " + f.toString());
			} catch (Exception e) {
				System.out.println("Exception : " + e.getMessage());
			}
		}
	}
}
