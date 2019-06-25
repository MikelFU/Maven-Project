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
	public Libro obtenerPorId(int id) {
//		for (int i = 0; i < libros.size() ; i++) {
////			
////		}  
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
		if (id == 0) { // cambiar el 0 por el metodo para obtenerID
			libros.remove(id);
		}
	}

	public int numero() {
		int numero = libros.size();
		return numero;
	}

}