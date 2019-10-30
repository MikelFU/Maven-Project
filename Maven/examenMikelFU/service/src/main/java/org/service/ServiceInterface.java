package org.service;

import org.model.Persona;

public interface ServiceInterface {
	Iterable<Persona> getLast50();
	Iterable<Persona> getByDni(String dni);
	Iterable<Persona> getByEmail(String email);
	Iterable<Persona> getByNombre(String nombre);
	Persona insert(Persona persona);
	Persona update(Persona persona);
}
