package com.ipartek.formacion.uf2216.ejercicios.global.entidades;

public class Libro {
	// TODO: ISBN, Editorial, Autor, Descripción, Género, Edición, IsBorrado, Fecha
	// de impresión
	private long id;
	private String titulo;
//	private long isbn;
//	private String editorial;
//	private String autor;
//	private String descripcion;
//	private String genero;
//	private String edicion;
//	private boolean isBorrado;
//	private Date fechaDeImpresion;

	public Libro(long id, String titulo) {
		super();
		this.id = id;
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
