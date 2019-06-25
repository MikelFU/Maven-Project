package com.ipartek.formacion.uf2216.ejercicios.global.accesodatos;

import java.util.ArrayList;

import com.ipartek.formacion.uf2216.ejercicios.global.entidades.Libro;

public class LibrosDAOColeccion implements Crudable<Libro> {
	// Data
	// Access
	// Object

	// Inicio patrón Singleton
	private LibrosDAOColeccion() {
	}

	Libro libr = new Libro();

	private static LibrosDAOColeccion instancia; // = new LibrosDAOColeccion();

	public static LibrosDAOColeccion getInstance() {
		if (instancia == null) {
			instancia = new LibrosDAOColeccion();
		}

		return instancia;
	}
	// Fin patrón Singleton

	private ArrayList<Libro> libros = new ArrayList<Libro>();

	@Override
	public Iterable<Libro> obtenerTodos() {
		return libros;
	}

	@Override
	public Libro obtenerPorId() {
		return null;
	}

	@Override
	public void insertar(Libro libro) {
		libros.add(libro);
	}

	@Override
	public void modificar(Libro libro) {
		// TODO Auto-generated method stub

	}

	@Override
	public void borrar(Libro libro) {
		libros.remove(libro);
	}

	@Override
	public void borrar(int id) {
		if (id == getId()) {
			libros.remove(id);
		}
	}

	public int numeroDeLibros() {
		int numero = libros.size();
		return numero;
	}

	@Override
	public int getId() {
		return libr.getId();
	}

}