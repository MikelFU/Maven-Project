package com.ipartek.formacion.uf2216.ejercicio3;

public class Ave {
	
	enum Sexo {
		HEMBRA, MACHO;
	}

	public Sexo sexo;
	public int edad;
	public int avesCreadas = 0;
	public DatosPersonales nombres;

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

	public Sexo getSexo() {
		System.out.println(sexo);
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

	public int getAvesCreadas() {
		return avesCreadas;
	}

	public void setAvesCreadas(int avesCreadas) {
		this.avesCreadas = avesCreadas;
	}

	public DatosPersonales getNombres() {
		return nombres;
	}

	public void setNombres(DatosPersonales nombres) {
		this.nombres = nombres;
	}
	
	
	
}
