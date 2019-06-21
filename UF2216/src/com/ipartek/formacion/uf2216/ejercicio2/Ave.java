package com.ipartek.formacion.uf2216.ejercicio2;

public class Ave {
	
	enum Sexo {
		HEMBRA, MACHO;
	}

	public Sexo sexo;
	public int edad;
	public int avesCreadas = 0;

	public Ave() {
		super();
	}

	public Ave(Sexo sexo, int edad) {
		super();
		this.sexo = sexo;
		this.edad = edad;
	}

	public int numeroAvesCreadas() {
		System.out.println(avesCreadas);
		return avesCreadas;
	}

	public int crearAve() {
		return avesCreadas++;
	}

	public String quienSoy() {
		return "Sexo: " + sexo + ", edad : " + edad;
	}
	
}
