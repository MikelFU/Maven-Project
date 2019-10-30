package dao;

import java.sql.Connection;
import java.util.ArrayList;
import org.model.Persona;

public interface CrudAble {
	Connection getConnection();
	ArrayList<Persona> getLast50();
	Persona getById(int id);
	Persona getByDni(String dni);
	Persona getByEmail(String email);
	Persona getByNombre(String nombre);
	Persona insert(Persona persona);
	Persona update(Persona persona);
}
