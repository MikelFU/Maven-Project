package com.ipartek.formacion.uf2216.ejercicio2;

import com.ipartek.formacion.uf2216.ejercicio2.Loro.Region;

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

	public static void main(String[] args) {
		Piolin piolin = new Piolin(Sexo.HEMBRA, 10, 1);
		Loro loro = new Loro(Sexo.MACHO, 12, Region.ESTE, "Azul");

		System.out.println("Metodo quienSoy : \n");
		piolin.quienSoy();
		loro.quienSoy();
		
		
		System.out.print("Tamaño del loro : ");
		piolin.Altura();
		
		System.out.print("Region : ");
		loro.deDondeEres();
		
		piolin.setTamano(25);
		System.out.print("Nuevo tamaño del loro : ");
		piolin.Altura();
		
		System.out.print("Nueva Region : ");
		loro.setRegion(Region.SUR);
		loro.getRegion();
		
		System.out.print("Numero de aves creadas: ");
		piolin.numeroAvesCreadas();

	}

}
