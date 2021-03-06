package com.ipartek.formacion.uf2216.ejercicios.global.presentacionconsola;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.ipartek.formacion.uf2216.ejercicios.global.accesodatos.Crudable;
import com.ipartek.formacion.uf2216.ejercicios.global.accesodatos.LibrosDAOColeccion;
import com.ipartek.formacion.uf2216.ejercicios.global.entidades.Libro;

public class MantenimientoLibros {

	static ArrayList<Libro> arrayLibros = new ArrayList<Libro>();

	public static void main(String[] args) {

		// TODO Men� con insertar, modificar, borrar, listar, buscar por id
		// TODO Buscar por titulo
		Crudable<Libro> dao = LibrosDAOColeccion.getInstance();
		Libro libro1 = new Libro(1, "T�tulo 1");
		Libro libro2 = new Libro(2, "T�tulo 2");
		Libro libro3 = new Libro(3, "T�tulo 3");
		dao.insertar(libro1);
		dao.insertar(libro2);
		dao.insertar(libro3);

		mostrarMenu();

	}

	private static void mostrarMenu() {
		String respuesta;
		int opcion;
		do {
			respuesta = JOptionPane.showInputDialog("1. A�adir\n" + "2. Modificar\n" + "3. Borrar\n" + "4. Listado\n"
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
				int id;
				id = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el Id que desea buscar"));
				buscarPorID(id);
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
		idLibro = Integer.parseInt(JOptionPane.showInputDialog("A�ade el id del libro : "));
		tituloNuevoLibro = JOptionPane.showInputDialog("A�ade el t�tulo del libro : ");

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
			JOptionPane.showMessageDialog(null, "El n�mero no es correcto. Vuelves al men�.");
		}

	}

	public static void modificar() {
		int idAModificar = Integer
				.parseInt(JOptionPane.showInputDialog("Introduce el ID del libro que quieres modificar"));
		borrar(idAModificar);

		int idLibro;
		String tituloNuevoLibro;
		idLibro = Integer.parseInt(JOptionPane.showInputDialog("A�ade el id del libro : "));
		tituloNuevoLibro = JOptionPane.showInputDialog("A�ade el t�tulo del libro : ");

		Crudable<Libro> dao = LibrosDAOColeccion.getInstance();
		Libro nuevoLibro = new Libro(idLibro, tituloNuevoLibro);
		dao.insertar(nuevoLibro);
	}

	public static void borrar(int numeroABorrar) {
		Crudable<Libro> dao = LibrosDAOColeccion.getInstance();
		for (Libro libro : dao.obtenerTodos()) {
			if (libro.getId() == numeroABorrar) {
				dao.borrar(numeroABorrar);
			} else {
				JOptionPane.showMessageDialog(null, "No existe ese libro");
			}
		}
	}

	public static void listado() {
		Crudable<Libro> dao = LibrosDAOColeccion.getInstance();

		String listado = "<html><h1>Listado de libros</h1><table border = 1 align = center>"
				+ "<tr><th>ID</th><th>T�tulo</th></tr>";
		for (Libro libro : dao.obtenerTodos()) {
			listado += "<tr><td>" + libro.getId() + "</td><td>" + libro.getTitulo() + "</td></tr>";
			JOptionPane.showMessageDialog(null, listado, "Listado de libros", JOptionPane.PLAIN_MESSAGE);
		}
	}

	public static void buscarPorID(int id) {
		Crudable<Libro> dao = LibrosDAOColeccion.getInstance();

		for (Libro libro : dao.obtenerTodos()) {
			if (libro.getId() == id) {
				JOptionPane.showMessageDialog(null, "El id " + libro.getId() + " si est� en la librer�a\n"
						+ "El titulo de ese libro es : " + libro.getTitulo());
			} else {
				JOptionPane.showMessageDialog(null, "El Id indicado no existe en esta librer�a", "Aviso",
						JOptionPane.WARNING_MESSAGE);
			}
		}
	}

	public static int numeroDeLibros() {
		Crudable<Libro> dao = LibrosDAOColeccion.getInstance();
		int numerodeLibros = dao.numero();
		return numerodeLibros;
	}

}
