package com.ipartek.formacion.uf2216.ejercicios.global.accesodatos;

public interface Crudable<T> {
	//Create
	//Retrieve
	//Update
	//Delete
	
	public Iterable<T> obtenerTodos();
	public T obtenerPorId(int id);
	
	public void insertar(T objeto);
	public void modificar(T objeto);
	public void borrar(T objeto);
	public void borrar(int id);
	public int numero();
	
}
