package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.model.Persona;
import org.service.ServiceInterface;
import org.service.ServicePersonas;

@WebServlet("/modificar")
public class Modificar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/vistas/modificar.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String email = request.getParameter("email");
		String dni = request.getParameter("dni");
		
		Persona persona = new Persona();
		persona.setId(id);
		persona.setNombre(nombre);
		persona.setApellido(apellido);
		persona.setEmail(email);
		persona.setDni(dni);
		
		ServiceInterface service = new ServicePersonas("com.mysql.cj.jdbc.Driver",
				"jdbc:mysql://localhost:3307/taller?useSSL=false&serverTimezone=UTC", "root", "admin");
		
		service.update(persona);
		
		response.sendRedirect("personas");
	}

}
