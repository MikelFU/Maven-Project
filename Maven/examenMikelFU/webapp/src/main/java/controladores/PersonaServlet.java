package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.service.ServiceInterface;
import org.service.ServicePersonas;

@WebServlet("/personas")
public class PersonaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServiceInterface service = new ServicePersonas("com.mysql.cj.jdbc.Driver",
				"jdbc:mysql://localhost:3307/taller?useSSL=false&serverTimezone=UTC", "root", "admin");
		
		request.setAttribute("personas", service.getLast50());
		request.getRequestDispatcher("WEB-INF/vistas/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/vistas/buscadoNombre.jsp").forward(request, response);
	}

}
