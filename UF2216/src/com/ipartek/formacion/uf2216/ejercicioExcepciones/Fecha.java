package com.ipartek.formacion.uf2216.ejercicioExcepciones;

import java.util.GregorianCalendar;

public class Fecha {

	private int ano = 0;
	private int mes = 1;
	private int dia = 1;

	static final int MESES_ANO = 12;

	public Fecha(int ano, int mes, int dia) {
		super();
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
	}

	public Fecha() {
		super();
	}

	public Fecha(Fecha f) {

	}

	public static boolean esBisiesto(int ano) {
		GregorianCalendar gc = new GregorianCalendar();
		if (gc.isLeapYear(ano)) {
			System.out.println("true");
			return true;

		} else {
			System.out.println("false");
			return false;
		}
	}

	public boolean esBisiesto() {
		GregorianCalendar gc = new GregorianCalendar();
		boolean anoBisiesto = false;
		if (anoBisiesto == gc.isLeapYear(this.ano)) {
			return true;
		} else {
			return false;
		}
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public void set(int año, int mes, int dia) {

	}

	public void set(Fecha f) {

	}

	@Override
	public String toString() {
		return "Fecha [año=" + ano + ", mes=" + mes + ", dia=" + dia + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fecha other = (Fecha) obj;
		if (ano != other.ano)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}

}
