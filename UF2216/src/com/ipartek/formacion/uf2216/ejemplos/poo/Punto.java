package com.ipartek.formacion.uf2216.ejemplos.poo;

public class Punto {

	//
	private static final int MINIMO_X = -100;
	private static final int MAXIMO_X = 100;

	// Variables de instancia
	private int x, y;

	// Variables estaticas, "de clase"
	private static int defaultY = 1;
	private static int defaultX = 1;

	// Enumeración
	enum Formatos {
		SIMPLE, COMPLEJO
	}

	public Punto(int x, int y) {
		setXY(x, y);
	}

	public Punto() {
		this(defaultX, defaultY);
	}

	public Punto(int xy) {
		this(xy, xy);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if (x > MAXIMO_X || x < MINIMO_X) {
			throw new RuntimeException("No se admite el valor" + x);
		} else {
			this.x = x;
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return transformarATexto(Formatos.COMPLEJO);
	}

	public void setXY(int x, int y) {
		setX(x);
		setY(y);
	}

	public String toString(boolean formatoComplejo) {
		return formatoComplejo ? this.transformarATexto(Formatos.COMPLEJO) : this.transformarATexto(Formatos.SIMPLE);
	}

	public String toString(Formatos formato) {
		return transformarATexto(formato);
	}
	
	private String transformarATexto(Formatos formato) {
		switch (formato) {
		case SIMPLE:
			return String.format("%s,%s", getX(), getY());
		case COMPLEJO:
			return String.format("P(%s,%s)", getX(), getY());
		default:
			throw new RuntimeException("Formato no reconocido");
		}
	}

	public static int getDefaultY() {
		return defaultY;
	}

	public static void setDefaultY(int defaultY) {
		Punto.defaultY = defaultY;
	}

	public static int getDefaultX() {
		return defaultX;
	}

	public static void setDefaultX(int defaultX) {
		Punto.defaultX = defaultX;
	}

	
}
