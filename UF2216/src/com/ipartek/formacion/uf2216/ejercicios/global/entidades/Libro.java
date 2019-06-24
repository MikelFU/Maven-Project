package com.ipartek.formacion.uf2216.ejercicios.global.entidades;

public class Libro {
	// TODO: ISBN, Editorial, Autor, Descripción, Género, Edición, IsBorrado, Fecha
	// de impresión
	private int id;
	private String titulo;
//	private long isbn;
//	private String editorial;
//	private String autor;
//	private String descripcion;
//	private String genero;
//	private String edicion;
//	private boolean isBorrado;
//	private Date fechaDeImpresion;

	public Libro(int id, String titulo) {
		super();
		this.id = id;
		this.titulo = titulo;
	}

	public Libro() {

	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
