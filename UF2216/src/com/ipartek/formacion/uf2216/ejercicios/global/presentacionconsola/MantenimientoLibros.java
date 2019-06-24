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
		arrayLibros.add(libro1);

		mostrarMenu();

	}

	private static void mostrarMenu() {
		String respuesta;
		int opcion;
		do {
			respuesta = JOptionPane.showInputDialog("1. Añadir\n" + "2. Modificar\n" + "3. Borrar\n" + "4. Listado\n"
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

		do {
			if (volver.equalsIgnoreCase("1")) {
				listado();
			} else if (volver.equalsIgnoreCase("2")) {
				mostrarMenu();
			}
		} while (volver.equalsIgnoreCase("S"));
	}

	public static void modificar() {

	}

	public static void borrar(int numeroABorrar) {
		Crudable<Libro> dao = LibrosDAOColeccion.getInstance();
		dao.borrar(numeroABorrar);
		volver();
	}

	public static void listado() {
		Crudable<Libro> dao = LibrosDAOColeccion.getInstance();
//		dao.insertar(new Libro(1, "Título 1"));
//		dao.insertar(new Libro(2, "Título 2"));

		for (Libro libro : dao.obtenerTodos()) {
			JOptionPane.showMessageDialog(null, libro.getTitulo() + "\nId: " + libro.getId(), "Listado de libros",
					JOptionPane.INFORMATION_MESSAGE);
//			System.out.println(libro);
		}
	}

	public static void buscarPorID() {
		/*
		 * String id; Crudable<Libro> dao = LibrosDAOColeccion.getInstance();
		 * 
		 * do { id = JOptionPane.showInputDialog("Introduzca el ID a buscar"); int i;
		 * for (i = 0; i < numeroDeLibros() ; i++) {
		 * 
		 * } } while (JOptionPane.showConfirmDialog( null, "Desea Continuar",
		 * "Otro tema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
		 */

	}

	public static int numeroDeLibros() {
		Crudable<Libro> dao = LibrosDAOColeccion.getInstance();
		int numerodeLibros = dao.numeroDeLibros();
		return numerodeLibros;
	}

}
