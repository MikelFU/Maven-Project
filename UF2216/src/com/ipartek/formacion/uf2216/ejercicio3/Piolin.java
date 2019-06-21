package com.ipartek.formacion.uf2216.ejercicio3;

public class Piolin extends Canario {

	public Sexo sexo;
	public int edad;
	public int numeroPeliculas;

	public Piolin() {
		super();
	}

	public Piolin(Sexo sexo, int edad, int numeroPeliculas) {
		super();
		this.sexo = sexo;
		this.edad = edad;
		this.numeroPeliculas = numeroPeliculas;
	}

	public static String cantar() {
		System.out.println("Pio-pio soy un Piolín");
		return null;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNumeroPeliculas() {
		return numeroPeliculas;
	}

	public void setNumeroPeliculas(int numeroPeliculas) {
		this.numeroPeliculas = numeroPeliculas;
	}

	public static void main(String[] args) {

		Piolin[] arrayPiolines = new Piolin[3];

		arrayPiolines[0].setEdad(12);
		
		//Loro loro = new Loro();
		System.out.println("Loro cantando : ");
		Loro.cantar();
	}

}
