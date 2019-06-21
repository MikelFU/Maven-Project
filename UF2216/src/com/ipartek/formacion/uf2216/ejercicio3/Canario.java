package com.ipartek.formacion.uf2216.ejercicio3;

public class Canario extends Ave{

	public Sexo sexo;
	public int edad;
	public double tamano;

	public Canario() {
		super();
	}

	public Canario(Sexo sexo, int edad) {
		super();
		this.sexo = sexo;
		this.edad = edad;
	}

	public Canario(Sexo sexo, int edad, double tamano) {
		super();
		this.sexo = sexo;
		this.edad = edad;
		this.tamano = tamano;
	}

	public double Altura() {
		if (tamano > 30) {
			System.out.println("Alto");
		} else if (30 > tamano && tamano > 15) {
			System.out.println("Medio");
		} else {
			System.out.println("Bajo");
		}
		return tamano;
	}

	public double getTamano() {
		return tamano;
	}

	public void setTamano(double tamano) {
		this.tamano = tamano;
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
	
	
	
}
