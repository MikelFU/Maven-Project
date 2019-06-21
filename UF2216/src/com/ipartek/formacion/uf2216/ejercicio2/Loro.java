package com.ipartek.formacion.uf2216.ejercicio2;

public class Loro extends Ave {
	
	enum Region{
		NORTE, SUR, ESTE, OESTE;
	}
	
	public Sexo sexo;
	public int edad;
	public Region region;
	public String color;

	public Loro() {
		super();
	}

	public Loro(Sexo sexo, int edad, Region region, String color) {
		super();
		this.sexo = sexo;
		this.edad = edad;
		this.region = region;
		this.color = color;
	}

	public Region deDondeEres() {
		System.out.println(this.region);
		return region;
	}

	public Region getRegion() {
		System.out.println(this.region);
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}
	
	
	
	
}
