package org.service;

import org.model.Persona;
import dao.PersonasDAO;

public class ServicePersonas implements ServiceInterface {

	public String url, user, password, driver;

	public ServicePersonas(String driver, String url, String user, String password) {
		this.url = url;
		this.user = user;
		this.password = password;
		this.driver = driver;
	}
	
	@Override
	public Iterable<Persona> getLast50() {
		PersonasDAO dao = new PersonasDAO(driver, url, user, password);
		return dao.getLast50();
	}

	@Override
	public Iterable<Persona> getByDni(String dni) {
		PersonasDAO dao = new PersonasDAO(driver, url, user, password);
		return dao.getByDni(dni);
	}
	
	@Override
	public Iterable<Persona> getByEmail(String email) {
		PersonasDAO dao = new PersonasDAO(driver, url, user, password);
		return dao.getByEmail(email);
	}

	@Override
	public Iterable<Persona> getByNombre(String persona) {
		PersonasDAO dao = new PersonasDAO(driver, url, user, password);
		return dao.getByNombre(persona);
	}

	@Override
	public Persona insert(Persona persona) {
		PersonasDAO dao = new PersonasDAO(driver, url, user, password);
		return dao.insert(persona);
	}

	@Override
	public Persona update(Persona persona) {
		PersonasDAO dao = new PersonasDAO(driver, url, user, password);
		return dao.update(persona);
	}
}
