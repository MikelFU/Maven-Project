package com.ipartek.formacion.uf2216.ejercicio3;

public class DatosPersonales {

	public String nombreAve;
	public String nombreDueño;

	public DatosPersonales(String nombreAve, String nombreDueño) {
		super();
		this.nombreAve = nombreAve;
		this.nombreDueño = nombreDueño;
	}

	public DatosPersonales() {
		super();
	}

	public String getNombreAve() {
		return nombreAve;
	}

	public void setNombreAve(String nombreAve) {
		this.nombreAve = nombreAve;
	}

	public String getNombreDueño() {
		return nombreDueño;
	}

	public void setNombreDueño(String nombreDueño) {
		this.nombreDueño = nombreDueño;
	}

}
