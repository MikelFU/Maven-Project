package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.model.Persona;

public class PersonasDAO {

	public String driver, url, user, password;

	public PersonasDAO(String driver, String url, String user, String password) {
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.password = password;
	}

	public Connection getConnection() {
		try {
			Class.forName(driver);
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			throw new RuntimeException("Ha habido un error al conectar a la base de datos", e);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("No se ha encontrado el driver de JDBC de MySQL", e);
		}
	}

	public ArrayList<Persona> getLast50() {
		ArrayList<Persona> listaPersonas = new ArrayList<>();

		Persona persona;

		String nombre, apellido, email, dni;
		int id;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM personas.gente ORDER BY id DESC LIMIT 50");

			while (rs.next()) {
				id = rs.getInt(1);
				nombre = rs.getString(2);
				apellido = rs.getString(3);
				email = rs.getString(4);
				dni = rs.getString(5);

				persona = new Persona();
				persona.setId(id);
				persona.setNombre(nombre);
				persona.setApellido(apellido);
				persona.setEmail(email);
				persona.setDni(dni);

				System.out.println(persona);

				listaPersonas.add(persona);

				System.out.println("----------");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return listaPersonas;
	}

	public ArrayList<Persona> getByDni(String dni) {
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

		Persona persona = null;
		String nombre = null, apellido = null, email = null;
		int id = 0;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);

			String query = "SELECT * FROM personas.gente WHERE dni = ?";

			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, dni);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				persona = new Persona();
				id = rs.getInt(1);
				nombre = rs.getString(2);
				apellido = rs.getString(3);
				email = rs.getString(4);

				persona.setId(id);
				persona.setNombre(nombre);
				persona.setApellido(apellido);
				persona.setEmail(email);
				persona.setDni(dni);

				listaPersonas.add(persona);
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		return listaPersonas;
	}

	public ArrayList<Persona> getByEmail(String email) {
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

		Persona persona = null;
		String nombre = null, apellido = null, dni = null;
		int id = 0;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);

			String query = "SELECT * FROM personas.gente WHERE email = ?";

			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				persona = new Persona();
				id = rs.getInt(1);
				nombre = rs.getString(2);
				apellido = rs.getString(3);
				dni = rs.getString(5);

				persona.setId(id);
				persona.setNombre(nombre);
				persona.setApellido(apellido);
				persona.setEmail(email);
				persona.setDni(dni);

				listaPersonas.add(persona);
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		return listaPersonas;
	}

	public ArrayList<Persona> getByNombre(String nombre) {
		ArrayList<Persona> listaPersonas = new ArrayList<>();

		Persona persona = null;
		String apellido = null, email = null, dni = null;
		int id = 0;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);

			String query = "SELECT * FROM personas.gente WHERE nombre = ?";

			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, nombre);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				persona = new Persona();
				id = rs.getInt(1);
				email = rs.getString(4);
				apellido = rs.getString(3);
				dni = rs.getString(5);

				persona.setId(id);
				persona.setNombre(nombre);
				persona.setApellido(apellido);
				persona.setEmail(email);
				persona.setDni(dni);

				listaPersonas.add(persona);
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		return listaPersonas;
	}

	public Persona insert(Persona persona) {
		String nombre = persona.getNombre();
		String apellido = persona.getApellido();
		String email = persona.getEmail();
		String dni = persona.getDni();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);

			String query = " INSERT into personas.gente (nombre, apellido, email, dni)" + " VALUES (?, ?, ?, ?)";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, nombre);
			pst.setString(2, apellido);
			pst.setString(3, email);
			pst.setString(4, dni);

			pst.execute();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return persona;
	}

	public Persona update(Persona persona) {
		int id;
		String nombre, apellido, email, dni;

		id = persona.getId();
		nombre = persona.getNombre();
		apellido = persona.getApellido();
		email = persona.getEmail();
		dni = persona.getDni();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);

			String query = " UPDATE personas.gente SET nombre = ?, apellido = ?, email = ?, dni = ? WHERE id = ?";

			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(5, id);
			pst.setString(1, nombre);
			pst.setString(2, apellido);
			pst.setString(3, email);
			pst.setString(4, dni);

			pst.execute();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		persona.setId(id);
		persona.setNombre(nombre);
		persona.setApellido(apellido);
		persona.setEmail(email);
		persona.setDni(dni);

		return persona;
	}
}
