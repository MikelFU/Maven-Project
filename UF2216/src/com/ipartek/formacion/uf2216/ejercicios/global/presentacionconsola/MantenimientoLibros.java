package com.ipartek.formacion.uf2216.ejercicios.global.presentacionconsola;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.ipartek.formacion.uf2216.ejercicios.global.accesodatos.Crudable;
import com.ipartek.formacion.uf2216.ejercicios.global.accesodatos.LibrosDAOColeccion;
import com.ipartek.formacion.uf2216.ejercicios.global.entidades.Libro;

public class MantenimientoLibros {

	static ArrayList<Libro> arrayLibros = new ArrayList<Libro>();

	public static void main(String[] args) {

		// TODO Menú con insertar, modificar, borrar, listar, buscar por id
		// TODO Buscar por titulo
		Crudable<Libro> dao = LibrosDAOColeccion.getInstance();
		Libro libro1 = new Libro(1, "Título 1");
		Libro libro2 = new Libro(2, "Título 2");
		Libro libro3 = new Libro(3, "Título 3");
		dao.insertar(libro1);
		dao.insertar(libro2);
		dao.insertar(libro3);

		mostrarMenu();

	}

	private static void mostrarMenu() {
		String respuesta;
		int opcion;
		do {
			respuesta = JOptionPane.showInputDialog("1. Añadir\n" + "2. Modificar\n"
					+ "3. Borrar\n" + "4. Listado\n"
					+ "5. Buscar por Id\n" + "\n0. Salir");
			opcion = Integer.parseInt(respuesta);
			switch (opcion) {
			case 1:
				anadir();
				volver();
				break;
			case 2:
				modificar();
				volver();
				break;
			case 3:
				int numeroABorrar;
				numeroABorrar = Integer.parseInt(JOptionPane.showInputDialog("Introduzca ID a borrar"));
				borrar(numeroABorrar);
				volver();
				break;
			case 4:
				listado();
				volver();
				break;
			case 5:
				buscarPorID();
				volver();
				break;
			case 0:
				System.out.println("Programa finalizado");
				break;
			default:
				break;
			}
		} while (opcion != 0);
	}

	public static void anadir() {
		int idLibro;
		String tituloNuevoLibro;
		idLibro = Integer.parseInt(JOptionPane.showInputDialog("Añade el id del libro : "));
		tituloNuevoLibro = JOptionPane.showInputDialog("Añade el título del libro : ");

		Crudable<Libro> dao = LibrosDAOColeccion.getInstance();
		Libro nuevoLibro = new Libro(idLibro, tituloNuevoLibro);
		dao.insertar(nuevoLibro);

		volver();
	}

	private static void volver() {
		String volver;
		volver = JOptionPane.showInputDialog("Pulsa 1 para ver el listado.\n Presiona 2 para volver al menu.");

		if (volver.equals("1")) {
			listado();
		} else if (volver.equals("2")) {
			mostrarMenu();
		} else {
			JOptionPane.showMessageDialog(null, "El número no es correcto. Vuelves al menú.");
		}

	}

	public static void modificar() {
		int idAModificar = Integer
				.parseInt(JOptionPane.showInputDialog("Introduce el ID del libro que quieres modificar"));
		borrar(idAModificar);

		int idLibro;
		String tituloNuevoLibro;
		idLibro = Integer.parseInt(JOptionPane.showInputDialog("Añade el id del libro : "));
		tituloNuevoLibro = JOptionPane.showInputDialog("Añade el título del libro : ");

		Crudable<Libro> dao = LibrosDAOColeccion.getInstance();
		Libro nuevoLibro = new Libro(idLibro, tituloNuevoLibro);
		dao.insertar(nuevoLibro);
	}

	public static void borrar(int numeroABorrar) {
		Crudable<Libro> dao = LibrosDAOColeccion.getInstance();
		dao.borrar(numeroABorrar);

	}

	public static void listado() {
		Crudable<Libro> dao = LibrosDAOColeccion.getInstance();

		String listado = "<html><h1>Listado de libros</h1><table border = 1><tr><th>ID</th><th>Título</th></tr>";
		for (Libro libro : dao.obtenerTodos()) {
			listado += "<tr><td>" + libro.getId() + "</td><td>" + libro.getTitulo() + "</td></tr>";
			JOptionPane.showMessageDialog(null, listado, "Listado de libros", JOptionPane.PLAIN_MESSAGE);
		}
	}

	public static void buscarPorID() {
		Crudable<Libro> dao = LibrosDAOColeccion.getInstance();
		
		dao.obtenerPorId(1);
		/*
		String id;
		Crudable<Libro> dao = LibrosDAOColeccion.getInstance();

		id = JOptionPane.showInputDialog("Introduzca el ID a buscar");
		int i;
		String listado = "";
		for (i = 0; i < numeroDeLibros() && id.equalsIgnoreCase(String.valueOf(dao.getId())); i++) {
			if (i == dao.getId()) {
				for (; i < numeroDeLibros(); i++) {
					if (id.equalsIgnoreCase(String.valueOf(dao.getId()))) {
						listado = "ID encontrado - " + dao.getId();
					}
				}
			} else {
				JOptionPane.showMessageDialog(null, "No existe ningún libro con ese id", "Aviso",
						JOptionPane.WARNING_MESSAGE);
			}
			JOptionPane.showMessageDialog(null, listado);
		}*/
	}

	public static int numeroDeLibros() {
		Crudable<Libro> dao = LibrosDAOColeccion.getInstance();
		int numerodeLibros = dao.numero();
		return numerodeLibros;
	}

}
